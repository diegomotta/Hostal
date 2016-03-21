/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Renderers;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Lukas
 */
public class Renderer_Reservas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if (i == 0) {
            return jtable.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(jtable, o, bln, bln1, 0, 0);
        }



        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
    }
}
