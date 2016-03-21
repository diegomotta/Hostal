package Interface.Domicilios;

import Interface.Acceso;
import Interface.GUIM;
import Interface.principalAdministrador;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Varios.Hosteria;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Lukas
 */
public class ABM_Provincia extends javax.swing.JPanel implements Observer{

    public ABM_Provincia(Hosteria unaHosteria, Pais aCountry, String aState) {
        this.unaHosteria = unaHosteria;
        initComponents();
        unaHosteria.addObserver(this);

        btn_modificarProvincia.setEnabled(false);
        btn_eliminarProvincia.setEnabled(false);

        if (!unaHosteria.getPaises().isEmpty()) {
            this.tbl_Provincias.getColumn("Provincia").setWidth(350);
            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_paisPadre.addItem(unPais);

            }
        }

        cbx_paisPadre.setSelectedItem(aCountry);
        tbl_Provincias.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Provincias.getSelectedRowCount() != 0) {
                            tbl_ProvinciasMouseClicked(null);
                        }
                    }
                });

        if (aCountry.getProvincias() != null) {
            List<Provincia> provincias = aCountry.getProvincias();
            if (!provincias.isEmpty()) {
                GUIM.cargarTablaProvincias(tbl_Provincias, provincias);
            }
            txt_nombreProvincia.setText(aState);

        }

        this.setVisible(true);
    }

    public ABM_Provincia(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;

        initComponents();
        btn_modificarProvincia.setEnabled(false);
        btn_eliminarProvincia.setEnabled(false);

        if (!unaHosteria.getPaises().isEmpty()) {
            this.tbl_Provincias.getColumn("Provincia").setWidth(350);
            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_paisPadre.addItem(unPais);

            }
        }

        tbl_Provincias.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Provincias.getSelectedRowCount() != 0) {
                            tbl_ProvinciasMouseClicked(null);
                        }
                    }
                });
        if (cbx_paisPadre.getItemCount() != 0) {
            cbx_paisPadre.setEnabled(true);
            txt_nombreProvincia.setEnabled(true);
            if (((Pais) cbx_paisPadre.getSelectedItem()).getProvincias() != null) {
                List<Provincia> provincias = ((Pais) cbx_paisPadre.getSelectedItem()).getProvincias();
                GUIM.cargarTablaProvincias(tbl_Provincias, provincias);
            }
        } else {
            cbx_paisPadre.setEnabled(false);
            txt_nombreProvincia.setEnabled(false);
        }
        this.setVisible(true);
        this.setVisible(true);
    }

    public ABM_Provincia(Hosteria unaHosteria, Pais aCountry) {

        this.unaHosteria = unaHosteria;
        initComponents();

        btn_modificarProvincia.setEnabled(false);
        btn_eliminarProvincia.setEnabled(false);

        if (!unaHosteria.getPaises().isEmpty()) {
            this.tbl_Provincias.getColumn("Provincia").setWidth(350);
            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_paisPadre.addItem(unPais);

            }
        }

        cbx_paisPadre.setSelectedItem(aCountry);

        tbl_Provincias.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Provincias.getSelectedRowCount() != 0) {
                            tbl_ProvinciasMouseClicked(null);
                        }
                    }
                });

        if (cbx_paisPadre.getItemCount() != 0) {
            cbx_paisPadre.setEnabled(true);
            txt_nombreProvincia.setEnabled(true);
            if (((Pais) cbx_paisPadre.getSelectedItem()).getProvincias() != null) {
                List<Provincia> provincias = ((Pais) cbx_paisPadre.getSelectedItem()).getProvincias();
                GUIM.cargarTablaProvincias(tbl_Provincias, provincias);
            }
        } else {
            cbx_paisPadre.setEnabled(false);
            txt_nombreProvincia.setEnabled(false);
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXSearchFieldBeanInfo1 = new org.jdesktop.swingx.JXSearchFieldBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombrePaís = new javax.swing.JLabel();
        cbx_paisPadre = new javax.swing.JComboBox();
        lbl_nombreProv = new javax.swing.JLabel();
        txt_nombreProvincia = new javax.swing.JTextField();
        pnl_resul_provincia = new javax.swing.JPanel();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Provincias = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_agregarProvincia = new javax.swing.JButton();
        btn_eliminarProvincia = new javax.swing.JButton();
        btn_modificarProvincia = new javax.swing.JButton();
        jXTaskPane4 = new org.jdesktop.swingx.JXTaskPane();
        txt_searchPro = new org.jdesktop.swingx.JXSearchField();

        setPreferredSize(new java.awt.Dimension(620, 302));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_nombrePaís.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombrePaís.setText("Seleccionar un País:");

        cbx_paisPadre.setAutoscrolls(true);
        cbx_paisPadre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_paisPadreItemStateChanged(evt);
            }
        });

        lbl_nombreProv.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombreProv.setText("Nombre de la Provincia:");

        txt_nombreProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreProvinciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreProvinciaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_resul_provinciaLayout = new javax.swing.GroupLayout(pnl_resul_provincia);
        pnl_resul_provincia.setLayout(pnl_resul_provinciaLayout);
        pnl_resul_provinciaLayout.setHorizontalGroup(
            pnl_resul_provinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_resul_provinciaLayout.setVerticalGroup(
            pnl_resul_provinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        buttonCircle1.setText("buttonCircle1");
        buttonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombreProv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreProvincia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombrePaís)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_paisPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(pnl_resul_provincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombrePaís)
                        .addComponent(cbx_paisPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreProv)
                    .addComponent(txt_nombreProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_resul_provincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBorder(null);

        tbl_Provincias.setBorder(null);
        tbl_Provincias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provincia", "Perteneciente a"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Provincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProvinciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Provincias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Provincias");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_agregarProvincia.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_agregarProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_agregarProvincia.setText("   Agregar");
        btn_agregarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProvinciaActionPerformed(evt);
            }
        });

        btn_eliminarProvincia.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_eliminarProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarProvincia.setText("   Eliminar");
        btn_eliminarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarProvinciaActionPerformed(evt);
            }
        });

        btn_modificarProvincia.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_modificarProvincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarProvincia.setText("Modificar");
        btn_modificarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarProvinciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRect1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_eliminarProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregarProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificarProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_agregarProvincia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarProvincia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modificarProvincia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXTaskPane4.setCollapsed(true);
        jXTaskPane4.setTitle("Buscar una Provincia");

        txt_searchPro.setPrompt("Nombre de la provincia");
        txt_searchPro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchProCaretUpdate(evt);
            }
        });
        jXTaskPane4.getContentPane().add(txt_searchPro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXTaskPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProvinciaActionPerformed
        Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
        boolean ok = false;
        pnl_resul_provincia.removeAll();
        try {
            if (unPais != null) {
                if (!txt_nombreProvincia.getText().isEmpty()) {
                    String nombreProvincia = txt_nombreProvincia.getText();
                    Provincia unaProvincia = unaHosteria.altaProvincia(unPais, nombreProvincia);
                    ok = true;
                    GUIM.limpiar_tabla(tbl_Provincias);
                    GUIM.cargarTablaProvincias(tbl_Provincias, unPais.getProvincias());
                    limpiar();
                    unaHosteria.crearAuditoria("ADD", "Agregó la Provincia: " + nombreProvincia + " al País " + unPais.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());

                    if (ok) {
                        GUIM.mostrarSms(pnl_resul_provincia, 0, nombreProvincia + " se ha guardado correctamente");
                    }
                    if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                        SwingUtilities.getWindowAncestor(this).dispose();
                    }
                }
            }
        } catch (Exception e) {
            GUIM.mostrarSms(pnl_resul_provincia, 1, txt_nombreProvincia.getText() + " ya ha sido cargado con anterioridad");
        }

    }//GEN-LAST:event_btn_agregarProvinciaActionPerformed

    private void btn_modificarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarProvinciaActionPerformed

        Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
        Provincia unaProvincia = (Provincia) tbl_Provincias.getValueAt(tbl_Provincias.getSelectedRow(), 0);
        String nombreAnterior = unaProvincia.getNombre();
        String nombreProvincia = txt_nombreProvincia.getText();
        try {
            unaHosteria.modificarProvincia(unPais, unaProvincia, nombreProvincia);
            unaHosteria.crearAuditoria("MOD", "Modificó la Provincia: " + nombreAnterior + " a " + nombreProvincia, Acceso.getUsuario(), GUIM.getHoraActual());
            GUIM.cargarTablaProvincias(tbl_Provincias, unPais.getProvincias());
            limpiar();

        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btn_modificarProvinciaActionPerformed
    private void sub_abmProvinciasMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void cbx_paisPadreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_paisPadreItemStateChanged
        GUIM.limpiar_tabla(tbl_Provincias);
        if (cbx_paisPadre.getItemCount() != 0) {
            pnl_resul_provincia.removeAll();
            List<Provincia> provincias = ((Pais) cbx_paisPadre.getSelectedItem()).getProvincias();
            GUIM.cargarTablaProvincias(tbl_Provincias, provincias);

        }
    }//GEN-LAST:event_cbx_paisPadreItemStateChanged

    private void btn_eliminarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarProvinciaActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar la Provincia seleccionada?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                Pais unPais = (Pais) cbx_paisPadre.getSelectedItem();
                Provincia unaProvincia = (Provincia) tbl_Provincias.getValueAt(tbl_Provincias.getSelectedRow(), 0);
                String nombreProv = unaProvincia.getNombre();
                unaHosteria.bajaProvincia(unPais, unaProvincia);

                GUIM.cargarTablaProvincias(tbl_Provincias, unPais.getProvincias());
                limpiar();

                unaHosteria.crearAuditoria("DEL", "Eliminó la Provincia: " + nombreProv + " del País " + unPais.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
                GUIM.mostrarSms(pnl_resul_provincia, 1, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_eliminarProvinciaActionPerformed

    private void txt_nombreProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProvinciaKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreProvinciaKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt_searchProCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchProCaretUpdate
        Pais unPais = (Pais) this.cbx_paisPadre.getSelectedItem();
        List<Provincia> provincias = unPais.getProvincias();
        List<Provincia> filtro = new LinkedList<>();
        if (!txt_searchPro.getText().isEmpty()) {
            for (Provincia unaProv : provincias) {
                if (unaProv.getNombre().toUpperCase().startsWith(txt_searchPro.getText().toUpperCase())) {
                    filtro.add(unaProv);
                }
                GUIM.cargarTablaProvincias(tbl_Provincias, filtro);

            }
        } else {
            GUIM.cargarTablaProvincias(tbl_Provincias, provincias);
        }

    }//GEN-LAST:event_txt_searchProCaretUpdate

    private void tbl_ProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProvinciasMouseClicked
        txt_nombreProvincia.setText(tbl_Provincias.getValueAt(tbl_Provincias.getSelectedRow(), 0).toString());
        btn_modificarProvincia.setEnabled(true);
        btn_eliminarProvincia.setEnabled(true);
    }//GEN-LAST:event_tbl_ProvinciasMouseClicked

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
        frame.setLocationRelativeTo(null);
        frame.show();
        cbx_paisPadre.removeAllItems();
        for (Pais unPais : unaHosteria.getPaises()) {
            cbx_paisPadre.addItem(unPais);
        }
    }//GEN-LAST:event_buttonCircle1ActionPerformed

    private void txt_nombreProvinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProvinciaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_agregarProvinciaActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nombreProvinciaKeyPressed

    public void limpiar() {
        txt_nombreProvincia.setText("");
    }
    private Hosteria unaHosteria;
    private principalAdministrador principal;
    private JPanel panelAnterior;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarProvincia;
    private javax.swing.JButton btn_eliminarProvincia;
    private javax.swing.JButton btn_modificarProvincia;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private javax.swing.JComboBox cbx_paisPadre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXSearchFieldBeanInfo jXSearchFieldBeanInfo1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane4;
    private javax.swing.JLabel lbl_nombrePaís;
    private javax.swing.JLabel lbl_nombreProv;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel pnl_resul_provincia;
    private javax.swing.JTable tbl_Provincias;
    private javax.swing.JTextField txt_nombreProvincia;
    private org.jdesktop.swingx.JXSearchField txt_searchPro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
