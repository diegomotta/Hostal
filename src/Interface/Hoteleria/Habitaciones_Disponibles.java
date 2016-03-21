
package Interface.Hoteleria;

import LN.Alquileres.Habitacion;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class Habitaciones_Disponibles extends javax.swing.JPanel {
    public Habitacion habitacionSeleccionada;
    public Habitaciones_Disponibles(List<Habitacion> habitaciones) {
        this.habitacionSeleccionada = null;
    
        
        initComponents();
        DefaultListModel modelo = new DefaultListModel();        
        for (Habitacion unaHabitacion : habitaciones) {
            if (unaHabitacion.isHabilitado() && unaHabitacion.isEstado_limpieza() && unaHabitacion.getEstado_ocupacion().equals("Disponible")) {
                modelo.addElement(unaHabitacion);
            }
        }
        list_habitaciones.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_habitaciones = new javax.swing.JList();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Habitaciones Disponibles");
        lbl_titulo.setFocusable(false);

        list_habitaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        list_habitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                list_habitacionesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(list_habitaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void list_habitacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_habitacionesMouseReleased
        if (evt.getClickCount() == 2) {
        
        habitacionSeleccionada = (Habitacion)list_habitaciones.getSelectedValue();
        SwingUtilities.getWindowAncestor(this).dispose();
        
        }
    }//GEN-LAST:event_list_habitacionesMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbl_titulo;
    private javax.swing.JList list_habitaciones;
    // End of variables declaration//GEN-END:variables

public JList getHabitacion_Deleccionada(){
    return this.list_habitaciones;
}

    public Habitacion getHabitacionSeleccionada() {
        return habitacionSeleccionada;
    }

    public void setHabitacionSeleccionada(Habitacion habitacionSeleccionada) {
        this.habitacionSeleccionada = habitacionSeleccionada;
    }



}
