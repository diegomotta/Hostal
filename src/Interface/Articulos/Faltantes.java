package Interface.Articulos;

import Interface.Acceso;
import Interface.GUIM;
import LN.Articulos.Faltante;
import LN.Varios.Foto;
import LN.Varios.Hosteria;
import java.util.HashMap;
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

public class Faltantes extends javax.swing.JPanel {

    private Hosteria unaHosteria;

    public Faltantes(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        GUIM.cargarTablaFaltantes(tbl_faltantes, unaHosteria.getFaltantes());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelRect3 = new org.edisoncor.gui.panel.PanelRect();
        btn_nuevo_faltante = new javax.swing.JButton();
        btn_Lista_Reservas = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_faltantes = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Registro de Faltantes");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        panelRect3.setBackground(new java.awt.Color(255, 255, 255));
        panelRect3.setForeground(new java.awt.Color(255, 255, 255));
        panelRect3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect3.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_nuevo_faltante.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_nuevo_faltante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_nuevo_faltante.setText("<html><p>Registrar</p><p>Faltante</p></html>");
        btn_nuevo_faltante.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_nuevo_faltante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_faltanteActionPerformed(evt);
            }
        });

        btn_Lista_Reservas.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_Lista_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        btn_Lista_Reservas.setText("   Listar");
        btn_Lista_Reservas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Lista_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lista_ReservasActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMaximumSize(null);
        jButton1.setMinimumSize(null);

        javax.swing.GroupLayout panelRect3Layout = new javax.swing.GroupLayout(panelRect3);
        panelRect3.setLayout(panelRect3Layout);
        panelRect3Layout.setHorizontalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevo_faltante)
                        .addComponent(btn_Lista_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelRect3Layout.setVerticalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_nuevo_faltante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Lista_Reservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_faltantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "Costo Estimado", "Area de Utilización", "Causa o Motivo", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tbl_faltantes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_nuevo_faltanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_faltanteActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Registrar_Faltante reg = new Registrar_Faltante(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(reg);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        GUIM.cargarTablaFaltantes(tbl_faltantes, unaHosteria.getFaltantes());
    }//GEN-LAST:event_btn_nuevo_faltanteActionPerformed

    private void btn_Lista_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lista_ReservasActionPerformed
try {
            Foto logotipo = unaHosteria.getLogo();

            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", logotipo);
            parametros.put("log", Acceso.getUsuario());
            parametros.put("pa", unaHosteria.getMiPais());
            parametros.put("pcia", unaHosteria.getMiProvincia());
            parametros.put("ciud", unaHosteria.getMiCiudad());
            parametros.put("calle", unaHosteria.getMiCalle());
            parametros.put("nomb", unaHosteria.getNombre());
            //            Collections.sort(colador);
            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Lista_de_Faltantes.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(unaHosteria.getFaltantes()));
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.show();

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getCause());
        }
    }//GEN-LAST:event_btn_Lista_ReservasActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        Faltante unFaltante = (Faltante) tbl_faltantes.getValueAt(tbl_faltantes.getSelectedRow(), 0);
        int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el Faltante seleccionado?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {

            try {
                unaHosteria.eliminarFaltante(unFaltante);
                unaHosteria.crearAuditoria("DEL", "Eliminó un faltante de la Lista de Faltantes, (" + unFaltante.getUnArticulo().getNombre() + ")", Acceso.getUsuario(), GUIM.getHoraActual());
                GUIM.cargarTablaFaltantes(tbl_faltantes, unaHosteria.getFaltantes());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Lista_Reservas;
    private javax.swing.JButton btn_nuevo_faltante;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private javax.swing.JTable tbl_faltantes;
    // End of variables declaration//GEN-END:variables
}
