package Interface.CajaPrincipal;

import Interface.Acceso;
import Interface.GUIM;
import LN.Caja.Caja;
import LN.Caja.Conceptos;
import LN.Caja.Lote;
import Log_Auditoria.Auditoria_Operacional;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Apertura_Caja extends javax.swing.JPanel {

    private Caja unaCaja;

    public Apertura_Caja(Caja unaCaja) {
        this.unaCaja = unaCaja;

        initComponents();
        cargarCampos();
        GUIM.decimalPositivo(txt_saldoActual);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_horaInicio = new javax.swing.JTextField();
        txt_saldoAnterior = new javax.swing.JTextField();
        txt_saldoActual = new javax.swing.JTextField();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_cancelar_apertura = new javax.swing.JButton();
        btn_aceptar_apertura = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setMaximumSize(null);
        jScrollPane1.setMinimumSize(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(200, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(299, 215));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Apertura de Caja");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Fecha y Hora:");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Total cierre anterior:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Total Inicial: ");

        txt_horaInicio.setEditable(false);
        txt_horaInicio.setEnabled(false);
        txt_horaInicio.setFocusable(false);

        txt_saldoAnterior.setEditable(false);
        txt_saldoAnterior.setEnabled(false);
        txt_saldoAnterior.setFocusable(false);

        txt_saldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_saldoActualKeyTyped(evt);
            }
        });

        btn_cancelar_apertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar_apertura.setText("Cancelar");
        btn_cancelar_apertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_aperturaActionPerformed(evt);
            }
        });

        btn_aceptar_apertura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_aceptar_apertura.setText("Aceptar");
        btn_aceptar_apertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_aperturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btn_aceptar_apertura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar_apertura)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar_apertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_horaInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_saldoActual)
                            .addComponent(txt_saldoAnterior))))
                .addContainerGap())
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_saldoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_saldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCampos() {
        txt_horaInicio.setText(GUIM.getFechaActual() + " - " + GUIM.getHoraActual());

        Date hoy = new Date();

        Calendar mañana = Calendar.getInstance();
        mañana.add(Calendar.DAY_OF_MONTH, 1);

        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_MONTH, -2);

        boolean anterior = false;
        Double saldoAnterior = 0.00;

        List<Lote> lotesCaja = unaCaja.getLotes();

        Lote loteAnterior = unaCaja.obtenerLote_Vigente();

        if (loteAnterior != null) {
            saldoAnterior = loteAnterior.getSaldoFinal();
            anterior = true;
        }


        if (!anterior) {
            txt_saldoAnterior.setText("0.00");
        } else {
            if (anterior) {
                txt_saldoAnterior.setText(saldoAnterior.toString());
            }

        }

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_cancelar_aperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_aperturaActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelar_aperturaActionPerformed

    private void btn_aceptar_aperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_aperturaActionPerformed
        try {
            Double saldoInicial = Double.parseDouble(txt_saldoActual.getText());
            Double saldoFinal = 0.00;
            String horaApertura = GUIM.getHoraActual();
            String horaCierre = "";
            Double totalRetirado = 0.00;
            String elConcepto = null;
            //        Date fechaLote = new Date();

            for (Conceptos unConcepto : unaCaja.getConceptos()) {
                if (unConcepto.getDetalle().equals("Inicio de Caja")) {
                    elConcepto = unConcepto.getDetalle();
                }
            }
            Integer comprobante = unaCaja.obtenerNC();

            if (unaCaja.obtenerLote_Vigente() != null) {
                Double finalAnterior = Double.parseDouble(txt_saldoAnterior.getText());

                if (saldoInicial.equals(finalAnterior)) {

                    Calendar hoy = Calendar.getInstance();
                    Calendar fechaLote = Calendar.getInstance();
                    fechaLote.setTime(unaCaja.obtenerLote_Vigente().getFechaLote());
                    if (fechaLote.get(Calendar.DAY_OF_YEAR) != hoy.get(Calendar.DAY_OF_YEAR)) {
                        Lote nuevoLote = unaCaja.abrirLote(saldoInicial, saldoFinal, horaApertura, horaCierre, totalRetirado/*, fechaLote*/);

                        nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), nuevoLote.getHoraApertura(), nuevoLote.getSaldoInicial(), "Ingreso", elConcepto, "Efectivo", comprobante);
                        unaCaja.ADD_Compeobante(comprobante);
                        Acceso.getUnaHosteria().agregarComprobante(comprobante);

                        if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                            SwingUtilities.getWindowAncestor(this).dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede abrir mas de un Lote en el mismo dia");
                    }


                } else {
                    if (saldoInicial > finalAnterior) {

                        Calendar hoy = Calendar.getInstance();
                        Calendar fechaLote = Calendar.getInstance();
                        fechaLote.setTime(unaCaja.obtenerLote_Vigente().getFechaLote());
                        if (fechaLote.get(Calendar.DAY_OF_YEAR) != hoy.get(Calendar.DAY_OF_YEAR)) {
                            Lote nuevoLote = unaCaja.abrirLote(finalAnterior, saldoFinal, horaApertura, horaCierre, totalRetirado/*, fechaLote*/);

                            nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), nuevoLote.getHoraApertura(), nuevoLote.getSaldoInicial(), "Ingreso", elConcepto, "Efectivo", comprobante);
                            unaCaja.ADD_Compeobante(comprobante);
                            nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), GUIM.getHoraActual(), (saldoInicial - finalAnterior), "Ingreso", "Ajuste de Inicio de caja respecto al cierre anterior", "Efectivo", (comprobante + 1));

                            unaCaja.ADD_Compeobante((comprobante + 1));
                            if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                                SwingUtilities.getWindowAncestor(this).dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No se puede abrir mas de un Lote en el mismo dia");
                        }


                    } else {
                        Calendar hoy = Calendar.getInstance();
                        Calendar fechaLote = Calendar.getInstance();
                        fechaLote.setTime(unaCaja.obtenerLote_Vigente().getFechaLote());
                        if (fechaLote.get(Calendar.DAY_OF_YEAR) != hoy.get(Calendar.DAY_OF_YEAR)) {
                            Lote nuevoLote = unaCaja.abrirLote(finalAnterior, saldoFinal, horaApertura, horaCierre, totalRetirado/*, fechaLote*/);

                            nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), nuevoLote.getHoraApertura(), nuevoLote.getSaldoInicial(), "Ingreso", elConcepto, "Efectivo", comprobante);
                            unaCaja.ADD_Compeobante(comprobante);
                            nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), GUIM.getHoraActual(), (finalAnterior - saldoInicial), "Egreso", "Ajuste de Inicio de caja respecto al cierre anterior", "Efectivo", (comprobante + 1));

                            unaCaja.ADD_Compeobante((comprobante + 1));
                            if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                                SwingUtilities.getWindowAncestor(this).dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "No se puede abrir mas de un Lote en el mismo dia");
                        }
                    }
                }

            } else {
                Lote nuevoLote = unaCaja.abrirLote(saldoInicial, saldoFinal, horaApertura, horaCierre, totalRetirado/*, fechaLote*/);
                nuevoLote.altaMovimiento(nuevoLote.getFechaLote(), nuevoLote.getHoraApertura(), nuevoLote.getSaldoInicial(), "Ingreso", elConcepto, "Efectivo", comprobante);
                unaCaja.ADD_Compeobante(comprobante);
                if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                    SwingUtilities.getWindowAncestor(this).dispose();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Apertura_Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_aceptar_aperturaActionPerformed

    private void txt_saldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_saldoActualKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_saldoActualKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar_apertura;
    private javax.swing.JButton btn_cancelar_apertura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTextField txt_horaInicio;
    private javax.swing.JTextField txt_saldoActual;
    private javax.swing.JTextField txt_saldoAnterior;
    // End of variables declaration//GEN-END:variables
}
