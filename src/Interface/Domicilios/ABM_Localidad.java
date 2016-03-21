/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Domicilios;

import Interface.Acceso;
import Interface.GUIM;
import Interface.principalAdministrador;
import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Varios.Hosteria;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ABM_Localidad extends javax.swing.JPanel {

    public ABM_Localidad(Hosteria unaHoateria) {
        this.unaHosteria = unaHoateria;

        initComponents();
        if (!unaHosteria.getPaises().isEmpty()) {

            btn_eliminarLocalidad.setEnabled(false);
            btn_modificarLocalidad.setEnabled(false);

            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_paisPadre.addItem(unPais);
            }

            tbl_Localidades.getSelectionModel().addListSelectionListener(
                    new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            if (tbl_Localidades.getSelectedRowCount() != 0) {
                                tbl_LocalidadesMouseClicked(null);
                            }
                        }
                    });

            if (cbx_provinciaPadre.getItemCount() != 0) {
                List<Localidad> localidades = ((Provincia) cbx_provinciaPadre.getSelectedItem()).getLocalidades();
                GUIM.cargarTablaLocalidades(tbl_Localidades, localidades);

            } else {
                txt_nombreLocalidad.setEnabled(false);
            }
            this.setVisible(true);
        }

    }

    public ABM_Localidad(Hosteria unaHoateria, Pais aCantry, Provincia aState) {

        this.unaHosteria = unaHoateria;

        initComponents();
        btn_eliminarLocalidad.setEnabled(false);
        btn_modificarLocalidad.setEnabled(false);

        if (!unaHosteria.getPaises().isEmpty()) {
            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_paisPadre.addItem(unPais);

            }

            if (cbx_provinciaPadre.getItemCount() != 0) {
                List<Localidad> localidades = ((Provincia) cbx_provinciaPadre.getSelectedItem()).getLocalidades();
                GUIM.cargarTablaLocalidades(tbl_Localidades, localidades);

            } else {
                txt_nombreLocalidad.setEnabled(false);
            }
            this.setVisible(true);

            cbx_paisPadre.setSelectedItem(aCantry);
            cbx_provinciaPadre.setSelectedItem(aState);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Tabla_Localidades = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Localidades = new javax.swing.JTable();
        pnl_DatosLocalidad = new javax.swing.JPanel();
        lbl_nombrePaís = new javax.swing.JLabel();
        cbx_paisPadre = new javax.swing.JComboBox();
        lbl_nombreProv = new javax.swing.JLabel();
        txt_nombreLocalidad = new javax.swing.JTextField();
        lbl_nombrePaís1 = new javax.swing.JLabel();
        cbx_provinciaPadre = new javax.swing.JComboBox();
        pnl_resul_localidad = new javax.swing.JPanel();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();
        buttonCircle2 = new org.edisoncor.gui.button.ButtonCircle();
        jTextField1 = new javax.swing.JTextField();
        jXTaskPane4 = new org.jdesktop.swingx.JXTaskPane();
        txt_searchLoc = new org.jdesktop.swingx.JXSearchField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_agregarLocalidad = new javax.swing.JButton();
        btn_eliminarLocalidad = new javax.swing.JButton();
        btn_modificarLocalidad = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(620, 420));

        pnl_Tabla_Localidades.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Tabla_Localidades.setLayout(new javax.swing.BoxLayout(pnl_Tabla_Localidades, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBorder(null);

        tbl_Localidades.setBorder(null);
        tbl_Localidades.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        tbl_Localidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Localidad", "Provincia", "País"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Localidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_LocalidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Localidades);

        pnl_Tabla_Localidades.add(jScrollPane1);

        pnl_DatosLocalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_nombrePaís.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombrePaís.setText("Seleccionar un País:");

        cbx_paisPadre.setAutoscrolls(true);
        cbx_paisPadre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_paisPadreItemStateChanged(evt);
            }
        });

        lbl_nombreProv.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombreProv.setText("Nombre de la Localidad:");

        txt_nombreLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreLocalidadActionPerformed(evt);
            }
        });
        txt_nombreLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreLocalidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreLocalidadKeyTyped(evt);
            }
        });

        lbl_nombrePaís1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombrePaís1.setText("Seleccione la Provincia:");

        cbx_provinciaPadre.setAutoscrolls(true);
        cbx_provinciaPadre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_provinciaPadreItemStateChanged(evt);
            }
        });

        pnl_resul_localidad.setBorder(null);

        javax.swing.GroupLayout pnl_resul_localidadLayout = new javax.swing.GroupLayout(pnl_resul_localidad);
        pnl_resul_localidad.setLayout(pnl_resul_localidadLayout);
        pnl_resul_localidadLayout.setHorizontalGroup(
            pnl_resul_localidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_resul_localidadLayout.setVerticalGroup(
            pnl_resul_localidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        buttonCircle1.setText("buttonCircle1");
        buttonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle1ActionPerformed(evt);
            }
        });

        buttonCircle2.setText("buttonCircle1");
        buttonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DatosLocalidadLayout = new javax.swing.GroupLayout(pnl_DatosLocalidad);
        pnl_DatosLocalidad.setLayout(pnl_DatosLocalidadLayout);
        pnl_DatosLocalidadLayout.setHorizontalGroup(
            pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                        .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                                .addComponent(lbl_nombrePaís)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_paisPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                                .addComponent(lbl_nombrePaís1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_provinciaPadre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                        .addComponent(lbl_nombreProv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(pnl_resul_localidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DatosLocalidadLayout.setVerticalGroup(
            pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DatosLocalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombrePaís)
                        .addComponent(cbx_paisPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombrePaís1)
                        .addComponent(cbx_provinciaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_DatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreProv)
                    .addComponent(txt_nombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(pnl_resul_localidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Localidades");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jXTaskPane4.setCollapsed(true);
        jXTaskPane4.setTitle("Buscar una Localidad");

        txt_searchLoc.setPrompt("Nombre de la Localidad");
        txt_searchLoc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchLocCaretUpdate(evt);
            }
        });
        jXTaskPane4.getContentPane().add(txt_searchLoc);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 177));

        btn_agregarLocalidad.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_agregarLocalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_agregarLocalidad.setText("  Agregar");
        btn_agregarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarLocalidadActionPerformed(evt);
            }
        });

        btn_eliminarLocalidad.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_eliminarLocalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarLocalidad.setText("   Eliminar");
        btn_eliminarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarLocalidadActionPerformed(evt);
            }
        });

        btn_modificarLocalidad.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_modificarLocalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarLocalidad.setText("Modificar");
        btn_modificarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarLocalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarLocalidad)
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_agregarLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificarLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_agregarLocalidad)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarLocalidad)
                .addGap(18, 18, 18)
                .addComponent(btn_modificarLocalidad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_DatosLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Tabla_Localidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pnl_Tabla_Localidades, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_DatosLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreLocalidadActionPerformed

    private void btn_agregarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarLocalidadActionPerformed
        String nombreLocalidad = txt_nombreLocalidad.getText();
        Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
        Provincia unaProvincia = (Provincia) cbx_provinciaPadre.getSelectedItem();
        pnl_resul_localidad.removeAll();
        if (!nombreLocalidad.isEmpty()) {
            try {
                Localidad unaLocalidad = unaHosteria.altaLocalidad(unPais, unaProvincia, nombreLocalidad);
                GUIM.cargarTablaLocalidades(tbl_Localidades, unaProvincia.getLocalidades());
                GUIM.mostrarSms(pnl_resul_localidad, 0, nombreLocalidad + " se ha guardado correctamente");
                unaHosteria.crearAuditoria("ADD", "Agregó la Localidad: " + nombreLocalidad + " a la Provincia " + unaProvincia.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());
                limpiar();
                if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                    SwingUtilities.getWindowAncestor(this).dispose();
                }

            } catch (Exception e) {
                GUIM.mostrarSms(pnl_resul_localidad, 1, nombreLocalidad + " ya ha sido cargado con anterioridad");
                limpiar();
            }
        }
    }//GEN-LAST:event_btn_agregarLocalidadActionPerformed

    private void btn_modificarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarLocalidadActionPerformed
        String nombreLocalidad = txt_nombreLocalidad.getText();
        if (!nombreLocalidad.isEmpty()) {
            Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
            Provincia unaProvincia = (Provincia) cbx_provinciaPadre.getSelectedItem();
            Localidad unaLocalidad = (Localidad) tbl_Localidades.getValueAt(tbl_Localidades.getSelectedRow(), 0);
            String nameOld = unaLocalidad.getNombre();
            try {
                unaHosteria.modificarLocalidad(unPais, unaProvincia, unaLocalidad, nombreLocalidad);
                unaHosteria.crearAuditoria("MOD", "Modificó la Localidad: " + nameOld + " a " + nombreLocalidad, Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception ex) {
                Logger.getLogger(ABM_Localidad.class.getName()).log(Level.SEVERE, null, ex);
            }
            GUIM.cargarTablaLocalidades(tbl_Localidades, unaProvincia.getLocalidades());
            limpiar();
        }
    }//GEN-LAST:event_btn_modificarLocalidadActionPerformed

    private void cbx_paisPadreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_paisPadreItemStateChanged
        if (cbx_paisPadre.getItemCount() != 0) {
            List<Provincia> provincias = ((Pais) cbx_paisPadre.getSelectedItem()).getProvincias();
            cbx_provinciaPadre.removeAllItems();
            for (Provincia unaProvincia : provincias) {
                cbx_provinciaPadre.addItem(unaProvincia);
            }
        } else {
            cbx_provinciaPadre.setEnabled(false);
            txt_nombreLocalidad.setEnabled(false);
        }
        if (((Pais) cbx_paisPadre.getSelectedItem()).getProvincias().isEmpty()) {
            cbx_provinciaPadre.setEnabled(false);
            txt_nombreLocalidad.setEnabled(false);
        } else {
            cbx_provinciaPadre.setEnabled(true);
            txt_nombreLocalidad.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_paisPadreItemStateChanged

    private void cbx_provinciaPadreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_provinciaPadreItemStateChanged
        GUIM.limpiar_tabla(tbl_Localidades);
        if (cbx_provinciaPadre.getItemCount() != 0) {
            List<Localidad> localidades = ((Provincia) cbx_provinciaPadre.getSelectedItem()).getLocalidades();
            GUIM.cargarTablaLocalidades(tbl_Localidades, localidades);

        }

    }//GEN-LAST:event_cbx_provinciaPadreItemStateChanged

    private void btn_eliminarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarLocalidadActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar la Localidad seleccionada?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
                Provincia unaProvincia = (Provincia) cbx_provinciaPadre.getSelectedItem();
                Localidad unaLocalidad = (Localidad) tbl_Localidades.getValueAt(tbl_Localidades.getSelectedRow(), 0);
                String nombreLocalidad = unaLocalidad.getNombre();
                unaHosteria.bajaLocalidad(unPais, unaProvincia, unaLocalidad);
                limpiar();
                unaHosteria.crearAuditoria("DEL", "Eliminó la Localidad: " + nombreLocalidad + " de la Provincia " + unaProvincia.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());
                GUIM.limpiar_tabla(tbl_Localidades);
                GUIM.cargarTablaLocalidades(tbl_Localidades, unaProvincia.getLocalidades());
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btn_eliminarLocalidadActionPerformed

    private void tbl_LocalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_LocalidadesMouseClicked

        txt_nombreLocalidad.setText(tbl_Localidades.getValueAt(tbl_Localidades.getSelectedRow(), 0).toString());
        btn_eliminarLocalidad.setEnabled(true);
        btn_modificarLocalidad.setEnabled(true);

    }//GEN-LAST:event_tbl_LocalidadesMouseClicked

    private void txt_nombreLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreLocalidadKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreLocalidadKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt_searchLocCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchLocCaretUpdate
        Provincia unaProvincia = (Provincia) this.cbx_provinciaPadre.getSelectedItem();
        List<Localidad> localidades = unaProvincia.getLocalidades();
        List<Localidad> filtro = new LinkedList<>();
        if (!txt_searchLoc.getText().isEmpty()) {
            for (Localidad unaLoc : localidades) {
                if (unaLoc.getNombre().toUpperCase().startsWith(txt_searchLoc.getText().toUpperCase())) {
                    filtro.add(unaLoc);
                }
                GUIM.cargarTablaLocalidades(tbl_Localidades, filtro);

            }
        } else {
            GUIM.cargarTablaLocalidades(tbl_Localidades, localidades);
        }
    }//GEN-LAST:event_txt_searchLocCaretUpdate

    private void buttonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle2ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        if (cbx_paisPadre.getSelectedItem() != -1) {
            Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();

            ABM_Provincia gestorProvincia = new ABM_Provincia(unaHosteria, unPais);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(gestorProvincia);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();
        }
        cbx_provinciaPadre.removeAllItems();
        for (Provincia unProvincia : ((Pais) cbx_paisPadre.getSelectedItem()).getProvincias()) {
            cbx_provinciaPadre.addItem(unProvincia);
        }
    }//GEN-LAST:event_buttonCircle2ActionPerformed

    private void buttonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle1ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }

        ABM_Pais gestorPais = new ABM_Pais(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gestorPais);
        frame.pack();
        frame.show();
        cbx_paisPadre.removeAllItems();
        for (Pais unPais : unaHosteria.getPaises()) {
            cbx_paisPadre.addItem(unPais);
        }
    }//GEN-LAST:event_buttonCircle1ActionPerformed

    private void txt_nombreLocalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreLocalidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_agregarLocalidadActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nombreLocalidadKeyPressed

    public void limpiar() {
        txt_nombreLocalidad.setText("");
    }
    private Hosteria unaHosteria;
    private principalAdministrador principal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarLocalidad;
    private javax.swing.JButton btn_eliminarLocalidad;
    private javax.swing.JButton btn_modificarLocalidad;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle2;
    private javax.swing.JComboBox cbx_paisPadre;
    private javax.swing.JComboBox cbx_provinciaPadre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane4;
    private javax.swing.JLabel lbl_nombrePaís;
    private javax.swing.JLabel lbl_nombrePaís1;
    private javax.swing.JLabel lbl_nombreProv;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel pnl_DatosLocalidad;
    private javax.swing.JPanel pnl_Tabla_Localidades;
    private javax.swing.JPanel pnl_resul_localidad;
    private javax.swing.JTable tbl_Localidades;
    private javax.swing.JTextField txt_nombreLocalidad;
    private org.jdesktop.swingx.JXSearchField txt_searchLoc;
    // End of variables declaration//GEN-END:variables
}
