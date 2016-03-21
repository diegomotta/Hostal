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
public class Tarifa_Salon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public final static String S = "Salon";
    public final static String SL = "Salon + Limpieza";
    public final static String SS = "Salon + Sonido";
    public final static String SC = "Salon + Cocina";
    public final static String SLS = "Salon + Limpieza + Sonido";
    public final static String SLC = "Salon + Limpieza + Cocina";
    public final static String SCS = "Salon + Cocina + Sonido";
    public final static String SLCS = "Completo";
    public final static String LIBRE = "Sin Cargo";
    private String tipo;
    private double precio;

    public Tarifa_Salon() {
    }

    public Tarifa_Salon(String tipo, double precio) {
        this.id = 0;
        this.tipo = tipo;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getS() {
        return S;
    }

    public static String getSL() {
        return SL;
    }

    public static String getSS() {
        return SS;
    }

    public static String getSC() {
        return SC;
    }

    public static String getSLS() {
        return SLS;
    }

    public static String getSCS() {
        return SCS;
    }

    public static String getSLCS() {
        return SLCS;
    }

    public static String getLIBRE() {
        return LIBRE;
    }

    public static String getSLC() {
        return SLC;
    }
    

    @Override
    public String toString() {
        switch (tipo) {
            case S:
                return "Salon";
            case SL:
                return "Salon + Limpieza";
            case SS:
                return "Salon + Sonido";
            case SC:
                return "Salon + Cocina";
            case SLS:
                return "Salon + Limpieza + Sonido";
            case SLC:
                return "Salon + Limpieza + Cocina";
            case SCS:
                return "Salon + Cocina + Sonido";
            case SLCS:
                return "Completo";
            case LIBRE:
                return "Sin Cargo";
            default:
                return "Error";



        }
    }
}
