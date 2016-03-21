package LN.Alquileres;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Habitacion implements Serializable, Comparable<Habitacion> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numero;
    private String estado_ocupacion;
    private boolean estado_limpieza;
    private boolean habilitado;
    private boolean eliminado;

    public Habitacion() {
    }

    public Habitacion(Integer numero, String estado_ocupacion, boolean estado_limpieza, boolean habilitado) {

        this.id = 0;
        this.numero = numero;
        this.estado_ocupacion = estado_ocupacion;
        this.estado_limpieza = estado_limpieza;
        this.habilitado = habilitado;
        this.eliminado = false;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstado_ocupacion() {
        return estado_ocupacion;
    }

    public void setEstado_ocupacion(String estado_ocupacion) {
        this.estado_ocupacion = estado_ocupacion;
    }

    public boolean isEstado_limpieza() {
        return estado_limpieza;
    }

    public void setEstado_limpieza(boolean estado_limpieza) {
        this.estado_limpieza = estado_limpieza;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    @Override
    public String toString() {
        return String.valueOf(this.getNumero());
    }

    @Override
    public int compareTo(Habitacion o) {
        return this.numero.compareTo(o.getNumero());
    }
}
