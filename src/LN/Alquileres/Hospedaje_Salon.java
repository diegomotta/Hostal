package LN.Alquileres;

import Interface.GUIM;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Hospedaje_Salon extends Hospedaje implements Serializable {

    @ManyToOne
    private Salon elSalon;
    @ManyToOne
    private Tarifa_Salon servicio;

    public Hospedaje_Salon() {
    }

    public Hospedaje_Salon(Salon elSalon, Tarifa_Salon servicio, Visitante unVisitante, Date ingreso, Date egreso, double descuento) {
        super(unVisitante, ingreso, egreso, descuento);
        this.elSalon = elSalon;
        this.servicio = servicio;
        Hosteria.persistencia.insert(this);
    }

    public Salon getElSalon() {
        return elSalon;
    }

    public void setElSalon(Salon elSalon) {
        this.elSalon = elSalon;
    }

    public Tarifa_Salon getServicio() {
        return servicio;
    }

    public void setServicio(Tarifa_Salon servicio) {
        this.servicio = servicio;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospedaje_Salon)) {
            return false;
        }
        Hospedaje_Salon other = (Hospedaje_Salon) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    public void corregirMovimiento(Hospedaje_Salon unHospedaje_Salon) {

        Double monto;
        int diasCalculados = GUIM.diferenciasDeFechas(unHospedaje_Salon.getIngreso(), unHospedaje_Salon.getEgreso());
        Movimiento_Hospedaje unmovimiento = unHospedaje_Salon.getMovimientos().get(0);
        if (diasCalculados == 0) {
            monto = unHospedaje_Salon.getServicio().getPrecio() * 0.5;
        } else {
            if (unHospedaje_Salon.getDescuento() != 0.0) {
                monto = (unHospedaje_Salon.getServicio().getPrecio() - ((unHospedaje_Salon.getDescuento() * unHospedaje_Salon.getServicio().getPrecio()) / 100)) * diasCalculados;

            } else {
                monto = unHospedaje_Salon.getServicio().getPrecio() * diasCalculados;

            }

        }
        unmovimiento.setMonto(monto);
        unmovimiento.setTipo(unHospedaje_Salon.getServicio().getTipo());
        Hosteria.persistencia.update(this);

    }

    @Override
    public String toString() {
        return String.valueOf(this.getElSalon().getNumero());
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getUnVisitante().getApellido() + " " + this.getUnVisitante().getNombre()};
        return fila;
    }

    public Object[] toVector2() {
        Double total = 0.0;
        for (Movimiento_Hospedaje unMovimiento_Hospedaje : this.getMovimientos()) {
            if (!unMovimiento_Hospedaje.getTipo().equals("Anticipo")) {
                total += unMovimiento_Hospedaje.getMonto();
            }
        }
        Object fila[] = {this.getServicio().getTipo(), this, this.getUnVisitante().getApellido() + " " + this.getUnVisitante().getNombre(), new SimpleDateFormat("dd/MM/yyyy").format(this.getIngreso()), new SimpleDateFormat("dd/MM/yyyy").format(this.getEgreso()), this.getDescuento(), total};
        return fila;
    }
}
