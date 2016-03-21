package Interface;

import Interface.Articulos.ABM_Artículos;
import Interface.Articulos.Faltantes;
import Interface.Domicilios.SubMenu_Domicilios;
import LN.Persona.Usuario.Usuario;
import LN.Varios.Hosteria;
import LN.Varios.Maestro;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lukas
 */
public class Extras extends javax.swing.JPanel {

    private Hosteria unaHosteria;

    public Extras(Hosteria unHosteria) {
        this.unaHosteria = unHosteria;
        initComponents();

        menu_BD.setIcon(new ImageIcon(getClass().getResource("/Imagenes/bd.png")));
        menu_Operaciones.setIcon(new ImageIcon(getClass().getResource("/Imagenes/op.png")));
//        if (Acceso.getLogueado() != null) {
//            if (Acceso.getLogueado() instanceof Operador) {
//                btn_auditoria.setEnabled(false);
//                btn_backup.setEnabled(false);
//                btn_opcionesHabitacion.setEnabled(false);
//                btn_opcionesPileta.setEnabled(false);
//                menu_BD.setEnabled(false);
//                menu_Operaciones.setEnabled(false);
//
//            } else if (Acceso.getLogueado() instanceof Administrador) {
//                btn_auditoria.setEnabled(true);
//                btn_backup.setEnabled(true);
//                btn_opcionesHabitacion.setEnabled(true);
//                btn_opcionesPileta.setEnabled(true);
//                menu_BD.setEnabled(true);
//                menu_Operaciones.setEnabled(true);
//            }
//        }

        if (Acceso.getLogueado() != null) {
            if (Acceso.getLogueado() instanceof Maestro) {
                btn_auditoria.setEnabled(true);
                btn_backup.setEnabled(true);
                menu_BD.setEnabled(true);
                menu_Operaciones.setEnabled(true);

            } else if (Acceso.getLogueado() instanceof Usuario) {
                Usuario unUsuario = (Usuario) Acceso.getLogueado();

                if (!unUsuario.getRol().getPermisos().containsKey("ibackaud")) {
                    btn_backup.setEnabled(false);
                    btn_auditoria.setEnabled(false);
                    menu_BD.setEnabled(false);
                    menu_Operaciones.setEnabled(false);
                } else {
                    btn_backup.setEnabled(true);
                    btn_auditoria.setEnabled(true);
                    menu_BD.setEnabled(true);
                    menu_Operaciones.setEnabled(true);
                }

                if (!unUsuario.getRol().getPermisos().containsKey("iartfalt")) {
                    btn_registrarFaltante.setEnabled(false);
                } else {
                    btn_registrarFaltante.setEnabled(false);
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup_Auditoria = new javax.swing.JPopupMenu();
        menu_BD = new javax.swing.JMenuItem();
        menu_Operaciones = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_registrarFaltante = new javax.swing.JButton();
        btn_Direccion = new javax.swing.JButton();
        btn_backup = new javax.swing.JButton();
        btn_auditoria = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnl_Cuerpo = new javax.swing.JPanel();

        menu_BD.setText("Base de Datos");
        menu_BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_BDActionPerformed(evt);
            }
        });
        Popup_Auditoria.add(menu_BD);

        menu_Operaciones.setText("Operaciones");
        menu_Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_OperacionesActionPerformed(evt);
            }
        });
        Popup_Auditoria.add(menu_Operaciones);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Herramientas"));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX APPLICATIONS STUFFIT EXPAN.png"))); // NOI18N
        jButton3.setText("Artículos");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        btn_registrarFaltante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Faltante.png"))); // NOI18N
        btn_registrarFaltante.setText("Faltantes");
        btn_registrarFaltante.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_registrarFaltante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarFaltanteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrarFaltante);

        btn_Direccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img-1.png"))); // NOI18N
        btn_Direccion.setText("Direcciones");
        btn_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DireccionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Direccion);

        btn_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wsecedit_dll_05_13.png"))); // NOI18N
        btn_backup.setText("Backup");
        btn_backup.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_backup);

        btn_auditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fontext_dll_02_10.png"))); // NOI18N
        btn_auditoria.setText("Auditoria");
        btn_auditoria.setComponentPopupMenu(Popup_Auditoria);
        btn_auditoria.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_auditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_auditoriaMousePressed(evt);
            }
        });
        btn_auditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_auditoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_auditoria);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hwrreg_exe_01_19.png"))); // NOI18N
        jButton1.setText("Ayuda");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        pnl_Cuerpo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Cuerpo.setLayout(new javax.swing.BoxLayout(pnl_Cuerpo, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addComponent(pnl_Cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ABM_Artículos gestorArticulos = new ABM_Artículos(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(gestorArticulos);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backupActionPerformed
        Backup nuevoBackup = new Backup();
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(nuevoBackup);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_btn_backupActionPerformed

    private void btn_registrarFaltanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarFaltanteActionPerformed
        Faltantes gestorFaltantes = new Faltantes(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(gestorFaltantes);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_btn_registrarFaltanteActionPerformed

    private void btn_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DireccionActionPerformed
        SubMenu_Domicilios gestorArticulos = new SubMenu_Domicilios(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(gestorArticulos);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_btn_DireccionActionPerformed

    private void btn_auditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_auditoriaActionPerformed
    }//GEN-LAST:event_btn_auditoriaActionPerformed

    private void menu_BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_BDActionPerformed
        Auditoria log = new Auditoria(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(log);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_menu_BDActionPerformed

    private void menu_OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_OperacionesActionPerformed
        Vista_Operaciones log = new Vista_Operaciones(unaHosteria);
        pnl_Cuerpo.removeAll();
        pnl_Cuerpo.add(log);
        pnl_Cuerpo.updateUI();
    }//GEN-LAST:event_menu_OperacionesActionPerformed

    private void btn_auditoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_auditoriaMousePressed
        Popup_Auditoria.show(btn_auditoria, evt.getX(), evt.getY());
    }//GEN-LAST:event_btn_auditoriaMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        String url = "file:///D:/Source/HTML/index.HTML";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this.getParent().getParent(), ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Popup_Auditoria;
    private javax.swing.JButton btn_Direccion;
    private javax.swing.JButton btn_auditoria;
    private javax.swing.JButton btn_backup;
    private javax.swing.JButton btn_registrarFaltante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_BD;
    private javax.swing.JMenuItem menu_Operaciones;
    private javax.swing.JPanel pnl_Cuerpo;
    // End of variables declaration//GEN-END:variables
}