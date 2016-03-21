package Interface.Hoteleria;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Vista_Diario extends javax.swing.JPanel implements Observer {

    private Hosteria unaHosteria;
    private JButton ultimoBoton;

    public Vista_Diario(final Hosteria unaHosteria) {

        this.unaHosteria = unaHosteria;
        this.ultimoBoton = null;
        unaHosteria.addObserver(this);
        initComponents();
        cargarHabitaciones();
        verificarEstados();


        if (Acceso.getLogueado() != null) {
            Object unUsuario = Acceso.getLogueado();


            if (unUsuario instanceof Usuario) {
                Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                if (!permisos.containsKey("resalq")) {
                    btn_alquilar_Habitacion.setEnabled(false);
                } else {
                    btn_alquilar_Habitacion.setEnabled(true);
                }

                if (!permisos.containsKey("iop")) {
                    btn_modHabitacion.setEnabled(false);
                } else {
                    btn_modHabitacion.setEnabled(true);
                }


            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_alquilar_Habitacion = new javax.swing.JButton();
        btn_listarCaja = new javax.swing.JButton();
        btn_modHabitacion = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel4 = new javax.swing.JLabel();
        lbl_domicilio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_huesped = new javax.swing.JLabel();
        lbl_tel_huesped = new javax.swing.JLabel();
        lbl_out = new javax.swing.JLabel();
        lbl_in = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_habitaciones = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Diario");
        jTextField1.setFocusable(false);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_alquilar_Habitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_alquilar_Habitacion.setText("      Alquilar");
        btn_alquilar_Habitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_alquilar_Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alquilar_HabitacionActionPerformed(evt);
            }
        });

        btn_listarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar.png"))); // NOI18N
        btn_listarCaja.setText("    Listar");
        btn_listarCaja.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_listarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarCajaActionPerformed(evt);
            }
        });

        btn_modHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/parametros.png"))); // NOI18N
        btn_modHabitacion.setText("<html><p>  Modificar</p><p>  Parámetros</p><html>");
        btn_modHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_modHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modHabitacionActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(20, 20));

        jTextField3.setBackground(new java.awt.Color(0, 255, 255));
        jTextField3.setPreferredSize(new java.awt.Dimension(20, 20));

        jTextField4.setBackground(new java.awt.Color(0, 255, 0));
        jTextField4.setPreferredSize(new java.awt.Dimension(20, 20));

        jTextField5.setBackground(new java.awt.Color(255, 175, 175));
        jTextField5.setPreferredSize(new java.awt.Dimension(20, 20));

        jTextField6.setBackground(new java.awt.Color(0, 0, 255));
        jTextField6.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel7.setText("Ocupada");

        jLabel8.setText("Disponible");

        jLabel9.setText("Sale Hoy");

        jLabel10.setText("Sale Mañana");

        jLabel11.setText("Falta Limpiar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(null);
        jButton1.setMinimumSize(null);

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_modHabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_alquilar_Habitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_listarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRect1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_alquilar_Habitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_listarCaja)
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(19, 19, 19))
        );

        jLabel4.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel4.setText("Domicilio:");

        lbl_domicilio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel1.setText("Huesped:");

        lbl_huesped.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_tel_huesped.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_out.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_in.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel5.setText("IN:");

        jLabel6.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel6.setText("OUT:");

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_tel_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_in, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_out, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_in, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_out, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tel_huesped, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pnl_habitaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_habitaciones.setLayout(new java.awt.GridLayout(8, 4));
        jScrollPane1.setViewportView(pnl_habitaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarCajaActionPerformed
    }//GEN-LAST:event_btn_listarCajaActionPerformed

    private void btn_alquilar_HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alquilar_HabitacionActionPerformed
        if (ultimoBoton != null) {
            JDialog frame;
            if (SwingUtilities.getWindowAncestor(pnl_habitaciones) instanceof JDialog) {
                frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
            } else {
                frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
            }

            Check_IN panel_checkin = new Check_IN(unaHosteria, ultimoBoton);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(panel_checkin);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();
            verificarEstados();
        }
    }//GEN-LAST:event_btn_alquilar_HabitacionActionPerformed

    private void btn_modHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modHabitacionActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Parametros_Habitacion losEstados = new Parametros_Habitacion(unaHosteria, null);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(losEstados);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        cargarHabitaciones();
        verificarEstados();

    }//GEN-LAST:event_btn_modHabitacionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alquilar_Habitacion;
    private javax.swing.JButton btn_listarCaja;
    private javax.swing.JButton btn_modHabitacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbl_domicilio;
    private javax.swing.JLabel lbl_huesped;
    private javax.swing.JLabel lbl_in;
    private javax.swing.JLabel lbl_out;
    private javax.swing.JLabel lbl_tel_huesped;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel pnl_habitaciones;
    // End of variables declaration//GEN-END:variables

    private void cargarHabitaciones() {
        pnl_habitaciones.removeAll();
        List<Habitacion> Habitaciones = unaHosteria.getHabitaciones();
        Collections.sort(Habitaciones);
        for (Habitacion unaHabitacion : Habitaciones) {
            if (!unaHabitacion.isEliminado()) {
                JButton unButton = new JButton("Habitación " + unaHabitacion.getNumero(), new ImageIcon(getClass().getResource("/Imagenes/PCI cards.png")));
                unButton.setName(String.valueOf(unaHabitacion.getNumero()));
                unButton.setVisible(true);
                unButton.setSize(180, 50);
                pnl_habitaciones.add(unButton);
                pnl_habitaciones.validate();
            }
            this.updateUI();

        }
    }

    private void verificarEstados() {

        for (Component losBotones : pnl_habitaciones.getComponents()) {
            losBotones.setBackground(Color.GREEN);
        }
        for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
            if (!unaHabitacion.isHabilitado()) {
                for (Component losBotones : pnl_habitaciones.getComponents()) {
                    if (losBotones.getName().equals(String.valueOf(unaHabitacion.getNumero()))) {
                        losBotones.setBackground(Color.gray);
                        break;
                    }
                }
            } else if (!unaHabitacion.isEstado_limpieza()) {
                for (Component losBotones : pnl_habitaciones.getComponents()) {
                    if (losBotones.getName().equals(String.valueOf(unaHabitacion.getNumero()))) {
                        losBotones.setBackground(Color.pink);
                        break;
                    }

                }
            }


            for (Hospedaje_Habitacion unHospedaje : unaHosteria.getAlquileresHabitacion()) {
                if (!unHospedaje.isCheck_out()) {
                    Calendar sale = Calendar.getInstance();
                    sale.setTime(unHospedaje.getEgreso());

                    Calendar hoy = Calendar.getInstance();
                    hoy.setTime(new Date());

                    Calendar mañana = Calendar.getInstance();
                    mañana.add(Calendar.DAY_OF_MONTH, 1);
                    for (Component losBotones : pnl_habitaciones.getComponents()) {

                        if (!(String.valueOf(unHospedaje.getUnaHabitacion().getNumero()).equals(losBotones.getName()))) {
                        } else {
                            losBotones.setForeground(Color.white);
                            if (sale.get(Calendar.DAY_OF_YEAR) > (mañana.get(Calendar.DAY_OF_YEAR))) {
                                losBotones.setBackground(Color.red);
                            }
                            if (sale.get(Calendar.DAY_OF_YEAR) == (mañana.get(Calendar.DAY_OF_YEAR))) {
                                losBotones.setBackground(Color.BLUE);
                            }
                            if (sale.get(Calendar.DAY_OF_YEAR) == (hoy.get(Calendar.DAY_OF_YEAR))) {
                                losBotones.setBackground(Color.CYAN);
                            }

                        }
                    }
                }
            }

        }


        final JPopupMenu popup = new JPopupMenu();
        final JMenuItem m1 = new JMenuItem(" Alquilar");
        JMenuItem m2 = new JMenuItem("Modificar");
        m1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Add - copia.png")));
        m2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/parametros - copia.png")));



        popup.add(m1);
        popup.add(m2);

        for (Component ellos : pnl_habitaciones.getComponents()) {
            if (ellos instanceof JButton) {
                ((JButton) ellos).setComponentPopupMenu(popup);
                ellos.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        if (e.isPopupTrigger()) {

                            popup.show(e.getComponent(), e.getX(), e.getY());
                        }
                    }

                    @Override
                    public void mouseClicked(MouseEvent me) {
                        String numHab = me.getComponent().getName();
                        Habitacion habSeleccionada = null;
                        for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
                            if (String.valueOf(unaHabitacion.getNumero()).equals(numHab)) {
                                habSeleccionada = unaHabitacion;
                                break;
                            }
                        }


                        for (Hospedaje_Habitacion unHospedaje : unaHosteria.getAlquileresHabitacion()) {
                            if (!unHospedaje.isCheck_out()) {
                                if (String.valueOf(unHospedaje.getUnaHabitacion().getNumero()).equals(me.getComponent().getName())) {
                                    lbl_huesped.setText(unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre());
                                    lbl_domicilio.setText(unHospedaje.getUnVisitante().getDireccion().getLocalidad() + ", " + unHospedaje.getUnVisitante().getDireccion().getProvincia() + ", " + unHospedaje.getUnVisitante().getDireccion().getPais());
                                    lbl_in.setText(new SimpleDateFormat("dd/MM/yyyy").format(unHospedaje.getIngreso()));
                                    lbl_out.setText(new SimpleDateFormat("dd/MM/yyyy").format(unHospedaje.getEgreso()));
                                    lbl_tel_huesped.setText(unHospedaje.getUnVisitante().getTelefono());
                                    btn_alquilar_Habitacion.setEnabled(false);
                                    m1.setEnabled(false);
                                    break;
                                } else {
                                    if (habSeleccionada.isEstado_limpieza() && habSeleccionada.isHabilitado() && habSeleccionada.getEstado_ocupacion().equals("Disponible")) {
                                        m1.setEnabled(true);
                                    } else {
                                        m1.setEnabled(false);
                                    }

                                    lbl_huesped.setText("");
                                    lbl_domicilio.setText("");
                                    lbl_in.setText("");
                                    lbl_out.setText("");
                                    lbl_tel_huesped.setText("");
                                    btn_alquilar_Habitacion.setEnabled(true);

                                }
                            }
                        }



                    }
                });

                ellos.addFocusListener(new FocusListener() {
                    @Override
                    public void focusGained(FocusEvent e) {
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        ultimoBoton = ((JButton) e.getComponent());
                    }
                });

            }
        }

        m1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                String numHab = e.getComponent().getName();
                Habitacion habSeleccionada = null;
                for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
                    if (String.valueOf(unaHabitacion.getNumero()).equals(numHab)) {
                        habSeleccionada = unaHabitacion;
                        break;
                    }
                }

                JButton elBoton = (JButton) ((JPopupMenu) ((JMenuItem) e.getSource()).getParent()).getInvoker();
                Integer habitacionBuscada = Integer.parseInt(elBoton.getName());
                if (Acceso.getLogueado() != null) {
                    Object unUsuario = Acceso.getLogueado();
                    if (unUsuario instanceof Usuario) {
                        Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                        if (!permisos.containsKey("resalq")) {

                            m1.setEnabled(false);
                        } else {
                            if (habSeleccionada.isEstado_limpieza() && habSeleccionada.isHabilitado() && habSeleccionada.getEstado_ocupacion().equals("Disponible")) {
                                m1.setEnabled(true);
                            } else {
                                m1.setEnabled(false);
                            }

                        }
                    }
                }

                if (GUIM.retornarHabitacion(habitacionBuscada, unaHosteria) != null) {
                    Habitacion unaHabitacion = GUIM.retornarHabitacion(habitacionBuscada, unaHosteria);
                    if (unaHabitacion.isEstado_limpieza() && unaHabitacion.isHabilitado() && unaHabitacion.getEstado_ocupacion().equals("Disponible")) {
                        m1.setEnabled(true);
                    } else {
                        m1.setEnabled(false);
                    }

//                    if (unaHabitacion.isHabilitado()) {
//                        m1.setEnabled(true);
//                    } else {
//                        m1.setEnabled(false);
//                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JButton elBoton = (JButton) ((JPopupMenu) ((JMenuItem) ae.getSource()).getParent()).getInvoker();

                Integer habitacionBuscada = Integer.parseInt(elBoton.getName());
                if (GUIM.retornarHabitacion(habitacionBuscada, unaHosteria) != null) {
                    Habitacion unaHabitacion = GUIM.retornarHabitacion(habitacionBuscada, unaHosteria);
                    if (unaHabitacion.isHabilitado()) {

                        JDialog frame;
                        if (SwingUtilities.getWindowAncestor(pnl_habitaciones) instanceof JDialog) {
                            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
                        } else {
                            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
                        }
                        Check_IN panel_checkin = new Check_IN(unaHosteria, elBoton);
                        frame.getContentPane().removeAll();
                        frame.getContentPane().add(panel_checkin);
                        frame.pack();
                        frame.setLocationRelativeTo(null);
                        frame.show();
                        verificarEstados();
                    } else {
                    }
                }



            }
        });
        ;


        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton elBoton = (JButton) ((JPopupMenu) ((JMenuItem) e.getSource()).getParent()).getInvoker();
                //ak programo o abro la ventana que quiero y ELBOTON es el que se pasa por parametro

                JDialog frame;
                if (SwingUtilities.getWindowAncestor(pnl_habitaciones) instanceof JDialog) {
                    frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
                } else {
                    frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(pnl_habitaciones), true);
                }
                Habitacion numeroHab = null;

                for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
                    if (elBoton.getName().equals(String.valueOf(unaHabitacion.getNumero()))) {
                        numeroHab = unaHabitacion;
                    }
                }

                Parametros_Habitacion panel_estados = new Parametros_Habitacion(unaHosteria, numeroHab);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(panel_estados);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.show();
//                cargarHabitaciones();
//                verificarEstados();
            }
        });

        m2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                e.consume();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                e.consume();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                e.consume();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (Acceso.getLogueado() != null) {
                    Object unUsuario = Acceso.getLogueado();
                    if (unUsuario instanceof Usuario) {
                        Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                        if (!permisos.containsKey("iop")) {
                            m1.setEnabled(false);
                        } else {
                            m1.setEnabled(true);
                        }
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Hospedaje_Habitacion) {
            verificarEstados();
        } else if (arg instanceof Habitacion) {
            cargarHabitaciones();
            verificarEstados();
        }

    }
}
