package LN.Persona.Visitante;

import LN.Domicilios.Direccion;
import LN.Persona.Estado_Civil;
import LN.Persona.Persona;
import LN.Persona.Sexo;
import LN.Varios.Hosteria;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Visitante extends Persona implements Comparable {

    public static final String VISITANTE_TIPO_AFILIADO = "Afiliado";
    public static final String VISITANTE_TIPO_TERCERO = "Tercero";
    @ManyToOne
    private Estado_Civil estado_civil;
    private String telefono;
    private String e_mail;
    private String motivo_visita;
    private String ocupacion;
    private String condicion_af;

    public Visitante() {
    }

    public Visitante(Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af) {
        this.estado_civil = estado_civil;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.motivo_visita = motivo_visita;
        this.ocupacion = ocupacion;
        this.condicion_af = condicion_af;
        Hosteria.persistencia.insert(this);
    }

    public Visitante(Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af, Integer id, String nombre, String apellido, String dni, Date fnac, Sexo sexo, Direccion direccion) {
        super(id, nombre, apellido, dni, fnac, sexo, direccion);
        this.estado_civil = estado_civil;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.motivo_visita = motivo_visita;
        this.ocupacion = ocupacion;
        this.condicion_af = condicion_af;
        Hosteria.persistencia.insert(this);
    }

    public Estado_Civil getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(Estado_Civil estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getMotivo_visita() {
        return motivo_visita;
    }

    public void setMotivo_visita(String motivo_visita) {
        this.motivo_visita = motivo_visita;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCondicion_af() {
        return condicion_af;
    }

    public void setCondicion_af(String condicion_af) {
        this.condicion_af = condicion_af;
    }

    @Override
    public String toString() {
        return this.getApellido();
    }

    public Object[] toVector() {
        Object fila[] = {this, super.getNombre(), super.getDni(), super.getDireccion().getLocalidad(), super.getDireccion().getProvincia(), super.getDireccion().getPais(), this.getCondicion_af(), super.getSexo()};
        return fila;
    }

    @Override
    public int compareTo(Object t) {
        Visitante unVisitante = (Visitante) t;

        if (this.getApellido().compareToIgnoreCase(unVisitante.getApellido()) == 0) {
            if (this.getNombre().compareToIgnoreCase(unVisitante.getNombre()) == 0) {
                return this.getDni().compareTo(unVisitante.getDni());
            } else {
                return this.getNombre().compareToIgnoreCase(unVisitante.getNombre());
            }
        } else {
            return this.getApellido().compareToIgnoreCase(unVisitante.getApellido());
        }
    }
}
