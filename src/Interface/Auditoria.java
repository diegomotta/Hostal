package Interface;

import LN.Persona.Usuario.Usuario;
import LN.Varios.Foto;
import LN.Varios.Hosteria;
import Log_Auditoria.Entidad_Revisada;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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

public class Auditoria extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private List<Entidad_Revisada> colador = new LinkedList<>();

    public Auditoria(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        lbl_desde.setText("");
        lbl_hasta.setText("");
        dp_desdeFecha.setEnabled(false);
        dp_hastaFecha.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JTextField();
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

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Log de Auditoria");
        lbl_titulo.setFocusable(false);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_filtro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_filtrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_hasta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dp_hastaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_desde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dp_desdeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ver)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dp_desdeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_desde))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cbx_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dp_hastaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_hasta))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_filtrado)
                                .addComponent(cbx_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setBorder(null);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Revisión", "Acción Realizada", "Clase Persistida", "Usuario Responsable", "Fecha del Hecho"
            }
        ));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed

        colador.clear();
        List resultado = Hosteria.persistencia.buscarRevisiones("entidad_revisada");

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
        for (Iterator iterador = resultado.iterator(); iterador.hasNext();) {
            Entidad_Revisada tupla = (Entidad_Revisada) iterador.next();
            if (filtro == 0) {
                if (tupla.getAccion().toUpperCase().equals(a.toUpperCase())) {
                    colador.add(tupla);
                }
            }
            if (filtro == 1) {
                if (tupla.getUsuario() != null) {
                    if (tupla.getUsuario().equals(a)) {
                        colador.add(tupla);
                    }
                }
            }

            if (filtro == 2) {
                if (accion.equals("Día en particular")) {
                    if (tupla.getMomento().equals(desde)) {
                        colador.add(tupla);
                    }
                }
                if (accion.equals("Período")) {
                    if ((tupla.getMomento().equals(desde) || tupla.getMomento().after(desde)) && (tupla.getMomento().equals(desde) || tupla.getMomento().before(hasta))) {
                        colador.add(tupla);
                    }

                }
            }
        }

        GUIM.cargarTablaAuditoria(jTable1, colador);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Foto logo = unaHosteria.getLogo();
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", logo);
//            Collections.sort(colador);           
            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Log_Audiciones.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(colador));
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.show();


        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getCause());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
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
