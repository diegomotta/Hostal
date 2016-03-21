
package Interface.Hoteleria;

import Interface.GUIM;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Reserva_Habitacion;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Lista_Reservas extends javax.swing.JPanel {

    private Hosteria unaHosteria;

    public Lista_Reservas(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        Date hasta = new Date();
        dp_hasta.setDate(hasta);

        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_MONTH, -7);
        dp_desde.setDate(calendario.getTime());





        cargarTabla(unaHosteria);
    }

    private void cargarTabla(Hosteria unaHosteria) {
        for (Reserva_Habitacion unaReserva : unaHosteria.getReservas()) {
            GUIM.cargarTablaReservas(tbl_Lista_Reservas, unaHosteria.getReservas());
            this.updateUI();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dp_desde = new org.jdesktop.swingx.JXDatePicker();
        dp_hasta = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Lista_Reservas = new javax.swing.JTable();
        cbx_filtro_Reservas = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        txt_searchPro = new org.jdesktop.swingx.JXSearchField();
        btn_Eliminar = new javax.swing.JButton();
        btn_Imprimir = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Lista de Reservas Activas");
        jTextField1.setFocusable(false);

        dp_desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_desdeActionPerformed(evt);
            }
        });

        dp_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_hastaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Desde:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Hasta:");

        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_Lista_Reservas.setAutoCreateRowSorter(true);
        tbl_Lista_Reservas.setBorder(null);
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

        cbx_filtro_Reservas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Single", "Dobles", "Triples", "Cuadruples", "Sin Cargo" }));
        cbx_filtro_Reservas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_filtro_ReservasItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Ver:");

        panelCurves1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txt_searchPro.setPrompt("Nombre del Huesped");
        txt_searchPro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchProCaretUpdate(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Imprimir.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        btn_Imprimir.setText("   Listar");
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_searchPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Imprimir)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_filtro_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_filtro_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
        try {
            List<Reserva_Habitacion> historial = unaHosteria.getReservas();
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();

            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Reservas_Salon.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(historial));
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);

            JDialog frame;
            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
            } else {
                frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            }

            frame.getContentPane().removeAll();
            frame.getContentPane().add(jviewer.getContentPane());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();

//            jviewer.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }


    }//GEN-LAST:event_btn_ImprimirActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        Reserva_Habitacion unaReserva = (Reserva_Habitacion) tbl_Lista_Reservas.getValueAt(tbl_Lista_Reservas.getSelectedRow(), 0);
        unaHosteria.eliminarReserva(unaReserva);
        cargarTabla(unaHosteria);

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void dp_desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_desdeActionPerformed
        GUIM.cargarTablaHistorial(tbl_Lista_Reservas, listarHospedajes());
        this.updateUI();
    }//GEN-LAST:event_dp_desdeActionPerformed

    private void dp_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_hastaActionPerformed
        GUIM.cargarTablaHistorial(tbl_Lista_Reservas, listarHospedajes());
        this.updateUI();
    }//GEN-LAST:event_dp_hastaActionPerformed

    private void cbx_filtro_ReservasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_filtro_ReservasItemStateChanged

        List<Reserva_Habitacion> reservas = unaHosteria.getReservas();
        List<Reserva_Habitacion> dobles = new LinkedList<>();
        List<Reserva_Habitacion> triples = new LinkedList<>();
        List<Reserva_Habitacion> cuadrubles = new LinkedList<>();
        List<Reserva_Habitacion> sinCargos = new LinkedList<>();
        List<Reserva_Habitacion> singles = new LinkedList<>();

        for (Reserva_Habitacion unaReserva : reservas) {
            if (unaReserva.getTipo().equals(cbx_filtro_Reservas.getSelectedItem())) {
            }
            switch (unaReserva.getTipo().getTipo()) {
                case "Single":
                    singles.add(unaReserva);
                    break;
                case "Doble Matrimonial":
                case "Doble Separada":
                    dobles.add(unaReserva);
                    break;
                case "Matrimonial + 1":
                case "Trible Separada":
                    triples.add(unaReserva);
                    break;
                case "Matrimonial + 2":
                case "Cuadruble Separada":
                    cuadrubles.add(unaReserva);
                    break;
                case "Sin Cargo":
                    sinCargos.add(unaReserva);
                    break;
            }

        }

        if (!reservas.isEmpty()) {
            String tipo = (String) cbx_filtro_Reservas.getSelectedItem();
            switch (tipo) {
                case "Single":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, singles);
                    break;
                case "Dobles":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, dobles);
                    break;
                case "Triples":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, triples);
                    break;
                case "Cuadruples":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, cuadrubles);
                    break;
                case "Sin Cargo":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, sinCargos);
                    break;
                case "Todas":
                    GUIM.cargarTablaReservas(tbl_Lista_Reservas, reservas);
                    break;

            }
            this.updateUI();

        }

    }//GEN-LAST:event_cbx_filtro_ReservasItemStateChanged

    private void txt_searchProCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchProCaretUpdate
        List<Reserva_Habitacion> reservas = unaHosteria.getReservas();
        List<Reserva_Habitacion> filtro = new LinkedList<>();
        if (!txt_searchPro.getText().isEmpty()) {
            for (Reserva_Habitacion unReserva : reservas) {
                if (unReserva.getApeVis().toUpperCase().contains(txt_searchPro.getText().toUpperCase()) || unReserva.getNombVis().toUpperCase().contains(txt_searchPro.getText().toUpperCase())) {
                    filtro.add(unReserva);
                }
                GUIM.cargarTablaReservas(tbl_Lista_Reservas, filtro);
            }
        } else {
            GUIM.cargarTablaReservas(tbl_Lista_Reservas, reservas);
        }
    }//GEN-LAST:event_txt_searchProCaretUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JComboBox cbx_filtro_Reservas;
    private org.jdesktop.swingx.JXDatePicker dp_desde;
    private org.jdesktop.swingx.JXDatePicker dp_hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTable tbl_Lista_Reservas;
    private org.jdesktop.swingx.JXSearchField txt_searchPro;
    // End of variables declaration//GEN-END:variables

    private List<Hospedaje_Habitacion> listarHospedajes() {
        List<Hospedaje_Habitacion> hosp = new LinkedList<>();
        for (Hospedaje_Habitacion h : unaHosteria.getAlquileresHabitacion()) {
            if ((h.getIngreso().getTime() == dp_desde.getDate().getTime()) || (h.getIngreso().getTime() > dp_desde.getDate().getTime())) {
                if ((h.getEgreso().getTime() == dp_hasta.getDate().getTime()) || (h.getEgreso().getTime() < dp_hasta.getDate().getTime())) {
                    hosp.add(h);
                }
            }
        }
        return hosp;
    }
}
