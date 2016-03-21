/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LN.Caja;

import LN.Varios.Hosteria;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Cupon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Tarjeta tarjeta;
    private String numeroTarjeta;
    private String numeroCupon;
    private String titular;
    private double importe;
    
    public Cupon() {
    }
    
    public Cupon(Tarjeta tarjeta, String numeroTarjeta, String numeroCupon, String titular, double importe) {
        this.id = 0;
        this.tarjeta = tarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.numeroCupon = numeroCupon;
        this.titular = titular;
        this.importe = importe;
        Hosteria.persistencia.insert(this);
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    public String getNumeroCupon() {
        return numeroCupon;
    }
    
    public void setNumeroCupon(String numeroCupon) {
        this.numeroCupon = numeroCupon;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getImporte() {
        return importe;
    }
    
    public void setImporte(double importe) {
        this.importe = importe;
    }
}
