package LN.Persona.Usuario;

import LN.Domicilios.Direccion;
import LN.Persona.Estado_Civil;
import LN.Persona.Persona;
import LN.Persona.Sexo;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Usuario extends Persona {

    private String pasword;
    private String usserame;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date creadoDia;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date diasHabilitado;
    private String creadoHora;
    private String telefono;
    @OneToOne
    private Rol rol;
    @ManyToOne
    private Estado_Civil estado_civil;
    private String e_mail;
    private String numeroCarnet;

    public Usuario() {
    }

    public Usuario(String pasword, String usserame, String creadoHora, String telefono, String numeroCarnet, Rol rol, Estado_Civil estado_civil, String e_mail) {
        this.pasword = pasword;
        this.usserame = usserame;
        this.creadoDia = new Date();
        this.diasHabilitado = devolverLimite();
        this.creadoHora = creadoHora;
        this.telefono = telefono;
        this.numeroCarnet = numeroCarnet;
        this.rol = rol;
        this.estado_civil = estado_civil;
        this.e_mail = e_mail;
        Hosteria.persistencia.insert(this);
    }

    public Usuario(String pasword, String usserame, String creadoHora, String telefono,String numeroCarnet, Rol rol, Estado_Civil estado_civil, String e_mail, Integer id, String nombre, String apellido, String dni, Date fnac, Sexo sexo, Direccion direccion, String domicilio) {
        super(id, nombre, apellido, dni, fnac, sexo, direccion);
        this.pasword = pasword;
        this.usserame = usserame;
        this.creadoDia = new Date();
        this.diasHabilitado = devolverLimite();
        this.creadoHora = creadoHora;
        this.telefono = telefono;
        this.numeroCarnet = numeroCarnet;
        this.rol = rol;
        this.estado_civil = estado_civil;
        this.e_mail = e_mail;
        Hosteria.persistencia.insert(this);
    }

    public Estado_Civil getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(Estado_Civil estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Date getDiasHabilitado() {
        return diasHabilitado;
    }

    public void setDiasHabilitado(Date diasHabilitado) {
        this.diasHabilitado = diasHabilitado;
    }

//    public void setRol(String rol) {
//        switch (rol) {
//            case ADMINISTRADOR:
//                this.rol = "Administrador";
//            case OPERADOR:
//                this.rol = "Operador";
//            default:
//
//        }
//    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getUsserame() {
        return usserame;
    }

    public void setUsserame(String usserame) {
        this.usserame = usserame;
    }

    public Date getCreadoDia() {
        return creadoDia;
    }

    public void setCreadoDia(Date creadoDia) {
        this.creadoDia = creadoDia;
    }

    public String getCreadoHora() {
        return creadoHora;
    }

    public void setCreadoHora(String creadoHora) {
        this.creadoHora = creadoHora;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(String numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }
    
    

    public static Date devolverLimite() {
        Calendar unCalendar = Calendar.getInstance();
        unCalendar.add(Calendar.MONTH, 3);
        return unCalendar.getTime();
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getApellido(), this.getUsserame(), this.getRol(), this.getDni(), this.getTelefono()};
        return fila;
    }
}
