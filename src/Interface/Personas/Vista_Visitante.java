package Interface.Personas;

import Interface.Acceso;
import Interface.GUIM;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Afiliado;
import LN.Persona.Visitante.Tercero;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Foto;
import LN.Varios.Hosteria;
import LN.Varios.Maestro;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Visitante extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Visitante huesped;

    public Vista_Visitante(Hosteria unaHosteria, Visitante unVisitante) {
        this.unaHosteria = unaHosteria;
        this.huesped = unVisitante;
        initComponents();
        if (Acceso.getLogueado() != null) {
            if (Acceso.getLogueado() instanceof Maestro) {
                btn_EliminarVisitante.setEnabled(true);
            } else if (Acceso.getLogueado() instanceof Usuario) {
                Usuario unUsuario = (Usuario) Acceso.getLogueado();
                if (unUsuario.getRol().getPermisos().containsKey("bvis")) {
                    btn_EliminarVisitante.setEnabled(true);
                    btn_EliminarVisitante.setFocusable(true);
                } else {
                    btn_EliminarVisitante.setEnabled(false);
                    btn_EliminarVisitante.setFocusable(false);
                }
            }
        }


        btn_capturar.setEnabled(false);



        cbx_filtroItemStateChanged(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_visitantes = new javax.swing.JTable();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        txt_searchApe = new org.jdesktop.swingx.JXSearchField();
        txt_searchNomb = new org.jdesktop.swingx.JXSearchField();
        txt_searchDNI = new org.jdesktop.swingx.JXSearchField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_nuevoVisitante = new javax.swing.JButton();
        btn_modificarVis = new javax.swing.JButton();
        btn_EliminarVisitante = new javax.swing.JButton();
        cbx_filtro = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btn_capturar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        chec_soloUno = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(1020, 765));
        setMinimumSize(new java.awt.Dimension(599, 381));

        tbl_visitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido", "Nombre", "DNI", "Localidad", "Provincia/Estado", "País", "Condición de Afiliación", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_visitantes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tbl_visitantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_visitantesMouseReleased(evt);
            }
        });
        tbl_visitantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_visitantesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_visitantesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_visitantes);

        txt_searchApe.setPrompt("Buscar por Apellido");
        txt_searchApe.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchApeCaretUpdate(evt);
            }
        });

        txt_searchNomb.setPrompt("Buscar por Nombre");
        txt_searchNomb.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchNombCaretUpdate(evt);
            }
        });

        txt_searchDNI.setPrompt("Buscar por DNI");
        txt_searchDNI.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchDNICaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_searchApe, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_searchNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_searchDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 257));

        btn_nuevoVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_nuevoVisitante.setText("Nuevo");
        btn_nuevoVisitante.setDisabledIcon(null);
        btn_nuevoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoVisitanteActionPerformed(evt);
            }
        });

        btn_modificarVis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarVis.setText("Modificar");
        btn_modificarVis.setDisabledIcon(null);
        btn_modificarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarVisActionPerformed(evt);
            }
        });

        btn_EliminarVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_EliminarVisitante.setText("Eliminar");
        btn_EliminarVisitante.setDisabledIcon(null);
        btn_EliminarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarVisitanteActionPerformed(evt);
            }
        });

        cbx_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Afiliados", "Terceros" }));
        cbx_filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_filtroItemStateChanged(evt);
            }
        });

        jLabel1.setText("Filtrar por:");

        btn_capturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Capturar_vis.png"))); // NOI18N
        btn_capturar.setText("Capturar");
        btn_capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capturarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chec_soloUno.setText("<html><p>Solamente el</p><p>Seleccionado</p></html>");
        chec_soloUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chec_soloUnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chec_soloUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_capturar)
                    .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(cbx_filtro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevoVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificarVis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_EliminarVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_nuevoVisitante)
                .addGap(18, 18, 18)
                .addComponent(btn_EliminarVisitante)
                .addGap(18, 18, 18)
                .addComponent(btn_modificarVis)
                .addGap(18, 18, 18)
                .addComponent(btn_capturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chec_soloUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoVisitanteActionPerformed


        JDialog jf;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }

        ABM_Visitantes gestorVisitante = new ABM_Visitantes(unaHosteria);
        jf.getContentPane().removeAll();
        jf.getContentPane().add(gestorVisitante);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.show();
        GUIM.cargarTablaVisitantes(tbl_visitantes, unaHosteria.getVisitantes());
        this.updateUI();
    }//GEN-LAST:event_btn_nuevoVisitanteActionPerformed

    private void btn_modificarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarVisActionPerformed
        Visitante unVisitante = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);

        JDialog jf;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        ABM_Visitantes gestorVisitante = new ABM_Visitantes(unaHosteria, unVisitante, true);
        jf.getContentPane().removeAll();
        jf.getContentPane().add(gestorVisitante);
        jf.pack();
        jf.show();
        GUIM.cargarTablaVisitantes(tbl_visitantes, unaHosteria.getVisitantes());
        this.updateUI();
    }//GEN-LAST:event_btn_modificarVisActionPerformed

    private void btn_EliminarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarVisitanteActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el Visitante seleccionado",
                "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION);
        Visitante unVisitante = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);
        if (res == JOptionPane.YES_OPTION) {
            try {
                unaHosteria.bajaVisitante(unVisitante);
                GUIM.cargarTablaVisitantes(tbl_visitantes, unaHosteria.getVisitantes());
            } catch (Exception e) {
//                GUIM.mostrarSms(pnl_resultados, 1, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_EliminarVisitanteActionPerformed

    private void txt_searchApeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchApeCaretUpdate
        List<Visitante> visitantes = unaHosteria.getVisitantes();
        List<Visitante> filtro = new LinkedList<>();
        if (!txt_searchApe.getText().isEmpty()) {
            for (Visitante unVis : visitantes) {
                if (unVis.getApellido().toUpperCase().startsWith(txt_searchApe.getText().toUpperCase())) {
                    filtro.add(unVis);
                }
                GUIM.cargarTablaVisitantes(tbl_visitantes, filtro);
            }
        } else {
            GUIM.cargarTablaVisitantes(tbl_visitantes, visitantes);
        }

    }//GEN-LAST:event_txt_searchApeCaretUpdate

    private void txt_searchNombCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchNombCaretUpdate
        List<Visitante> visitantes = unaHosteria.getVisitantes();
        List<Visitante> filtro = new LinkedList<>();
        if (!txt_searchNomb.getText().isEmpty()) {
            for (Visitante unVis : visitantes) {
                if (unVis.getNombre().toUpperCase().startsWith(txt_searchNomb.getText().toUpperCase())) {
                    filtro.add(unVis);
                }
                GUIM.cargarTablaVisitantes(tbl_visitantes, filtro);
            }
        } else {
            GUIM.cargarTablaVisitantes(tbl_visitantes, visitantes);
        }

    }//GEN-LAST:event_txt_searchNombCaretUpdate

    private void txt_searchDNICaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchDNICaretUpdate
        List<Visitante> visitantes = unaHosteria.getVisitantes();
        List<Visitante> filtro = new LinkedList<>();
        if (!txt_searchDNI.getText().isEmpty()) {
            for (Visitante unVis : visitantes) {
                if (unVis.getDni().toUpperCase().startsWith(txt_searchDNI.getText().toUpperCase())) {
                    filtro.add(unVis);
                }
                GUIM.cargarTablaVisitantes(tbl_visitantes, filtro);
            }
        } else {
            GUIM.cargarTablaVisitantes(tbl_visitantes, visitantes);
        }
    }//GEN-LAST:event_txt_searchDNICaretUpdate

    private void tbl_visitantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_visitantesKeyTyped
    }//GEN-LAST:event_tbl_visitantesKeyTyped

    private void tbl_visitantesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_visitantesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_modificarVisActionPerformed(null);
        }

    }//GEN-LAST:event_tbl_visitantesKeyPressed

    private void cbx_filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_filtroItemStateChanged
        List<Visitante> visitantes = unaHosteria.getVisitantes();
        List<Visitante> afiliados = new LinkedList<>();
        List<Visitante> terceros = new LinkedList<>();

        for (Visitante unVisit : visitantes) {
            switch (unVisit.getCondicion_af()) {
                case Hosteria.AFILIADO:
                    afiliados.add((Afiliado) unVisit);
                    break;
                case Hosteria.TERCERO:
                    terceros.add(unVisit);
                    break;
            }
        }
        if (!visitantes.isEmpty()) {
            if (cbx_filtro.getSelectedItem().equals("Afiliados")) {
                Collections.sort(afiliados);
                GUIM.cargarTablaVisitantes(tbl_visitantes, afiliados);
            } else if (cbx_filtro.getSelectedItem().equals("Terceros")) {
                GUIM.cargarTablaVisitantes(tbl_visitantes, terceros);
            } else {
                GUIM.cargarTablaVisitantes(tbl_visitantes, visitantes);
            }
        }
    }//GEN-LAST:event_cbx_filtroItemStateChanged

    private void tbl_visitantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_visitantesMouseReleased
        if (evt.getClickCount() == 2) {
            if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                Visitante unVisitante = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);
                SwingUtilities.getWindowAncestor(this).dispose();
