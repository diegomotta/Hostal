package Log_Auditoria;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Auditoria_Operacional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String operacion;
    private String usuarioResponsable;
    private String detalle;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String hora;

    public Auditoria_Operacional() {
    } 
    
    public Auditoria_Operacional(String unaOp, String detalle, String usuario, String hora) {
        this.id = 0;
        this.operacion = unaOp;
        this.detalle = detalle;
        this.fecha = new Date();
        this.hora = hora;
        this.usuarioResponsable = usuario;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

     
    
    public String getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(String usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return this.getOperacion();
    }
    
     public Object[] toVector() {
        Object fila[] = {this, this.getUsuarioResponsable(),this.getDetalle(), new SimpleDateFormat("dd/MM/yyyy").format(this.getFecha()), this.getHora()};
        return fila;
    }
    
}
