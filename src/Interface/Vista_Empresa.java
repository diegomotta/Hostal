package Interface;

import LN.Varios.Foto;
import LN.Varios.Hosteria;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Vista_Empresa extends javax.swing.JPanel {

    private Foto unLogo;
    public Hosteria nuevaHosteria;
    public Hosteria viejaHosteria;

    public Vista_Empresa(Hosteria unaHosteria) {
        this.unLogo = null;
        this.nuevaHosteria = null;
        this.viejaHosteria = unaHosteria;
        initComponents();
        if (viejaHosteria != null) {
            txt_calle.setEnabled(false);
            txt_ciudad.setEnabled(false);
            txt_mail.setEnabled(false);
            txt_nombre.setEnabled(false);
            txt_provincia.setEnabled(false);
            txt_tel1.setEnabled(false);
            txt_tel2.setEnabled(false);
            cargarCampos(viejaHosteria);

        } else {
            txt_calle.setEnabled(true);
            txt_ciudad.setEnabled(true);
            txt_mail.setEnabled(true);
            txt_nombre.setEnabled(true);
            txt_provincia.setEnabled(true);
            txt_tel1.setEnabled(true);
            txt_tel2.setEnabled(true);
            
            txt_calle.setText("Primeros Colonos 1757");
            txt_ciudad.setText("Apóstoles");
            txt_provincia.setText("Misiones");
            txt_nombre.setText("Hosteria Luz y Fuerza");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_calle = new javax.swing.JTextField();
        txt_tel1 = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_tel2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_ciudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_provincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Datos de la Empresa");
        jTextField1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Calle/Direccón:");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("E-Mail:");

        txt_tel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tel1KeyTyped(evt);
            }
        });

        txt_tel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tel2KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Tel 1:");

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Tel 2:");

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Logotipo del Ente");

        lbl_logo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_logoMouseReleased(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Ciudad:");

        txt_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ciudadKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel8.setText("Provincia:");

        txt_provincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_provinciaKeyTyped(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Corel X3.png"))); // NOI18N
        jLabel9.setText("Modificar Datos");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(null);
        jButton1.setMinimumSize(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txt_nombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24))
                    .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_guardar)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_logoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoMouseReleased
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen", "jpg"));
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String URL = fileChooser.getSelectedFile().getAbsolutePath();
            lbl_logo.setSize(99, 99);
            unLogo = new Foto(URL);
            lbl_logo.setIcon(new ImageIcon(unLogo.getImage()));
            this.repaint();


        }
    }//GEN-LAST:event_lbl_logoMouseReleased
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed



        if (!txt_nombre.getText().isEmpty() && !txt_tel1.getText().isEmpty() && !txt_tel2.getText().isEmpty() && !txt_calle.getText().isEmpty() && !txt_mail.getText().isEmpty() && !txt_ciudad.getText().isEmpty() && !txt_provincia.getText().isEmpty()) {
            String nombre = txt_nombre.getText();
            String tel1 = txt_tel1.getText();
            String tel2 = txt_tel2.getText();
            String calle = txt_calle.getText();
            String ciudad = txt_ciudad.getText();
            String provincia = txt_provincia.getText();
            String mail = txt_mail.getText();

            Foto unFoto;
            if (unLogo != null) {
                unFoto = unLogo;
            } else {
                if (viejaHosteria != null) {
                    unFoto = viejaHosteria.getLogo();
                } else {
                    unFoto = null;
                }
            }

            if (viejaHosteria != null) {
                viejaHosteria.editarEmpresa(nombre, tel1, tel2, mail, ciudad, provincia, calle, unFoto);
                cargarCampos(this.getViejaHosteria());
                JOptionPane.showMessageDialog(this, "Operación Exitosa");

            } else {
                nuevaHosteria = new Hosteria(nombre, tel1, tel2, mail, ciudad, provincia, calle, unFoto);
                SwingUtilities.getWindowAncestor(this).dispose();
                 JOptionPane.showMessageDialog(this, "Operación Exitosa");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        txt_calle.setEnabled(true);
        txt_ciudad.setEnabled(true);
        txt_mail.setEnabled(true);
        txt_nombre.setEnabled(true);
        txt_provincia.setEnabled(true);
        txt_tel1.setEnabled(true);
        txt_tel2.setEnabled(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void txt_tel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tel1KeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tel1KeyTyped

    private void txt_tel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tel2KeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tel2KeyTyped

    private void txt_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudadKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ciudadKeyTyped

    private void txt_provinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_provinciaKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_provinciaKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_tel1;
    private javax.swing.JTextField txt_tel2;
    // End of variables declaration//GEN-END:variables

    public Hosteria getNuevaHosteria() {
        return nuevaHosteria;
    }

    public void setNuevaHosteria(Hosteria nuevaHosteria) {
        this.nuevaHosteria = nuevaHosteria;
    }

    public Hosteria getViejaHosteria() {
        return viejaHosteria;
    }

    public void setViejaHosteria(Hosteria viejaHosteria) {
        this.viejaHosteria = viejaHosteria;
    }

    private void cargarCampos(Hosteria unaHosteria) {
        txt_nombre.setText(unaHosteria.getNombre());
        txt_calle.setText(unaHosteria.getMiCalle());
        txt_ciudad.setText(unaHosteria.getMiCiudad());
        txt_provincia.setText(unaHosteria.getMiProvincia());
        txt_tel1.setText(unaHosteria.getTelefono1());
        txt_tel2.setText(unaHosteria.getTelefono2());
        txt_mail.setText(unaHosteria.getEmail());
        lbl_logo.setIcon(new ImageIcon(unaHosteria.getLogo().getImage()));



    }
}
