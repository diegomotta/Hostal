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
public class Tipo_Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public final static String DOCUMENTO_NACIONAL_IDENTIDAD = "DNI";
    public final static String REGISTRO_GERAL = "RG";
    public final static String CEDULA_IDENTIDAD = "CI";
    public final static String CEDULA_CIUDADANIA = "CC";
    public final static String DOCUMENTO_UNICO_IDENTIDAD = "DUI";
    public final static String DOCUMENTO_PERSONAL_IDENTIFICACION = "DPI";
    public final static String OTRA_IDENTIFICACION = "OTRO";
    private String tipo;

    public Tipo_Documento() {
    }

    public Tipo_Documento(String tipo) {
        this.tipo = tipo;
        Hosteria.persistencia.insert(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getCEDULA_CIUDADANIA() {
        return CEDULA_CIUDADANIA;
    }

    public static String getCEDULA_IDENTIDAD() {
        return CEDULA_IDENTIDAD;
    }

    public static String getDOCUMENTO_NACIONAL_IDENTIDAD() {
        return DOCUMENTO_NACIONAL_IDENTIDAD;
    }

    public static String getDOCUMENTO_PERSONAL_IDENTIFICACION() {
        return DOCUMENTO_PERSONAL_IDENTIFICACION;
    }

    public static String getDOCUMENTO_UNICO_IDENTIDAD() {
        return DOCUMENTO_UNICO_IDENTIDAD;
    }

    public static String getOTRA_IDENTIFICACION() {
        return OTRA_IDENTIFICACION;
    }

    public static String getREGISTRO_GERAL() {
        return REGISTRO_GERAL;
    }

    @Override
    public String toString() {
        switch (tipo) {
            case DOCUMENTO_NACIONAL_IDENTIDAD:
                return "DNI";
            case CEDULA_IDENTIDAD:
                return "CI";
            case CEDULA_CIUDADANIA:
                return "CC";
            case DOCUMENTO_PERSONAL_IDENTIFICACION:
                return "DPI";
            case DOCUMENTO_UNICO_IDENTIDAD:
                return "DUI";
            case REGISTRO_GERAL:
                return "RG";
            case OTRA_IDENTIFICACION:
                return "OTRO";
            default:
                return "Error";

        }


    }
}
