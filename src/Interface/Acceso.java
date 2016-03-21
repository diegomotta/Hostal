package Interface;

import Interface.Personas.Cambiar_Clave;
import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import LN.Varios.Maestro;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Acceso extends javax.swing.JPanel {

    public static Hosteria unaHosteria;
    public static String usuario = "Sistema";
    public static Object logueado;
    private int diasRestantes;

    public Acceso(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        Acceso.usuario = "";
        this.diasRestantes = 90;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_CA = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        btn_aceptar1 = new javax.swing.JButton();
        btn_cancelar1 = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Control de Acceso");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Key glass.png"))); // NOI18N
        jLabel10.setText("Contraseña:");

        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX APPLICATIONS AOL INSTANT M.png"))); // NOI18N
        jLabel2.setText("    Usuario:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_correo.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_correo.setMinimumSize(new java.awt.Dimension(25, 25));

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

        javax.swing.GroupLayout pnl_CALayout = new javax.swing.GroupLayout(pnl_CA);
        pnl_CA.setLayout(pnl_CALayout);
        pnl_CALayout.setHorizontalGroup(
            pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(pnl_CALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CALayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_contraseña))
                    .addGroup(pnl_CALayout.createSequentialGroup()
                        .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_CALayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_CALayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btn_aceptar1)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelar1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_CALayout.setVerticalGroup(
            pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CALayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_CALayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar1)
                    .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        add(pnl_CA);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_aceptar1ActionPerformed(null);
        }
    }//GEN-LAST:event_txt_contraseñaKeyPressed

    private void btn_aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar1ActionPerformed


        if (txt_usuario.getText().equals(unaHosteria.getUnUsuarioMaestro().getUssername())) {
            Maestro unMaestro = unaHosteria.getUnUsuarioMaestro();
            if (txt_contraseña.getText().equals(unMaestro.getPassword())) {
                Acceso.setUsuario(unMaestro.getUssername());
                logueado = unMaestro;
                principalAdministrador unPrinc = new principalAdministrador(unaHosteria);
                SwingUtilities.getWindowAncestor(this).dispose();

            } else {
                JOptionPane.showMessageDialog(this, "El nombre de Usuario y/o Contraseña son Incorrectos");
                txt_contraseña.setText("");
                txt_contraseña.grabFocus();
            }
        } else if (unaHosteria.hayUsuarios()) {
            Acceso.setUsuario(txt_usuario.getText());

            String contraseña = txt_contraseña.getText();
            Usuario unUsuario = unaHosteria.esUsuario(Acceso.getUsuario());
            if (unUsuario != null) {
                if (controlar(unUsuario, contraseña)) {
                    logueado = unUsuario;
                    if (diasRestantes <= 7) {
                        if (diasRestantes == 0) {
                            JDialog frame;
                            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                                frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                            } else {
                                frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                            }

                            Cambiar_Clave gestorClaves = new Cambiar_Clave(unaHosteria, unUsuario);
                            frame.getContentPane().removeAll();
                            frame.getContentPane().add(gestorClaves);
                            frame.pack();
                            frame.setLocationRelativeTo(null);
                            frame.show();

                        } else {
                            int res = JOptionPane.showConfirmDialog(this, "Usted debe actualizar su contraseña de Usuario, le restan " + String.valueOf(diasRestantes) + " días para realizar la operacion",
                                    "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION);

                            if (res == JOptionPane.YES_OPTION) {
                                JDialog frame;
                                if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                                    frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                                } else {
                                    frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                                }

                                Cambiar_Clave gestorClaves = new Cambiar_Clave(unaHosteria, unUsuario);
                                frame.getContentPane().removeAll();
                                frame.getContentPane().add(gestorClaves);
                                frame.pack();
                                frame.setLocationRelativeTo(null);
                                frame.show();

                            } else {
                                principalAdministrador unPrinc = new principalAdministrador(unaHosteria);
                                SwingUtilities.getWindowAncestor(this).dispose();
                            }
                        }
                    } else {

                        principalAdministrador unPrinc = new principalAdministrador(unaHosteria);
                        SwingUtilities.getWindowAncestor(this).dispose();
                    }
                } else {
                    int res = JOptionPane.showConfirmDialog(this, "La contraseña que ha ingresado es Incorrecta, ¿Desea corregirla?",
                            "Advertencia", JOptionPane.PLAIN_MESSAGE);
                    txt_contraseña.setText("");
                    txt_contraseña.grabFocus();

                }
            } else {
                int res = JOptionPane.showConfirmDialog(this, "El nombre de Usuario que ha ingresado es Incorrecto, ¿Desea corregirlo?",
                        "Advertencia", JOptionPane.PLAIN_MESSAGE);
                txt_contraseña.setText("");
                txt_usuario.setText("");
                txt_usuario.grabFocus();
            }
        }
    }//GEN-LAST:event_btn_aceptar1ActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Esta accion finalizara la ejecución de la aplicacion ¿Desea cerrarla?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    public boolean controlar(Usuario unUsuario, String contraseña) {
        boolean control = false;
        if (unUsuario.getPasword().toUpperCase().equals(contraseña.toUpperCase())) {
            control = true;
            Acceso.setLogueado(unUsuario);
            Acceso.setUsuario(unUsuario.getUsserame());
            diasRestantes = GUIM.diferenciasDeFechas(new Date(), unUsuario.getDiasHabilitado());
        }
        return control;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar1;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JPanel pnl_CA;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    public static Hosteria getUnaHosteria() {
        return unaHosteria;
    }

    public void setUnaHosteria(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Acceso.usuario = usuario;
    }

    public static Object getLogueado() {
        return logueado;
    }

    public static void setLogueado(Object logueado) {
        Acceso.logueado = logueado;
    }
}
