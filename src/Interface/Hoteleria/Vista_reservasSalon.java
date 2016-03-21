package Interface.Hoteleria;

import Interface.GUIM;
import Interface.Personas.Vista_Visitante;
import LN.Alquileres.Reserva_Salon;
import LN.Alquileres.Salon;
import LN.Alquileres.Tarifa_Salon;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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

public class Vista_reservasSalon extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Visitante huesped_resrva;
    private Reserva_Salon seleccionada;

    public Vista_reservasSalon(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        iniciarInterface();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_reservasSalon = new javax.swing.JTable();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        jLabel1 = new javax.swing.JLabel();
        txt_visitante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dp_desde = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        dp_hasta = new org.jdesktop.swingx.JXDatePicker();
        cbx_tipo_reserva = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btn_modificarReserva = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbx_numeroSalon = new javax.swing.JComboBox();
        lbl_info1 = new javax.swing.JLabel();
        lbl_info2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_Realizar_Reserva = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tbl_reservasSalon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Reserva", "Salón", "Responsable de la Reserva", "Desde", "Hasta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_reservasSalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_reservasSalonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_reservasSalon);

        jXTaskPane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        jXTaskPane1.setScrollOnExpand(true);
        jXTaskPane1.setTitle("Datos para una nueva Reserva");
        jXTaskPane1.setAutoscrolls(true);

        jLabel1.setText("A nombre de:");

        txt_visitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_visitanteMouseClicked(evt);
            }
        });
        txt_visitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_visitanteKeyTyped(evt);
            }
        });

        jLabel3.setText("Desde:");

        jLabel2.setText("Hasta:");

        dp_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_hastaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        btn_modificarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_modificarReserva.setText("<html><p>Guardar</p><p>Cambios</p></html>");
        btn_modificarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarReservaActionPerformed(evt);
            }
        });

        jLabel5.setText("Salón Número:");

        javax.swing.GroupLayout jXTaskPane1Layout = new javax.swing.GroupLayout(jXTaskPane1.getContentPane());
        jXTaskPane1.getContentPane().setLayout(jXTaskPane1Layout);
        jXTaskPane1Layout.setHorizontalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(txt_visitante))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXTaskPane1Layout.createSequentialGroup()
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_numeroSalon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_tipo_reserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modificarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_info2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTaskPane1Layout.createSequentialGroup()
                        .addComponent(lbl_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jXTaskPane1Layout.setVerticalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTaskPane1Layout.createSequentialGroup()
                                .addComponent(lbl_info1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(lbl_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_visitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbx_numeroSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbx_tipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTaskPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Reservas del Salón de Eventos");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_Realizar_Reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_Realizar_Reserva.setText("<html><p>  Nueva</p><p>Reserva</p></html>");
        btn_Realizar_Reserva.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Realizar_Reserva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Realizar_Reserva.setToolTipText("Almacena una nueva Reserva del Salon");
        btn_Realizar_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Realizar_ReservaActionPerformed(evt);
            }
        });

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_Eliminar.setText("<html><p>Eliminar</p><p>Reserva</p></html>");
        btn_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Eliminar.setToolTipText("Elimina una Reserva Existente en el Sitema");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton1.setText("<html><p style=\"text-align:center\">Listar</p><p>Reservas</p></html>");
        jButton1.setActionCommand("<html><p style=\"text-align:right\">Listar</p><p>Reservas</p></html>");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setToolTipText("Muestra un resumen de las Reservas Activas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(0);
        jButton2.setMaximumSize(null);
        jButton2.setMinimumSize(null);

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Realizar_Reserva, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(btn_Eliminar))
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_Realizar_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jXTaskPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_reservasSalonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_reservasSalonMouseClicked
        if (tbl_reservasSalon.getSelectedRowCount() != 0) {
            btn_modificarReserva.setEnabled(true);
            Reserva_Salon unaReserva_Salon = (Reserva_Salon) tbl_reservasSalon.getValueAt(tbl_reservasSalon.getSelectedRow(), 0);
            txt_visitante.setText(unaReserva_Salon.getUnVisitante().getApellido());
            dp_desde.setDate(unaReserva_Salon.getDesdeFecha());
            dp_hasta.setDate(unaReserva_Salon.getHastaFecha());
            cbx_tipo_reserva.setSelectedItem(unaReserva_Salon.getTipo());
        }
    }//GEN-LAST:event_tbl_reservasSalonMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void txt_visitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_visitanteMouseClicked
        Visitante unVisitante = abrir_panel_captura_visitante();
        if (unVisitante != null) {
            txt_visitante.setText(unVisitante.getApellido() + " " + unVisitante.getNombre());
            huesped_resrva = unVisitante;
        }
    }//GEN-LAST:event_txt_visitanteMouseClicked

    private void txt_visitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_visitanteKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_visitanteKeyTyped

    private void dp_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_hastaActionPerformed
        if (dp_hasta.getDate().before(dp_desde.getDate()) || dp_hasta.getDate().equals(dp_desde.getDate())) {
            JOptionPane.showMessageDialog(this, "La Fecha de Salida no puede ser anterior o igual a la Fecha de Entrada");
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dp_desde.getDate());
            calendario.add(Calendar.DAY_OF_MONTH, 1);
            dp_hasta.setDate(calendario.getTime());
        }
    }//GEN-LAST:event_dp_hastaActionPerformed

    private void btn_modificarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarReservaActionPerformed

        Visitante elVisitante = huesped_resrva;
        Date desde = dp_desde.getDate();
        Date hasta = dp_hasta.getDate();
        int noches = GUIM.diferenciasDeFechas(desde, hasta);
        Salon elSalon = (Salon) cbx_numeroSalon.getSelectedItem();
        Tarifa_Salon tipoServicio = (Tarifa_Salon) cbx_tipo_reserva.getSelectedItem();
        Reserva_Salon unaReserva_Salon = (Reserva_Salon) tbl_reservasSalon.getValueAt(tbl_reservasSalon.getSelectedRow(), 0);

        try {
            unaHosteria.modificar_ReservaSalon(unaReserva_Salon, elVisitante, desde, hasta, noches, elSalon, tipoServicio);
            GUIM.cargarReservasSalon(tbl_reservasSalon, unaHosteria.getReservas_Salon());

            btn_modificarReserva.setEnabled(false);
            this.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_modificarReservaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_Realizar_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Realizar_ReservaActionPerformed
        Visitante elVisitante = huesped_resrva;
        Date desde = dp_desde.getDate();
        Date hasta = dp_hasta.getDate();
        int noches = GUIM.diferenciasDeFechas(desde, hasta);

        Salon elSalon = (Salon) cbx_numeroSalon.getSelectedItem();
        Tarifa_Salon tipoServicio = (Tarifa_Salon) cbx_tipo_reserva.getSelectedItem();
        if (elVisitante != null) {
            try {
                unaHosteria.reservar_Salon(elVisitante, desde, hasta, noches, tipoServicio, elSalon);
                iniciarInterface();
                this.updateUI();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Visitante para Continuar");
        }


    }//GEN-LAST:event_btn_Realizar_ReservaActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar la Reserva seleccionada?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            Reserva_Salon unaReserva = (Reserva_Salon) tbl_reservasSalon.getValueAt(tbl_reservasSalon.getSelectedRow(), 0);
            unaHosteria.eliminar_reservaSalon(unaReserva);
            iniciarInterface();
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            List<Reserva_Salon> historial = unaHosteria.getReservas_Salon();
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();

            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Reservas_Salon.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(historial));
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Realizar_Reserva;
    private javax.swing.JButton btn_modificarReserva;
    private javax.swing.JComboBox cbx_numeroSalon;
    private javax.swing.JComboBox cbx_tipo_reserva;
    private org.jdesktop.swingx.JXDatePicker dp_desde;
    private org.jdesktop.swingx.JXDatePicker dp_hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private javax.swing.JLabel lbl_info1;
    private javax.swing.JLabel lbl_info2;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tbl_reservasSalon;
    private javax.swing.JTextField txt_visitante;
    // End of variables declaration//GEN-END:variables

    private void iniciarInterface() {
    jXTaskPane1.setCollapsed(true);
        btn_modificarReserva.setEnabled(false);

        cbx_numeroSalon.setModel(new DefaultComboBoxModel());
        cbx_tipo_reserva.setModel(new DefaultComboBoxModel());

        for (Salon unSalon : unaHosteria.getSalones()) {
            cbx_numeroSalon.addItem(unSalon);
        }

        for (Tarifa_Salon unaTarifa_Salon : unaHosteria.getTarifas_Salon()) {
            cbx_tipo_reserva.addItem(unaTarifa_Salon);
        }
        cbx_tipo_reserva.setSelectedIndex(0);

        Calendar calendario = Calendar.getInstance();
        dp_desde.setDate(calendario.getTime());
        calendario.add(Calendar.DAY_OF_MONTH, 1);
        dp_hasta.setDate(calendario.getTime());
        GUIM.cargarReservasSalon(tbl_reservasSalon, unaHosteria.getReservas_Salon());
         this.tbl_reservasSalon.getColumn("Tipo de Reserva").setMaxWidth(300);
        this.tbl_reservasSalon.getColumn("Salón").setMaxWidth(100);
        this.tbl_reservasSalon.getColumn("Responsable de la Reserva").setMaxWidth(300);
        this.tbl_reservasSalon.getColumn("Desde").setMaxWidth(200);
        this.tbl_reservasSalon.getColumn("Hasta").setMaxWidth(200);
        
        this.updateUI();

    }

    private Visitante abrir_panel_captura_visitante() {
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Vista_Visitante panel_captura_visitante = new Vista_Visitante(unaHosteria, null);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel_captura_visitante);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        if (panel_captura_visitante.getSelected_Visitante().getSelectedRowCount() != 0) {
            return (Visitante) panel_captura_visitante.getSelected_Visitante().getValueAt(panel_captura_visitante.getSelected_Visitante().getSelectedRow(), 0);
        } else {
            return null;
        }
    }
}
