package LN.Alquileres;

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
public class Reserva_Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombVis;
    private String apeVis;
    @Temporal(TemporalType.DATE)
    private Date desdeFecha;
    @Temporal(TemporalType.DATE)
    private Date hastaFecha;
    private int cantidad_de_Noches;
    @ManyToOne
    private Habitacion deHabitacion;
    @ManyToOne
    private Tarifa_Habitacion tipo;

    public Reserva_Habitacion() {
    }

    public Reserva_Habitacion(String unApellido, String unNombre, Date desdeFecha, Date hastaFecha, int cantidad_de_Noches, Habitacion deHabitacion, Tarifa_Habitacion tipo) {
        this.id = 0;
        this.apeVis = unApellido;
        this.nombVis = unNombre;
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.cantidad_de_Noches = cantidad_de_Noches;
        this.deHabitacion = deHabitacion;
        this.tipo = tipo;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombVis() {
        return nombVis;
    }

    public void setNombVis(String nombVis) {
        this.nombVis = nombVis;
    }

    public String getApeVis() {
        return apeVis;
    }

    public void setApeVis(String apeVis) {
        this.apeVis = apeVis;
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

    public Habitacion getDeHabitacion() {
        return deHabitacion;
    }

    public void setDeHabitacion(Habitacion deHabitacion) {
        this.deHabitacion = deHabitacion;
    }

    public Tarifa_Habitacion getTipo() {
        return tipo;
    }

    public void setTipo(Tarifa_Habitacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getDeHabitacion().getNumero());
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getTipo(), this.getApeVis() + " " + this.getNombVis(), new SimpleDateFormat("dd/MM/yyyy").format(this.getDesdeFecha()), new SimpleDateFormat("dd/MM/yyyy").format(this.getHastaFecha())};
        return fila;
    }

    public String toLista() {
        return String.valueOf("Sr/a: " + this.getApeVis() + " " + this.getNombVis() + "   Servicio: " + this.getTipo() + "    Día: " + new SimpleDateFormat("dd/MM/yyyy").format(this.getDesdeFecha()));
    }
}
