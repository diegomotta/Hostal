package Interface.Hoteleria;

import Interface.CajaPrincipal.Cupones_Tarjetas;
import Interface.Acceso;
import Interface.CajaPrincipal.Apertura_Caja;
import Interface.CajaPrincipal.Cierre_Caja;
import Interface.GUIM;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Caja.Cupon;
import LN.Caja.Lote;
import LN.Varios.Hosteria;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JCheckBox;
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

public class CheckOUT_Salon extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Hospedaje_Salon unHospedaje;
    private double total_a_cobrar;
    private double descuento;
    private double unitario;
     private List<Combo_OUT> cosas;

    public CheckOUT_Salon(Hosteria unaHosteria, Hospedaje_Salon unHospedaje_Salon) {
        this.unHospedaje = unHospedaje_Salon;
        this.unaHosteria = unaHosteria;
        this.descuento = unHospedaje_Salon.getDescuento();
        this.unitario = unHospedaje_Salon.getServicio().getPrecio();
        initComponents();
        this.cosas = new LinkedList<>();

//        JCheckBox unCheckBox = new JCheckBox(unHospedaje_Salon.getServicio().getTipo());
        pnl_movimientos.setLayout(new GridLayout(3, 2));

        for (Movimiento_Hospedaje unMovimiento_Hospedaje : unHospedaje.getMovimientos()) {
            cosas.add(new Combo_OUT(unMovimiento_Hospedaje));
        }

        for (JCheckBox unCheck : cosas) {
            unCheck.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent ie) {
                    buscarPrecio(ie);
//                    if (descuento != 0) {
//                        total_a_cobrar = (unitario - ((descuento * unitario) / 100)) * unHospedaje.getCantidad_dias();
//                        txt_aFacturar.setText(String.valueOf(total_a_cobrar));
//                    } else {
//                        txt_aFacturar.setText(String.valueOf((unHospedaje.getCantidad_dias() * unitario)));
//                    }
                    
                }
            });
            pnl_movimientos.add(unCheck);
        }


