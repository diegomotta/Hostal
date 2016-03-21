package Interface.Hoteleria;

import Interface.CajaPrincipal.Cupones_Tarjetas;
import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Hospedaje;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Caja.Cupon;
import LN.Caja.Lote;
import LN.Varios.Hosteria;
import Log_Auditoria.Auditoria_Operacional;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Debito_Credito extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Hospedaje unHospedaje;
    private Vista_Huespedes panel_huesped;

    public Debito_Credito(Hosteria unaHosteria, Hospedaje unHospedaje) {
        this.unaHosteria = unaHosteria;
        this.unHospedaje = unHospedaje;
        initComponents();
//        panel_huesped = new Vista_Huespedes(unaHosteria);
//        this.unHospedaje = (Hospedaje_Habitacion) panel_huesped.getTabla_Huespedes().getValueAt(panel_huesped.getTabla_Huespedes().getSelectedRow(), 1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_tipo_movimiento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txt_monto_movimiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbx_forma = new javax.swing.JComboBox();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Debito/Credito");
        lbl_titulo.setFocusable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Movimiento"));

        jLabel1.setText("Tipo de Movimiento:");

        cbx_tipo_movimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anticipo", "Recargo" }));
        cbx_tipo_movimiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tipo_movimientoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Ingrese el Monto:");

        txt_monto_movimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_monto_movimientoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_movimientoKeyTyped(evt);
            }
        });

        jLabel3.setText("Forma de Anticipo:");

        cbx_forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_tipo_movimiento, 0, 128, Short.MAX_VALUE)
                    .addComponent(txt_monto_movimiento)
                    .addComponent(cbx_forma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_tipo_movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_monto_movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btn_Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancelar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        Lote unLote = unaHosteria.getCajaPrincipal().obtenerLote_Vigente();
        if (es_delDia(unLote)) {
            Double Pendiente = buscarPrecio(unHospedaje);
            double monto = Double.valueOf(txt_monto_movimiento.getText());
            String tipo = String.valueOf(cbx_tipo_movimiento.getSelectedItem());

            if (tipo.equals("Anticipo") && monto > Pendiente) {
                JOptionPane.showMessageDialog(this, "No puede Ingresar un Anticipo mayor al saldo pendiente del hospedaje");
            } else {

                Integer comprobante;
                if (unaHosteria.getCajaPrincipal().getComprobantes().isEmpty()) {
                    comprobante = 1;
                } else {
                    comprobante = unaHosteria.getCajaPrincipal().getComprobantes().size() + 1;
                }

                if (!unaHosteria.existeComprobante(comprobante)) {

                    if (cbx_forma.getSelectedIndex() == 0) {

                        if (unHospedaje instanceof Hospedaje_Habitacion) {
                            unaHosteria.altaMovimiento_Hospedaje(monto, tipo, new Date(), unHospedaje, GUIM.getHoraActual());
                            unaHosteria.crearAuditoria("MOD", "Agrego un " + tipo + " al Hospedaje de " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre() + " (habitación " + ((Hospedaje_Habitacion) unHospedaje).getUnaHabitacion().getNumero() + "), por $" + String.valueOf(monto), Acceso.getUsuario(), GUIM.getHoraActual());
                            if (tipo.equals("Anticipo")) {
                                unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), monto, "Ingreso", "Anticipo de habitación (" + ((Hospedaje_Habitacion) unHospedaje).getUnaHabitacion().getNumero() + ")", "Efectivo", comprobante);
                                unaHosteria.crearAuditoria("ADD", "Agrego un Ingreso a Caja debido a un " + tipo + " de un Hospedaje (habitación " + ((Hospedaje_Habitacion) unHospedaje).getUnaHabitacion().getNumero() + "), por $" + String.valueOf(monto), Acceso.getUsuario(), GUIM.getHoraActual());
                                unaHosteria.agregarComprobante(comprobante);
                            }

                        } else {
                            unaHosteria.altaMovimiento_Hospedaje(monto, tipo, new Date(), unHospedaje, GUIM.getHoraActual());
                            unaHosteria.crearAuditoria("MOD", "Agrego un " + tipo + " al Hospedaje de " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre() + " (Salón " + ((Hospedaje_Salon) unHospedaje).getElSalon().getNumero() + "), por $" + String.valueOf(monto), Acceso.getUsuario(), GUIM.getHoraActual());
                            if (tipo.equals("Anticipo")) {
                                unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), monto, "Ingreso", "Anticipo de Salón (" + ((Hospedaje_Salon) unHospedaje).getElSalon().getNumero() + ")", "Efectivo", comprobante);
                                unaHosteria.crearAuditoria("ADD", "Agrego un Ingreso a Caja debido a un " + tipo + " de un Hospedaje (Salón " + ((Hospedaje_Salon) unHospedaje).getElSalon().getNumero() + "), por $" + String.valueOf(monto), Acceso.getUsuario(), GUIM.getHoraActual());
                                unaHosteria.agregarComprobante(comprobante);
                            }
                        }

                        SwingUtilities.getWindowAncestor(this).dispose();
                    } else {
                        JDialog jf;
                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                        } else {
                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                        }
                        Cupones_Tarjetas cupones = new Cupones_Tarjetas(unaHosteria.getCajaPrincipal(), monto, unHospedaje.getUnVisitante());
                        jf.getContentPane().removeAll();
                        jf.getContentPane().add(cupones);
                        jf.pack();
                        jf.setLocationRelativeTo(null);
                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jf.show();


                        if (cupones.getNuevoCupon() != null) {
                            Cupon unCupon = cupones.getNuevoCupon();

                            if (unHospedaje instanceof Hospedaje_Habitacion) {
                                unaHosteria.altaMovimiento_Hospedaje(monto, tipo, new Date(), unHospedaje, GUIM.getHoraActual());
                                unaHosteria.crearAuditoria("MOD", "Agrego un " + tipo + " al hospedaje de " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre()
                                        + ", Habitación " + ((Hospedaje_Habitacion) unHospedaje).getUnaHabitacion().getNumero(), Acceso.getUsuario(), GUIM.getHoraActual());
                                if (tipo.equals("Anticipo")) {
                                    unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), monto, "Ingreso", "Anticipo de habitación " + ((Hospedaje_Habitacion) unHospedaje).getUnaHabitacion().getNumero()
                                            + ", (Cupón número " + unCupon.getNumeroCupon() + ")", "Tarjeta", comprobante);
                                    unaHosteria.agregarComprobante(comprobante);
                                }
                                SwingUtilities.getWindowAncestor(this).dispose();
                            } else {
                                unaHosteria.crearAuditoria("MOD", "Agrego un " + tipo + " al hospedaje de " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre()
                                        + ", Salón " + ((Hospedaje_Salon) unHospedaje).getElSalon().getNumero(), Acceso.getUsuario(), GUIM.getHoraActual());
                                if (tipo.equals("Anticipo")) {
                                    unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), monto, "Ingreso", "Anticipo del Salón " + ((Hospedaje_Salon) unHospedaje).getElSalon().getNumero()
                                            + ", (Cupón número " + unCupon.getNumeroCupon() + ")", "Tarjeta", comprobante);
                                    unaHosteria.agregarComprobante(comprobante);
                                }
                                SwingUtilities.getWindowAncestor(this).dispose();

                            }


                        } else {
                            JOptionPane.showMessageDialog(this, "Usted no ha registrado el Cupón correctamente, por favor vuelva a intentarlo");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "El número de comprobante asignado ya existe");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe haber un lote habierto para realizar la operación");
        }


        SwingUtilities.getWindowAncestor(
                this).dispose();
    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void cbx_tipo_movimientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tipo_movimientoItemStateChanged
        if (cbx_tipo_movimiento.getSelectedIndex() == 1) {
            cbx_forma.setEnabled(false);

//            JDialog jf;
//            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
//                jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
//            } else {
//                jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
//            }
//            Cupones_Tarjetas cupones = new Cupones_Tarjetas(unaHosteria.getCajaPrincipal(), unHospedaje);
//            jf.getContentPane().removeAll();
//            jf.getContentPane().add(cupones);
//            jf.pack();
//            jf.setLocationRelativeTo(null);
//            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            jf.show();

        } else {
            cbx_forma.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_tipo_movimientoItemStateChanged

    private void txt_monto_movimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_movimientoKeyPressed

    }//GEN-LAST:event_txt_monto_movimientoKeyPressed

    private void txt_monto_movimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_movimientoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }        
    }//GEN-LAST:event_txt_monto_movimientoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox cbx_forma;
    private javax.swing.JComboBox cbx_tipo_movimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lbl_titulo;
    private javax.swing.JTextField txt_monto_movimiento;
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

    private Double buscarPrecio(Hospedaje unHospedaje) {
        Double No_Facturado = 0.00;
        Double Ya_Facturado = 0.00;
        Double total_a_cobrar = 0.00;

        for (Movimiento_Hospedaje unMovimiento_Hospedaje : unHospedaje.getMovimientos()) {

            if (unMovimiento_Hospedaje.getTipo().equals("Anticipo")) {
                Ya_Facturado += unMovimiento_Hospedaje.getMonto();
            } else {
                No_Facturado += unMovimiento_Hospedaje.getMonto();
            }
        }
        total_a_cobrar = (No_Facturado - Ya_Facturado);
        return total_a_cobrar;
    }
}
