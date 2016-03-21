/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hoteleria;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
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

/**
 *
 * @author Lukas
 */
public class Historial_Habitaciones extends javax.swing.JPanel {

    private Hosteria unaHosteria;

    public Historial_Habitaciones(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        iniciarInterface(unaHosteria);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_hospedajes_habitacion = new javax.swing.JTable();
        panelCurves5 = new org.edisoncor.gui.panel.PanelCurves();
        btn_listar_historial = new javax.swing.JButton();
        btn_exit4 = new javax.swing.JButton();
        check_soloUno = new javax.swing.JCheckBox();
        check_habitacion = new javax.swing.JCheckBox();
        cbx_Habitacion = new javax.swing.JComboBox();
        search_huesped = new org.jdesktop.swingx.JXSearchField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Historial  de Alquileres de Habitaciones");
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de los Alquileres"));

        tbl_hospedajes_habitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_hospedajes_habitacion);

        btn_listar_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        btn_listar_historial.setText("Listar");
        btn_listar_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_historialActionPerformed(evt);
            }
        });

        btn_exit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown.png"))); // NOI18N
        btn_exit4.setText("Salir");
        btn_exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit4ActionPerformed(evt);
            }
        });

        check_soloUno.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        check_soloUno.setText("Seleccionado");

        check_habitacion.setFont(new java.awt.Font("Bell MT", 2, 18)); // NOI18N
        check_habitacion.setText("¿Habitación?");
        check_habitacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_habitacionItemStateChanged(evt);
            }
        });

        search_huesped.setPrompt("Nombre del Huesped");
        search_huesped.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                search_huespedCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout panelCurves5Layout = new javax.swing.GroupLayout(panelCurves5);
        panelCurves5.setLayout(panelCurves5Layout);
        panelCurves5Layout.setHorizontalGroup(
            panelCurves5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_listar_historial)
                .addGap(18, 18, 18)
                .addComponent(btn_exit4)
                .addGap(18, 18, 18)
                .addComponent(search_huesped, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_soloUno)
                .addGap(18, 18, 18))
        );
        panelCurves5Layout.setVerticalGroup(
            panelCurves5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listar_historial)
                    .addComponent(btn_exit4)
                    .addComponent(search_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_habitacion)
                    .addComponent(cbx_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_soloUno))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
            .addComponent(panelCurves5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btn_listar_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_historialActionPerformed

        try {
            if (check_soloUno.isSelected()) {
                List<Hospedaje_Salon> unoSolo = new LinkedList<>();
                unoSolo.add((Hospedaje_Salon) tbl_hospedajes_habitacion.getValueAt(tbl_hospedajes_habitacion.getSelectedRow(), 0));

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

    private void btn_exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit4ActionPerformed
    }//GEN-LAST:event_btn_exit4ActionPerformed

    private void search_huespedCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_search_huespedCaretUpdate
        List<Hospedaje_Habitacion> filtro = new LinkedList<>();
        if (check_habitacion.isSelected()) {
            for (Hospedaje_Habitacion unHospedaje_Habitacion : unaHosteria.getAlquileresHabitacion()) {
                Integer salon = ((Habitacion) cbx_Habitacion.getSelectedItem()).getNumero();
                if (unHospedaje_Habitacion.isCheck_out()) {
                    if (unHospedaje_Habitacion.getUnVisitante().getApellido().toUpperCase().contains(search_huesped.getText().toUpperCase()) || unHospedaje_Habitacion.getUnVisitante().getNombre().toUpperCase().contains(search_huesped.getText().toUpperCase()) && unHospedaje_Habitacion.getUnaHabitacion().getNumero().equals(salon)) {

                        filtro.add(unHospedaje_Habitacion);
                    }
                }
            }
        } else {
            for (Hospedaje_Habitacion unHospedaje_Habitacion : unaHosteria.getAlquileresHabitacion()) {
                if (unHospedaje_Habitacion.isCheck_out()) {
                    if (unHospedaje_Habitacion.getUnVisitante().getApellido().toUpperCase().contains(search_huesped.getText().toUpperCase()) || unHospedaje_Habitacion.getUnVisitante().getNombre().toUpperCase().contains(search_huesped.getText().toUpperCase())) {

                        filtro.add(unHospedaje_Habitacion);
                    }

                }
            }

        }
        GUIM.cargarHistorialHabitacion(tbl_hospedajes_habitacion, filtro);
    }//GEN-LAST:event_search_huespedCaretUpdate

    private void check_habitacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_habitacionItemStateChanged
  
            cbx_Habitacion.setEnabled(check_habitacion.isSelected());
        
    }//GEN-LAST:event_check_habitacionItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit4;
    private javax.swing.JButton btn_listar_historial;
    private javax.swing.JComboBox cbx_Habitacion;
    private javax.swing.JCheckBox check_habitacion;
    private javax.swing.JCheckBox check_soloUno;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField3;
    private org.edisoncor.gui.panel.PanelCurves panelCurves5;
    private org.jdesktop.swingx.JXSearchField search_huesped;
    private javax.swing.JTable tbl_hospedajes_habitacion;
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
        cbx_Habitacion.removeAllItems();
        for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
            cbx_Habitacion.addItem(unaHabitacion);
        }

        List<Hospedaje_Habitacion> checkOK = new LinkedList<>();
        for (Hospedaje_Habitacion hospedajes : unaHosteria.getAlquileresHabitacion()) {
            if (hospedajes.isCheck_out()) {
                checkOK.add(hospedajes);
            }
        }
        GUIM.cargarHistorialHabitacion(tbl_hospedajes_habitacion, checkOK);
    }
}
