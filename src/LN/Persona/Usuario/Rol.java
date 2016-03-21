package LN.Persona.Usuario;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreRol;
    @OneToMany
    private Map<String, Permisos> permisos;
    
    public Rol() {
    }
    
    public Rol(String nombreRol, Map<String, Permisos> permisos) {
        this.nombreRol = nombreRol;
        this.permisos = permisos;
        Hosteria.persistencia.insert(this);
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombreRol() {
        return nombreRol;
    }
    
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Map<String, Permisos> getPermisos() {
        return permisos;
    }

    public void setPermisos(Map<String, Permisos> permisos) {
        this.permisos = permisos;
    }

    
    @Override
    public String toString() {
        return this.getNombreRol();
    }
    
     public Object[] toVector() {
        Object fila[] = {this};
        return fila;
    }
}
