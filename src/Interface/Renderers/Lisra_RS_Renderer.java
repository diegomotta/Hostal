/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Renderers;

import LN.Alquileres.Reserva_Salon;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;


public class Lisra_RS_Renderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Reserva_Salon) {
            JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            listCellRendererComponent.setText(((Reserva_Salon) value).toLista());
            return listCellRendererComponent;
        } else {
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }

    }
}
