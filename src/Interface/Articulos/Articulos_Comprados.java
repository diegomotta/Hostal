package Interface.Articulos;

import Interface.Acceso;
import Interface.GUIM;
import LN.Articulos.Area;
import LN.Articulos.Articulo;
import LN.Articulos.Articulos_Adquiridos;
import LN.Articulos.Compra;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
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

public class Articulos_Comprados extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private List<Articulos_Adquiridos> articulosComprados;
    private List<Articulos_Adquiridos> filtro2;
    private double totalEg = 0.0;

    public Articulos_Comprados(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        this.articulosComprados = new LinkedList<>();
        initComponents();


        cargarCombos();
        check_area.setSelected(false);
        check_articulo.setSelected(false);
        for (Compra unaCompra : unaHosteria.getCompras()) {
            for (Articulos_Adquiridos unAdquiridos : unaCompra.getArticulosRelacionados()) {
                articulosComprados.add(unAdquiridos);
            }
        }

        GUIM.cargarTablaCompras(tbl_movCaja, articulosComprados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbx_fechas = new javax.swing.JComboBox();
        dp_desde = new org.jdesktop.swingx.JXDatePicker();
        dp_hasta = new org.jdesktop.swingx.JXDatePicker();
        cbx_articulos = new javax.swing.JComboBox();
        cbx_Area = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mes = new javax.swing.JTextField();
        check_articulo = new javax.swing.JCheckBox();
        check_area = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_movCaja = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eye.png"))); // NOI18N
        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton2.setText("Listar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbx_fechas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Día", "Mes", "Año", "Período" }));
        cbx_fechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_fechasItemStateChanged(evt);
            }
        });

        cbx_articulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_articulosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Fechas:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Desde:");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Hasta:");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setText("Mes:");

        check_articulo.setText("Artículo Específico");
        check_articulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_articuloItemStateChanged(evt);
            }
        });

        check_area.setText("Area Determinada");
        check_area.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                check_areaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mes)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dp_desde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dp_hasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check_articulo)
                    .addComponent(check_area))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_articulos, 0, 101, Short.MAX_VALUE)
                    .addComponent(cbx_Area, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_articulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_area)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbx_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Historial de Registros de Compra");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setMaximumSize(null);

        tbl_movCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "Precio", "Cantidad Adquirida", "Costo Relacionado", "Area de Aplicación", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_movCaja);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_fechasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_fechasItemStateChanged
        if (cbx_fechas.getSelectedIndex() == 1) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(true);
            dp_hasta.setEnabled(false);
        } else if (cbx_fechas.getSelectedIndex() == 2) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(true);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);
        } else if (cbx_fechas.getSelectedIndex() == 3) {
            txt_año.setEnabled(true);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);

        } else if (cbx_fechas.getSelectedIndex() == 4) {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(true);
            dp_hasta.setEnabled(true);
        } else {
            txt_año.setEnabled(false);
            txt_mes.setEnabled(false);
            dp_desde.setEnabled(false);
            dp_hasta.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_fechasItemStateChanged

    private void cbx_articulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_articulosItemStateChanged
    }//GEN-LAST:event_cbx_articulosItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Articulos_Adquiridos> filtro = new LinkedList<>();
        filtro2 = new LinkedList<>();

        if (cbx_fechas.getSelectedIndex() == 0) {
            if (check_area.isSelected()) {
                Area unArea = (Area) cbx_Area.getSelectedItem();
                for (Articulos_Adquiridos unArticulos_Adquirido : articulosComprados) {
                    if (unArticulos_Adquirido.getUnArea().equals(unArea)) {
                        filtro2.add(unArticulos_Adquirido);
                    }
                }
            } else if (check_articulo.isSelected()) {
                for (Articulos_Adquiridos unArticulos_Adquirido : articulosComprados) {
                    if (unArticulos_Adquirido.getUnArticulo().equals((Articulo) cbx_articulos.getSelectedItem())) {
                        filtro2.add(unArticulos_Adquirido);
                    }
                }
            } else {
                filtro2 = articulosComprados;
            }

        } else if (cbx_fechas.getSelectedIndex() == 1) {
            Calendar fechaCompra = Calendar.getInstance();
            Calendar fechaDP = Calendar.getInstance();
            fechaDP.setTime(dp_desde.getDate());
            for (Articulos_Adquiridos unAdquirido : articulosComprados) {
                fechaCompra.setTime(unAdquirido.getFecha());
                if (fechaCompra.get(Calendar.DAY_OF_YEAR) == fechaDP.get(Calendar.DAY_OF_YEAR)) {
                    filtro.add(unAdquirido);
                }
            }
            if (check_area.isSelected()) {
                Area unArea = (Area) cbx_Area.getSelectedItem();
                for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                    if (unArticulos_Adquirido.getUnArea().equals(unArea)) {
                        filtro2.add(unArticulos_Adquirido);
                    }
                }
            } else if (check_articulo.isSelected()) {
                for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                    if (unArticulos_Adquirido.getUnArticulo().equals((Articulo) cbx_articulos.getSelectedItem())) {
                        filtro2.add(unArticulos_Adquirido);
                    }
                }
            } else {
                filtro2 = filtro;
            }

        } else if (cbx_fechas.getSelectedIndex() == 2) {
            if (!txt_mes.getText().isEmpty()) {
                Calendar unCalendar = Calendar.getInstance();
                for (Articulos_Adquiridos unAdquirido : articulosComprados) {
                    unCalendar.setTime(unAdquirido.getFecha());
                    if (unCalendar.get(Calendar.MONTH) == (Integer.parseInt(txt_mes.getText()) - 1)) {
                        filtro.add(unAdquirido);
                    }
                }
                if (check_area.isSelected()) {
                    Area unArea = (Area) cbx_Area.getSelectedItem();
                    for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                        if (unArticulos_Adquirido.getUnArea().equals(unArea)) {
                            filtro2.add(unArticulos_Adquirido);
                        }
                    }
                } else if (check_articulo.isSelected()) {
                    for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                        if (unArticulos_Adquirido.getUnArticulo().equals((Articulo) cbx_articulos.getSelectedItem())) {
                            filtro2.add(unArticulos_Adquirido);
                        }
                    }
                } else {
                    filtro2 = filtro;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar el valor numerico del mes que desea visualizar");
            }

        } else if (cbx_fechas.getSelectedIndex() == 3) {
            if (!txt_año.getText().isEmpty()) {
                Calendar fechaCompra = Calendar.getInstance();
                for (Articulos_Adquiridos unAdquirido : articulosComprados) {
                    fechaCompra.setTime(unAdquirido.getFecha());
                    if (fechaCompra.get(Calendar.YEAR) == (Integer.parseInt(txt_año.getText()))) {
                        filtro.add(unAdquirido);
                    }
                }
                if (check_area.isSelected()) {
                    Area unArea = (Area) cbx_Area.getSelectedItem();
                    for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                        if (unArticulos_Adquirido.getUnArea().equals(unArea)) {
                            filtro2.add(unArticulos_Adquirido);
                        }
                    }
                } else if (check_articulo.isSelected()) {
                    for (Articulos_Adquiridos unArticulos_Adquirido : filtro) {
                        if (unArticulos_Adquirido.getUnArticulo().equals((Articulo) cbx_articulos.getSelectedItem())) {
                            filtro2.add(unArticulos_Adquirido);
                        }
                    }
                } else {
                    filtro2 = filtro;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar el valor numerico del año que desea visualizar");
            }
        }
        totalEg = 0.0;
        for (Articulos_Adquiridos unArticulo_Adquirido : filtro2) {
            totalEg = totalEg + (unArticulo_Adquirido.getUnPrecio() * unArticulo_Adquirido.getCantidad());
        }
        GUIM.cargarTablaCompras(tbl_movCaja, filtro2);
        this.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void check_articuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_articuloItemStateChanged
        if (check_articulo.isSelected()) {
            cbx_articulos.setEnabled(true);
            check_area.setSelected(false);
            cbx_Area.setEnabled(false);
        } else {
            cbx_articulos.setEnabled(false);
        }
    }//GEN-LAST:event_check_articuloItemStateChanged

    private void check_areaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_check_areaItemStateChanged
        if (check_area.isSelected()) {
            cbx_Area.setEnabled(true);
            check_articulo.setSelected(false);
            cbx_articulos.setEnabled(false);
        } else {
            cbx_Area.setEnabled(false);
        }
    }//GEN-LAST:event_check_areaItemStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("us", Acceso.getUsuario());
            parametros.put("logo", unaHosteria.getLogo());
            parametros.put("pa", unaHosteria.getMiPais());
            parametros.put("pcia", unaHosteria.getMiProvincia());
            parametros.put("ciud", unaHosteria.getMiCiudad());
            parametros.put("calle", unaHosteria.getMiCalle());
            parametros.put("nomb", unaHosteria.getNombre());
            parametros.put("cant", filtro2.size());

            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/articulosComprados.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(filtro2));
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
            frame.setSize(800, 600);
            frame.show();

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbx_Area;
    private javax.swing.JComboBox cbx_articulos;
    private javax.swing.JComboBox cbx_fechas;
    private javax.swing.JCheckBox check_area;
    private javax.swing.JCheckBox check_articulo;
    private org.jdesktop.swingx.JXDatePicker dp_desde;
    private org.jdesktop.swingx.JXDatePicker dp_hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JTable tbl_movCaja;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_mes;
    // End of variables declaration//GEN-END:variables

    private void cargarCombos() {
        for (Area unArea : unaHosteria.getAreas()) {
            cbx_Area.addItem(unArea);
        }

        for (Articulo unArticulo : unaHosteria.getArticulos()) {
            cbx_articulos.addItem(unArticulo);

        }
    }
}