//
//        pnl_movimientos.setLayout(new GridLayout(2, 1));
//        for (JCheckBox unCheckBox : cosas) {
//            unCheckBox.addItemListener(new ItemListener() {
//                @Override
//                public void itemStateChanged(ItemEvent ie) {
//                    buscarPrecio(ie);
//                }
//            });
//
//            pnl_movimientos.add(unCheckBox);
//        }

        
        
        
        

        Integer comprobante;
        if (this.unaHosteria.getCajaPrincipal().getComprobantes().isEmpty()) {
            comprobante = 1;
        } else {
            comprobante = this.unaHosteria.getCajaPrincipal().getComprobantes().size() + 1;
        }

        txt_comprpbante.setText(String.valueOf(comprobante));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_aFacturar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_formaPago = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txt_comprpbante = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnl_movimientos = new javax.swing.JPanel();

        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(null);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMaximumSize(null);
        jPanel1.setPreferredSize(null);

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Check OUT - Salón de Eventos");
        lbl_titulo.setFocusable(false);
        lbl_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_tituloActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Total a Facturar:");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Forma de Pago:");

        cbx_formaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta" }));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Comprobante Interno Nro.");

        txt_comprpbante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_comprpbanteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_aFacturar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_comprpbante, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_aFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_comprpbante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Impresión y Confirmación"));

        jButton1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton1.setText("Detalle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alpha Dista Icon 79.png"))); // NOI18N
        jButton2.setText("Hacer Check-OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shutdown.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addComponent(jButton3))
        );

        pnl_movimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos a Facturar"));

        javax.swing.GroupLayout pnl_movimientosLayout = new javax.swing.GroupLayout(pnl_movimientos);
        pnl_movimientos.setLayout(pnl_movimientosLayout);
        pnl_movimientosLayout.setHorizontalGroup(
            pnl_movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_movimientosLayout.setVerticalGroup(
            pnl_movimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(pnl_movimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_titulo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_movimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        Lote unLote = unaHosteria.getCajaPrincipal().obtenerLote_Vigente();
        if (unLote != null) {
            if (!unLote.isCerrado()) {
                if (es_delDia(unLote)) {
                    try {
                        Integer comprobante = Integer.parseInt(txt_comprpbante.getText());
                        Double aCobrar = Double.parseDouble(txt_aFacturar.getText());
                        if (cbx_formaPago.getSelectedIndex() == 1) {
                            JDialog jf;
                            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                                jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                            } else {
                                jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                            }
                            Cupones_Tarjetas cupones = new Cupones_Tarjetas(unaHosteria.getCajaPrincipal(), unHospedaje);
                            jf.getContentPane().removeAll();
                            jf.getContentPane().add(cupones);
                            jf.pack();
                            jf.setLocationRelativeTo(null);
                            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            jf.show();

                            if (cupones.getNuevoCupon() != null) {
                                Cupon unCupon = cupones.getNuevoCupon();
                                unaHosteria.CheckOut_Salon(unHospedaje.getElSalon(), unHospedaje, aCobrar, true, unCupon);
                                unaHosteria.crearAuditoria("ADD", "Agrego un Check-OUT del Salon a nombre de : " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre() + ", tipo " + unHospedaje.getServicio().getTipo(), Acceso.getUsuario(), GUIM.getHoraActual());
                                unaHosteria.agregarComprobante(comprobante);
                                SwingUtilities.getWindowAncestor(this).dispose();
                            } else {
                                JOptionPane.showMessageDialog(this, "Usted no ha registrado el Cupón correctamente, por favor vuelva a intentarlo");
                            }

                        } else if (cbx_formaPago.getSelectedIndex() == 0) {
                            unaHosteria.CheckOut_Salon(unHospedaje.getElSalon(), unHospedaje, aCobrar, false, null);
                            unaHosteria.crearAuditoria("ADD", "Agrego un Check-OUT del Salon a nombre de : " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre() + ", tipo " + unHospedaje.getServicio().getTipo(), Acceso.getUsuario(), GUIM.getHoraActual());
                            SwingUtilities.getWindowAncestor(this).dispose();
                            unaHosteria.agregarComprobante(comprobante);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                } else {
                    int res = JOptionPane.showConfirmDialog(this, "Aún no se ha realizado el cierre de caja de las ultimas actividades, ¿desea cerrarlo?",
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        JDialog jf;
                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                        } else {
                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                        }
                        Cierre_Caja cierre = new Cierre_Caja(unaHosteria.getCajaPrincipal(), unLote);
                        jf.getContentPane().removeAll();
                        jf.getContentPane().add(cierre);
                        jf.pack();
                        jf.setLocationRelativeTo(null);
                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jf.show();
                    }
                }
            } else {
                if (es_delDia(unLote)) {
                    JOptionPane.showMessageDialog(this, "El Lote del dia de hoy ya ha sido cerrado");
                } else {
                    int res = JOptionPane.showConfirmDialog(this, "Aún no existen Lotes inicializados, ¿desea abrir un nuevo Lote?",
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        JDialog jf;
                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                        } else {
                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                        }
                        Apertura_Caja abrir = new Apertura_Caja(unaHosteria.getCajaPrincipal());
                        jf.getContentPane().removeAll();
                        jf.getContentPane().add(abrir);
                        jf.pack();
                        jf.setLocationRelativeTo(null);
                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jf.show();

                    }
                }
            }
        } else {
            int res = JOptionPane.showConfirmDialog(this, "Aún no existen Lotes inicializados, ¿desea abrir su primer Lote?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {


                JDialog jf;
                if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                    jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                } else {
                    jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                }
                Apertura_Caja abrir = new Apertura_Caja(unaHosteria.getCajaPrincipal());
                jf.getContentPane().removeAll();
                jf.getContentPane().add(abrir);
                jf.pack();
                jf.setLocationRelativeTo(null);
                jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jf.show();

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            List<Hospedaje_Salon> hospedajes = new LinkedList<>();
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            hospedajes.add(unHospedaje);

            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Salida(Salon).jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(hospedajes));
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
            frame.setSize(800, 800);
            frame.show();


        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbl_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_tituloActionPerformed

    private void txt_comprpbanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_comprpbanteKeyPressed
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_comprpbanteKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbx_formaPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lbl_titulo;
    private javax.swing.JPanel pnl_movimientos;
    private javax.swing.JTextField txt_aFacturar;
    private javax.swing.JTextField txt_comprpbante;
    // End of variables declaration//GEN-END:variables

    private boolean es_delDia(Lote unLote) {
        boolean ok = false;

        if (unLote != null) {
            Calendar hoy = Calendar.getInstance();
            Calendar fechaLote = Calendar.getInstance();
            fechaLote.setTime(unLote.getFechaLote());
            if (hoy.get(Calendar.DAY_OF_YEAR) == fechaLote.get(Calendar.DAY_OF_YEAR)) {
                ok = true;
            }
        }
        return ok;
    }
    
    
    private void buscarPrecio(ItemEvent ie) {
        Double No_Facturado = 0.00;
        Double Ya_Facturado = 0.00;
        total_a_cobrar = 0.00;

        for (Combo_OUT unCombo_OUT : this.cosas) {
            if (unCombo_OUT.isSelected()) {
                if (((Movimiento_Hospedaje) unCombo_OUT.getMovimientoAsociado()).getTipo().equals("Anticipo")) {
                    Ya_Facturado += ((Movimiento_Hospedaje) unCombo_OUT.getMovimientoAsociado()).getMonto();
                } else {
                    No_Facturado += ((Movimiento_Hospedaje) unCombo_OUT.getMovimientoAsociado()).getMonto();
                }
            }
            txt_aFacturar.setText(String.valueOf(No_Facturado - Ya_Facturado));
            
            
        }
        total_a_cobrar = (No_Facturado - Ya_Facturado);
    }
}
