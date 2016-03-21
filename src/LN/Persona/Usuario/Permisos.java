package LN.Persona.Usuario;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Permisos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public final static String ra = "resalq";
    public final static String em = "eminf";
    public final static String br = "bres";
    public final static String bv = "bvis";
    public final static String usuarios = "us";
    public final static String rg = "regcom";
    public final static String backaud = "ibackaud";
    public final static String artic_falt = "iartfalt";
    public final static String op = "iop";
    public final static String oh = "ioh";
    public final static String os = "ios";
    public final static String ic = "ic";
    public final static String pout = "pout";
    public final static String pim = "pim";
    private String tipo;

    public Permisos() {
    }

    public Permisos(String tipo) {
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

    public static String getRa() {
        return ra;
    }

    public static String getEm() {
        return em;
    }

    public static String getBr() {
        return br;
    }

    public static String getBv() {
        return bv;
    }

    public static String getUsuarios() {
        return usuarios;
    }

    public static String getRg() {
        return rg;
    }

    public static String getBackaud() {
        return backaud;
    }

    public static String getArtic_falt() {
        return artic_falt;
    }

    public static String getOp() {
        return op;
    }

    public static String getOh() {
        return oh;
    }

    public static String getOs() {
        return os;
    }

    public static String getIc() {
        return ic;
    }

    public static String getPout() {
        return pout;
    }

    public static String getPim() {
        return pim;
    }
    
}
