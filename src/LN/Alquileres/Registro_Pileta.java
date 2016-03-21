/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LN.Alquileres;

import LN.Persona.Visitante.Afiliado;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Registro_Pileta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Afiliado unAfiliado;
    private int total_afiliados;
    private int total_entradas;
    private double monto_entradas;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_entrada;

    public Registro_Pileta() {
    }

    public Registro_Pileta(Afiliado unAfiliado, int total_afiliados, int total_entradas, double monto_entradas, Date fecha_entrada) {
        this.id = 0;
        this.unAfiliado = unAfiliado;
        this.total_afiliados = total_afiliados;
        this.total_entradas = total_entradas;
        this.monto_entradas = monto_entradas;
        this.fecha_entrada = fecha_entrada;
        Hosteria.persistencia.insert(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Afiliado getUnAfiliado() {
        return unAfiliado;
    }

    public void setUnAfiliado(Afiliado unAfiliado) {
        this.unAfiliado = unAfiliado;
    }

    public int getTotal_afiliados() {
        return total_afiliados;
    }

    public void setTotal_afiliados(int total_afiliados) {
        this.total_afiliados = total_afiliados;
    }

    public int getTotal_entradas() {
        return total_entradas;
    }

    public void setTotal_entradas(int total_entradas) {
        this.total_entradas = total_entradas;
    }

    public double getMonto_entradas() {
        return monto_entradas;
    }

    public void setMonto_entradas(double monto_entradas) {
        this.monto_entradas = monto_entradas;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    @Override
    public String toString() {
        return this.getUnAfiliado().getApellido() + " " + this.getUnAfiliado().getNombre();
    }

    public Object[] toRegistro() {
        Object fila[] = {this, this.getTotal_entradas(), this.getMonto_entradas(), new SimpleDateFormat("dd/MM/yyyy - hh:mm").format(this.getFecha_entrada())};
        return fila;
    }
}
