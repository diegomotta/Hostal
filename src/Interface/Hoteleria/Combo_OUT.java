/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hoteleria;

import LN.Alquileres.Movimiento_Hospedaje;
import javax.swing.JCheckBox;

/**
 *
 * @author Lukas
 */
public class Combo_OUT extends JCheckBox {

    private Object movimientoAsociado;

    public Combo_OUT(Object movimientoAsociado) {
        this.movimientoAsociado = movimientoAsociado;
        if (movimientoAsociado instanceof Movimiento_Hospedaje) {
            this.setLabel(((Movimiento_Hospedaje) movimientoAsociado).getTipo());

        }



    }

    public Object getMovimientoAsociado() {
        return movimientoAsociado;
    }

    public void setMovimientoAsociado(Object movimientoAsociado) {
        this.movimientoAsociado = movimientoAsociado;
    }
}
