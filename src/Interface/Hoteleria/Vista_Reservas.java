package Interface.Hoteleria;

import Interface.GUIM;
import Interface.Renderers.Pintar_Celdas;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Reserva_Habitacion;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Vista_Reservas extends javax.swing.JPanel implements Observer {

    public static Hosteria unaHosteria;

    public Vista_Reservas(Hosteria unaHosteria) {
        Vista_Reservas.unaHosteria = unaHosteria;
        unaHosteria.addObserver(this);

        initComponents();

        JTable unaTabla = GUIM.crear_tabla_Reservas();
        pnl_tbl_reservas.add(unaTabla);
        cargarGrilla(unaTabla);
        cargarTabla(unaHosteria);

    }

    public static void cargarGrilla(JTable unaTabla) {

        if (!unaHosteria.getAlquileresHabitacion().isEmpty()) {
            for (Hospedaje_Habitacion unHospedaje : unaHosteria.getAlquileresHabitacion()) {
                if(!unHospedaje.isCheck_out()){

                Calendar salio = Calendar.getInstance();
                salio.setTime(unHospedaje.getEgreso());

                int cant = GUIM.diferenciasDeFechas(unHospedaje.getIngreso(), unHospedaje.getEgreso());
                int dia_salida = salio.get(Calendar.DAY_OF_MONTH);
                int mes_salida = salio.get(Calendar.MONTH);
                int habit = unHospedaje.getUnaHabitacion().getNumero();

                DefaultTableModel modelo = (DefaultTableModel) unaTabla.getModel();

                for (int j = modelo.getColumnCount() - 1; j > 1; j--) {
                    if (modelo.getValueAt(0, j).equals((dia_salida - 1) + "/" + (mes_salida + 1))) {
                        for (int c = j; c > (j - cant); c--) {

                            if (c >= 1) {
                                unaTabla.setValueAt(unHospedaje, habit, c);
                                TableColumn tcol = unaTabla.getColumnModel().getColumn(c);
                                tcol.setCellRenderer(new Pintar_Celdas());
                            }
                        }
                    }
                }}
            }
        }

        if (!unaHosteria.getReservas().isEmpty()) {
            for (Reserva_Habitacion unaReserva : unaHosteria.getReservas()) {
                int cant = unaReserva.getCantidad_de_Noches();
                int habit = unaReserva.getDeHabitacion().getNumero();

                Calendar salio = Calendar.getInstance();
                salio.setTime(unaReserva.getHastaFecha());
                int dia_salida = salio.get(Calendar.DAY_OF_MONTH);
                int mes_salida = salio.get(Calendar.MONTH);

                DefaultTableModel modelo = (DefaultTableModel) unaTabla.getModel();

                for (int j = modelo.getColumnCount() - 1; j > 1; j--) {
                    if (modelo.getValueAt(0, j).equals((dia_salida - 1) + "/" + (mes_salida + 1))) {
                        for (int c = j; c > (j - cant); c--) {

                            if (c >= 1) {
                                unaTabla.setValueAt(unaReserva, habit, c);
                                TableColumn tcol = unaTabla.getColumnModel().getColumn(c);
                                tcol.setCellRenderer(new Pintar_Celdas());
                            }
                        }
                    }
                }
            }
        }

    }

    public static Hosteria getUnaHosteria() {
        return unaHosteria;
    }

    public static void setUnaHosteria(Hosteria unaHosteria) {
        Vista_Reservas.unaHosteria = unaHosteria;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_tbl_reservas = new javax.swing.JPanel();
        panelRect3 = new org.edisoncor.gui.panel.PanelRect();
        btn_Realizar_Reserva = new javax.swing.JButton();
        btn_Lista_Reservas = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Lista_Reservas = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Reservas");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospedajes y Reservaciones"));

        pnl_tbl_reservas.setMaximumSize(new java.awt.Dimension(600, 355));
        pnl_tbl_reservas.setPreferredSize(new java.awt.Dimension(2500, 360));
        pnl_tbl_reservas.setLayout(new javax.swing.BoxLayout(pnl_tbl_reservas, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnl_tbl_reservas);

        panelRect3.setBackground(new java.awt.Color(255, 255, 255));
        panelRect3.setForeground(new java.awt.Color(255, 255, 255));
        panelRect3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect3.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_Realizar_Reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_Realizar_Reserva.setText("<html><p>  Nueva</p><p>Reserva</p></html>");
        btn_Realizar_Reserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Realizar_Reserva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Realizar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Realizar_ReservaActionPerformed(evt);
            }
        });

        btn_Lista_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Document.png"))); // NOI18N
        btn_Lista_Reservas.setText("Historial");
        btn_Lista_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lista_ReservasActionPerformed(evt);
            }
        });

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Reserva");

        jLabel7.setText("Hospedaje");

        jTextField4.setBackground(new java.awt.Color(0, 255, 0));
        jTextField4.setPreferredSize(new java.awt.Dimension(20, 20));

        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout panelRect3Layout = new javax.swing.GroupLayout(panelRect3);
        panelRect3.setLayout(panelRect3Layout);
        panelRect3Layout.setHorizontalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect3Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(panelRect3Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Realizar_Reserva)
                        .addComponent(btn_Lista_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRect3Layout.setVerticalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_Realizar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Lista_Reservas)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas Actuales"));

        tbl_Lista_Reservas.setAutoCreateRowSorter(true);
        tbl_Lista_Reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitación", "Tipo", "Huesped", "Fecha Ingreso", "Fecha Egreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Lista_Reservas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla(Hosteria unaHosteria) {
        for (Reserva_Habitacion unaReserva : unaHosteria.getReservas()) {
            GUIM.cargarTablaReservas(tbl_Lista_Reservas, unaHosteria.getReservas());
            this.updateUI();

        }

    }

    public void llamarVisitante() {
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Reservar_Habitacion laReserva = new Reservar_Habitacion(unaHosteria, 1, 1, 1, 1);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(laReserva);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_Realizar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Realizar_ReservaActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Reservar_Habitacion laReserva = new Reservar_Habitacion(unaHosteria, 1, 1, 1, 1);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(laReserva);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_btn_Realizar_ReservaActionPerformed

    private void btn_Lista_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lista_ReservasActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Lista_Reservas unaLista = new Lista_Reservas(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(unaLista);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Lista_ReservasActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        Reserva_Habitacion unaReserva = (Reserva_Habitacion) tbl_Lista_Reservas.getValueAt(tbl_Lista_Reservas.getSelectedRow(), 0);
        unaHosteria.eliminarReserva(unaReserva);


    }//GEN-LAST:event_btn_EliminarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Lista_Reservas;
    private javax.swing.JButton btn_Realizar_Reserva;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private javax.swing.JPanel pnl_tbl_reservas;
    private javax.swing.JTable tbl_Lista_Reservas;
    // End of variables declaration//GEN-END:variables

    public JButton getButton_Nueva_Resetva() {
        return this.btn_Realizar_Reserva;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Reserva_Habitacion) {
            JTable unaTabla = GUIM.crear_tabla_Reservas();
            pnl_tbl_reservas.removeAll();
            pnl_tbl_reservas.add(unaTabla);
            cargarTabla(unaHosteria);
            cargarGrilla(unaTabla);
            
        }
    }
}
