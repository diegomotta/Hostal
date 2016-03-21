package LN.Persona.Visitante;

import LN.Domicilios.Direccion;
import LN.Persona.Estado_Civil;
import LN.Persona.Sexo;
import java.util.Date;
import javax.persistence.Entity;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Tercero extends Visitante {

    public Tercero() {
    }

    public Tercero(Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af) {
        super(estado_civil, telefono, e_mail, motivo_visita, ocupacion, condicion_af);
    }

    public Tercero(Estado_Civil estado_civil, String telefono, String e_mail, String motivo_visita, String ocupacion, String condicion_af, Integer id, String nombre, String apellido, String dni, Date fnac, Sexo sexo, Direccion direccion) {
        super(estado_civil, telefono, e_mail, motivo_visita, ocupacion, condicion_af, id, nombre, apellido, dni, fnac, sexo, direccion);
    }
}
