package LN.Persona;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Sexo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    public static final int VARON = 0;
    public static final int MUJER = 1;
    public static final int NO_ESPECIFICADO = 2;
    protected int sexo;

    public Sexo() {
    }

    public int getSexo() {
        return sexo;
    }

    public Sexo(Integer id, int sexo) {
        this.id = id;
        this.sexo = sexo;
        Hosteria.persistencia.insert(this);
    }

    public Sexo(int sexo) {
        this.sexo = sexo;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static int getMUJER() {
        return MUJER;
    }

    public static int getNO_ESPECIFICADO() {
        return NO_ESPECIFICADO;
    }

    public static int getVARON() {
        return VARON;
    }

    public void setSexo(int sexo) throws Exception {
        if (esValorValido(sexo)) {
            this.sexo = sexo;
        } else {
            throw new Exception("Valor no valido para sexo");
        }

    }

    public static boolean esValorValido(int sexo) {
        switch (sexo) {
            case VARON:
                return true;
            case MUJER:
                return true;
            case NO_ESPECIFICADO:
                return true;
            default:
                return false;
        }
    }

    public Object[] toVector() {
        Object fila[] = {this};
        return fila;
    }

    @Override
    public String toString() {

        switch (sexo) {
            case VARON:
                return "Varon";
            case MUJER:
                return "Mujer";
            case NO_ESPECIFICADO:
                return "No Especificado";
            default:
                return "Error";

        }
    }
}
