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
public class Estado_Civil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public static final int Soltero = 0;
    public static final int Casado = 1;
    public static final int Viudo = 2;
    public static final int Divorciado = 3;
    private int estado;

    public Estado_Civil() {
    }

    public Estado_Civil(Integer id, int estado) {
        this.id = id;
        this.estado = estado;
        Hosteria.persistencia.insert(this);
    }

    public Estado_Civil(int estado) {
        this.estado = estado;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public static int getCasado() {
        return Casado;
    }

    public static int getDivorciado() {
        return Divorciado;
    }

    public static int getSoltero() {
        return Soltero;
    }

    public static int getViudo() {
        return Viudo;
    }

    public void setEstado(int estado) throws Exception {
        if (esValido(estado)) {
            this.estado = estado;
        } else {
            throw new Exception("Valor no valido para Estado Civil");
        }
    }

    public static boolean esValido(int estadoCivil) {
        switch (estadoCivil) {
            case Soltero:
                return true;
            case Casado:
                return true;
            case Viudo:
                return true;
            case Divorciado:
                return true;
            default:
                return false;
        }
    }

    public String toString() {

        switch (estado) {
            case Soltero:
                return "Soltero";
            case Casado:
                return "Casado";
            case Viudo:
                return "Viudo";
            case Divorciado:
                return "Divorciado";
            default:
                return "Error";

        }
    }
}
