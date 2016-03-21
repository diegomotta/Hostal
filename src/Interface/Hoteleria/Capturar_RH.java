
package Interface.Hoteleria;

import Interface.Renderers.Lista_RH;
import LN.Alquileres.Reserva_Habitacion;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;


public class Capturar_RH extends javax.swing.JPanel {

 public Reserva_Habitacion unaReserva_Habitacion = null;
    public Capturar_RH(List<Reserva_Habitacion> reservas) {
        initComponents();
        
        DefaultListModel modelo = new DefaultListModel();

        Lista_RS.setCellRenderer(new Lista_RH());
        
        for (Reserva_Habitacion unaReserva : reservas) {
            modelo.addElement(unaReserva);
        }
        Lista_RS.setModel(modelo);
    }

    public Reserva_Habitacion getUnaReserva_Habitacion() {
        return unaReserva_Habitacion;
    }

    public void setUnaReserva_Habitacion(Reserva_Habitacion unaReserva_Habitacion) {
        this.unaReserva_Habitacion = unaReserva_Habitacion;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_RS = new javax.swing.JList();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Lista_RS.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Reservas Activas"));
        Lista_RS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista_RSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista_RS);

        jPanel1.add(jScrollPane1);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void Lista_RSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista_RSMouseClicked
        if (evt.getClickCount() == 2) {
            unaReserva_Habitacion = (Reserva_Habitacion) Lista_RS.getSelectedValue();
            SwingUtilities.getWindowAncestor(this).dispose();
        }
    }//GEN-LAST:event_Lista_RSMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Lista_RS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
