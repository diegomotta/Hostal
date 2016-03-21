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
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public final static String Area_Limpieza = "Limpieza";
    public final static String Area_Habitaciones = "Habitaciones";
    public final static String Area_Salon = "Salón";
    public final static String Area_Pileta = "Pileta";
    public final static String Area_Mantenimiento = "Mantenimiento";
    public final static String Area_General = "General";
    private String tipo;

    public Area(String tipo) {
        this.id = 0;
        this.tipo = tipo;
        Hosteria.persistencia.insert(this);
    }

    public Area() {
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

    @Override
    public String toString() {
        switch (tipo) {
            case Area_Limpieza:
                return "Limpieza";
            case Area_Habitaciones:
                return "Habitaciones";
            case Area_Pileta:
                return "Pileta";
            case Area_Salon:
                return "Salón";
            case Area_Mantenimiento:
                return "Mantenimiento";
            case Area_General:
                return "General";
            default:
                return "Error";
        }
    }
}
