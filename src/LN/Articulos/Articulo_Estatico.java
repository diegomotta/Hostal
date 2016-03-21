package LN.Articulos;

import java.io.Serializable;
import javax.persistence.Entity;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Articulo_Estatico extends Articulo implements Serializable {

    private Double precio;

    public Articulo_Estatico() {
    }

    public Articulo_Estatico(Double precio, String nombre, Area area_aplicacion, Integer porTanto, Unidad_de_Medida unidad) {
        super(nombre, area_aplicacion, porTanto, unidad);
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    @Override
    public Object[] toVector() {
        Object fila[] = {this, this.getArea_aplicacion(), this.getCuantificacion() == null ? "Sin Detalle" : super.getCuantificacion().toString() + " " + super.getUnidad().toString(), this.getPrecio()};
        return fila;
    }
}
