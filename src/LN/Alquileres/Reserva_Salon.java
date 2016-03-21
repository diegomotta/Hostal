package LN.Alquileres;

import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Reserva_Salon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Visitante unVisitante;
    @Temporal(TemporalType.DATE)
    private Date desdeFecha;
    @Temporal(TemporalType.DATE)
    private Date hastaFecha;
    private int cantidad_de_Noches;
       
    @ManyToOne
    private Salon elSalon;
    @ManyToOne
    private Tarifa_Salon tipo;

    public Reserva_Salon() {
    }

    public Reserva_Salon(Visitante unVisitante, Date desdeFecha, Date hastaFecha, int cantidad_de_Noches, Salon elSalon, Tarifa_Salon tipo) {
        this.id = 0;
        this.unVisitante = unVisitante;
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.cantidad_de_Noches = cantidad_de_Noches;
        
        this.elSalon = elSalon;
        this.tipo = tipo;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Visitante getUnVisitante() {
        return unVisitante;
    }

    public void setUnVisitante(Visitante unVisitante) {
        this.unVisitante = unVisitante;
    }

    public Date getDesdeFecha() {
        return desdeFecha;
    }

    public void setDesdeFecha(Date desdeFecha) {
        this.desdeFecha = desdeFecha;
    }

    public Date getHastaFecha() {
        return hastaFecha;
    }

    public void setHastaFecha(Date hastaFecha) {
        this.hastaFecha = hastaFecha;
    }

    public int getCantidad_de_Noches() {
        return cantidad_de_Noches;
    }

    public void setCantidad_de_Noches(int cantidad_de_Noches) {
        this.cantidad_de_Noches = cantidad_de_Noches;
    }


    public Salon getElSalon() {
        return elSalon;
    }

    public void setElSalon(Salon elSalon) {
        this.elSalon = elSalon;
    }

    public Tarifa_Salon getTipo() {
        return tipo;
    }

    public void setTipo(Tarifa_Salon tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getTipo());
    }

    public String toLista() {
        return String.valueOf("Sr/a: " + this.getUnVisitante() + "   Servicio: " + this.getTipo() + "    Día: " + new SimpleDateFormat("dd/MM/yyyy").format(this.getDesdeFecha()));
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getElSalon(), this.getUnVisitante().getApellido() + " " + this.getUnVisitante().getNombre() , new SimpleDateFormat("dd/MM/yyyy").format(this.getDesdeFecha()), new SimpleDateFormat("dd/MM/yyyy").format(this.getHastaFecha())};
        return fila;
    }
}
