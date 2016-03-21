/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CajaPrincipal;

import Interface.Acceso;
import Interface.GUIM;
import LN.Caja.Caja;
import LN.Caja.Tarjeta;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Lukas
 */
public class ABM_Tarjetas extends javax.swing.JPanel implements Observer {

    private Caja unaCaja;

    public ABM_Tarjetas(Caja unaCaja) {
        this.unaCaja = unaCaja;
        this.unaCaja.addObserver(this);
        initComponents();
        cargarTarjetas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panel_Ingresar = new javax.swing.JPanel();
        lbl_nombrePaís = new javax.swing.JLabel();
        txt_nombreTarjeta = new javax.swing.JTextField();
        pnl_tablaPaíses = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tarjetas = new javax.swing.JTable();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_modificarT = new javax.swing.JButton();
        btn_eliminarT = new javax.swing.JButton();
        btn_agregarT = new javax.swing.JButton();
        jXTaskPane4 = new org.jdesktop.swingx.JXTaskPane();
        txt_searchPa = new org.jdesktop.swingx.JXSearchField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Tarjetas");

        panel_Ingresar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_nombrePaís.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        lbl_nombrePaís.setText("Nombre:");
        lbl_nombrePaís.setName("lbl_nombrePaís"); // NOI18N

        txt_nombreTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreTarjetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreTarjetaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_IngresarLayout = new javax.swing.GroupLayout(panel_Ingresar);
        panel_Ingresar.setLayout(panel_IngresarLayout);
        panel_IngresarLayout.setHorizontalGroup(
            panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_IngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombrePaís)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombreTarjeta)
                .addContainerGap())
        );
        panel_IngresarLayout.setVerticalGroup(
            panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_IngresarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombrePaís)
                    .addComponent(txt_nombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnl_tablaPaíses.setBorder(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_Tarjetas.setBorder(null);
        tbl_Tarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarjetas existe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Tarjetas);

        javax.swing.GroupLayout pnl_tablaPaísesLayout = new javax.swing.GroupLayout(pnl_tablaPaíses);
        pnl_tablaPaíses.setLayout(pnl_tablaPaísesLayout);
        pnl_tablaPaísesLayout.setHorizontalGroup(
            pnl_tablaPaísesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnl_tablaPaísesLayout.setVerticalGroup(
            pnl_tablaPaísesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 320));

        btn_modificarT.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_modificarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarT.setText("Modificar");
        btn_modificarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarTActionPerformed(evt);
            }
        });

        btn_eliminarT.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_eliminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarT.setText("Eliminar");
        btn_eliminarT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarTMouseClicked(evt);
            }
        });
        btn_eliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarTActionPerformed(evt);
            }
        });

        btn_agregarT.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btn_agregarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_agregarT.setText("Agregar");
        btn_agregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_agregarT)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarT)
                .addGap(18, 18, 18)
                .addComponent(btn_modificarT)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jXTaskPane4.setCollapsed(true);
        jXTaskPane4.setTitle("Buscar una Tarjeta");

        txt_searchPa.setPrompt("Nombre de la Tarjeta");
        txt_searchPa.setToolTipText("Nombre de la Tarjeta");
        txt_searchPa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchPaCaretUpdate(evt);
            }
        });
        jXTaskPane4.getContentPane().add(txt_searchPa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_tablaPaíses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(panel_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_tablaPaíses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreTarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreTarjetaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_agregarTActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nombreTarjetaKeyPressed

    private void txt_nombreTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreTarjetaKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreTarjetaKeyTyped

    private void btn_modificarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarTActionPerformed
        if (tbl_Tarjetas.getSelectedColumnCount() == 1) {
            Tarjeta unaTarjeta = (Tarjeta) tbl_Tarjetas.getValueAt(tbl_Tarjetas.getSelectedRow(), 0);
            String oldName = unaTarjeta.getNombre();
            if (!txt_nombreTarjeta.getText().isEmpty()) {
                try {
                    String nombre = txt_nombreTarjeta.getText();
                    unaCaja.modificarTarjeta(unaTarjeta, nombre);
                    Acceso.getUnaHosteria().crearAuditoria("MOD", "Se modificó la Tarjeta " + oldName + " a: " + nombre, Acceso.getUsuario(), GUIM.getHoraActual());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de Tarjeta para continuar");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una tarjeta de la lista para continuar");
        }
    }//GEN-LAST:event_btn_modificarTActionPerformed

    private void btn_eliminarTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarTMouseClicked

    private void btn_eliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarTActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Tarjeta seleccionada",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        Tarjeta unaTarjeta = (Tarjeta) tbl_Tarjetas.getValueAt(tbl_Tarjetas.getSelectedRow(), 0);

        String nombreTarjeta = unaTarjeta.getNombre();
        if (res == JOptionPane.YES_OPTION) {
            try {
                unaCaja.eliminarTarjeta(unaTarjeta);
//                GUIM.cargarTablaTarjetas(tbl_Tarjetas, unaCaja.getTarjetas());
                Acceso.getUnaHosteria().crearAuditoria("DEL", "Eliminó La Tarjeta: " + nombreTarjeta + " de la lista de Tarjetas", Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btn_eliminarTActionPerformed

    private void btn_agregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarTActionPerformed
        if (!txt_nombreTarjeta.getText().isEmpty()) {
            try {
                String nombre = txt_nombreTarjeta.getText().trim();
                unaCaja.agregarTarjeta(nombre);
                Acceso.getUnaHosteria().crearAuditoria("ADD", "Agregoó La Tarjeta: " + nombre + " a la lista de Tarjetas", Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un nombre de Tarjeta para continuar");
        }

    }//GEN-LAST:event_btn_agregarTActionPerformed

    private void txt_searchPaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchPaCaretUpdate
    }//GEN-LAST:event_txt_searchPaCaretUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarT;
    private javax.swing.JButton btn_eliminarT;
    private javax.swing.JButton btn_modificarT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane4;
    private javax.swing.JLabel lbl_nombrePaís;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel panel_Ingresar;
    private javax.swing.JPanel pnl_tablaPaíses;
    private javax.swing.JTable tbl_Tarjetas;
    private javax.swing.JTextField txt_nombreTarjeta;
    private org.jdesktop.swingx.JXSearchField txt_searchPa;
    // End of variables declaration//GEN-END:variables

    private void cargarTarjetas() {
        if (!unaCaja.getTarjetas().isEmpty()) {
            GUIM.cargarTablaTarjetas(tbl_Tarjetas, unaCaja.getTarjetas());
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Tarjeta) {
            cargarTarjetas();
        }
    }
}
