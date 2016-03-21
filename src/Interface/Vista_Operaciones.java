package Interface;

import LN.Persona.Usuario.Usuario;
import LN.Varios.Foto;
import LN.Varios.Hosteria;
import Log_Auditoria.Auditoria_Operacional;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Operaciones extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private List<Auditoria_Operacional> colador = new LinkedList<>();

    public Vista_Operaciones(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_filtrado = new javax.swing.JLabel();
        cbx_accion = new javax.swing.JComboBox();
        dp_desdeFecha = new org.jdesktop.swingx.JXDatePicker();
        lbl_desde = new javax.swing.JLabel();
        dp_hastaFecha = new org.jdesktop.swingx.JXDatePicker();
        lbl_hasta = new javax.swing.JLabel();
        btn_ver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbx_filtro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_numero = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones de Consulta"));

        lbl_filtrado.setText("Acción Realizada:");

        cbx_accion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agregado", "Modificación", "Eliminación" }));
        cbx_accion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_accionItemStateChanged(evt);
            }
        });

        lbl_desde.setText("Desde:");

        lbl_hasta.setText("Hasta:");

        btn_ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eye.png"))); // NOI18N
        btn_ver.setText("Ver");
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });

        jLabel5.setText("Filtrar por:");

        cbx_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acción Realizada", "Usuario Particular", "Fecha del Hecho" }));
        cbx_filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_filtroItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbx_filtro, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(lbl_filtrado)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbx_accion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(37, 37, 37)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(lbl_hasta)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(dp_hastaFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(lbl_desde)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(dp_desdeFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 186, Short.MAX_VALUE)
                .add(btn_ver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn_ver)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(dp_desdeFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(lbl_desde))
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel5)
                                .add(cbx_filtro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(dp_hastaFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(lbl_hasta))
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(lbl_filtrado)
                                .add(cbx_accion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setBorder(null);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operación", "Usuario Responsable", "Detalle", "Fecha del Hecho", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Número de Coincidencias:");

        lbl_numero.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lbl_numero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jButton1))
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lbl_numero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Auditoria de Operaciones Realizadas");
        lbl_titulo.setFocusable(false);
        lbl_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_tituloActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(lbl_titulo)
            .add(jScrollPane1)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(lbl_titulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_accionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_accionItemStateChanged
        int filtro1 = cbx_filtro.getSelectedIndex();
        int filtro2 = cbx_accion.getSelectedIndex();
        if (filtro1 == 2) {
            if (filtro2 == 0) {
                lbl_desde.setText("Seleccione un Día");
                lbl_hasta.setText("");
                dp_desdeFecha.setEnabled(true);
                dp_desdeFecha.setDate(new Date());
                dp_hastaFecha.setEnabled(false);
                dp_hastaFecha.setDate(null);

            } else {
                lbl_desde.setText("A partir de:");
                lbl_hasta.setText("Hasta la fecha:");
                dp_desdeFecha.setEnabled(true);
                dp_desdeFecha.setDate(new Date());
                dp_hastaFecha.setEnabled(true);
                dp_hastaFecha.setDate(new Date());
            }
        } else {
            lbl_desde.setText("");
            lbl_hasta.setText("");
            dp_desdeFecha.setEnabled(false);
            dp_hastaFecha.setEnabled(false);
            dp_desdeFecha.setDate(null);
            dp_hastaFecha.setDate(null);

        }
    }//GEN-LAST:event_cbx_accionItemStateChanged

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed

        colador.clear();

        int filtro = cbx_filtro.getSelectedIndex();
        String accion = null;
        String a = null;
        Date desde = null;
        Date hasta = null;
        switch (filtro) {
            case 0:
                accion = (String) cbx_accion.getSelectedItem();
                switch (accion) {
                    case ("Agregado"):
                        a = "ADD";
                        break;
                    case ("Modificación"):
                        a = "MOD";
                        break;
                    case ("Eliminación"):
                        a = "DEL";
                        break;
                    default:
                        a = "";
                        break;
                }
                break;
            case 1:
                a = (String) cbx_accion.getSelectedItem();
                break;
            case 2:
                accion = (String) cbx_accion.getSelectedItem();
                switch (accion) {
                    case ("Día en particular"):
                        desde = dp_desdeFecha.getDate();
                    case ("Período"):
                        desde = dp_desdeFecha.getDate();
                        hasta = dp_hastaFecha.getDate();

                }

        }
        if (!unaHosteria.getAudiciones().isEmpty()) {
            for (Auditoria_Operacional unaAuditoria_Operacional : unaHosteria.getAudiciones()) {

                if (filtro == 0) {
                    if (unaAuditoria_Operacional.getOperacion().toUpperCase().equals(a.toUpperCase())) {
                        colador.add(unaAuditoria_Operacional);
                    }
                }
                if (filtro == 1) {
                    if (unaAuditoria_Operacional.getUsuarioResponsable() != null) {
                        if (unaAuditoria_Operacional.getUsuarioResponsable().equals(a)) {
                            colador.add(unaAuditoria_Operacional);
                        }
                    }
                }

                if (filtro == 2) {
                    if (accion.equals("Día en particular")) {
                        if (unaAuditoria_Operacional.getFecha().equals(desde)) {
                            colador.add(unaAuditoria_Operacional);
                        }
                    }
                    if (accion.equals("Período")) {
                        if ((unaAuditoria_Operacional.getFecha().equals(desde) || unaAuditoria_Operacional.getFecha().after(desde)) && (unaAuditoria_Operacional.getFecha().equals(desde) || unaAuditoria_Operacional.getFecha().before(hasta))) {
                            colador.add(unaAuditoria_Operacional);
                        }

                    }
                }
            }
        }

        GUIM.cargarTablaOperaciones(jTable1, colador);
        lbl_numero.setText(String.valueOf(jTable1.getRowCount()));
    }//GEN-LAST:event_btn_verActionPerformed

    private void cbx_filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_filtroItemStateChanged
        int filtro = cbx_filtro.getSelectedIndex();
        switch (filtro) {
            case 0:
                lbl_filtrado.setText("Seleccione una Acción");
                cbx_accion.removeAllItems();
                cbx_accion.addItem("Todos");
                cbx_accion.addItem("Agregado");
                cbx_accion.addItem("Modificación");
                cbx_accion.addItem("Eliminación");
                break;
            case 1:
                lbl_filtrado.setText("Seleccione un Usuario");
                cbx_accion.removeAllItems();
                for (Usuario unUsuario : unaHosteria.getUsuarios()) {
                    cbx_accion.addItem(unUsuario.getUsserame());
                }
                break;
            case 2:
                lbl_filtrado.setText("Seleccione una Fecha");
                cbx_accion.removeAllItems();
                cbx_accion.addItem("Día en particular");
                cbx_accion.addItem("Período");
                break;
        }
    }//GEN-LAST:event_cbx_filtroItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Foto logotipo = unaHosteria.getLogo();

            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", logotipo);
            parametros.put("log", Acceso.getUsuario());
            parametros.put("pa", unaHosteria.getMiPais());
            parametros.put("pcia", unaHosteria.getMiProvincia());
            parametros.put("ciud", unaHosteria.getMiCiudad());
            parametros.put("calle", unaHosteria.getMiCalle());
            parametros.put("nomb", unaHosteria.getNombre());
            //            Collections.sort(colador);
            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Log_Operaciones.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(colador));
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.show();

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getCause());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_tituloActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ver;
    private javax.swing.JComboBox cbx_accion;
    private javax.swing.JComboBox cbx_filtro;
    private org.jdesktop.swingx.JXDatePicker dp_desdeFecha;
    private org.jdesktop.swingx.JXDatePicker dp_hastaFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_desde;
    private javax.swing.JLabel lbl_filtrado;
    private javax.swing.JLabel lbl_hasta;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JTextField lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
