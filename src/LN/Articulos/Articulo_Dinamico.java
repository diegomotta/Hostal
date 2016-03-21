package LN.Articulos;

import java.io.Serializable;
import javax.persistence.Entity;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Articulo_Dinamico extends Articulo implements Serializable {

    public Articulo_Dinamico(String nombre, Area area_aplicacion, Integer porTanto, Unidad_de_Medida unidad) {
        super(nombre, area_aplicacion, porTanto, unidad);
    }

    public Articulo_Dinamico() {
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    @Override
    public Object[] toVector() {
        Object fila[] = {this, this.getArea_aplicacion(), this.getCuantificacion() == null ? "Sin Detalle" : super.getCuantificacion().toString() + " " + super.getUnidad().toString(), "Sin Precio"};
        return fila;
    }
}
