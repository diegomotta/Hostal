package LN.Alquileres;

import Interface.GUIM;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.hibernate.envers.Audited;

@Audited
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Hospedaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Visitante unVisitante;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ingreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date egreso;
    private int cantidad_dias;
    private double descuento;
    private boolean check_out = false;
    @OneToMany
    private List<Movimiento_Hospedaje> movimientos;

    public Hospedaje() {
    }

    public Hospedaje(Visitante unVisitante, Date ingreso, Date egreso, double descuento) {
        this.id = 0;
        this.unVisitante = unVisitante;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.cantidad_dias = GUIM.diferenciasDeFechas(ingreso, egreso);
        this.descuento = descuento;
        this.movimientos = new LinkedList<>();
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

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }

    public int getCantidad_dias() {
        return cantidad_dias;
    }

    public void setCantidad_dias(int cantidad_dias) {
        this.cantidad_dias = cantidad_dias;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public boolean isCheck_out() {
        return check_out;
    }

    public void setCheck_out(boolean check_out) {
        this.check_out = check_out;
    }

    public List<Movimiento_Hospedaje> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento_Hospedaje> movimientos) {
        this.movimientos = movimientos;
    }

    public void altaMovimiento_Hospedaje(double monto, String tipo, Date fecha_movimiento, String unaHora) {
        Movimiento_Hospedaje nuevoMH = new Movimiento_Hospedaje(monto, tipo, fecha_movimiento, unaHora, this);
        this.movimientos.add(nuevoMH);
        Hosteria.getPersistencia().update(this);
    }
}
