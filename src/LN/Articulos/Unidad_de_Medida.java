package LN.Articulos;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Unidad_de_Medida implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String nombre;
    private String abreviacion;

    public Unidad_de_Medida(String nombre, String abreviacion) {
        this.id = 0;
        this.nombre = nombre;
        this.abreviacion = abreviacion;
        Hosteria.persistencia.insert(this);


    }

    public Unidad_de_Medida() {
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
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

    @Override
    public String toString() {
        return this.getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getAbreviacion()};
        return fila;
    }
}
