package Interface.Personas;

import Interface.GUIM;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Rol;
import LN.Varios.Hosteria;
import java.awt.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Gestor_de_Roles extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Rol unRol;

    public Gestor_de_Roles(Hosteria laHosteria) {
        this.unaHosteria = laHosteria;
        this.unRol = null;
        initComponents();
        cargarInterface();

    }

    private void cargarInterface(){
    btn_eliminarRol.setEnabled(false);
        btn_modificarRol.setEnabled(false);
        btn_nuevoRol.setEnabled(true);
        btn_cancelar.setEnabled(false);
        GUIM.cargarTablaRoles(jTable1, unaHosteria.getRoles());
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_permisos = new javax.swing.JPanel();
        us = new javax.swing.JCheckBox();
        iop = new javax.swing.JCheckBox();
        bvis = new javax.swing.JCheckBox();
        ibackaud = new javax.swing.JCheckBox();
        resalq = new javax.swing.JCheckBox();
        iartfalt = new javax.swing.JCheckBox();
        pout = new javax.swing.JCheckBox();
        ioh = new javax.swing.JCheckBox();
        bres = new javax.swing.JCheckBox();
        ic = new javax.swing.JCheckBox();
        eminf = new javax.swing.JCheckBox();
        ios = new javax.swing.JCheckBox();
        regcom = new javax.swing.JCheckBox();
        pim = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreRol = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_nuevoRol = new javax.swing.JButton();
        btn_eliminarRol = new javax.swing.JButton();
        btn_modificarRol = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        pnl_permisos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione los Permisos que tendrá el Rol", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        pnl_permisos.setLayout(new java.awt.GridLayout(7, 2));

        us.setText("Permitir Gestión de Usuarios");
        us.setName("us"); // NOI18N
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        pnl_permisos.add(us);

        iop.setText("Ingresar a Opciones de Pileta");
        iop.setName("iop"); // NOI18N
        pnl_permisos.add(iop);

        bvis.setText("Permitir Borrar Visitantes");
        bvis.setName("bvis"); // NOI18N
        pnl_permisos.add(bvis);

        ibackaud.setText("Ingresar a Backups y Auditoría");
        ibackaud.setName("ibackaud"); // NOI18N
        pnl_permisos.add(ibackaud);

        resalq.setText("Permitir Reservas y Alquileres");
        resalq.setName("resalq"); // NOI18N
        pnl_permisos.add(resalq);

        iartfalt.setText("Ingresar a Artículos y Faltantes");
        iartfalt.setName("iartfalt"); // NOI18N
        iartfalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iartfaltActionPerformed(evt);
            }
        });
        pnl_permisos.add(iartfalt);

        pout.setText("Permitir Check-Outs");
        pout.setName("pout"); // NOI18N
        pnl_permisos.add(pout);

        ioh.setText("Ingresar a Opciones de Habitación");
        ioh.setName("ioh"); // NOI18N
        pnl_permisos.add(ioh);

        bres.setText("Permitir Borrar Reservas");
        bres.setName("bres"); // NOI18N
        pnl_permisos.add(bres);

        ic.setText("Ingresar a Caja");
        ic.setName("ic"); // NOI18N
        pnl_permisos.add(ic);

        eminf.setText("Permitir Emisión de Informes");
        eminf.setName("eminf"); // NOI18N
        pnl_permisos.add(eminf);

        ios.setText("Ingresar a Opciones de Salón");
        ios.setName("ios"); // NOI18N
        pnl_permisos.add(ios);

        regcom.setText("Permitir Registrar Compras");
        regcom.setName("regcom"); // NOI18N
        pnl_permisos.add(regcom);

        pim.setText("Permitir Movimientos de Hospedajes");
        pim.setName("pim"); // NOI18N
        pim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pimActionPerformed(evt);
            }
        });
        pnl_permisos.add(pim);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Roles de Usuario");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del Rol:");

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_nuevoRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_nuevoRol.setText("Guardar");
        btn_nuevoRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoRolActionPerformed(evt);
            }
        });

        btn_eliminarRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarRol.setText("Eliminar");
        btn_eliminarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarRolActionPerformed(evt);
            }
        });

        btn_modificarRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarRol.setText("Modificar");
        btn_modificarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarRolActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX SYSTEM ALERT STOP.png"))); // NOI18N
        btn_cancelar.setText("<html><p>Cancelar</p><p>Edición</p><html>");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(0);
        jButton2.setMaximumSize(null);
        jButton2.setMinimumSize(null);

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_cancelar)
                        .addComponent(btn_eliminarRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificarRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevoRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_nuevoRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificarRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_permisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombreRol, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_nombreRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnl_permisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void iartfaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iartfaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iartfaltActionPerformed

    private void btn_nuevoRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoRolActionPerformed
        String nombre;

        Map<String, Permisos> permisos = new HashMap<>();
        permisos.clear();
        for (Component unComponent : pnl_permisos.getComponents()) {
            if (unComponent instanceof JCheckBox) {
                if (((JCheckBox) unComponent).isSelected()) {
                    Permisos nuevoPermiso = new Permisos(unComponent.getName());
                    permisos.put(nuevoPermiso.getTipo(), nuevoPermiso);
                }
            }
        }
        if (!txt_nombreRol.getText().isEmpty()) {
            nombre = txt_nombreRol.getText();
            if (!permisos.isEmpty()) {
                try {
                    Rol unRol = unaHosteria.agregarRol(nombre, permisos);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe al menos un Permiso para crear el nuevo Rol");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un Nombre al nuevo Rol");
        }
        cargarInterface();
    }//GEN-LAST:event_btn_nuevoRolActionPerformed

    private void btn_eliminarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarRolActionPerformed
        Rol rolseleccionado = (Rol) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        if (rolseleccionado != null) {
            try {
                unaHosteria.eliminarRol(rolseleccionado);
                cargarInterface();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar algun rol antes de continuar");
        }


    }//GEN-LAST:event_btn_eliminarRolActionPerformed

    private void btn_modificarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarRolActionPerformed
        String nombre;

        Map<String, Permisos> permisos;
        permisos = new HashMap<>();
        permisos.clear();
        for (Component unComponent : pnl_permisos.getComponents()) {
            if (unComponent instanceof JCheckBox) {
                if (((JCheckBox) unComponent).isSelected()) {
                    Permisos nuevoPermiso = new Permisos(unComponent.getName());
                    permisos.put(nuevoPermiso.getTipo(), nuevoPermiso);
                }
            }
        }
        if (!txt_nombreRol.getText().isEmpty()) {
            nombre = txt_nombreRol.getText();
            if (!permisos.isEmpty()) {
                try {
                    unaHosteria.modificarRol(unRol, nombre, permisos);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe al menos un Permiso para crear el nuevo Rol");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un Nombre al nuevo Rol");
        }

        cargarInterface();


    }//GEN-LAST:event_btn_modificarRolActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Rol rolSeleccionado;
        if (jTable1.getRowCount() > 0) {
            rolSeleccionado = (Rol) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            if (rolSeleccionado != null && rolSeleccionado instanceof Rol) {
                unRol = rolSeleccionado;
                txt_nombreRol.setText(rolSeleccionado.getNombreRol());

                for (Component unComponent : pnl_permisos.getComponents()) {
                    ((JCheckBox) unComponent).setSelected(false);
                }

                Iterator it = rolSeleccionado.getPermisos().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry e = (Map.Entry) it.next();
                    for (Component unComponent : pnl_permisos.getComponents()) {

                        if (e.getKey().equals(unComponent.getName())) {
                            ((JCheckBox) unComponent).setSelected(true);
                            break;
                        } else {
                        }
                    }
                }
                Iterator i = rolSeleccionado.getPermisos().entrySet().iterator();
                while (i.hasNext()) {
                    Map.Entry e = (Map.Entry) i.next();
                    for (Component unComponent : pnl_permisos.getComponents()) {
                        if (e.getKey().equals(unComponent.getName())) {
                            ((JCheckBox) unComponent).setSelected(true);
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error en la seleccion del Rol");
            }
            btn_nuevoRol.setEnabled(false);
            btn_modificarRol.setEnabled(true);
            btn_eliminarRol.setEnabled(true);
            btn_cancelar.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        for (Component unComponent : pnl_permisos.getComponents()) {
            ((JCheckBox) unComponent).setSelected(false);
        }
        btn_eliminarRol.setEnabled(false);
        btn_modificarRol.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_nuevoRol.setEnabled(true);
        txt_nombreRol.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void pimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bres;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminarRol;
    private javax.swing.JButton btn_modificarRol;
    private javax.swing.JButton btn_nuevoRol;
    private javax.swing.JCheckBox bvis;
    private javax.swing.JCheckBox eminf;
    private javax.swing.JCheckBox iartfalt;
    private javax.swing.JCheckBox ibackaud;
    private javax.swing.JCheckBox ic;
    private javax.swing.JCheckBox ioh;
    private javax.swing.JCheckBox iop;
    private javax.swing.JCheckBox ios;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JCheckBox pim;
    private javax.swing.JPanel pnl_permisos;
    private javax.swing.JCheckBox pout;
    private javax.swing.JCheckBox regcom;
    private javax.swing.JCheckBox resalq;
    private javax.swing.JTextField txt_nombreRol;
    private javax.swing.JCheckBox us;
    // End of variables declaration//GEN-END:variables
}
