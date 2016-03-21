package Interface;

import Interface.CajaPrincipal.Vista_Caja;
import Interface.Hoteleria.Vista_Diario;
import Interface.Hoteleria.Vista_Huespedes;
import Interface.Hoteleria.Vista_Pileta;
import Interface.Hoteleria.Vista_Reservas;
import Interface.Hoteleria.Vista_alquileresSalon;
import Interface.Hoteleria.Vista_reservasSalon;
import Interface.Personas.ABM_Usuario;
import Interface.Personas.Vista_Visitante;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Caja.Caja;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import LN.Varios.Maestro;
import java.awt.Window;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class principalAdministrador extends javax.swing.JFrame {

    public principalAdministrador(Hosteria unaHosteria) {

        this.unaHosteria = unaHosteria;
        initComponents();
        this.setSize(1024, 720);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//            this.repaint();


        if (Acceso.getLogueado() != null) {
            Object unUsuario = Acceso.getLogueado();
            if (unUsuario instanceof Usuario) {
                Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                if (!permisos.containsKey("ic")) {
                    BTN_Caja.setEnabled(false);
                } else {
                    BTN_Caja.setEnabled(true);
                }

                if (!permisos.containsKey("us")) {
                    Menu_usuarios.setEnabled(false);
                } else {
                    Menu_usuarios.setEnabled(true);
                }
            } else if (Acceso.getLogueado() instanceof Maestro) {
                Menu_usuarios.setEnabled(true);
                BTN_Caja.setEnabled(true);
            }
        }
        controlarHospedajes_Habitaciones(unaHosteria.getAlquileresHabitacion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup_Personas = new javax.swing.JPopupMenu();
        Menu_visitantes = new javax.swing.JMenuItem();
        Menu_usuarios = new javax.swing.JMenuItem();
        Popup_Reservas = new javax.swing.JPopupMenu();
        Menu_Salon = new javax.swing.JMenuItem();
        Menu_Habitaciones = new javax.swing.JMenuItem();
        Popup_Hospedajes = new javax.swing.JPopupMenu();
        Salon = new javax.swing.JMenuItem();
        Habitaciones = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BTN_Diario = new javax.swing.JButton();
        BTN_Huespedes = new javax.swing.JButton();
        BTN_Reservas = new javax.swing.JButton();
        btn_Pileta = new javax.swing.JButton();
        BTN_Caja = new javax.swing.JButton();
        btn_Personas = new javax.swing.JButton();
        Extras = new javax.swing.JButton();
        BTN_Login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnl_Cuerpo = new javax.swing.JPanel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();

        Menu_visitantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Satchel.png"))); // NOI18N
        Menu_visitantes.setText("Visitantes");
        Menu_visitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_visitantesActionPerformed(evt);
            }
        });
        Popup_Personas.add(Menu_visitantes);

        Menu_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OnLineIDCpl_dll_02_13.png"))); // NOI18N
        Menu_usuarios.setText("Usuarios");
        Menu_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_usuariosActionPerformed(evt);
            }
        });
        Popup_Personas.add(Menu_usuarios);

        Menu_Salon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salon.png"))); // NOI18N
        Menu_Salon.setText("Salón");
        Menu_Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SalonActionPerformed(evt);
            }
        });
        Popup_Reservas.add(Menu_Salon);

        Menu_Habitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Habitacion.png"))); // NOI18N
        Menu_Habitaciones.setText("Habitación");
        Menu_Habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_HabitacionesActionPerformed(evt);
            }
        });
        Popup_Reservas.add(Menu_Habitaciones);

        Salon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salon.png"))); // NOI18N
        Salon.setText("Salones");
        Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalonActionPerformed(evt);
            }
        });
        Popup_Hospedajes.add(Salon);

        Habitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Habitacion.png"))); // NOI18N
        Habitaciones.setText("Habitaciones");
        Habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitacionesActionPerformed(evt);
            }
        });
        Popup_Hospedajes.add(Habitaciones);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOMA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(1, 10));

        BTN_Diario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Public Folder 3.png"))); // NOI18N
        BTN_Diario.setText("Diario");
        BTN_Diario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Diario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTN_Diario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DiarioActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Diario);

        BTN_Huespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX SYSTEM GROUP.png"))); // NOI18N
        BTN_Huespedes.setText("Huespedes");
        BTN_Huespedes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Huespedes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTN_Huespedes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Huespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN_HuespedesMousePressed(evt);
            }
        });
        jPanel2.add(BTN_Huespedes);

        BTN_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alpha Dista Icon 78.png"))); // NOI18N
        BTN_Reservas.setText("Reservas");
        BTN_Reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Reservas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTN_Reservas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BTN_ReservasMousePressed(evt);
            }
        });
        jPanel2.add(BTN_Reservas);

        btn_Pileta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/feet.png"))); // NOI18N
        btn_Pileta.setText("Pileta");
        btn_Pileta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Pileta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Pileta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Pileta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PiletaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Pileta);

        BTN_Caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        BTN_Caja.setText("Caja");
        BTN_Caja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Caja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTN_Caja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CajaActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Caja);

        btn_Personas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/personas.png"))); // NOI18N
        btn_Personas.setText("Personas");
        btn_Personas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Personas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Personas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PersonasMousePressed(evt);
            }
        });
        jPanel2.add(btn_Personas);

        Extras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX APPLICATIONS STUFFIT EXPAN.png"))); // NOI18N
        Extras.setText("Extras");
        Extras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Extras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Extras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Extras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtrasActionPerformed(evt);
            }
        });
        jPanel2.add(Extras);

        BTN_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/systemcpl_dll_01_14.png"))); // NOI18N
        BTN_Login.setText("Log");
        BTN_Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_Login.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BTN_Login.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Login);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuraciones.png"))); // NOI18N
        jButton2.setText("Configuración");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        pnl_Cuerpo.setBackground(new java.awt.Color(51, 51, 51));
        pnl_Cuerpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_Cuerpo.setLayout(new javax.swing.BoxLayout(pnl_Cuerpo, javax.swing.BoxLayout.LINE_AXIS));

        panelCurves1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        pnl_Cuerpo.add(panelCurves1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_Cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CajaActionPerformed
//        LinkedList<Lote> unLote = unaHosteria.getCajaPrincipal().getLotes();
        Caja unaCaja = unaHosteria.getCajaPrincipal();
        Vista_Caja cajaPrincipal = new Vista_Caja(unaHosteria, unaCaja);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(cajaPrincipal);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_BTN_CajaActionPerformed

    private void BTN_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LoginActionPerformed
        JFrame acceso = new JFrame();
        Acceso gestor = new Acceso(unaHosteria);
        acceso.getContentPane().removeAll();
        acceso.getContentPane().add(gestor);
        acceso.setType(Window.Type.POPUP);
        acceso.pack();
        acceso.setLocationRelativeTo(null);
        acceso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
        acceso.show(true);
    }//GEN-LAST:event_BTN_LoginActionPerformed

    private void BTN_DiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DiarioActionPerformed
        Vista_Diario hojaDiaria = new Vista_Diario(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(hojaDiaria);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_BTN_DiarioActionPerformed

    private void btn_PiletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PiletaActionPerformed
        Vista_Pileta vista = new Vista_Pileta(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(vista);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_btn_PiletaActionPerformed

    private void ExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtrasActionPerformed
        Extras extra = new Extras(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(extra);
        pnl_Cuerpo.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_ExtrasActionPerformed

    private void Menu_visitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_visitantesActionPerformed
        Vista_Visitante captVisitante = new Vista_Visitante(unaHosteria, null);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(captVisitante);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_Menu_visitantesActionPerformed

    private void Menu_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_usuariosActionPerformed
        ABM_Usuario gestorUsuario = new ABM_Usuario(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(gestorUsuario);
        pnl_Cuerpo.updateUI();

    }//GEN-LAST:event_Menu_usuariosActionPerformed

    private void btn_PersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PersonasMousePressed
        Popup_Personas.show(btn_Personas, evt.getX(), evt.getY());
    }//GEN-LAST:event_btn_PersonasMousePressed

    private void Menu_SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SalonActionPerformed

        Vista_reservasSalon reservas = new Vista_reservasSalon(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(reservas);
        pnl_Cuerpo.updateUI();

    }//GEN-LAST:event_Menu_SalonActionPerformed

    private void SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalonActionPerformed
        Vista_alquileresSalon elSalon_de_Eventos = new Vista_alquileresSalon(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(elSalon_de_Eventos);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_SalonActionPerformed

    private void Menu_HabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_HabitacionesActionPerformed
        Vista_Reservas lasReservas = new Vista_Reservas(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(lasReservas);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_Menu_HabitacionesActionPerformed

    private void HabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitacionesActionPerformed
        Vista_Huespedes Vista_Huespedes = new Vista_Huespedes(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(Vista_Huespedes);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_HabitacionesActionPerformed

    private void BTN_ReservasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ReservasMousePressed
        Popup_Reservas.show(BTN_Reservas, evt.getX(), evt.getY());
    }//GEN-LAST:event_BTN_ReservasMousePressed

    private void BTN_HuespedesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_HuespedesMousePressed
        Popup_Hospedajes.show(BTN_Huespedes, evt.getX(), evt.getY());
    }//GEN-LAST:event_BTN_HuespedesMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Configuraciones config = new Configuraciones(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(config);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_jButton2ActionPerformed
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Caja;
    private javax.swing.JButton BTN_Diario;
    private javax.swing.JButton BTN_Huespedes;
    private javax.swing.JButton BTN_Login;
    private javax.swing.JButton BTN_Reservas;
    private javax.swing.JButton Extras;
    private javax.swing.JMenuItem Habitaciones;
    private javax.swing.JMenuItem Menu_Habitaciones;
    private javax.swing.JMenuItem Menu_Salon;
    private javax.swing.JMenuItem Menu_usuarios;
    private javax.swing.JMenuItem Menu_visitantes;
    private javax.swing.JPopupMenu Popup_Hospedajes;
    private javax.swing.JPopupMenu Popup_Personas;
    private javax.swing.JPopupMenu Popup_Reservas;
    private javax.swing.JMenuItem Salon;
    private javax.swing.JButton btn_Personas;
    private javax.swing.JButton btn_Pileta;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JPanel pnl_Cuerpo;
    // End of variables declaration//GEN-END:variables

    public void controlarHospedajes_Habitaciones(List<Hospedaje_Habitacion> listaHospedajes) {
        Date hoy = new Date();
        for (Hospedaje_Habitacion unHospedaje : listaHospedajes) {
            if (!unHospedaje.isCheck_out()) {
                if (unHospedaje.getEgreso().before(hoy)) {
                    unHospedaje.setEgreso(hoy);
                    Hosteria.persistencia.update(unaHosteria);
                    JOptionPane.showMessageDialog(this, "Se le agrego un día de estadia al hospedaje de " + unHospedaje.getUnVisitante().getApellido() + " " + unHospedaje.getUnVisitante().getNombre() + ", Habitacion número" + unHospedaje.getUnaHabitacion().getNumero());
                }
            }

        }

    }
}
