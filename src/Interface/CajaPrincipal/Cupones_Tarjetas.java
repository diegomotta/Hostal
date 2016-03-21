package Interface.CajaPrincipal;

import Interface.GUIM;
import LN.Alquileres.Hospedaje;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Caja.Caja;
import LN.Caja.Cupon;
import LN.Caja.Tarjeta;
import LN.Persona.Visitante.Visitante;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Cupones_Tarjetas extends javax.swing.JPanel implements Observer {
    
    private Caja unCaja;
    public Cupon nuevoCupon;
    
    public Cupones_Tarjetas(Caja unCaja, Hospedaje unHospedaje) {
        this.unCaja = unCaja;
        this.nuevoCupon = null;
        initComponents();
        this.unCaja.addObserver(this);
//        cbx_tarjeta.removeAllItems();
        
        
        for (Tarjeta unaTarjeta : unCaja.getTarjetas()) {
            cbx_tarjeta.addItem(unaTarjeta);
        }
        
        txt_titular.setText(unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre());
        if (unHospedaje instanceof Hospedaje_Habitacion) {
            txt_importe.setText(String.valueOf(buscarPrecio((Hospedaje_Habitacion) unHospedaje)));
        } else if (unHospedaje instanceof Hospedaje_Salon) {
            Hospedaje_Salon elH = (Hospedaje_Salon) unHospedaje;
            Double aPagar = elH.getServicio().getPrecio() * elH.getCantidad_dias();
            txt_importe.setText(String.valueOf(aPagar));
        }
        
    }
    
    public Cupones_Tarjetas(Caja unCaja, Double monto, Visitante unVisitante) {
        this.unCaja = unCaja;
        this.nuevoCupon = null;
        initComponents();
                this.unCaja.addObserver(this);
                
        for (Tarjeta unaTarjeta : unCaja.getTarjetas()) {
            cbx_tarjeta.addItem(unaTarjeta);
        }
        txt_titular.setText(unVisitante.getApellido() + " " + unVisitante.getNombre());
        txt_importe.setText(String.valueOf(monto));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_tarjeta = new javax.swing.JComboBox();
        txt_numTarj = new javax.swing.JTextField();
        txt_numCup = new javax.swing.JTextField();
        txt_titular = new javax.swing.JTextField();
        txt_importe = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese los datos del cupon cobrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Tarjeta:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Número de Tarjeta:");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Número de Cupón:");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Titular de la Tarjeta:");

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Importe a cobrarse:");

        txt_numTarj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numTarjKeyTyped(evt);
            }
        });

        txt_numCup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numCupKeyTyped(evt);
            }
        });

        txt_titular.setEditable(false);
        txt_titular.setFocusable(false);

        txt_importe.setEditable(false);
        txt_importe.setFocusable(false);
        txt_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_importeKeyTyped(evt);
            }
        });

        btn_aceptar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_importe)
                            .addComponent(txt_numCup)
                            .addComponent(txt_titular)
                            .addComponent(txt_numTarj)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbx_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbx_tarjeta))
                    .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numTarj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_numCup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        
        if (!txt_numTarj.getText().isEmpty() && !txt_numCup.getText().isEmpty() && !txt_importe.getText().isEmpty()) {
            Tarjeta tarjeta = (Tarjeta) cbx_tarjeta.getSelectedItem();
            String cupon = txt_numCup.getText();
            String numTarjeta = txt_numTarj.getText();
            String titular = txt_titular.getText();
            double importe = Double.parseDouble(txt_importe.getText());
            try {
                nuevoCupon = unCaja.registrarCupon(tarjeta, numTarjeta, cupon, titular, importe);
                SwingUtilities.getWindowAncestor(this).dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No deben existir campos vacios para registrar el Cupón");
        }
        
    }//GEN-LAST:event_btn_aceptarActionPerformed
    
    private void txt_numTarjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numTarjKeyTyped
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numTarjKeyTyped
    
    private void txt_numCupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numCupKeyTyped
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numCupKeyTyped
    
    private void txt_importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_importeKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_importeKeyTyped
    
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    
    private void buttonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle1ActionPerformed
        
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        
        ABM_Tarjetas gestorTarjetas = new ABM_Tarjetas(unCaja);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gestorTarjetas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        
    }//GEN-LAST:event_buttonCircle1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private javax.swing.JComboBox cbx_tarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_importe;
    private javax.swing.JTextField txt_numCup;
    private javax.swing.JTextField txt_numTarj;
    private javax.swing.JTextField txt_titular;
    // End of variables declaration//GEN-END:variables

    public Cupon getNuevoCupon() {
        return nuevoCupon;
    }
    
    public void setNuevoCupon(Cupon nuevoCupon) {
        this.nuevoCupon = nuevoCupon;
    }
    
    private Double buscarPrecio(Hospedaje_Habitacion unHospedaje_Habitacion) {
        Double No_Facturado = 0.00;
        Double Ya_Facturado = 0.00;
        Double total_a_cobrar;
        
        for (Movimiento_Hospedaje unMovimiento_Hospedaje : unHospedaje_Habitacion.getMovimientos()) {
            if (unMovimiento_Hospedaje.getTipo().equals("Anticipo")) {
                Ya_Facturado += unMovimiento_Hospedaje.getMonto();
            } else {
                No_Facturado += unMovimiento_Hospedaje.getMonto();
            }
        }
        total_a_cobrar = (No_Facturado - Ya_Facturado); //+ unHospedaje_Habitacion.getMovimientos().get(0).getMonto();

        return total_a_cobrar;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Tarjeta) {
            cbx_tarjeta.removeAllItems();
            for (Tarjeta unaTarjeta : unCaja.getTarjetas()) {
                cbx_tarjeta.addItem(unaTarjeta);
            }
        }
    }
}
