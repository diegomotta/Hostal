
package LN.Articulos;

import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroFactura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    private String hora;
    @OneToMany
    private List<Articulos_Adquiridos> articulosRelacionados;
    private int cantidadArticulos;
    private double montoCompra;
    @ManyToOne
    private Usuario usuarioResponsable;
    @OneToOne
    private Establecimiento unEstablecimiento;

    public Compra(String numeroFactura, Date fecha, String hora, List<Articulos_Adquiridos> articulosRelacionados, int cantidadArticulos, double montoCompra, Establecimiento unEstablecimiento) {
        this.id = 0;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.hora = hora;
        this.articulosRelacionados = articulosRelacionados;
        this.cantidadArticulos = cantidadArticulos;
        this.montoCompra = montoCompra;
        this.unEstablecimiento = unEstablecimiento;
        Hosteria.persistencia.insert(this);
    }

    public Compra() {
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Articulos_Adquiridos> getArticulosRelacionados() {
        return articulosRelacionados;
    }

    public void setArticulosRelacionados(List<Articulos_Adquiridos> articulosRelacionados) {
        this.articulosRelacionados = articulosRelacionados;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public Usuario getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(Usuario usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    public Establecimiento getUnEstablecimiento() {
        return unEstablecimiento;
    }

    public void setUnEstablecimiento(Establecimiento unEstablecimiento) {
        this.unEstablecimiento = unEstablecimiento;
    }

    
}
