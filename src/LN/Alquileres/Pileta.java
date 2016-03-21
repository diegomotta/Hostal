package LN.Alquileres;

import LN.Caja.Cupon;
import LN.Persona.Visitante.Afiliado;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Pileta extends Observable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double precio_invitado;
    private int cantidad_invitados;
    private boolean habilitada;
    @OneToMany
    private List<Registro_Pileta> registros;

    public Pileta() {
    }

    public Pileta(double precio_invitado, int cantidad_invitados, boolean habilitada) {
        this.id = 0;
        this.precio_invitado = precio_invitado;
        this.cantidad_invitados = cantidad_invitados;
        this.habilitada = habilitada;
        this.registros = new LinkedList<>();
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecio_invitado() {
        return precio_invitado;
    }

    public void setPrecio_invitado(double precio_invitado) {
        this.precio_invitado = precio_invitado;
    }

    public int getCantidad_invitados() {
        return cantidad_invitados;
    }

    public void setCantidad_invitados(int cantidad_invitados) {
        this.cantidad_invitados = cantidad_invitados;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }

    public List<Registro_Pileta> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro_Pileta> registros) {
        this.registros = registros;
    }

    public void registrar_Entrada(Afiliado unAfiliado, int total_afiliados, int total_entradas, double monto_entradas, Date fecha_entrada, boolean conTarjeta, Cupon unCupon) throws Exception {
        Registro_Pileta nuevoRegistro = new Registro_Pileta(unAfiliado, total_afiliados, total_entradas, monto_entradas, fecha_entrada);
        this.registros.add(nuevoRegistro);
        Hosteria.getPersistencia().update(this);
        setChanged();
        notifyObservers(nuevoRegistro);
    }

    public void actualizarParametros(int invitados, double costo) throws Exception {
        if (invitados < 0 || costo < 0.0) {
            throw new Exception("Usted esta pasando parametros incorrectos, por favor vuelva a revisar los datos necesarios");
        } else {
            this.setCantidad_invitados(invitados);
            this.setPrecio_invitado(costo);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(this);
        }
    }

   
}

