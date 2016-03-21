/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Articulos;

import Interface.Acceso;
import Interface.GUIM;
import LN.Articulos.Area;
import LN.Articulos.Articulo;
import LN.Articulos.Unidad_de_Medida;
import LN.Varios.Hosteria;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Lukas
 */
public class ABM_Artículos extends javax.swing.JPanel {
    
    public ABM_Artículos(Hosteria unaHosteria) {
        
        this.unaHosteria = unaHosteria;
        initComponents();
        iniciarInterface();
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreArticulo = new javax.swing.JTextField();
        cbx_unidadMedida = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbx_areaAplicacion = new javax.swing.JComboBox();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();
        box_cuantificable = new javax.swing.JCheckBox();
        box_estatico = new javax.swing.JCheckBox();
        txt_Precio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_articulos = new javax.swing.JTable();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        txt_buscarNombre = new org.jdesktop.swingx.JXSearchField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_agregarArticulo = new javax.swing.JButton();
        btn_eliminarArticulo = new javax.swing.JButton();
        btn_modificarArticulo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Artículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 3, 14)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel1.setText("Nombre del Artículo:");

        txt_nombreArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nombreArticuloFocusLost(evt);
            }
        });
        txt_nombreArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreArticuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreArticuloKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel3.setText("Por");

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel5.setText("Area:");

        buttonCircle1.setText("buttonCircle1");
        buttonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle1ActionPerformed(evt);
            }
        });

        box_cuantificable.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        box_cuantificable.setText("¿Con Unidad de Medida?");
        box_cuantificable.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box_cuantificableStateChanged(evt);
            }
        });

        box_estatico.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        box_estatico.setText("Precio Estático");
        box_estatico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                box_estaticoStateChanged(evt);
            }
        });

        txt_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box_estatico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_areaAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(box_cuantificable)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_unidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_estatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbx_areaAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_cuantificable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_unidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tbl_articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "Area de aplicaion", "Detalle", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_articulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_articulos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        txt_buscarNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txt_buscarNombre.setInstantSearchDelay(50);
        txt_buscarNombre.setPrompt("Buscar Artículo");
        txt_buscarNombre.setRecentSearchesSaveKey("");
        txt_buscarNombre.setToolTipText("Buscar Articulo por su nombre");
        txt_buscarNombre.setPromptBackround(java.awt.Color.white);
        txt_buscarNombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_buscarNombreCaretUpdate(evt);
            }
        });
        txt_buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarNombreActionPerformed(evt);
            }
        });
        txt_buscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setMinimumSize(new java.awt.Dimension(150, 0));

        btn_agregarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_agregarArticulo.setText("   Agregar");
        btn_agregarArticulo.setDisabledIcon(null);
        btn_agregarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_agregarArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_agregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarArticuloActionPerformed(evt);
            }
        });

        btn_eliminarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarArticulo.setText("   Eliminar");
        btn_eliminarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_eliminarArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_eliminarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarArticuloActionPerformed(evt);
            }
        });

        btn_modificarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarArticulo.setText("Modificar");
        btn_modificarArticulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_modificarArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_modificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarArticuloActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        jButton1.setText("<html><p>Historial</p><p>de Compras</p></html>");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
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
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_agregarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificarArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Artículos");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarInterface() {
        btn_eliminarArticulo.setEnabled(false);
        btn_modificarArticulo.setEnabled(false);
        
        box_cuantificable.setSelected(false);
        box_cuantificableStateChanged(null);
        List<Unidad_de_Medida> unidades = unaHosteria.getUnidadesDeMedida();
        for (Unidad_de_Medida unaUnidad : unidades) {
            cbx_unidadMedida.addItem(unaUnidad);
        }
        
        box_estatico.setSelected(false);
        
        List<Area> areas = unaHosteria.getAreas();
        for (Area unArea : areas) {
            cbx_areaAplicacion.addItem(unArea);
        }
        Collections.sort(unaHosteria.getArticulos());
        GUIM.cargarTablaArticulos(tbl_articulos, unaHosteria.getArticulos());
        this.updateUI();
        
        tbl_articulos.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        txt_nombreArticulo.setText(tbl_articulos.getValueAt(tbl_articulos.getSelectedRow(), 0).toString());
                        cbx_areaAplicacion.setSelectedItem(tbl_articulos.getValueAt(tbl_articulos.getSelectedRow(), 1).toString());
                        
                        
                    }
                });
    }
    
    private void btn_agregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarArticuloActionPerformed
        
        
        Integer por = null;
        Unidad_de_Medida cuantificable = null;
        String nombreArt = txt_nombreArticulo.getText();
        Area aplicadoEn = (Area) cbx_areaAplicacion.getSelectedItem();
        Double precioArt = null;
        
        if (box_cuantificable.isSelected()) {
            por = Integer.parseInt(txt_cantidad.getText());
            cuantificable = (Unidad_de_Medida) cbx_unidadMedida.getSelectedItem();
        }
        try {
            if (box_estatico.isSelected()) {
                precioArt = Double.parseDouble(txt_Precio.getText());
            }
            
            unaHosteria.altaArticulo(nombreArt, aplicadoEn, cuantificable, por, precioArt);
            txt_cantidad.setText("");
            txt_nombreArticulo.setText("");
            txt_Precio.setText("");
            GUIM.cargarTablaArticulos(tbl_articulos, unaHosteria.getArticulos());
        } catch (Exception ex) {
            Logger.getLogger(ABM_Artículos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        unaHosteria.crearAuditoria("ADD","Agrego el Artículo: " + nombreArt, Acceso.getUsuario(), GUIM.getHoraActual());
        
        
        
    }//GEN-LAST:event_btn_agregarArticuloActionPerformed
    
    private void btn_eliminarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarArticuloActionPerformed
        
        int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el Articulo seleccionado",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
        Articulo unArticulo = (Articulo) tbl_articulos.getValueAt(tbl_articulos.getSelectedRow(), 0);
                
                unaHosteria.bajaArticulo(unArticulo);
                txt_cantidad.setText("");
                txt_nombreArticulo.setText("");
                
                
                GUIM.cargarTablaArticulos(tbl_articulos, unaHosteria.getArticulos());
                unaHosteria.crearAuditoria("DEL","Eliminó el Artículo: " + unArticulo.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_eliminarArticuloActionPerformed
    
    private void btn_modificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarArticuloActionPerformed
        
        if (!txt_nombreArticulo.getText().isEmpty()) {
            if (tbl_articulos.getSelectedRowCount() != 0) {
                try {
                    Articulo unArticulo = (Articulo) tbl_articulos.getValueAt(tbl_articulos.getSelectedRow(), 0);
                    
                    Integer por = null;
                    Unidad_de_Medida cuantificable = null;
                    String nombreArt = txt_nombreArticulo.getText();
                    Area aplicadoEn = (Area) cbx_areaAplicacion.getSelectedItem();
                    
                    if (box_cuantificable.isSelected()) {
                        por = Integer.parseInt(txt_cantidad.getText());
                        cuantificable = (Unidad_de_Medida) cbx_unidadMedida.getSelectedItem();
                    }
                    
                    unaHosteria.modificarArticulo(unArticulo, nombreArt, aplicadoEn, cuantificable, por);
                    GUIM.cargarTablaArticulos(tbl_articulos, unaHosteria.getArticulos());
                    unaHosteria.crearAuditoria("MOD","Modificó el Artículo: " + unArticulo.getNombre(), Acceso.getUsuario(), GUIM.getHoraActual());
                } catch (Exception e) {
                }
                
                
            }
        }

//        if (txt_nombrePais.getText() != null) {
//
//            Pais unPais = (Pais) tbl_Paises.getValueAt(tbl_Paises.getSelectedRow(), 1);
//
//            unaHosteria.modificaPais(unPais, txt_nombrePais.getText());
//
//            GUIM.cargarTablaPaises(tbl_Paises, unaHosteria.getPaises());
//            txt_nombrePais.setText("");
//
//        }
    }//GEN-LAST:event_btn_modificarArticuloActionPerformed
    
    private void txt_nombreArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreArticuloKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
//            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreArticuloKeyTyped
    
    private void buttonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle1ActionPerformed
        
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        
        
        
        ABM_Unidad_de_Medida gestorUnidades = new ABM_Unidad_de_Medida(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gestorUnidades);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        
        for (Unidad_de_Medida unaUnidad : unaHosteria.getUnidadesDeMedida()) {
            cbx_unidadMedida.addItem(unaUnidad);
        }
    }//GEN-LAST:event_buttonCircle1ActionPerformed
    
    private void box_cuantificableStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box_cuantificableStateChanged
        if (box_cuantificable.isSelected()) {
            txt_cantidad.setEnabled(true);
            cbx_unidadMedida.setEnabled(true);
        } else {
            txt_cantidad.setEnabled(false);
            cbx_unidadMedida.setEnabled(false);
        }
    }//GEN-LAST:event_box_cuantificableStateChanged
    
    private void txt_nombreArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreArticuloKeyPressed
        if (txt_nombreArticulo.getText().isEmpty()) {
            cbx_areaAplicacion.setEnabled(false);
        } else {
            cbx_areaAplicacion.setEnabled(true);
        }
    }//GEN-LAST:event_txt_nombreArticuloKeyPressed
    
    private void txt_nombreArticuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nombreArticuloFocusLost
        if (txt_nombreArticulo.getText().isEmpty()) {
            cbx_areaAplicacion.setEnabled(false);
        } else {
            cbx_areaAplicacion.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreArticuloFocusLost
    
    private void txt_buscarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarNombreKeyTyped
        List<Articulo> articulos = unaHosteria.getArticulos();
        List<Articulo> filtro = new LinkedList<>();
        if (!txt_buscarNombre.getText().isEmpty()) {
            for (Articulo unArt : articulos) {
                if (unArt.getNombre().toUpperCase().startsWith(txt_buscarNombre.getText().toUpperCase())) {
                    filtro.add(unArt);
                }
                GUIM.cargarTablaArticulos(tbl_articulos, filtro);
            }
        } else {
            GUIM.cargarTablaArticulos(tbl_articulos, articulos);
        }
        
    }//GEN-LAST:event_txt_buscarNombreKeyTyped
    
    private void txt_buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarNombreActionPerformed
    
    private void tbl_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_articulosMouseClicked
        btn_eliminarArticulo.setEnabled(true);
        btn_modificarArticulo.setEnabled(true);
        Articulo unArticulo = (Articulo) tbl_articulos.getValueAt(tbl_articulos.getSelectedRow(), 0);
        txt_nombreArticulo.setText(unArticulo.getNombre());
        cbx_areaAplicacion.setSelectedItem(unArticulo.getArea_aplicacion());
        
        
        
        
    }//GEN-LAST:event_tbl_articulosMouseClicked
    
    private void txt_buscarNombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_buscarNombreCaretUpdate
        List<Articulo> articulos = unaHosteria.getArticulos();
        List<Articulo> filtro = new LinkedList<>();
        if (!txt_buscarNombre.getText().isEmpty()) {
            for (Articulo unArt : articulos) {
                if (unArt.getNombre().toUpperCase().startsWith(txt_buscarNombre.getText().toUpperCase())) {
                    filtro.add(unArt);
                }
                GUIM.cargarTablaArticulos(tbl_articulos, filtro);
            }
        } else {
            GUIM.cargarTablaArticulos(tbl_articulos, articulos);
        }
        
    }//GEN-LAST:event_txt_buscarNombreCaretUpdate
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void box_estaticoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_box_estaticoStateChanged
        if (box_estatico.isSelected()) {
            txt_Precio.setEnabled(true);
        } else {
            txt_Precio.setEnabled(false);
        }
    }//GEN-LAST:event_box_estaticoStateChanged
    
    private void txt_PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrecioKeyTyped
    
    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }

        Articulos_Comprados arts = new Articulos_Comprados(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(arts);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_jButton1ActionPerformed
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_cuantificable;
    private javax.swing.JCheckBox box_estatico;
    private javax.swing.JButton btn_agregarArticulo;
    private javax.swing.JButton btn_eliminarArticulo;
    private javax.swing.JButton btn_modificarArticulo;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private javax.swing.JComboBox cbx_areaAplicacion;
    private javax.swing.JComboBox cbx_unidadMedida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tbl_articulos;
    private javax.swing.JTextField txt_Precio;
    private org.jdesktop.swingx.JXSearchField txt_buscarNombre;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_nombreArticulo;
    // End of variables declaration//GEN-END:variables
}
