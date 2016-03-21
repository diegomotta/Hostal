package Interface.Hoteleria;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Salon;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

public class Historial_Salon extends javax.swing.JPanel {

    private Hosteria unaHosteria;

    public Historial_Salon(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        iniciarInterface(unaHosteria);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hospedajes_Salon = new javax.swing.JTable();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_listar_historial = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        check_soloUno = new javax.swing.JCheckBox();
        search_huesped = new org.jdesktop.swingx.JXSearchField();
        check_salon = new javax.swing.JCheckBox();
        cbx_salon = new javax.swing.JComboBox();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Historial de Alquileres del Salon de Eventos");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de los Alquileres"));

        tbl_hospedajes_Salon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Servicio", "Salón", "Huesped", "Desde", "Hasta", "Descuento", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_hospedajes_Salon);

        btn_listar_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        btn_listar_historial.setText("Listar");
        btn_listar_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_historialActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown.png"))); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        check_soloUno.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        check_soloUno.setText("El Seleccionado");

        search_huesped.setInstantSearchDelay(1000);
        search_huesped.setPrompt("Nombre del Huesped");
        search_huesped.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                search_huespedCaretUpdate(evt);
            }
        });

        check_salon.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        check_salon.setText("¿Salón?");
        check_salon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_salonStateChanged(evt);
            }
        });
        check_salon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_salonItemStateChanged(evt);
            }
        });
        check_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_salonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_listar_historial)
                .addGap(18, 18, 18)
                .addComponent(btn_exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(check_soloUno)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(check_salon))
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_listar_historial)
                        .addComponent(btn_exit)
                        .addComponent(check_soloUno)
                        .addComponent(search_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jScrollPane1)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_listar_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_historialActionPerformed

        try {
            if (check_soloUno.isSelected()) {
                List<Hospedaje_Salon> unoSolo = new LinkedList<>();
                unoSolo.add((Hospedaje_Salon) tbl_hospedajes_Salon.getValueAt(tbl_hospedajes_Salon.getSelectedRow(), 0));

                HashMap<String, Object> parametros = new HashMap();
                parametros.clear();
                parametros.put("log", Acceso.getUsuario());
                parametros.put("logo", unaHosteria.getLogo());
                parametros.put("pa", unaHosteria.getMiPais());
                parametros.put("pcia", unaHosteria.getMiProvincia());
                parametros.put("ciud", unaHosteria.getMiCiudad());
                parametros.put("calle", unaHosteria.getMiCalle());
                parametros.put("nomb", unaHosteria.getNombre());

                JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Hospedaje_Salon_Unico.jrxml");
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(unoSolo));
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


            } else if (!check_soloUno.isSelected()) {
                List<Hospedaje_Salon> historial = unaHosteria.getAlquileresSalon();
                int canReg = historial.size();
                HashMap<String, Object> parametros = new HashMap();
                parametros.clear();
                parametros.put("log", Acceso.getUsuario());
                parametros.put("logo", unaHosteria.getLogo());
                parametros.put("pa", unaHosteria.getMiPais());
                parametros.put("pcia", unaHosteria.getMiProvincia());
                parametros.put("ciud", unaHosteria.getMiCiudad());
                parametros.put("calle", unaHosteria.getMiCalle());
                parametros.put("nomb", unaHosteria.getNombre());
                parametros.put("cant", canReg);
                JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Historial_hospedajes_salon.jrxml");
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


            }
//            jviewer.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btn_listar_historialActionPerformed

    private void search_huespedCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_search_huespedCaretUpdate
        List<Hospedaje_Salon> filtro = new LinkedList<>();
        if (check_salon.isSelected()) {
            for (Hospedaje_Salon unHospedaje_Salon : unaHosteria.getAlquileresSalon()) {
                Integer salon = ((Salon) cbx_salon.getSelectedItem()).getNumero();
                if (unHospedaje_Salon.isCheck_out()) {
                    if (unHospedaje_Salon.getUnVisitante().getApellido().toUpperCase().contains(search_huesped.getText().toUpperCase()) || unHospedaje_Salon.getUnVisitante().getNombre().toUpperCase().contains(search_huesped.getText().toUpperCase()) && unHospedaje_Salon.getElSalon().getNumero().equals(salon)) {

                        filtro.add(unHospedaje_Salon);
                    }
                }
            }
        } else {
            for (Hospedaje_Salon unHospedaje_Salon : unaHosteria.getAlquileresSalon()) {
                if (unHospedaje_Salon.isCheck_out()) {
                    if (unHospedaje_Salon.getUnVisitante().getApellido().toUpperCase().contains(search_huesped.getText().toUpperCase()) || unHospedaje_Salon.getUnVisitante().getNombre().toUpperCase().contains(search_huesped.getText().toUpperCase())) {

                        filtro.add(unHospedaje_Salon);
                    }

                }
            }

        }
        GUIM.cargarHistorialSalon(tbl_hospedajes_Salon, filtro);
    }//GEN-LAST:event_search_huespedCaretUpdate

    private void check_salonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_salonItemStateChanged

       
            cbx_salon.setEnabled(check_salon.isSelected());
     
    }//GEN-LAST:event_check_salonItemStateChanged

    private void check_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_salonActionPerformed
    }//GEN-LAST:event_check_salonActionPerformed

    private void check_salonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_salonStateChanged
    }//GEN-LAST:event_check_salonStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_listar_historial;
    private javax.swing.JComboBox cbx_salon;
    private javax.swing.JCheckBox check_salon;
    private javax.swing.JCheckBox check_soloUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.jdesktop.swingx.JXSearchField search_huesped;
    private javax.swing.JTable tbl_hospedajes_Salon;
    // End of variables declaration//GEN-END:variables

    private void iniciarInterface(Hosteria unaHosteria) {
        if (Acceso.getLogueado() != null) {
            Object unUsuario = Acceso.getLogueado();
            if (unUsuario instanceof Usuario) {
                Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                if (!permisos.containsKey("eminf")) {
                    btn_listar_historial.setEnabled(false);
                } else {
                    btn_listar_historial.setEnabled(true);
                }
            }
        }
        cbx_salon.removeAllItems();
        for (Salon unSalon : unaHosteria.getSalones()) {
            cbx_salon.addItem(unSalon);
        }

        List<Hospedaje_Salon> checkOK = new LinkedList<>();
        for (Hospedaje_Salon hospedajes : unaHosteria.getAlquileresSalon()) {
            if (hospedajes.isCheck_out()) {
                checkOK.add(hospedajes);
            }
        }
        GUIM.cargarHistorialSalon(tbl_hospedajes_Salon, checkOK);
    }
}
