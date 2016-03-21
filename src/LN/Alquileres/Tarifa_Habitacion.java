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
public class Tarifa_Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public final static String SINGLE = "Single";
    public final static String DOBLE_MATRIMONIAL = "Doble Matrimonial";
    public final static String DOBLE_SEPARADA = "Doble Separada";
    public final static String TRIBLE_MAT_1 = "Matrimonial + 1";
    public final static String TRIBLE_SEPARADA = "Trible Separada";
    public final static String CUADRUBLE_MAT_2 = "Matrimonial + 2";
    public final static String CUADRUBLE_SEPARADA = "Cuadruble Separada";
    public final static String LIBRE = "Sin Cargo";
    private String tipo;
    private double precio;

    public Tarifa_Habitacion() {
    }

    public Tarifa_Habitacion(String tipo, double precio) {
        this.id = 0;
        this.tipo = tipo;
        this.precio = precio;
        Hosteria.persistencia.insert(this);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public static String getSINGLE() {
        return SINGLE;
    }

    public static String getDOBLE_MATRIMONIAL() {
        return DOBLE_MATRIMONIAL;
    }

    public static String getDOBLE_SEPARADA() {
        return DOBLE_SEPARADA;
    }

    public static String getTRIBLE_MAT_1() {
        return TRIBLE_MAT_1;
    }

    public static String getTRIBLE_SEPARADA() {
        return TRIBLE_SEPARADA;
    }

    public static String getCUADRUBLE_MAT_2() {
        return CUADRUBLE_MAT_2;
    }

    public static String getCUADRUBLE_SEPARADA() {
        return CUADRUBLE_SEPARADA;
    }

    public static String getLIBRE() {
        return LIBRE;
    }

    @Override
    public String toString() {
        switch (tipo) {
            case SINGLE:
                return "Single";
            case DOBLE_MATRIMONIAL:
                return "Doble Matrimonial";
            case DOBLE_SEPARADA:
                return "Doble Separada";
            case TRIBLE_MAT_1:
                return "Matrimonial + 1";
            case TRIBLE_SEPARADA:
                return "Trible Separada";
            case CUADRUBLE_MAT_2:
                return "Matrimonial + 2";
            case CUADRUBLE_SEPARADA:
                return "Cuadruble Separada";
            case LIBRE:
                return "Sin Cargo";
            default:
                return "Error";
        }
    }
}
