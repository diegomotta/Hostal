package Interface.Hoteleria;

import Interface.Renderers.Lisra_RS_Renderer;
import LN.Alquileres.Reserva_Salon;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

public class Capturar_RS extends javax.swing.JPanel {

    public Reserva_Salon unaReserva_Salon = null;

    public Capturar_RS(List<Reserva_Salon> reservas) {
        initComponents();
        DefaultListModel modelo = new DefaultListModel();

        Lista_RS.setCellRenderer(new Lisra_RS_Renderer());
        
        for (Reserva_Salon unaReserva : reservas) {
            modelo.addElement(unaReserva);
        }
        Lista_RS.setModel(modelo);


//TableColumn tcol = unaTabla.getColumnModel().getColumn(c);
//tcol.setCellRenderer(new Pintar_Celdas());
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
            unaReserva_Salon = (Reserva_Salon) Lista_RS.getSelectedValue();
            SwingUtilities.getWindowAncestor(this).dispose();
        }
    }//GEN-LAST:event_Lista_RSMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Lista_RS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public Reserva_Salon getUnaReserva_Salon() {
        return unaReserva_Salon;
    }

    public void setUnaReserva_Salon(Reserva_Salon unaReserva_Salon) {
        this.unaReserva_Salon = unaReserva_Salon;
    }
}
