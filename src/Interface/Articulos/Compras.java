package Interface.Articulos;

import Interface.GUIM;
import Interface.Renderers.Lista_articulosAdquiridos;
import LN.Articulos.Area;
import LN.Articulos.Articulo;
import LN.Articulos.Articulo_Estatico;
import LN.Articulos.Articulos_Adquiridos;
import LN.Articulos.Compra;
import LN.Articulos.Establecimiento;
import LN.Varios.Hosteria;
import LN.Varios.Numero;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Compras extends javax.swing.JPanel implements Observer {
    
    private Hosteria unaHosteria;
    private List<Articulos_Adquiridos> articulos;
    private Double total = 0.0;
    private Articulos_Adquiridos articuloSeleccionado;
    public Compra unaCompra;
    
    public Compras(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        this.articulos = new LinkedList<>();
        this.unaCompra = null;
        initComponents();
        GUIM.decimalPositivo(txt_precio);
        
        unaHosteria.addObserver(this);
        btn_quitar.setEnabled(false);
        txt_cantidad.setText("1");
        carcarCombo();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_quitar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        cbx_articulos = new com.jidesoft.swing.AutoCompletionComboBox();
        btn_abrirArticulos = new org.edisoncor.gui.button.ButtonCircle();
        txt_precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_area = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_nombreEstablecimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_numeroComprobante = new javax.swing.JTextField();
        check_Comprobante = new javax.swing.JCheckBox();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Registro de Compras");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abajo.png"))); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arriba.png"))); // NOI18N
        btn_quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Monto Total:");

        txt_total.setEditable(false);
        txt_total.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_quitar)
                            .addComponent(btn_agregar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbx_articulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_articulosItemStateChanged(evt);
            }
        });

        btn_abrirArticulos.setText("buttonCircle1");
        btn_abrirArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirArticulosActionPerformed(evt);
            }
        });

        txt_precio.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_precioCaretUpdate(evt);
            }
        });
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Artículo:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Costo ($):");

        txt_area.setEditable(false);
        txt_area.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Destinado a:");

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(null);
        jButton1.setMinimumSize(null);

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_guardar)
                        .addComponent(btn_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_nombreEstablecimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreEstablecimientoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad:");

        txt_cantidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_cantidadCaretUpdate(evt);
            }
        });
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Subtotal:");

        txt_subtotal.setEditable(false);
        txt_subtotal.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel8.setText("Establecimiento emisor:");

        txt_numeroComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeroComprobanteActionPerformed(evt);
            }
        });
        txt_numeroComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numeroComprobanteKeyTyped(evt);
            }
        });

        check_Comprobante.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        check_Comprobante.setText("Numero de Comprobante:");
        check_Comprobante.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                check_ComprobanteStateChanged(evt);
            }
        });
        check_Comprobante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_ComprobanteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_precio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_subtotal)
                            .addComponent(txt_area)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(cbx_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_abrirArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(check_Comprobante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombreEstablecimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_numeroComprobante))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbx_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_abrirArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_Comprobante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void cbx_articulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_articulosItemStateChanged
        Articulo articuloSelec = (Articulo) cbx_articulos.getSelectedItem();
        if (articuloSelec instanceof Articulo_Estatico) {
            txt_precio.setText(String.valueOf(((Articulo_Estatico) articuloSelec).getPrecio()));
        } else {
            txt_precio.setText("");
            txt_subtotal.setText("");
        }
        txt_area.setText(articuloSelec.getArea_aplicacion().getTipo());
        txt_cantidad.setText("1");
    }//GEN-LAST:event_cbx_articulosItemStateChanged
    
    private void txt_precioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_precioCaretUpdate
    }//GEN-LAST:event_txt_precioCaretUpdate
    
    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_precioKeyTyped
    
    private void btn_abrirArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirArticulosActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        
        ABM_Artículos arts = new ABM_Artículos(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(arts);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        carcarCombo();
    }//GEN-LAST:event_btn_abrirArticulosActionPerformed
    
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        btn_quitar.setEnabled(false);
        
        boolean ok1;
        boolean ok2;
        
        if (!txt_precio.getText().isEmpty()) {
            ok1 = true;
        } else {
            ok1 = false;
        }
        if (!txt_cantidad.getText().isEmpty()) {
            ok2 = true;
        } else {
            ok2 = false;
        }
        if (ok1 && ok2) {
            Articulo unArticulo = (Articulo) cbx_articulos.getSelectedItem();
            Area unArea = unArticulo.getArea_aplicacion();
            double unMonto = Double.valueOf(txt_precio.getText());
            int cantidad = Integer.parseInt(txt_cantidad.getText());
            Double subTotal = (unMonto * cantidad);
            Articulos_Adquiridos unaAdquisicion = unaHosteria.agregarAdquisicion(unArticulo, unMonto, unArea, cantidad);
            articulos.add(unaAdquisicion);
            
            total = total + subTotal;
            
            txt_total.setText(String.valueOf(total));
            cargarLista(articulos);
            txt_precio.setText("");
            txt_area.setText("");
            txt_cantidad.setText("");
            cbx_articulos.setSelectedIndex(0);
            
            
        } else {
            JOptionPane.showMessageDialog(this, "No pueden existir campos vacios");
        }
        
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        boolean ok = false;
        int cantidadTotal = 0;
        Numero NumeroComprobante;
        Establecimiento unEstablecimiento;
        for (Articulos_Adquiridos unAdquirido : articulos) {
            cantidadTotal = +unAdquirido.getCantidad();
        }
        double montoCompra = Double.valueOf(txt_total.getText());
        if (check_Comprobante.isSelected()) {
            if (!"".equals(txt_nombreEstablecimiento.getText())) {
                if (!"".equals(txt_numeroComprobante.getText())) {
                    unEstablecimiento = unaHosteria.obtenerEstablecimiento(txt_nombreEstablecimiento.getText());
                    if (unEstablecimiento != null) {
                        NumeroComprobante = unEstablecimiento.obtenerNumeroComprobante(txt_numeroComprobante.getText());
                        
                        if (NumeroComprobante != null) {
                            JOptionPane.showMessageDialog(this, "Esta compra ya se ha registrado con anterioridad, por favor verifique sus datos nuevamente");
                            ok = false;
                        } else {
                            NumeroComprobante = unEstablecimiento.agregarNumero(txt_numeroComprobante.getText());
                            ok = true;
                        }
                    } else {
                        unEstablecimiento = unaHosteria.agregarEstablecimiento(txt_nombreEstablecimiento.getText());
                        NumeroComprobante = unEstablecimiento.agregarNumero(txt_numeroComprobante.getText());
                        ok = true;
                    }
                    try {
                        if (ok) {
                            unaCompra = unaHosteria.agregarCompra(NumeroComprobante, new Date(), GUIM.getHoraActual(), articulos, cantidadTotal, montoCompra, unEstablecimiento);
                            SwingUtilities.getWindowAncestor(this).dispose();
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un numero de factura");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del Establecimiento");
                
            }
        } else {
            try {
                unaCompra = unaHosteria.agregarCompra(null, new Date(), GUIM.getHoraActual(), articulos, cantidadTotal, montoCompra, null);
                SwingUtilities.getWindowAncestor(this).dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1ValueChanged
    
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 1) {
            articuloSeleccionado = (Articulos_Adquiridos) jList1.getSelectedValue();
            btn_quitar.setEnabled(true);
            btn_agregar.setEnabled(false);
        }
    }//GEN-LAST:event_jList1MouseClicked
    
    private void btn_quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitarActionPerformed
        total = total - (articuloSeleccionado.getUnPrecio() * articuloSeleccionado.getCantidad());
        articulos.remove(articuloSeleccionado);
        cargarLista(articulos);
        cbx_articulos.setSelectedIndex(0);
        txt_area.setText(((Articulo) cbx_articulos.getSelectedItem()).getArea_aplicacion().getTipo());
        btn_quitar.setEnabled(false);
        btn_agregar.setEnabled(true);
        txt_total.setText(String.valueOf(total));
        
    }//GEN-LAST:event_btn_quitarActionPerformed
    
    private void txt_nombreEstablecimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreEstablecimientoKeyTyped
    }//GEN-LAST:event_txt_nombreEstablecimientoKeyTyped
    
    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped
    
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    
    private void txt_numeroComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeroComprobanteActionPerformed
    }//GEN-LAST:event_txt_numeroComprobanteActionPerformed
    
    private void check_ComprobanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_ComprobanteItemStateChanged
    }//GEN-LAST:event_check_ComprobanteItemStateChanged
    
    private void txt_numeroComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroComprobanteKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numeroComprobanteKeyTyped
    
    private void check_ComprobanteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_check_ComprobanteStateChanged
        if (check_Comprobante.isSelected()) {
            txt_numeroComprobante.setEnabled(true);
            txt_nombreEstablecimiento.setEnabled(true);
        } else {
            txt_numeroComprobante.setEnabled(false);
            txt_nombreEstablecimiento.setEnabled(false);
        }
    }//GEN-LAST:event_check_ComprobanteStateChanged
    
    private void txt_cantidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_cantidadCaretUpdate
        if (!txt_precio.getText().isEmpty()) {
            Double precioUnitario = Double.parseDouble(txt_precio.getText());
            if (txt_cantidad.getText().isEmpty()) {
                txt_subtotal.setText(String.valueOf(precioUnitario));
            } else {
                Integer cantiadUnitaria = Integer.parseInt(txt_cantidad.getText());
                Double subtotal = precioUnitario * cantiadUnitaria;
                txt_subtotal.setText(String.valueOf(subtotal));
            }
        }
    }//GEN-LAST:event_txt_cantidadCaretUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonCircle btn_abrirArticulos;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_quitar;
    private com.jidesoft.swing.AutoCompletionComboBox cbx_articulos;
    private javax.swing.JCheckBox check_Comprobante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_nombreEstablecimiento;
    private javax.swing.JTextField txt_numeroComprobante;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    public Compra getUnaCompra() {
        return unaCompra;
    }
    
    public void setUnaCompra(Compra unaCompra) {
        this.unaCompra = unaCompra;
    }
    
    private void carcarCombo() {
        for (Articulo unArticulo : unaHosteria.getArticulos()) {
            cbx_articulos.addItem(unArticulo);
        }
    }
    
    private void cargarLista(List<Articulos_Adquiridos> unaLista) {
        DefaultListModel modelo = new DefaultListModel();
        
        for (Articulos_Adquiridos unAdquiridos : unaLista) {
            modelo.addElement(unAdquiridos);
            
        }
        
        jList1.setCellRenderer(new Lista_articulosAdquiridos());
        jList1.removeAll();
        jList1.setModel(modelo);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Articulo) {
            carcarCombo();
        }
    }
}
