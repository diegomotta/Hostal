package LN.Caja;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Conceptos implements Comparable<Conceptos>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;
    private String detalle;

    public Conceptos() {
    }

    public Conceptos(String tipo, String detalle) {
        this.id = 0;
        this.tipo = tipo;
        this.detalle = detalle;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return this.getDetalle();
    }

    public Object[] toVector() {
        Object fila[] = {this.getTipo(), this};
        return fila;
    }

    @Override
    public int compareTo(Conceptos t) {
        if (this.tipo.compareToIgnoreCase(t.getTipo()) == 0) {
            return this.detalle.compareTo(getDetalle());
        } else {
            return this.tipo.compareToIgnoreCase(t.getTipo());
        }
    }
}
