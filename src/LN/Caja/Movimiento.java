package LN.Caja;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Movimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fecha_dia;
    private String hora_mov;
    private Double importe;
    private static final String EGRESO = "Egreso";
    private static final String INGRESO = "Ingreso";
    private String tipo;
    private String fuente;
    private String concepto;
    private Integer numeroComprobante;

    public Movimiento() {
    }

    public Movimiento(Date fecha_dia, String hora_mov, Double entrada, String tipo, String concepto, String fuente, Integer comprobante) {
        this.id = 0;
        this.fecha_dia = fecha_dia;
        this.hora_mov = hora_mov;
        this.importe = entrada;
        this.tipo = tipo;
        this.concepto = concepto;
        this.numeroComprobante = comprobante;
        this.fuente = fuente;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_dia() {
        return fecha_dia;
    }

    public void setFecha_dia(Date fecha_dia) {
        this.fecha_dia = fecha_dia;
    }

    public String getHora_mov() {
        return hora_mov;
    }

    public void setHora_mov(String hora_mov) {
        this.hora_mov = hora_mov;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Integer getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(Integer numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    
    
    @Override
    public String toString() {
        return this.getTipo();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getFuente(), this.getImporte(), this.getConcepto(), new SimpleDateFormat("dd/MM/yyyy").format(this.getFecha_dia()), this.getHora_mov(), this.getNumeroComprobante()};
        return fila;
    }
}
