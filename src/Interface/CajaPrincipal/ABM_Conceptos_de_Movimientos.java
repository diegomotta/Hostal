package Interface.CajaPrincipal;

import Interface.Acceso;
import Interface.GUIM;
import LN.Caja.Caja;
import LN.Caja.Conceptos;
import LN.Varios.Hosteria;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class ABM_Conceptos_de_Movimientos extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Caja unaCaja;

    public ABM_Conceptos_de_Movimientos(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        this.unaCaja = unaHosteria.getCajaPrincipal();
        initComponents();
        this.tbl_conceptos.getColumn("Tipo").setMaxWidth(100);
        cargarCampos();
//
//        tbl_conceptos.getSelectionModel().addListSelectionListener(
//                new ListSelectionListener() {
//                    @Override
//                    public void valueChanged(ListSelectionEvent e) {
//                        Conceptos unConceptos = (Conceptos) tbl_conceptos.getValueAt(tbl_conceptos.getSelectedRow(), 1);
//                        txt_detalleConcepto.setText(unConceptos.getDetalle());
//                        if (unConceptos.getTipo().equals("Entrada")) {
//                            cbx_tipoConcepto.setSelectedItem("Entrada");
//                        } else {
//                            cbx_tipoConcepto.setSelectedItem("Salida");
//                        }
//                    }
//                });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        pnl_btnConceptos = new org.edisoncor.gui.panel.PanelRect();
        btn_addConcepto = new javax.swing.JButton();
        btn_delConcepto = new javax.swing.JButton();
        btn_modConcepto = new javax.swing.JButton();
        Scroll_tblConceptos = new javax.swing.JScrollPane();
        tbl_conceptos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_detalleConcepto = new javax.swing.JTextField();
        lbl_resultado = new javax.swing.JLabel();
        cbx_tipoConcepto = new javax.swing.JComboBox();
        txt_searchConcepto = new org.jdesktop.swingx.JXSearchField();

        setMaximumSize(new java.awt.Dimension(682, 435));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Conceptos");
        jTextField1.setFocusable(false);

        pnl_btnConceptos.setBackground(new java.awt.Color(255, 255, 255));
        pnl_btnConceptos.setForeground(new java.awt.Color(255, 255, 255));
        pnl_btnConceptos.setColorPrimario(new java.awt.Color(255, 255, 255));
        pnl_btnConceptos.setColorSecundario(new java.awt.Color(102, 102, 102));
        pnl_btnConceptos.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_addConcepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_addConcepto.setText("  Guardar");
        btn_addConcepto.setDisabledIcon(null);
        btn_addConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addConceptoActionPerformed(evt);
            }
        });

        btn_delConcepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_delConcepto.setText("   Eliminar");
        btn_delConcepto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delConceptoMouseClicked(evt);
            }
        });
        btn_delConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delConceptoActionPerformed(evt);
            }
        });

        btn_modConcepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modConcepto.setText("Modificar");
        btn_modConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modConceptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_btnConceptosLayout = new javax.swing.GroupLayout(pnl_btnConceptos);
        pnl_btnConceptos.setLayout(pnl_btnConceptosLayout);
        pnl_btnConceptosLayout.setHorizontalGroup(
            pnl_btnConceptosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnConceptosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_btnConceptosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addConcepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delConcepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modConcepto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnl_btnConceptosLayout.setVerticalGroup(
            pnl_btnConceptosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnConceptosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_addConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delConcepto)
                .addGap(18, 18, 18)
                .addComponent(btn_modConcepto)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        Scroll_tblConceptos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Scroll_tblConceptos.setAutoscrolls(true);
        Scroll_tblConceptos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Scroll_tblConceptosMouseClicked(evt);
            }
        });

        tbl_conceptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Detalle del Concepto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_conceptos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_conceptosMouseClicked(evt);
            }
        });
        tbl_conceptos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_conceptosKeyTyped(evt);
            }
        });
        Scroll_tblConceptos.setViewportView(tbl_conceptos);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel6.setText("Detalle");

        cbx_tipoConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Entrada", "Salida" }));
        cbx_tipoConcepto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tipoConceptoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_tipoConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_detalleConcepto)
                .addContainerGap())
            .addComponent(lbl_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txt_detalleConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_tipoConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        txt_searchConcepto.setPrompt("Buscar un Concepto");
        txt_searchConcepto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchConceptoCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scroll_tblConceptos)
                    .addComponent(txt_searchConcepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_btnConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_btnConceptos, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Scroll_tblConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_searchConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addConceptoActionPerformed
        String tipoConcepto = cbx_tipoConcepto.getSelectedItem().toString();
        String detalleConcepto = txt_detalleConcepto.getText();
        try {
            Conceptos nuevoConceptos = unaCaja.agregarConcepto(tipoConcepto, detalleConcepto);
            unaHosteria.crearAuditoria("ADD", "Agregó el Concepto " + detalleConcepto + " de tipo " + tipoConcepto, Acceso.getUsuario(), GUIM.getHoraActual());

            lbl_resultado.setText("El concepto: " + detalleConcepto + " se ha cargado correctamente");
//            GUIM.cargarTablaConceptos(tbl_conceptos, unaCaja.getConceptos());
            if (nuevoConceptos.getTipo().equals("Entrada")) {
                cbx_tipoConcepto.setSelectedIndex(1);
                cbx_tipoConceptoItemStateChanged(null);
            } else {
                cbx_tipoConcepto.setSelectedIndex(2);
                cbx_tipoConceptoItemStateChanged(null);
            }
            txt_detalleConcepto.setText("");
        } catch (Exception ex) {
            lbl_resultado.setText(ex.getMessage());
        }

    }//GEN-LAST:event_btn_addConceptoActionPerformed

    private void btn_delConceptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_delConceptoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delConceptoMouseClicked

    private void btn_delConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delConceptoActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el Concepto seleccionado?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                Conceptos unConcepto = (Conceptos) tbl_conceptos.getValueAt(tbl_conceptos.getSelectedRow(), 1);
                String detalleConcepto = unConcepto.getDetalle();
                String tipoConcepto = unConcepto.getTipo();
                unaCaja.eliminarConcepto(unConcepto);
                unaHosteria.crearAuditoria("DEL", "Eliminó el Concepto " + detalleConcepto + " de tipo " + tipoConcepto, Acceso.getUsuario(), GUIM.getHoraActual());
                txt_detalleConcepto.setText("");
                GUIM.cargarTablaConceptos(tbl_conceptos, unaCaja.getConceptos());
            } catch (Exception e) {
                lbl_resultado.setText(e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_delConceptoActionPerformed

    private void btn_modConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modConceptoActionPerformed
        if (txt_detalleConcepto.getText() != null) {
            try {
                Conceptos unConcepto = (Conceptos) tbl_conceptos.getValueAt(tbl_conceptos.getSelectedRow(), 1);
                String detalleConcepto = unConcepto.getDetalle();
                String tipoConcepto = unConcepto.getTipo();
                unaCaja.modificarConcepto(unConcepto, tipoConcepto, txt_detalleConcepto.getText());
                unaHosteria.crearAuditoria("MOD", "Modificó el Concepto " + detalleConcepto + " (" + tipoConcepto + ") a" + txt_detalleConcepto.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
                GUIM.cargarTablaConceptos(tbl_conceptos, unaCaja.getConceptos());
                txt_detalleConcepto.setText("");
            } catch (Exception ex) {
                lbl_resultado.setText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_modConceptoActionPerformed

    private void tbl_conceptosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_conceptosMouseClicked
        txt_detalleConcepto.setText(tbl_conceptos.getValueAt(tbl_conceptos.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_tbl_conceptosMouseClicked

    private void tbl_conceptosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_conceptosKeyTyped
    }//GEN-LAST:event_tbl_conceptosKeyTyped

    private void Scroll_tblConceptosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Scroll_tblConceptosMouseClicked
    }//GEN-LAST:event_Scroll_tblConceptosMouseClicked

    private void txt_searchConceptoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchConceptoCaretUpdate
        txt_detalleConcepto.setText("");
        List<Conceptos> todos = unaHosteria.getCajaPrincipal().getConceptos();
        List<Conceptos> filtro = new LinkedList<>();
        if (!txt_searchConcepto.getText().isEmpty()) {
            for (Conceptos uncons : todos) {
                if (uncons.getDetalle().toUpperCase().startsWith(txt_searchConcepto.getText().toUpperCase())) {
                    filtro.add(uncons);
                }
                GUIM.cargarTablaConceptos(tbl_conceptos, filtro);

            }
        } else {
            GUIM.cargarTablaConceptos(tbl_conceptos, todos);
        }
    }//GEN-LAST:event_txt_searchConceptoCaretUpdate

    private void cbx_tipoConceptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tipoConceptoItemStateChanged
        String unTipo = cbx_tipoConcepto.getSelectedItem().toString();

        List<Conceptos> ingresos = new LinkedList<>();
        List<Conceptos> egresos = new LinkedList<>();
        for (Conceptos unC : unaHosteria.getCajaPrincipal().getConceptos()) {
            if (unC.getTipo().equals("Entrada")) {
                ingresos.add(unC);
            } else {
                egresos.add(unC);
            }
        }

        if (unTipo.equals("Entrada")) {
            GUIM.cargarTablaConceptos(tbl_conceptos, ingresos);
        } else if (unTipo.equals("Salida")) {
            GUIM.cargarTablaConceptos(tbl_conceptos, egresos);
        } else {
            GUIM.cargarTablaConceptos(tbl_conceptos, unaHosteria.getCajaPrincipal().getConceptos());
        }
    }//GEN-LAST:event_cbx_tipoConceptoItemStateChanged

    private void cargarCampos() {
        cbx_tipoConceptoItemStateChanged(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll_tblConceptos;
    private javax.swing.JButton btn_addConcepto;
    private javax.swing.JButton btn_delConcepto;
    private javax.swing.JButton btn_modConcepto;
    private javax.swing.JComboBox cbx_tipoConcepto;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_resultado;
    private org.edisoncor.gui.panel.PanelRect pnl_btnConceptos;
    private javax.swing.JTable tbl_conceptos;
    private javax.swing.JTextField txt_detalleConcepto;
    private org.jdesktop.swingx.JXSearchField txt_searchConcepto;
    // End of variables declaration//GEN-END:variables
}
