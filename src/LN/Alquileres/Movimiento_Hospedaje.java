package LN.Alquileres;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class Movimiento_Hospedaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double monto;
    @Temporal(TemporalType.DATE)
    private Date fecha_movimiento;
    private String hora;
    @ManyToOne
    private Hospedaje hospedajePadre;
    public final static String Anticipo = "Anticipo";
    public final static String Recargo = "Recargo";
    private String tipo;

    public Movimiento_Hospedaje() {
    }

    public Movimiento_Hospedaje(double monto, String tipo, Date fecha,String hora ,Hospedaje Padre) {
        this.id = 0;
        this.fecha_movimiento = fecha;
        this.hora = hora;
        this.monto = monto;
        this.tipo = tipo;
        this.hospedajePadre = Padre;
        Hosteria.getPersistencia().insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(Date fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }

    public Hospedaje getHospedajePadre() {
        return hospedajePadre;
    }

    public void setHospedajePadre(Hospedaje hospedajePadre) {
        this.hospedajePadre = hospedajePadre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    

    @Override
    public String toString() {
        switch (tipo) {
            case Anticipo:
                return "Anticípo";
            case Recargo:
                return "Recargo";
            default:
                return "Error";
        }
    }

    public Object[] toMovimiento() {
        Object fila[] = {new SimpleDateFormat("dd/MM/yyyy").format(this.getFecha_movimiento()),this.getHora(), this.getTipo(), this.getMonto(), 0.00};
        return fila;
    }

    public Object[] toOUT() {
        Calendar in = Calendar.getInstance();
        in.setTime(this.getFecha_movimiento());
        int dia = in.get(Calendar.DAY_OF_MONTH);
        int mes = in.get(Calendar.MONTH);
        int anio = in.get(Calendar.YEAR);
        int lahora = in.get(Calendar.HOUR);
        int minutos = in.get(Calendar.MINUTE);
        Object fila[] = {this, this.getMonto(), dia + "/" + mes + "/" + anio, lahora + "/" + minutos};
        return fila;
    }
}
