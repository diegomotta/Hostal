package LN.Articulos;

import LN.Varios.Hosteria;
import LN.Varios.Numero;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Establecimiento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToMany
    private List<Numero> numeros;
    
    public Establecimiento() {
    }
    
    public Establecimiento(String nombre) {
        this.id = 0;
        this.nombre = nombre;
        this.numeros = new LinkedList<>();
        Hosteria.persistencia.insert(this);
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
    
    public List<Numero> getNumeros() {
        return numeros;
    }
    
    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }
    
    public Numero obtenerNumeroComprobante(String numero) {
        Numero retornar = null;
        for (Numero unNumero : this.getNumeros()) {
            if (unNumero.getNumero().toUpperCase().equals(numero.toUpperCase())) {
                retornar = unNumero;
            }
        }
        return retornar;
        
    }
    
    public Numero agregarNumero(String unNumero) {
        Numero nuevoNumero = new Numero(unNumero);
        this.numeros.add(nuevoNumero);
        Hosteria.persistencia.update(this);
        return nuevoNumero;
    }
}
