package LN.Articulos;

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
public class Faltante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Articulo unArticulo;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private double costoEtimado;
    private String causa;

    public Faltante() {
    }

    public Faltante(Articulo unArticulo, Date fecha, double costoEtimado, String causa) {
        this.id = 0;
        this.unArticulo = unArticulo;
        this.fecha = fecha;
        this.costoEtimado = costoEtimado;
        this.causa = causa;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Articulo getUnArticulo() {
        return unArticulo;
    }

    public void setUnArticulo(Articulo unArticulo) {
        this.unArticulo = unArticulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    public double getCostoEtimado() {
        return costoEtimado;
    }

    public void setCostoEtimado(double costoEtimado) {
        this.costoEtimado = costoEtimado;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    @Override
    public String toString() {
        return this.getUnArticulo().getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getCostoEtimado(), this.getUnArticulo().getArea_aplicacion(), this.getCausa(), new SimpleDateFormat("dd/MM/yyyy").format(this.getFecha())};
        return fila;
    }
}
