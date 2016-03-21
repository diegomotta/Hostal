package LN.Articulos;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Articulo implements Comparable<Articulo>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @ManyToOne
    private Unidad_de_Medida unidad;
    @ManyToOne
    private Area area_aplicacion;
    private Integer cuantificacion;

    public Articulo(String nombre, Area area_aplicacion, Integer porTanto, Unidad_de_Medida unidad) {
        this.id = 0;
        this.nombre = nombre;
        this.unidad = unidad;
        this.area_aplicacion = area_aplicacion;

        this.cuantificacion = porTanto;
        Hosteria.persistencia.insert(this);
    }

    public Articulo() {
    }

    public Area getArea_aplicacion() {
        return area_aplicacion;
    }

    public void setArea_aplicacion(Area area_aplicacion) {
        this.area_aplicacion = area_aplicacion;
    }

    public Integer getCuantificacion() {
        return cuantificacion;
    }

    public void setCuantificacion(Integer cuantificacion) {
        this.cuantificacion = cuantificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Unidad_de_Medida getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad_de_Medida unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getArea_aplicacion(), cuantificacion == null ? "Sin Detalle" : cuantificacion.toString() + " " + unidad.toString()};
        return fila;
    }

    @Override
    public int compareTo(Articulo t) {
        if (this.nombre.compareToIgnoreCase(t.getNombre()) == 0) {
            return this.unidad.getNombre().compareTo(t.getUnidad().getNombre());
        } else {
            return this.nombre.compareToIgnoreCase(t.getNombre());
        }
    }
}