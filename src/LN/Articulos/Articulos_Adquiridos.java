package LN.Articulos;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Articulos_Adquiridos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Articulo unArticulo;
    private double unPrecio;
    @OneToOne
    private Area unArea;
    private int cantidad;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    public Articulos_Adquiridos(Articulo unArticulo, double unPrecio, Area unArea, int unaCantidad) {
        this.unArticulo = unArticulo;
        this.unPrecio = unPrecio;
        this.unArea = unArea;
        this.cantidad = unaCantidad;
        this.fecha = new Date();
        Hosteria.persistencia.insert(this);
    }

    public Articulos_Adquiridos() {
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

    public double getUnPrecio() {
        return unPrecio;
    }

    public void setUnPrecio(double unPrecio) {
        this.unPrecio = unPrecio;
    }

    public Area getUnArea() {
        return unArea;
    }

    public void setUnArea(Area unArea) {
        this.unArea = unArea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String toLista() {
        return String.valueOf(this.getCantidad() + " unidad/es de " + this.getUnArticulo().getNombre() + " a $" + this.getUnPrecio() + " la unidad");
    }

    @Override
    public String toString() {
        return this.getUnArticulo().getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getUnPrecio(), this.getCantidad(), (this.getUnPrecio() * this.getCantidad()), this.getUnArticulo().getArea_aplicacion(), new SimpleDateFormat("dd/MM/yyyy").format(this.getFecha())};
        return fila;
    }
}
