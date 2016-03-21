package LN.Alquileres;

import Interface.GUIM;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Hospedaje_Habitacion extends Hospedaje implements Serializable {
    
    @ManyToOne
    private Habitacion unaHabitacion;
    @ManyToOne
    private Tarifa_Habitacion unaTarifa_Habitacion;
    
    public Hospedaje_Habitacion() {
    }
    
    public Hospedaje_Habitacion(Habitacion unaHabitacion, Tarifa_Habitacion unaTarifa_Habitacion, Visitante unVisitante, Date ingreso, Date egreso, double descuento) {
        super(unVisitante, ingreso, egreso, descuento);
        this.unaHabitacion = unaHabitacion;
        this.unaTarifa_Habitacion = unaTarifa_Habitacion;
        Hosteria.persistencia.insert(this);
    }
    
    public Habitacion getUnaHabitacion() {
        return unaHabitacion;
    }
    
    public void setUnaHabitacion(Habitacion unaHabitacion) {
        this.unaHabitacion = unaHabitacion;
    }
    
    public Tarifa_Habitacion getUnaTarifa_Habitacion() {
        return unaTarifa_Habitacion;
    }
    
    public void setUnaTarifa_Habitacion(Tarifa_Habitacion unaTarifa_Habitacion) {
        this.unaTarifa_Habitacion = unaTarifa_Habitacion;
    }
    
    @Override
    public String toString() {
        return super.getUnVisitante().getApellido();
    }
    
    public Object[] toVector() {
        Object fila[] = {this.getUnaHabitacion().getNumero(), this};
        return fila;
    }
    
    public Object[] toVector2() {
        Calendar in = Calendar.getInstance();
        in.setTime(this.getIngreso());
        int dia = in.get(Calendar.DAY_OF_MONTH);
        int mes = in.get(Calendar.MONTH);
        int anio = in.get(Calendar.YEAR);
        int hora = in.get(Calendar.HOUR);
        int minutos = in.get(Calendar.MINUTE);
        
        Object fila[] = {dia + "/" + mes + "/" + anio, hora + "/" + minutos, this.getUnaTarifa_Habitacion().getTipo(), this.getUnaTarifa_Habitacion().getPrecio(), 0.00};
        return fila;
    }
    
    public Object[] toVector3() {
        Double total = 0.0;
        for (Movimiento_Hospedaje unMovimiento_Hospedaje : this.getMovimientos()) {
            if (!unMovimiento_Hospedaje.getTipo().equals("Anticipo")) {
                total += unMovimiento_Hospedaje.getMonto();
            }
        }
        Object fila[] = {this.getUnaTarifa_Habitacion().getTipo(), this, this.getUnVisitante().getApellido() + " " + this.getUnVisitante().getNombre(), new SimpleDateFormat("dd/MM/yyyy").format(this.getIngreso()), new SimpleDateFormat("dd/MM/yyyy").format(this.getEgreso()), this.getDescuento(), total};
        return fila;
    }
    
    public Object[] toHistorial() {
        Calendar in = Calendar.getInstance();
        in.setTime(this.getIngreso());
        int dia = in.get(Calendar.DAY_OF_MONTH);
        int mes = in.get(Calendar.MONTH);
        int anio = in.get(Calendar.YEAR);
        int hora = in.get(Calendar.HOUR);
        int minutos = in.get(Calendar.MINUTE);
        
        Object fila[] = {this.getUnaHabitacion(), this.getUnaTarifa_Habitacion().getTipo(), this.getUnVisitante().getApellido() + " " + this.getUnVisitante().getNombre(), this.getIngreso(), this.getEgreso()};
        return fila;
    }
    
    public void cambiarHabitacion(Habitacion nuevaHabitacion, Hospedaje_Habitacion unHospedaje_Habitacion) throws Exception {
        if (nuevaHabitacion instanceof Habitacion && unHospedaje_Habitacion instanceof Hospedaje_Habitacion) {
            Habitacion vieja = unHospedaje_Habitacion.getUnaHabitacion();
            vieja.setHabilitado(true);
            vieja.setEstado_limpieza(true);
            vieja.setEstado_ocupacion("Disponible");
            unHospedaje_Habitacion.setUnaHabitacion(nuevaHabitacion);
            nuevaHabitacion.setEstado_ocupacion("Ocupada");
            Hosteria.persistencia.update(this);
            
        } else {
            throw new Exception("Ha ocurrido un Error en la recepcion de los parametros necesarios");
        }
    }
    
    public boolean verSalida(Hospedaje_Habitacion unHospedaje_Habitacion) {
        
        Calendar salidaSupuesta = Calendar.getInstance();
        salidaSupuesta.setTime(unHospedaje_Habitacion.getEgreso());
        Calendar hoy = Calendar.getInstance();
        if ((salidaSupuesta.get(Calendar.YEAR) == hoy.get(Calendar.YEAR)) && (salidaSupuesta.get(Calendar.DAY_OF_YEAR) == hoy.get(Calendar.DAY_OF_YEAR))) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void corregirMonto(Hospedaje_Habitacion unHospedaje_Habitacion) {
        
        Double monto;
        int diasCalculados = GUIM.diferenciasDeFechas(unHospedaje_Habitacion.getIngreso(), new Date());
        Movimiento_Hospedaje unmovimiento = unHospedaje_Habitacion.getMovimientos().get(0);
        if (diasCalculados == 0) {
            monto = unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() * 0.5;
            unHospedaje_Habitacion.setEgreso(new Date());
        } else {
            if (unHospedaje_Habitacion.getDescuento() != 0.0) {
                monto = (unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() - ((unHospedaje_Habitacion.getDescuento() * unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio()) / 100)) * diasCalculados;
                unHospedaje_Habitacion.setEgreso(new Date());
            } else {
                monto = unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() * diasCalculados;
                unHospedaje_Habitacion.setEgreso(new Date());
            }
            
        }
        unmovimiento.setMonto(monto);
        Hosteria.persistencia.update(this);
        
    }

    public void corregirMovimiento(Hospedaje_Habitacion unHospedaje_Habitacion) {
        
        Double monto;
        int diasCalculados = GUIM.diferenciasDeFechas(unHospedaje_Habitacion.getIngreso(), unHospedaje_Habitacion.getEgreso());
        Movimiento_Hospedaje unmovimiento = unHospedaje_Habitacion.getMovimientos().get(0);
        if (diasCalculados == 0) {
            monto = unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() * 0.5;
        } else {
            if (unHospedaje_Habitacion.getDescuento() != 0.0) {
                monto = (unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() - ((unHospedaje_Habitacion.getDescuento() * unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio()) / 100)) * diasCalculados;
                
            } else {
                monto = unHospedaje_Habitacion.getUnaTarifa_Habitacion().getPrecio() * diasCalculados;
                
            }
            
        }
        unmovimiento.setMonto(monto);
        unmovimiento.setTipo(unHospedaje_Habitacion.getUnaTarifa_Habitacion().getTipo());
        Hosteria.persistencia.update(this);
        
    }
}
