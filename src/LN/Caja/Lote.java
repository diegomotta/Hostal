package LN.Caja;

import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Lote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fechaLote;
    private Double saldoInicial;
    private Double saldoFinal;
    private String horaApertura;
    private String horaCierre;
    private Double totalRetirado;
    @OneToMany
    private List<Movimiento> movimientos;
    private boolean cerrado;

    public Lote() {
    }

    public Lote(Double saldoInicial, Double saldoFinal, String horaApertura, String horaCierre, Double totalRetirado, boolean estaCerrado) {
        this.id = 0;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.totalRetirado = totalRetirado;
        this.movimientos = new LinkedList<>();
        this.fechaLote = new Date();
        this.cerrado = false;

        Hosteria.persistencia.insert(this);
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public Date getFechaLote() {
        return fechaLote;
    }

    public void setFechaLote(Date fechaLote) {
        this.fechaLote = fechaLote;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Double getTotalRetirado() {
        return totalRetirado;
    }

    public void setTotalRetirado(Double totalRetirado) {
        this.totalRetirado = totalRetirado;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
//Date fecha_dia, String hora_mov, Double entrada, Double salida, String tipo, Conceptos concepto

    public void altaMovimiento(Date fecha_dia, String hora_mov, Double importe, String tipo, String concepto, String fuente, Integer comprobante) {
        Movimiento unMovimiento = new Movimiento(fecha_dia, hora_mov, importe, tipo, concepto, fuente, comprobante);
        this.movimientos.add(unMovimiento);
        Hosteria.persistencia.update(this);

    }
}
