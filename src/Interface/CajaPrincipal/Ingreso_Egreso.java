package Interface.CajaPrincipal;

import Interface.Acceso;
import Interface.Articulos.Compras;
import Interface.GUIM;
import LN.Articulos.Compra;
import LN.Caja.Conceptos;
import LN.Caja.Lote;
import LN.Varios.Hosteria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Ingreso_Egreso extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Lote unLote;
    private boolean pruebaLogica = false;
    private Compra unaCompra;
    private Conceptos unConceptos = null;

    public Ingreso_Egreso(Hosteria unaHosteria, Lote unLote) {
        this.unaHosteria = unaHosteria;
        this.unLote = unLote;
        this.unaCompra = null;
        initComponents();
        GUIM.decimalPositivo(txt_monto_cobro);
        GUIM.decimalPositivo(txt_monto_pago);
        txt_fecha_pago.setText(GUIM.getFechaActual());
        txt_fecha_cobro.setText(GUIM.getFechaActual());

        timer.start();



        carcarCombo_Conceptos();

        btn_compras.setEnabled(false);
        btn_compras.setFocusable(false);

        Integer comprobante = this.unaHosteria.getCajaPrincipal().obtenerNC();
        txt_comprobante_Cobrar.setText(String.valueOf(comprobante));
        txt_comprobante_Pagar.setText(String.valueOf(comprobante));

    }

    private void carcarCombo_Conceptos() {
        List<Conceptos> conceptos = unaHosteria.getCajaPrincipal().getConceptos();
        for (Conceptos unConcepto : conceptos) {
            if (unConcepto.getTipo().equals("Entrada")) {
                cbx_conceptoEntrada.addItem(unConcepto);
            } else {
                cbx_conceptoSalida.addItem(unConcepto);
            }

        }
        cbx_conceptoSalida.setSelectedIndex(cbx_conceptoSalida.getItemCount() - 1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestañas = new javax.swing.JTabbedPane();
        pnl_cobrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_hora_cobro = new javax.swing.JTextField();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_monto_cobro = new org.jdesktop.swingx.JXTextField();
        jLabel5 = new javax.swing.JLabel();
        clockFace2 = new org.edisoncor.gui.varios.ClockFace();
        cbx_conceptoEntrada = new com.jidesoft.swing.AutoCompletionComboBox();
        btn_agregarConcepto_Ingreso = new org.edisoncor.gui.button.ButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        txt_comprobante_Cobrar = new javax.swing.JTextField();
        txt_fecha_cobro = new javax.swing.JTextField();
        pnl_pagar = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        txt_monto_pago = new org.jdesktop.swingx.JXTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_hora_pago = new javax.swing.JTextField();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        btn_aceptar1 = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        cbx_conceptoSalida = new com.jidesoft.swing.AutoCompletionComboBox();
        btn_agregarConcepto_Egreso = new org.edisoncor.gui.button.ButtonCircle();
        btn_compras = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_comprobante_Pagar = new javax.swing.JTextField();
        txt_fecha_pago = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        pestañas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pestañas.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Concepto:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ingrese la información correspondiente al nuevo movimiento");
        jTextField1.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("Hora");

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_monto_cobro.setBackground(new java.awt.Color(102, 255, 255));
        txt_monto_cobro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_cobroKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("Importe:");

        javax.swing.GroupLayout clockFace2Layout = new javax.swing.GroupLayout(clockFace2);
        clockFace2.setLayout(clockFace2Layout);
        clockFace2Layout.setHorizontalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        clockFace2Layout.setVerticalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        cbx_conceptoEntrada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_conceptoEntradaItemStateChanged(evt);
            }
        });

        btn_agregarConcepto_Ingreso.setText("buttonCircle1");
        btn_agregarConcepto_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarConcepto_IngresoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nro. de Comprobante");

        txt_comprobante_Cobrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_comprobante_CobrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_cobrarLayout = new javax.swing.GroupLayout(pnl_cobrar);
        pnl_cobrar.setLayout(pnl_cobrarLayout);
        pnl_cobrarLayout.setHorizontalGroup(
            pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cobrarLayout.createSequentialGroup()
                .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_cobrarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_monto_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_comprobante_Cobrar))
                    .addGroup(pnl_cobrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_cobrarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_conceptoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_cobrarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_hora_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarConcepto_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );
        pnl_cobrarLayout.setVerticalGroup(
            pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cobrarLayout.createSequentialGroup()
                .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_cobrarLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txt_hora_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbx_conceptoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_agregarConcepto_Ingreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_cobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_monto_cobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_comprobante_Cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pestañas.addTab("Cobrar", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sign-Down.png")), pnl_cobrar); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Ingrese la información correspondiente al nuevo movimiento");
        jTextField2.setFocusable(false);

        txt_monto_pago.setBackground(new java.awt.Color(255, 102, 102));
        txt_monto_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_pagoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel6.setText("Importe:");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel7.setText("Concepto:");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel9.setText("Hora");

        btn_aceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_aceptar1.setText("Aceptar");
        btn_aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar1ActionPerformed(evt);
            }
        });

        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar1.setText("Cancelar");
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves2Layout = new javax.swing.GroupLayout(panelCurves2);
        panelCurves2.setLayout(panelCurves2Layout);
        panelCurves2Layout.setHorizontalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar1)
                .addContainerGap())
        );
        panelCurves2Layout.setVerticalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_aceptar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout clockFace1Layout = new javax.swing.GroupLayout(clockFace1);
        clockFace1.setLayout(clockFace1Layout);
        clockFace1Layout.setHorizontalGroup(
            clockFace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        clockFace1Layout.setVerticalGroup(
            clockFace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        cbx_conceptoSalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_conceptoSalidaItemStateChanged(evt);
            }
        });
        cbx_conceptoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_conceptoSalidaActionPerformed(evt);
            }
        });

        btn_agregarConcepto_Egreso.setText("buttonCircle1");
        btn_agregarConcepto_Egreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarConcepto_EgresoActionPerformed(evt);
            }
        });

        btn_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btn_compras.setText("Cargar datos de la Compra");
        btn_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprasActionPerformed(evt);
            }
        });

        jLabel10.setText("Nro. de Comprobante");

        javax.swing.GroupLayout pnl_pagarLayout = new javax.swing.GroupLayout(pnl_pagar);
        pnl_pagar.setLayout(pnl_pagarLayout);
        pnl_pagarLayout.setHorizontalGroup(
            pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(pnl_pagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_pagarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_monto_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_comprobante_Pagar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pagarLayout.createSequentialGroup()
                        .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_pagarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_pagarLayout.createSequentialGroup()
                                        .addComponent(btn_compras)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cbx_conceptoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnl_pagarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_hora_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarConcepto_Egreso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
            .addComponent(panelCurves2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_pagarLayout.setVerticalGroup(
            pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pagarLayout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pagarLayout.createSequentialGroup()
                        .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clockFace1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(txt_hora_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cbx_conceptoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_agregarConcepto_Egreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(btn_compras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_pagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_monto_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_comprobante_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pestañas.addTab("Pagar", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sign-up.png")), pnl_pagar); // NOI18N

        add(pestañas);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        String unConcepto = ((Conceptos) cbx_conceptoEntrada.getSelectedItem()).getDetalle();
        Date unDia = new Date();
        double importe = Double.valueOf(txt_monto_cobro.getText());
        String unaHora = txt_hora_cobro.getText();
        String tipo = "Ingreso";
        double entrada = Double.valueOf(txt_monto_cobro.getText());
        double salida = 0.00;


        if (!unLote.isCerrado()) {
            Integer comprobante;
            comprobante = Integer.parseInt(txt_comprobante_Cobrar.getText());

            unLote.altaMovimiento(unDia, unaHora, importe, tipo, unConcepto, "Efectivo", comprobante);
            unaHosteria.crearAuditoria("ADD", "Agregó un movimiento de Ingreso a caja por $" + txt_monto_cobro.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
            unaHosteria.agregarComprobante(comprobante);
            SwingUtilities.getWindowAncestor(this).dispose();
        } else {
            int res = JOptionPane.showConfirmDialog(this, "¿El lote al que quiere asignar el movimiento ya fue cerrado, desea reabrirlo?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                try {
                    unaHosteria.getCajaPrincipal().reabrirLote(unLote);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        }

    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar1ActionPerformed
        boolean ok = false;
        Date unDia = new Date();
        String unaHora = GUIM.getHoraActual();
        Double importe = 0.0;
        String tipo = "Egreso";
        String unConcepto = ((Conceptos) cbx_conceptoSalida.getSelectedItem()).getDetalle();

        if (unConcepto.equals("Compra de Insumos")) {
            if (unaCompra != null) {
                if (unaCompra.getNumeroFactura() == null) {
                    unConcepto = ("Compra de Insumos por " + unaCompra.getMontoCompra() + ", (Sin detalle de Factura)");
                    ok = true;
                } else {
                    unConcepto = ("Compra de Insumos por " + unaCompra.getMontoCompra() + ", Factura número: " + unaCompra.getNumeroFactura());
                    ok = true;
                }
            }
        }

        if (!"".equals(txt_monto_pago.getText())) {
            importe = Double.valueOf(txt_monto_pago.getText());
        }
        Integer comprobante;
        comprobante = Integer.parseInt(txt_comprobante_Pagar.getText());
        if (!unLote.isCerrado()) {
            if (ok) {


                unLote.altaMovimiento(unDia, unaHora, importe, tipo, unConcepto, "Efectivo", comprobante);
                unaHosteria.crearAuditoria("ADD", "Agregó una nueva Compra a la Lista de Gastos en Adquisicion de Articulos por $" + txt_monto_pago.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
                unaHosteria.crearAuditoria("ADD", "Agregó un movimiento de Egreso a caja por $" + txt_monto_pago.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
                unaHosteria.agregarComprobante(comprobante);
                SwingUtilities.getWindowAncestor(this).dispose();
            } else {
                unLote.altaMovimiento(unDia, unaHora, importe, tipo, unConcepto, "Efectivo", comprobante);
                unaHosteria.crearAuditoria("ADD", "Agregó un movimiento de Egreso a caja por $" + txt_monto_pago.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
                unaHosteria.agregarComprobante(comprobante);
                SwingUtilities.getWindowAncestor(this).dispose();
            }


        } else {
            JOptionPane.showMessageDialog(this, "El lote al que quiere asignar el movimiento ya fue cerrado");
        }
    }//GEN-LAST:event_btn_aceptar1ActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_agregarConcepto_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarConcepto_IngresoActionPerformed
        abrir_Carga_de_Conceptos();
    }//GEN-LAST:event_btn_agregarConcepto_IngresoActionPerformed

    private void btn_agregarConcepto_EgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarConcepto_EgresoActionPerformed
        abrir_Carga_de_Conceptos();
    }//GEN-LAST:event_btn_agregarConcepto_EgresoActionPerformed

    private void cbx_conceptoEntradaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_conceptoEntradaItemStateChanged
        if (pruebaLogica && cbx_conceptoEntrada.getSelectedIndex() != -1) {
            unConceptos = (Conceptos) cbx_conceptoEntrada.getSelectedItem();
//            cargarTabla();
        }
    }//GEN-LAST:event_cbx_conceptoEntradaItemStateChanged

    private void cbx_conceptoSalidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_conceptoSalidaItemStateChanged
    }//GEN-LAST:event_cbx_conceptoSalidaItemStateChanged

    private void txt_monto_cobroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_cobroKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_monto_cobroKeyTyped

    private void txt_monto_pagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_pagoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_monto_pagoKeyTyped

    private void cbx_conceptoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_conceptoSalidaActionPerformed
        String unConcepto = (String) cbx_conceptoSalida.getSelectedItem().toString();
        if (unConcepto.equals("Compra de Insumos")) {
            btn_compras.setEnabled(true);
            btn_compras.setFocusable(true);
        } else {
            btn_compras.setEnabled(false);
            btn_compras.setFocusable(false);
        }
    }//GEN-LAST:event_cbx_conceptoSalidaActionPerformed

    private void btn_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprasActionPerformed

        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }

        Compras panelCompras = new Compras(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelCompras);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

        unaCompra = panelCompras.getUnaCompra();
        if (unaCompra != null) {
            txt_monto_pago.setText(String.valueOf(unaCompra.getMontoCompra()));
        }
    }//GEN-LAST:event_btn_comprasActionPerformed

    private void txt_comprobante_CobrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_comprobante_CobrarKeyPressed
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_comprobante_CobrarKeyPressed
    private Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            txt_hora_pago.setText(GUIM.getHoraActual());
            txt_hora_cobro.setText(GUIM.getHoraActual());

        }
    });
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_aceptar1;
    private org.edisoncor.gui.button.ButtonCircle btn_agregarConcepto_Egreso;
    private org.edisoncor.gui.button.ButtonCircle btn_agregarConcepto_Ingreso;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_compras;
    private com.jidesoft.swing.AutoCompletionComboBox cbx_conceptoEntrada;
    private com.jidesoft.swing.AutoCompletionComboBox cbx_conceptoSalida;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private org.edisoncor.gui.varios.ClockFace clockFace2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JPanel pnl_cobrar;
    private javax.swing.JPanel pnl_pagar;
    private javax.swing.JTextField txt_comprobante_Cobrar;
    private javax.swing.JTextField txt_comprobante_Pagar;
    private javax.swing.JTextField txt_fecha_cobro;
    private javax.swing.JTextField txt_fecha_pago;
    private javax.swing.JTextField txt_hora_cobro;
    private javax.swing.JTextField txt_hora_pago;
    private org.jdesktop.swingx.JXTextField txt_monto_cobro;
    private org.jdesktop.swingx.JXTextField txt_monto_pago;
    // End of variables declaration//GEN-END:variables

    private void abrir_Carga_de_Conceptos() {
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }

        ABM_Conceptos_de_Movimientos gestoronceptos = new ABM_Conceptos_de_Movimientos(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gestoronceptos);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

        carcarCombo_Conceptos();
    }
}
