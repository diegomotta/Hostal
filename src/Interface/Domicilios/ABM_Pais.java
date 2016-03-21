package Interface.Domicilios;


import Interface.Acceso;
import Interface.GUIM;
import Interface.principalAdministrador;
import LN.Domicilios.Pais;
import LN.Persona.Tipo_Documento;
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
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ABM_Pais extends javax.swing.JPanel implements Observer {

    public ABM_Pais(Hosteria unaHosteria, JFrame principal) {
        this.principal = (principalAdministrador) principal;
        this.unaHosteria = unaHosteria;
        unaHosteria.addObserver(this);
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);

        tbl_Paises.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Paises.getSelectedRow() != -1) {
                            selTabla();
                        }
                    }
                });

        List<Tipo_Documento> documentos = unaHosteria.getDocumentos();
        for (Tipo_Documento unDocumento : documentos) {
            cbx_docIdentidad.addItem(unDocumento);
        }

        GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
        this.tbl_Paises.getColumn("Países").setMaxWidth(400);
        this.setVisible(true);
    }

    public ABM_Pais(Hosteria unaHosteria) {
        this.principal = (principalAdministrador) principal;
        this.unaHosteria = unaHosteria;
        unaHosteria.addObserver(this);
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);

        tbl_Paises.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Paises.getSelectedRow() != -1) {
                            selTabla();
                        }
                    }
                });
        List<Tipo_Documento> documentos = unaHosteria.getDocumentos();
        for (Tipo_Documento unDocumento : documentos) {
            cbx_docIdentidad.addItem(unDocumento);
        }

        GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
        this.tbl_Paises.getColumn("Países").setMaxWidth(400);
        this.setVisible(true);
    }

    public ABM_Pais(Hosteria unaHosteria, String aCowntry) {
        unaHosteria.addObserver(this);
        this.unaHosteria = unaHosteria;
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);

        tbl_Paises.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_Paises.getSelectedRow() != -1) {
                            selTabla();
                        }
                    }
                });
        this.txt_nombrePais.setText(aCowntry);
        GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
        this.tbl_Paises.getColumn("Países").setMaxWidth(400);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        panel_Ingresar = new javax.swing.JPanel();
        lbl_nombrePaís = new javax.swing.JLabel();
        txt_nombrePais = new javax.swing.JTextField();
        pnl_resultados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_docIdentidad = new javax.swing.JComboBox();
        pnl_tablaPaíses = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Paises = new javax.swing.JTable();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_agregarPais = new javax.swing.JButton();
        jXTaskPane4 = new org.jdesktop.swingx.JXTaskPane();
        txt_searchPa = new org.jdesktop.swingx.JXSearchField();

        jTextField2.setText("jTextField2");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Países");

        panel_Ingresar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_nombrePaís.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombrePaís.setText("Nombre del País:");
        lbl_nombrePaís.setName("lbl_nombrePaís"); // NOI18N

        txt_nombrePais.setNextFocusableComponent(btn_agregarPais);
        txt_nombrePais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombrePaisKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombrePaisKeyTyped(evt);
            }
        });

        pnl_resultados.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        pnl_resultados.setLayout(new javax.swing.BoxLayout(pnl_resultados, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel1.setText("Documento de Identidad:");

        javax.swing.GroupLayout panel_IngresarLayout = new javax.swing.GroupLayout(panel_Ingresar);
        panel_Ingresar.setLayout(panel_IngresarLayout);
        panel_IngresarLayout.setHorizontalGroup(
            panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_IngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_IngresarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_docIdentidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_IngresarLayout.createSequentialGroup()
                        .addComponent(lbl_nombrePaís)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(pnl_resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_IngresarLayout.setVerticalGroup(
            panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_IngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePaís)
                    .addComponent(txt_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_docIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_tablaPaíses.setBorder(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_Paises.setBorder(null);
        tbl_Paises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Países", "Documento de Identidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Paises);

        javax.swing.GroupLayout pnl_tablaPaísesLayout = new javax.swing.GroupLayout(pnl_tablaPaíses);
        pnl_tablaPaíses.setLayout(pnl_tablaPaísesLayout);
        pnl_tablaPaísesLayout.setHorizontalGroup(
            pnl_tablaPaísesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnl_tablaPaísesLayout.setVerticalGroup(
            pnl_tablaPaísesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 320));

        btn_modificar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_agregarPais.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_agregarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_agregarPais.setText("Agregar");
        btn_agregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_agregarPais)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jXTaskPane4.setCollapsed(true);
        jXTaskPane4.setTitle("Buscar un País");

        txt_searchPa.setPrompt("Nombre del País");
        txt_searchPa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchPaCaretUpdate(evt);
            }
        });
        jXTaskPane4.getContentPane().add(txt_searchPa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_tablaPaíses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_tablaPaíses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPaisActionPerformed

        String nombrePais = txt_nombrePais.getText();
        Tipo_Documento tipodoc = (Tipo_Documento) cbx_docIdentidad.getSelectedItem();
        pnl_resultados.removeAll();
        if (!nombrePais.isEmpty()) {
            try {
                unaHosteria.altaPais(nombrePais, tipodoc);
                GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
                GUIM.mostrarSms(pnl_resultados, 0, nombrePais + " se ha guardado correctamente");
                limpiar();
                if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                    SwingUtilities.getWindowAncestor(this).dispose();
                }
                unaHosteria.crearAuditoria("ADD","Agrego el País: " + nombrePais, Acceso.getUsuario(), GUIM.getHoraActual());
                //unaHosteria.crearAuditoria("Agrego el País: " + usserName + " (" + apeUsser + " " + nomUsser + ")" , Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    GUIM.mostrarSms(pnl_resultados, 1, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_agregarPaisActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (txt_nombrePais.getText() != null) {

            Pais unPais = (Pais) tbl_Paises.getValueAt(tbl_Paises.getSelectedRow(), 0);
            Tipo_Documento unDocumento = (Tipo_Documento) cbx_docIdentidad.getSelectedItem();
            unaHosteria.modificaPais(unPais, txt_nombrePais.getText(), unDocumento);

            GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
            limpiar();

        }

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el País seleccionado",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        Pais unPais = (Pais) tbl_Paises.getValueAt(tbl_Paises.getSelectedRow(), 0);
        pnl_resultados.removeAll();
        String nombrePais = unPais.getNombre();
        if (res == JOptionPane.YES_OPTION) {
            try {
                unaHosteria.bajaPais(unPais);
                limpiar();

                GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
                GUIM.mostrarSms(pnl_resultados, 0, unPais.getNombre() + " se ha eliminado del sistema correctamente");
                unaHosteria.crearAuditoria("DEL","Eliminó el Pais: " + nombrePais, Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
                GUIM.mostrarSms(pnl_resultados, 1, e.getMessage());
            }

        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMouseClicked

    public void selTabla() {
        Pais unPais = (Pais) tbl_Paises.getValueAt(tbl_Paises.getSelectedRow(), 0);
        txt_nombrePais.setText(unPais.getNombre());
        cbx_docIdentidad.setSelectedItem(unPais.getTipoDocumento());
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
    }

    private void txt_nombrePaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombrePaisKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombrePaisKeyTyped

    private void txt_searchPaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchPaCaretUpdate

        List<Pais> paises = unaHosteria.getPaises();
        List<Pais> filtro = new LinkedList<>();
        if (!txt_searchPa.getText().isEmpty()) {
            for (Pais unPa : paises) {
                if (unPa.getNombre().toUpperCase().startsWith(txt_searchPa.getText().toUpperCase())) {
                    filtro.add(unPa);
                }
                GUIM.cargarTablaPaises(tbl_Paises, filtro);

            }
        } else {
            GUIM.cargarTablaPaises(tbl_Paises, paises);
        }
    }//GEN-LAST:event_txt_searchPaCaretUpdate

    private void txt_nombrePaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombrePaisKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_agregarPaisActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nombrePaisKeyPressed

    public void limpiar() {
        txt_nombrePais.setText("");
    }
    private principalAdministrador principal;
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPais;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cbx_docIdentidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane4;
    private javax.swing.JLabel lbl_nombrePaís;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel panel_Ingresar;
    private javax.swing.JPanel pnl_resultados;
    private javax.swing.JPanel pnl_tablaPaíses;
    private javax.swing.JTable tbl_Paises;
    private javax.swing.JTextField txt_nombrePais;
    private org.jdesktop.swingx.JXSearchField txt_searchPa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        if (o1 instanceof Pais) {
            GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
        }
    }
}
