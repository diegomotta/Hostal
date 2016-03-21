/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Renderers;

import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Reserva_Salon;
import LN.Alquileres.Reserva_Habitacion;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Lukas
 */
public class Pintar_Celdas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {


        if (o instanceof Reserva_Habitacion) {
            String val = ((Reserva_Habitacion) o).getApeVis();
            JLabel lbl = new JLabel(val);
            lbl.setBackground(Color.green);
            lbl.setOpaque(true);
            lbl.setFocusable(true);
            return lbl;
        } else if (o instanceof Hospedaje_Habitacion) {
            String val = ((Hospedaje_Habitacion) o).getUnVisitante().getApellido();
            JLabel lbl = new JLabel(val);
            lbl.setBackground(Color.red);
            lbl.setOpaque(true);
            lbl.setFocusable(true);
            return lbl;
        } else if (o instanceof Reserva_Salon) {
            String val = ((Reserva_Salon) o).getUnVisitante().getApellido();
            JLabel lbl = new JLabel(val);
            lbl.setBackground(Color.green);
            lbl.setOpaque(true);
            lbl.setFocusable(true);
            return lbl;
        } else if (o instanceof Hospedaje_Salon) {
            String val = ((Hospedaje_Salon) o).getUnVisitante().getApellido();
            JLabel lbl = new JLabel(val);
            lbl.setBackground(Color.red);
            lbl.setOpaque(true);
            lbl.setFocusable(true);
            return lbl;

        } else {
            return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        }



    }
}
