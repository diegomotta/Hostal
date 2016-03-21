package Interface.Renderers;

import LN.Articulos.Articulos_Adquiridos;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;


public class Lista_articulosAdquiridos extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Articulos_Adquiridos) {
            JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            listCellRendererComponent.setText(((Articulos_Adquiridos) value).toLista());
            return listCellRendererComponent;
        } else {
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }

    }
}
