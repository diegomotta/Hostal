package Interface.CajaPrincipal;

import Interface.GUIM;
import LN.Caja.Caja;
import LN.Caja.Lote;
import LN.Caja.Movimiento;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

public class Resumenes extends javax.swing.JPanel {

    private Caja unaCaja;
    private List<Movimiento> losMovimientos = new LinkedList<>();
    private List<Movimiento> filtro2;
    private double totalIn = 0.0;
    private double totalEg = 0.0;

    public Resumenes(Caja unaCaja) {
        this.unaCaja = unaCaja;

        initComponents();
        this.tbl_movCaja.getColumn("Tipo").setMaxWidth(200);
        this.tbl_movCaja.getColumn("Fuente").setMaxWidth(200);
        this.tbl_movCaja.getColumn("Importe").setMaxWidth(200);
        this.tbl_movCaja.getColumn("Fecha").setMaxWidth(200);
        this.tbl_movCaja.getColumn("Hora").setMaxWidth(200);
        this.tbl_movCaja.getColumn("Nro. Comp.").setMaxWidth(200);
        cbx_lote.removeAllItems();
        for (Lote unLote : unaCaja.getLotes()) {
            cbx_lote.addItem(unLote.getId());
        }
        chec_clave.setSelected(false);
        cbx_fechas.setSelectedIndex(1);
        cbx_fechas.setSelectedIndex(0);




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbx_fechas = new javax.swing.JComboBox();
        dp_desde = new org.jdesktop.swingx.JXDatePicker();
        dp_hasta = new org.jdesktop.swingx.JXDatePicker();
        cbx_tipos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chec_clave = new javax.swing.JCheckBox();
        txt_clave = new javax.swing.JTextField();
        cbx_lote = new com.jidesoft.swing.AutoCompletionComboBox();
        chec_NL = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_movCaja = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbl_ingresos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_egresos = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Conceptos");
        jTextField1.setFocusable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbx_fechas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Día", "Mes", "Año", "Período" }));
        cbx_fechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_fechasItemStateChanged(evt);
            }
        });

        cbx_tipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Ingresos", "Egresos" }));
        cbx_tipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tiposItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Fechas:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Desde:");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Hasta:");

        txt_año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_añoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Mes:");

        txt_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mesKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Movimiento:");

        chec_clave.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        chec_clave.setText("Palabras Claves:");
        chec_clave.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chec_claveStateChanged(evt);
            }
        });

        chec_NL.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        chec_NL.setText("Número de Lote:");
        chec_NL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chec_NLItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chec_clave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_clave))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chec_NL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_fechas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_año)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dp_desde, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(dp_hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chec_clave)
                                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cbx_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chec_NL)
                            .addComponent(cbx_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cbx_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setMaximumSize(null);

        tbl_movCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Fuente", "Importe", "Detalle", "Fecha", "Hora", "Nro. Comp."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_movCaja);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eye.png"))); // NOI18N
        jButton1.setText("Visualizar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton2.setText("   Listar");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel8.setText("Total Ingresos:");

        lbl_ingresos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel10.setText("Total Egresos:");

        lbl_egresos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_egresos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lbl_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_egresos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_fechasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_fechasItemStateChanged
        if (cbx_fechas.getSelectedIndex() == 1) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(true);
            dp_hasta.setEnabled(false);
        } else if (cbx_fechas.getSelectedIndex() == 2) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(true);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);
        } else if (cbx_fechas.getSelectedIndex() == 3) {
            txt_año.setEnabled(true);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);

        } else if (cbx_fechas.getSelectedIndex() == 4) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(true);
            dp_hasta.setEnabled(true);
        } else {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_fechasItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Movimiento> filtro = new LinkedList<>();
        filtro2 = new LinkedList<>();

        if (chec_NL.isSelected()) {
            losMovimientos.clear();
            if (cbx_lote.getSelectedIndex() != -1) {

                for (Lote unLote : unaCaja.getLotes()) {
                    if (unLote.getId().equals(cbx_lote.getSelectedItem())) {
                        for (Movimiento unMovimiento : unLote.getMovimientos()) {
                            losMovimientos.add(unMovimiento);
                        }
                        break;
                    }
                }
                filtro2 = losMovimientos;

            }
        } else {
            cbx_lote.removeAllItems();
            losMovimientos.clear();
            for (Lote unLote : unaCaja.getLotes()) {
                cbx_lote.addItem(unLote.getId());
                for (Movimiento unMovimiento : unLote.getMovimientos()) {
                    losMovimientos.add(unMovimiento);
                }
            }

            if (cbx_fechas.getSelectedIndex() == 0) {
                if (chec_clave.isSelected()) {
                    String palabraClave = txt_clave.getText().toUpperCase().trim();
                    for (Movimiento unMovimiento : losMovimientos) {
                        if (unMovimiento.getConcepto().toUpperCase().trim().contains(palabraClave)) {
                            filtro2.add(unMovimiento);
                        }
                    }
                } else {
                    if (cbx_tipos.getSelectedIndex() == 1) {
                        for (Movimiento one : losMovimientos) {
                            if (one.getTipo().equals("Ingreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else if (cbx_tipos.getSelectedIndex() == 2) {
                        for (Movimiento one : losMovimientos) {
                            if (one.getTipo().equals("Egreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else {
                        filtro2 = losMovimientos;

                    }
                }




            } else if (cbx_fechas.getSelectedIndex() == 1) {
                Calendar fechaMov = Calendar.getInstance();
                Calendar fechaDP = Calendar.getInstance();
                fechaDP.setTime(dp_desde.getDate());
                for (Movimiento unMovimiento : losMovimientos) {
                    fechaMov.setTime(unMovimiento.getFecha_dia());
                    if (fechaMov.get(Calendar.DAY_OF_YEAR) == fechaDP.get(Calendar.DAY_OF_YEAR)) {
                        filtro.add(unMovimiento);
                    }
                }

                if (chec_clave.isSelected()) {
                    String palabraClave = txt_clave.getText().toUpperCase().trim();
                    for (Movimiento unMovimiento : filtro) {
                        if (unMovimiento.getConcepto().toUpperCase().trim().contains(palabraClave)) {
                            filtro2.add(unMovimiento);
                        }
                    }
                } else {
                    if (cbx_tipos.getSelectedIndex() == 1) {
                        for (Movimiento one : filtro) {
                            if (one.getTipo().equals("Ingreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else if (cbx_tipos.getSelectedIndex() == 2) {
                        for (Movimiento one : filtro) {
                            if (one.getTipo().equals("Egreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else {
                        filtro2 = filtro;
                    }
                }

            } else if (cbx_fechas.getSelectedIndex() == 2) {
                if (!txt_mes.getText().isEmpty()) {
                    Calendar unCalendar = Calendar.getInstance();
                    for (Movimiento unMovimiento : losMovimientos) {
                        unCalendar.setTime(unMovimiento.getFecha_dia());
                        if (unCalendar.get(Calendar.MONTH) == (Integer.parseInt(txt_mes.getText()) - 1)) {
                            filtro.add(unMovimiento);
                        }
                    }

                    if (chec_clave.isSelected()) {
                        String palabraClave = txt_clave.getText().toUpperCase().trim();
                        for (Movimiento unMovimiento : filtro) {
                            if (unMovimiento.getConcepto().toUpperCase().trim().contains(palabraClave)) {
                                filtro2.add(unMovimiento);
                            }
                        }
                    } else {
                        if (cbx_tipos.getSelectedIndex() == 1) {
                            for (Movimiento one : filtro) {
                                if (one.getTipo().equals("Ingreso")) {
                                    filtro2.add(one);
                                }
                            }
                        } else if (cbx_tipos.getSelectedIndex() == 2) {
                            for (Movimiento one : filtro) {
                                if (one.getTipo().equals("Egreso")) {
                                    filtro2.add(one);
                                }
                            }
                        } else {
                            filtro2 = filtro;
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar el valor numérico del año que desea visualizar");
                }
            } else if (cbx_fechas.getSelectedIndex() == 3) {
                if (!txt_año.getText().isEmpty()) {
                    Calendar fechaMov = Calendar.getInstance();
                    for (Movimiento unMovimiento : losMovimientos) {
                        fechaMov.setTime(unMovimiento.getFecha_dia());
                        if (fechaMov.get(Calendar.YEAR) == (Integer.parseInt(txt_año.getText()))) {
                            filtro.add(unMovimiento);
                        }
                    }
                    if (chec_clave.isSelected()) {
                        String palabraClave = txt_clave.getText().toUpperCase().trim();
                        for (Movimiento unMovimiento : filtro) {
                            if (unMovimiento.getConcepto().toUpperCase().trim().contains(palabraClave)) {
                                filtro2.add(unMovimiento);
                            }
                        }
                    } else {
                        if (cbx_tipos.getSelectedIndex() == 1) {
                            for (Movimiento one : filtro) {
                                if (one.getTipo().equals("Ingreso")) {
                                    filtro2.add(one);
                                }
                            }
                        } else if (cbx_tipos.getSelectedIndex() == 2) {
                            for (Movimiento one : filtro) {
                                if (one.getTipo().equals("Egreso")) {
                                    filtro2.add(one);
                                }
                            }
                        } else {
                            filtro2 = filtro;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar el valor numérico del año que desea visualizar");
                }
            } else if (cbx_fechas.getSelectedIndex() == 4) {
                Calendar fechaMov = Calendar.getInstance();
                Calendar desde = Calendar.getInstance();
                Calendar hasta = Calendar.getInstance();
                desde.setTime(dp_desde.getDate());
                hasta.setTime(dp_hasta.getDate());

                for (Movimiento unMovimiento : losMovimientos) {
                    fechaMov.setTime(unMovimiento.getFecha_dia());
                    if ((fechaMov.equals(desde) || fechaMov.after(desde)) && (fechaMov.equals(hasta) || fechaMov.before(hasta))) {
                        filtro.add(unMovimiento);
                    }
                }
                if (chec_clave.isSelected()) {
                    String palabraClave = txt_clave.getText().toUpperCase().trim();
                    for (Movimiento unMovimiento : filtro) {
                        if (unMovimiento.getConcepto().toUpperCase().trim().contains(palabraClave)) {
                            filtro2.add(unMovimiento);
                        }
                    }
                } else {
                    if (cbx_tipos.getSelectedIndex() == 1) {
                        for (Movimiento one : filtro) {
                            if (one.getTipo().equals("Ingreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else if (cbx_tipos.getSelectedIndex() == 2) {
                        for (Movimiento one : filtro) {
                            if (one.getTipo().equals("Egreso")) {
                                filtro2.add(one);
                            }
                        }
                    } else {
                        filtro2 = filtro;
                    }
                }


            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar el valor numérico del año que desea visualizar");
            }

        }


        totalIn = 0.0;
        totalEg = 0.0;
        for (Movimiento unMovimiento : filtro2) {
            if (unMovimiento.getTipo().equals("Ingreso")) {
                totalIn = totalIn + unMovimiento.getImporte();
            } else {
                totalEg = totalEg + unMovimiento.getImporte();
            }


        }

        lbl_ingresos.setText(String.valueOf(totalIn));
        lbl_egresos.setText(String.valueOf(totalEg));

        GUIM.cargarTablaCaja(tbl_movCaja, filtro2, null, null);
        this.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_tiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tiposItemStateChanged
    }//GEN-LAST:event_cbx_tiposItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("totalIng", totalIn);
            parametros.put("totalEg", totalEg);

            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Movimientos_de_Caja.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(filtro2));
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
            frame.setSize(800, 600);
            frame.show();

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chec_claveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chec_claveStateChanged
        if (chec_clave.isSelected()) {
            txt_clave.setEnabled(true);
            cbx_tipos.setEnabled(false);
        } else {
            txt_clave.setText("");
            txt_clave.setEnabled(false);
            cbx_tipos.setEnabled(true);
        }

    }//GEN-LAST:event_chec_claveStateChanged

    private void chec_NLItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chec_NLItemStateChanged
        if (chec_NL.isSelected()) {
            cbx_fechas.setSelectedIndex(0);
            cbx_fechas.setEnabled(false);
            chec_clave.setSelected(false);
            chec_clave.setEnabled(false);
            txt_clave.setText("");
            cbx_tipos.setEnabled(false);
            
        }else{
        cbx_fechas.setSelectedIndex(0);
            cbx_fechas.setEnabled(true);
            chec_clave.setEnabled(true);
            txt_clave.setText("");
            cbx_tipos.setEnabled(true);}

    }//GEN-LAST:event_chec_NLItemStateChanged

    private void txt_mesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesKeyPressed
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_mesKeyPressed

    private void txt_añoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_añoKeyPressed
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_añoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbx_fechas;
    private com.jidesoft.swing.AutoCompletionComboBox cbx_lote;
    private javax.swing.JComboBox cbx_tipos;
    private javax.swing.JCheckBox chec_NL;
    private javax.swing.JCheckBox chec_clave;
    private org.jdesktop.swingx.JXDatePicker dp_desde;
    private org.jdesktop.swingx.JXDatePicker dp_hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_egresos;
    private javax.swing.JLabel lbl_ingresos;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTable tbl_movCaja;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_mes;
    // End of variables declaration//GEN-END:variables
}
