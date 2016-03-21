package LN.Persona.Visitante;

import LN.Domicilios.Direccion;
import LN.Persona.Estado_Civil;
import LN.Persona.Sexo;
import java.util.Date;
import javax.persistence.Entity;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Afiliado extends Visitante implements Comparable {

    private String numero_carnet;

    public Afiliado(String numero_carnet) {
        this.numero_carnet = numero_carnet;
    }

    public Afiliado(String numero_carnet, Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af) {
        super(estado_civil, telefono, e_mail, motivo_visita, ocupacion, condicion_af);
        this.numero_carnet = numero_carnet;
    }

    public Afiliado(String numero_carnet, Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af, Integer id, String nombre, String apellido, String dni, Date fnac, Sexo sexo, Direccion direccion) {
        super(estado_civil, telefono, e_mail, motivo_visita, ocupacion, condicion_af, id, nombre, apellido, dni, fnac, sexo, direccion);
        this.numero_carnet = numero_carnet;
    }

    public Afiliado() {
    }

    public String getNumero_carnet() {
        return numero_carnet;
    }

    public void setNumero_carnet(String numero_carnet) {
        this.numero_carnet = numero_carnet;
    }

    @Override
    public int compareTo(Object t) {
        Afiliado unAfiliado = (Afiliado) t;

        if (this.getApellido().compareToIgnoreCase(unAfiliado.getApellido()) == 0) {
            if (this.getNombre().compareToIgnoreCase(unAfiliado.getNombre()) == 0) {
                return this.getDni().compareTo(unAfiliado.getDni());
            } else {
                return this.getNombre().compareToIgnoreCase(unAfiliado.getNombre());
            }
        } else {
            return this.getApellido().compareToIgnoreCase(unAfiliado.getApellido());
        }

    }
}
