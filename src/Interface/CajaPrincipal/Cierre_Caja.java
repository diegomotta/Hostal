package Interface.CajaPrincipal;

import Interface.Acceso;
import Interface.GUIM;
import LN.Caja.Caja;
import LN.Caja.Lote;
import LN.Caja.Movimiento;
import LN.Varios.Foto;
import LN.Varios.Hosteria;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
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

public class Cierre_Caja extends javax.swing.JPanel {

    private Caja unaCaja;
    public final Lote unLote;
    private Double totalEntradas = 0.00;
    private Double totalSalidas = 0.00;
    private Double totalTarjetas = 0.00;

    public Cierre_Caja(Caja unaCaja, Lote loteActual) {
        this.unaCaja = unaCaja;
        this.unLote = loteActual;
        initComponents();
        cargarCampos(unLote);
        GUIM.decimalPositivo(txt_totalRetirado);
        GUIM.decimalPositivo(txt_saldoFinal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_cancelar_cierre = new javax.swing.JButton();
        btn_aceptar_cierre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_totalIngresos = new javax.swing.JTextField();
        txt_totalRetirado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_apertura = new javax.swing.JTextField();
        txt_saldoInicial = new javax.swing.JTextField();
        txt_diferencia = new javax.swing.JTextField();
        txt_saldoFinal = new javax.swing.JTextField();
        txt_cierre = new javax.swing.JTextField();
        txt_totalEgresos = new javax.swing.JTextField();
        txt_finalTeorico = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Cierre de Caja");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_cancelar_cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar_cierre.setText("Cancelar");
        btn_cancelar_cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cierreActionPerformed(evt);
            }
        });

        btn_aceptar_cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_aceptar_cierre.setText("Aceptar");
        btn_aceptar_cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_cierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar_cierre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar_cierre)
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_aceptar_cierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar_cierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Apertura:");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Cierre:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Saldo Inicial:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("Saldo Final:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("Diferencia:");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel6.setText("Total Retirado:");

        txt_totalIngresos.setEditable(false);
        txt_totalIngresos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_totalIngresos.setEnabled(false);

        txt_totalRetirado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_totalRetiradoCaretUpdate(evt);
            }
        });
        txt_totalRetirado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_totalRetiradoFocusLost(evt);
            }
        });
        txt_totalRetirado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_totalRetiradoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setText("Total Ingresos:");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel9.setText("Final Teórico:");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel10.setText("Total Egresos:");

        txt_apertura.setEditable(false);
        txt_apertura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_apertura.setEnabled(false);

        txt_saldoInicial.setEditable(false);
        txt_saldoInicial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_saldoInicial.setEnabled(false);

        txt_diferencia.setEditable(false);
        txt_diferencia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_diferencia.setEnabled(false);

        txt_saldoFinal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_saldoFinalCaretUpdate(evt);
            }
        });
        txt_saldoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_saldoFinalKeyTyped(evt);
            }
        });

        txt_cierre.setEditable(false);
        txt_cierre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_cierre.setEnabled(false);

        txt_totalEgresos.setEditable(false);
        txt_totalEgresos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_totalEgresos.setEnabled(false);

        txt_finalTeorico.setEditable(false);
        txt_finalTeorico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_finalTeorico.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_totalIngresos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_totalRetirado)
                            .addComponent(txt_saldoInicial)
                            .addComponent(txt_saldoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_totalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_finalTeorico)
                            .addComponent(txt_diferencia)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_totalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_totalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_saldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_finalTeorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_saldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_diferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_totalRetirado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCampos(Lote elLote) {
        if (elLote != null) {
            Double entro = 0.00;
            Double salio = 0.00;
            Double tarjetas = 0.00;

            for (Movimiento unMovimiento : elLote.getMovimientos()) {
                if (unMovimiento.getFuente().equals("tarjeta")) {
                    tarjetas += unMovimiento.getImporte();
                } else if (unMovimiento.getFuente().equals("Efectivo")) {
                    if ("Egreso".equals(unMovimiento.getTipo())) {
                        salio += unMovimiento.getImporte();
                    } else {
                        entro += unMovimiento.getImporte();
                    }
                }

            }
            txt_apertura.setText(new SimpleDateFormat("dd/MM/yy").format(elLote.getFechaLote()));
            txt_cierre.setText(GUIM.getFechaActual() + " - " + GUIM.getHoraActual());
            Double teorico = (entro - salio);
            txt_totalIngresos.setText(String.valueOf(entro));
            txt_totalEgresos.setText(String.valueOf(salio));
            txt_finalTeorico.setText(String.valueOf(teorico));
            txt_saldoInicial.setText(String.valueOf(elLote.getSaldoInicial()));
        }
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_cancelar_cierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cierreActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelar_cierreActionPerformed

    private void btn_aceptar_cierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_cierreActionPerformed

        try {
            String elUsuario = Acceso.getUsuario();
            Date diaLote = unLote.getFechaLote();
            Integer numeroLote = unLote.getId();
            Hosteria unaHosteria = Acceso.getUnaHosteria();
            Foto logotipo = unaHosteria.getLogo();

//-----------------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------------//

            try {
                String horaCierre;
                Calendar fechaActual = Calendar.getInstance();
                Calendar diaDelLote = Calendar.getInstance();
                diaDelLote.setTime(unLote.getFechaLote());

                if (fechaActual.get(Calendar.DAY_OF_YEAR) == diaDelLote.get(Calendar.DAY_OF_YEAR)) {
                    horaCierre = txt_cierre.getText();
                } else {
                    horaCierre = "23:59:59";
                }

                Double totalRetirado = Double.parseDouble(txt_totalRetirado.getText());
                Double saldoFinal = Double.parseDouble(txt_saldoFinal.getText());
                Double teorico = Double.parseDouble(txt_finalTeorico.getText());
                Integer comprobante = unaCaja.obtenerNC();

                if (teorico > saldoFinal) {
                    unLote.altaMovimiento(diaLote, GUIM.getHoraActual(), totalRetirado, "Egreso", "Usuario (" + Acceso.getUsuario() + ") retira de caja", "Efectivo", comprobante);
                    unaHosteria.agregarComprobante(comprobante);
                } else if (teorico < saldoFinal) {
                    unLote.altaMovimiento(diaLote, GUIM.getHoraActual(), totalRetirado, "Ingreso", "Usuario (" + Acceso.getUsuario() + ") ingresa a caja", "Efectivo", comprobante);
                    unaHosteria.agregarComprobante(comprobante);
                }
                unaCaja.cerrarLote(saldoFinal, horaCierre, totalRetirado, unLote);
                SwingUtilities.getWindowAncestor(this).dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

//-----------------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------------//

            for (Movimiento unMovimiento : unLote.getMovimientos()) {
                if (unMovimiento.getFuente().equals("tarjeta")) {
                    totalTarjetas += unMovimiento.getImporte();
                } else if (unMovimiento.getFuente().equals("Efectivo")) {
                    if ("Egreso".equals(unMovimiento.getTipo())) {
                        totalSalidas += unMovimiento.getImporte();
                    } else {
                        totalEntradas += unMovimiento.getImporte();
                    }
                }

            }
            Double totalRetirado = Double.parseDouble(txt_totalRetirado.getText());
            Double queda = Double.parseDouble(txt_saldoFinal.getText());

            List<Movimiento> historial = unLote.getMovimientos();
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("totalEntradas", totalEntradas);
            parametros.put("totalSalidas", totalSalidas);
            parametros.put("final", queda);
            parametros.put("retirado", totalRetirado);
            parametros.put("dia", diaLote);
            parametros.put("numero", numeroLote);
            parametros.put("us", elUsuario);
            parametros.put("logo", logotipo);
            parametros.put("tarjetas", totalTarjetas);


            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/CierreCaja.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(historial));
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
            frame.setSize(900, 700);
            frame.show();

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }



    }//GEN-LAST:event_btn_aceptar_cierreActionPerformed

    private void txt_saldoFinalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_saldoFinalCaretUpdate
    }//GEN-LAST:event_txt_saldoFinalCaretUpdate

    private void txt_saldoFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_saldoFinalKeyTyped
    }//GEN-LAST:event_txt_saldoFinalKeyTyped

    private void txt_totalRetiradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalRetiradoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_totalRetiradoKeyTyped

    private void txt_totalRetiradoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_totalRetiradoCaretUpdate
        if (txt_saldoFinal.getText().isEmpty()) {
            txt_diferencia.setText("");
        } else {
            if (txt_totalRetirado.getText().isEmpty()) {
                Double diferencia = (Double.parseDouble(txt_saldoFinal.getText()) - Double.parseDouble(txt_finalTeorico.getText()));
                txt_diferencia.setText(String.valueOf(diferencia));
            } else {
                Double diferencia = (Double.parseDouble(txt_saldoFinal.getText()) + Double.parseDouble(txt_totalRetirado.getText()) - Double.parseDouble(txt_finalTeorico.getText()));
                txt_diferencia.setText(String.valueOf(diferencia));
            }
        }


    }//GEN-LAST:event_txt_totalRetiradoCaretUpdate

    private void txt_totalRetiradoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_totalRetiradoFocusLost
        if (!txt_totalRetirado.getText().isEmpty()) {
            if (Double.parseDouble(txt_diferencia.getText()) != 0.0) {
                JOptionPane.showMessageDialog(this, "La suma entre el total retirado y el saldo final no puede ser distinto al final Teorico");
            }

        }
    }//GEN-LAST:event_txt_totalRetiradoFocusLost
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar_cierre;
    private javax.swing.JButton btn_cancelar_cierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTextField txt_apertura;
    private javax.swing.JTextField txt_cierre;
    private javax.swing.JTextField txt_diferencia;
    private javax.swing.JTextField txt_finalTeorico;
    private javax.swing.JTextField txt_saldoFinal;
    private javax.swing.JTextField txt_saldoInicial;
    private javax.swing.JTextField txt_totalEgresos;
    private javax.swing.JTextField txt_totalIngresos;
    private javax.swing.JTextField txt_totalRetirado;
    // End of variables declaration//GEN-END:variables
}
