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
public class Salon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numero;
    private String estado_ocupacion;
    private Integer capacidadMaxima;
    private boolean cocina;
    private boolean refrigeracion;
    private boolean estado_limpieza;
    private boolean habilitado;
    private boolean eliminado;

    public Salon() {
    }

    public Salon(Integer unNumero, boolean estado_limpieza, boolean habilitado, Integer max, boolean refrig, boolean cocina) {
        this.id = 0;
        this.numero = unNumero;
        this.estado_ocupacion = "Disponible";
        this.capacidadMaxima = max;
        this.refrigeracion = refrig;
        this.cocina = cocina;
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

    public boolean isEstado_limpieza() {
        return estado_limpieza;
    }

    public void setEstado_limpieza(boolean estado_limpieza) {
        this.estado_limpieza = estado_limpieza;
    }

    public boolean isCocina() {
        return cocina;
    }

    public void setCocina(boolean cocina) {
        this.cocina = cocina;
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

    public String getEstado_ocupacion() {
        return estado_ocupacion;
    }

    public void setEstado_ocupacion(String estado_ocupacion) {
        this.estado_ocupacion = estado_ocupacion;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }
    
    
    

    @Override
    public String toString() {
        return String.valueOf(this.getNumero());
    }
}
