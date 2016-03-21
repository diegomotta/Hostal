package LN.Caja;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Observable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Caja extends Observable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToMany
    private List<Lote> lotes;
    @OneToMany
    private List<Conceptos> conceptos;
    @OneToMany
    private List<Cupon> cupones;
    @OneToMany
    private List<Tarjeta> tarjetas;
    @ElementCollection(targetClass = Integer.class)
    private List<Integer> comprobantes;

    public Caja() {
    }

    public Caja(String nombre) {
        this.id = 0;
        this.nombre = nombre;
        this.lotes = new LinkedList<>();
        this.conceptos = new LinkedList<>();
        this.comprobantes = new LinkedList<>();
        this.cupones = new LinkedList<>();

        conceptos.add(new Conceptos("Entrada", "Inicio de Caja"));
        conceptos.add(new Conceptos("Entrada", "Pago por adelantado de una Habitacion"));
        conceptos.add(new Conceptos("Entrada", "Reserva de Habitacion"));
        conceptos.add(new Conceptos("Entrada", "Reserva del Salon de Evento"));
        conceptos.add(new Conceptos("Entrada", "Ingreso a Caja para cambio"));
        conceptos.add(new Conceptos("Entrada", "Entrada a Pileta de Natacion"));
        conceptos.add(new Conceptos("Entrada", "Check-OUT Habitación"));
        conceptos.add(new Conceptos("Entrada", "Check-OUT Salón"));
        conceptos.add(new Conceptos("Salida", "Compra de Insumos"));
        conceptos.add(new Conceptos("Salida", "Retira el Administrador"));
        conceptos.add(new Conceptos("Salida", "Retira el Operador"));

        this.tarjetas = new LinkedList<>();
        tarjetas.add(new Tarjeta("Visa"));
        tarjetas.add(new Tarjeta("Mastercard"));
        tarjetas.add(new Tarjeta("Naranja"));
        tarjetas.add(new Tarjeta("Maestro"));
        tarjetas.add(new Tarjeta("American Express"));

        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public List<Conceptos> getConceptos() {
        return conceptos;
    }

    public void setConceptos(List<Conceptos> conceptos) {
        this.conceptos = conceptos;
    }

    public List<Cupon> getCupones() {
        return cupones;
    }

    public void setCupones(List<Cupon> cupones) {
        this.cupones = cupones;
    }

    public List<Integer> getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(List<Integer> comprobantes) {
        this.comprobantes = comprobantes;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    private boolean existeLote(Lote unLote) {
        boolean existe = false;


        return existe;
    }

    public void ADD_Compeobante(Integer unComprobante) {
        this.getComprobantes().add(unComprobante);
        Hosteria.persistencia.update(this);

    }

    private boolean existeConcepto(Conceptos unCon) {
        boolean existe = false;
        for (Conceptos oneConcept : this.getConceptos()) {
            if (unCon.equals(oneConcept)) {
                existe = true;
            }
        }
        return existe;
    }

    public Conceptos obtenerConcepto(String tipo, String detalle) {
        Conceptos unConcepto = null;
        for (Conceptos losConceptos : this.getConceptos()) {
            if (unConcepto.getTipo().toUpperCase().equals(tipo.toUpperCase()) && unConcepto.getDetalle().toUpperCase().equals(detalle.toUpperCase())) {
                unConcepto = losConceptos;
            }
        }
        return unConcepto;
    }

    public Lote abrirLote(Double saldoInicial, Double saldoFinal, String horaApertura, String horaCierre, Double totalRetirado/*, Date fechaLote*/) throws Exception {
        Lote nuevoLote = new Lote(saldoInicial, saldoFinal, horaApertura, horaCierre, totalRetirado, false);
        this.lotes.add(nuevoLote);
        Hosteria.persistencia.update(this);
        return nuevoLote;
    }

    public void cerrarLote(Double saldoFinal, String horaCierre, Double totalRetirado, Lote unLote/*, Date fechaLote*/) throws Exception {
        if (unLote.isCerrado() != false) {
            throw new Exception("El Lote que quiere serrar ya ha sido cerrado con anterioridad");
        }

        unLote.setHoraCierre(horaCierre);
        unLote.setSaldoFinal(saldoFinal);
        unLote.setTotalRetirado(totalRetirado);
        unLote.setCerrado(true);
        Hosteria.getPersistencia().update(this);

    }

    public void reabrirLote(Lote unLote) {
        if (unLote instanceof Lote) {
            unLote.setCerrado(false);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unLote);
        }
    }

    public Conceptos agregarConcepto(String tipoConcepto, String detalleConcepto) throws Exception {
        boolean existe = false;
        Conceptos nuevoConcepto = null;
        for (Conceptos unConcepto : this.getConceptos()) {
            if (unConcepto.getDetalle().toUpperCase().equals(detalleConcepto.toUpperCase()) && unConcepto.getTipo().toUpperCase().equals(tipoConcepto.toUpperCase())) {
                existe = true;
                throw new Exception("El concepto que quiere agregar ya existe");

            }
            break;
        }
        if (!existe) {
            nuevoConcepto = new Conceptos(tipoConcepto, detalleConcepto);
            this.conceptos.add(nuevoConcepto);
            setChanged();
            notifyObservers(nuevoConcepto);
            Hosteria.getPersistencia().update(this);
        }
        return nuevoConcepto;
    }

    public void modificarConcepto(Conceptos unConcepto, String tipoConcepto, String detalleConcepto) throws Exception {
        if (!existeConcepto(unConcepto)) {
            throw new Exception("El Concepto que desea modificar no existe en el Sistema");
        } else {
            if (obtenerConcepto(tipoConcepto, detalleConcepto) != null) {
                throw new Exception("Las Modificaciones ingresadas son identicas a otro concepto cargado previamente");
            } else {
                unConcepto.setTipo(tipoConcepto);
                unConcepto.setDetalle(detalleConcepto);
                Hosteria.getPersistencia().update(this);
            }
        }
    }

    public boolean utilizaConcepto(Conceptos unConcepto) {
        boolean utiliza = false;
        List<Lote> losLotes = this.getLotes();
        for (Lote unLote : losLotes) {
            for (Movimiento unMovimiento : unLote.getMovimientos()) {
                if (unMovimiento.getTipo().equals(unConcepto.getTipo()) && unMovimiento.getConcepto().equals(unConcepto.getDetalle())) {
                    utiliza = true;
                }
            }
        }
        return utiliza;
    }

    public boolean utilizaTarjeta(Tarjeta unaTarjeta) {
        boolean utiliza = false;
        for (Tarjeta unaT : this.getTarjetas()) {
            if (unaT.getNombre().toUpperCase().trim().equals(unaTarjeta.getNombre().toUpperCase().trim())) {
                utiliza = true;

            }
        }
        return utiliza;
    }

    public void eliminarConcepto(Conceptos unConcepto) throws Exception {
        if (utilizaConcepto(unConcepto)) {
            throw new Exception("El Concepto seleccionado no puede ser Eliminado");
        } else {
            this.conceptos.remove(unConcepto);
            Hosteria.persistencia.delete(unConcepto);
            Hosteria.persistencia.update(this);
        }
    }

    public Lote obtenerLote_Vigente() {
        Lote vigente = null;
        List<Lote> lotesAnteriores = this.getLotes();
        if (!lotesAnteriores.isEmpty()) {
            vigente = lotesAnteriores.get(lotesAnteriores.size() - 1);
        }
        return vigente;

    }

    public Lote loteAnterior() {
        Lote anterior = null;
        List<Lote> lotesAnteriores = this.getLotes();
        if (!lotesAnteriores.isEmpty()) {
            anterior = lotesAnteriores.get(lotesAnteriores.size() - 2);
        }
        return anterior;

    }

    public Cupon registrarCupon(Tarjeta tarjeta, String numeroTarjeta, String numeroCupon, String titular, double importe) throws Exception {
        Cupon nuevoCupon = null;
        if (!existeCupon(numeroTarjeta, numeroCupon)) {
            nuevoCupon = new Cupon(tarjeta, numeroTarjeta, numeroCupon, titular, importe);
            this.cupones.add(nuevoCupon);
            Hosteria.persistencia.update(this);

        } else {
            throw new Exception("Este Cupón ya ha sido registrado");
        }
        return nuevoCupon;
    }

    public boolean existeCupon(String numeroTarjeta, String numeroCupon) {
        boolean existe = false;
        for (Cupon unCupon : this.getCupones()) {
            if (unCupon.getNumeroCupon().equals(numeroCupon) && unCupon.getNumeroTarjeta().equals(numeroTarjeta)) {
                existe = true;
                break;
            }
        }


        return existe;
    }

    public boolean existeTarjeta(String nombre) {
        boolean existe = false;
        for (Tarjeta unaTarjeta : this.getTarjetas()) {
            if (unaTarjeta.getNombre().toUpperCase().trim().equals(nombre.toUpperCase().trim())) {
                existe = true;
                break;
            }
        }
        return existe;

    }

    public void agregarTarjeta(String nombre) throws Exception {
        if (!existeTarjeta(nombre)) {
            Tarjeta nuevaTarjeta = new Tarjeta(nombre);
            this.tarjetas.add(nuevaTarjeta);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(nuevaTarjeta);
        } else {
            throw new Exception("Esta Tarjeta ya Existe");
        }
    }

    public void eliminarTarjeta(Tarjeta unaTarjeta) throws Exception {
//        if (utilizaTarjeta(unaTarjeta)) {
//            throw new Exception("La Tarjeta seleccionado no puede ser Eliminada");
//        } else {
            this.tarjetas.remove(unaTarjeta);
            Hosteria.persistencia.delete(unaTarjeta);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unaTarjeta);
//        }
    }

    public void modificarTarjeta(Tarjeta unaTarjeta, String nombre) throws Exception {
        if (unaTarjeta instanceof Tarjeta) {
            if (!existeTarjeta(nombre)) {
                unaTarjeta.setNombre(nombre);
                Hosteria.persistencia.update(this);
                setChanged();
                notifyObservers(unaTarjeta);
            } else {
                throw new Exception("El nombre que ha ingresado no es valido");
            }
        } else {
            throw new Exception("Se ha producido un error interno, por favor intente nuevamente");
        }

    }

    public Integer obtenerNC() {
        Integer NC;
        if (this.getComprobantes().isEmpty()) {
            NC = 0;
        } else {
            NC = (this.getComprobantes().get(this.getComprobantes().size() - 1)) + 1;
        }
        return NC;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Caja)) {
            return false;
        }
        final Caja other = (Caja) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