//                JOptionPane.showMessageDialog(this, "me llamo un JDialog");
            }

        }
        huesped = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);

        if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
            btn_capturar.setEnabled(true);
        } else {
            btn_capturar.setEnabled(false);
        }

    }//GEN-LAST:event_tbl_visitantesMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("logo", unaHosteria.getLogo());
            parametros.put("pa", unaHosteria.getMiPais());
            parametros.put("pcia", unaHosteria.getMiProvincia());
            parametros.put("ciud", unaHosteria.getMiCiudad());
            parametros.put("calle", unaHosteria.getMiCalle());
            parametros.put("nomb", unaHosteria.getNombre());

            List<Visitante> todos = unaHosteria.getVisitantes();
            List<Visitante> afiliados = new LinkedList<>();
            List<Visitante> terceros = new LinkedList<>();

            if (chec_soloUno.isSelected()) {
                if (tbl_visitantes.getSelectedRowCount() >= 1) {
                    Visitante unVisitante = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);
                    terceros.add(unVisitante);
                    JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/unVis.jrxml");
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(terceros));
                    JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                    jviewer.show();

                } else {
                    JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un visitante de la tabla");
                }

            } else {
                terceros.clear();
                for (Visitante unVisitante : todos) {
                    if (unVisitante instanceof Afiliado) {
                        afiliados.add(unVisitante);
//                    parametros.put("numero_carnet", ((Afiliado) unVisitante).getNumero_carnet());
                    } else if (unVisitante instanceof Tercero) {
                        terceros.add(unVisitante);
                    }
                }

                JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/losVisitantes.jrxml");

                if (cbx_filtro.getSelectedItem().equals("Afiliados")) {
                    Collections.sort(afiliados);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(afiliados));
                    JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                    jviewer.show();

                } else if (cbx_filtro.getSelectedItem().equals("Terceros")) {
                    Collections.sort(terceros);
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(terceros));
                    JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                    jviewer.show();

                } else {
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(todos));
                    JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                    jviewer.show();
                }
            }
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(panelCurves1, ex.getMessage());
        }
//        SwingUtilities.getWindowAncestor(this).dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void chec_soloUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chec_soloUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chec_soloUnoActionPerformed

    private void btn_capturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capturarActionPerformed
        
            if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                Visitante unVisitante = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);
                SwingUtilities.getWindowAncestor(this).dispose();
            }

        
        huesped = (Visitante) tbl_visitantes.getValueAt(tbl_visitantes.getSelectedRow(), 0);


    }//GEN-LAST:event_btn_capturarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarVisitante;
    private javax.swing.JButton btn_capturar;
    private javax.swing.JButton btn_modificarVis;
    private javax.swing.JButton btn_nuevoVisitante;
    private javax.swing.JComboBox cbx_filtro;
    private javax.swing.JCheckBox chec_soloUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tbl_visitantes;
    private org.jdesktop.swingx.JXSearchField txt_searchApe;
    private org.jdesktop.swingx.JXSearchField txt_searchDNI;
    private org.jdesktop.swingx.JXSearchField txt_searchNomb;
    // End of variables declaration//GEN-END:variables

    public JTable getSelected_Visitante() {
        return this.tbl_visitantes;
    }
}
