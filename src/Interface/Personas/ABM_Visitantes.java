package Interface.Personas;

import LN.Varios.Hosteria;
import Interface.Domicilios.Panel_Direccion;
import Interface.GUIM;
import LN.Domicilios.Direccion;
import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Persona.Estado_Civil;
import LN.Persona.Persona;
import LN.Persona.Sexo;
import LN.Persona.Visitante.Visitante;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ABM_Visitantes extends javax.swing.JPanel {

    private Hosteria unaHosteria;
    private Visitante theVisitor;
    protected Panel_Direccion pnlD;

    public ABM_Visitantes(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;

        initComponents();
        //        List<Tipo_Documento> documentos = unaHosteria.getDocumentos();
        iniciarInterface(false);
        this.setVisible(true);

    }

    public ABM_Visitantes(Hosteria unaHosteria, Visitante unVisitante, boolean modificar) {
        this.unaHosteria = unaHosteria;
        this.theVisitor = unVisitante;

        initComponents();
        iniciarInterface(true);
        cbx_condicion_af.setSelectedItem(theVisitor.getCondicion_af());
        cbx_estado_civil.setSelectedItem(theVisitor.getEstado_civil());
        cbx_sexo.setSelectedItem(theVisitor.getSexo());
        txt_apellido_vis.setText(theVisitor.getApellido());
        txt_nombre_vis.setText(theVisitor.getNombre());
        txt_mail.setText(theVisitor.getE_mail());
        txt_domicilio.setText(theVisitor.getDireccion().getDomicilio());
        txt_nro_doc.setText(theVisitor.getDni());
        txt_ocupacion.setText(theVisitor.getOcupacion());
        txt_telefono.setText(theVisitor.getTelefono());
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        cbx_estado_civil = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txt_ocupacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbx_motivo_visita = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        DP_fecha_nacimiento = new org.jdesktop.swingx.JXDatePicker();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre_vis = new javax.swing.JTextField();
        txt_apellido_vis = new javax.swing.JTextField();
        cbx_sexo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        pnl_direccion = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbx_condicion_af = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txt_nro_carnet = new javax.swing.JTextField();
        lbl_tipoDNI = new javax.swing.JLabel();
        txt_nro_doc = new javax.swing.JTextField();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        btn_aceptar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setAutoscrolls(true);
        setMaximumSize(null);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane4.setAutoscrolls(true);
        jScrollPane4.setMaximumSize(null);
        jScrollPane4.setMinimumSize(null);

        jPanel1.setMaximumSize(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opcionales"));
        jPanel3.setAutoscrolls(true);

        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel15.setText("Motivo de Visita:");

        txt_mail.setNextFocusableComponent(txt_ocupacion);
        txt_mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_mailFocusLost(evt);
            }
        });

        lbl_correo.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_correo.setMinimumSize(new java.awt.Dimension(25, 25));

        cbx_estado_civil.setNextFocusableComponent(txt_telefono);

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel6.setText("Estado Civil:");

        txt_ocupacion.setNextFocusableComponent(cbx_sexo);
        txt_ocupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ocupacionKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel9.setText("E-mail:");

        jLabel18.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel18.setText("Ocupación:");

        cbx_motivo_visita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vacaciones", "Visita a Familiares", "Trabajo", "Negocios", "Estudio" }));

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel13.setText("Fecha de Nacimiento:");

        DP_fecha_nacimiento.setNextFocusableComponent(cbx_estado_civil);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_estado_civil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ocupacion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DP_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_motivo_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbx_motivo_visita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(DP_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jPanel4.setPreferredSize(new java.awt.Dimension(615, 238));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel5.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel7.setText("Sexo:");

        txt_nombre_vis.setNextFocusableComponent(txt_apellido_vis);
        txt_nombre_vis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_visActionPerformed(evt);
            }
        });
        txt_nombre_vis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_visKeyTyped(evt);
            }
        });

        txt_apellido_vis.setNextFocusableComponent(txt_telefono);
        txt_apellido_vis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_visKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel8.setText("Teléfono:");

        txt_telefono.setNextFocusableComponent(txt_nro_doc);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        pnl_direccion.setBorder(null);
        pnl_direccion.setLayout(new javax.swing.BoxLayout(pnl_direccion, javax.swing.BoxLayout.LINE_AXIS));

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel16.setText("Domicilio:");

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel14.setText("Condición de Afiliación:");

        cbx_condicion_af.setNextFocusableComponent(txt_nro_carnet);
        cbx_condicion_af.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_condicion_afItemStateChanged(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel17.setText("Nro. de Carnet:");

        txt_nro_carnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro_carnetKeyTyped(evt);
            }
        });

        lbl_tipoDNI.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lbl_tipoDNI.setText("DNI:");

        txt_nro_doc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nro_doc.setCaretColor(java.awt.Color.black);
        txt_nro_doc.setNextFocusableComponent(txt_domicilio);
        txt_nro_doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro_docKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_vis))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nro_carnet))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellido_vis))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_condicion_af, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_tipoDNI)
                        .addGap(40, 40, 40)
                        .addComponent(txt_nro_doc)))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addComponent(pnl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbx_condicion_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_nro_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre_vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_apellido_vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnl_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipoDNI)
                            .addComponent(txt_nro_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelCurves1.setBackground(new java.awt.Color(102, 102, 102));
        panelCurves1.setForeground(new java.awt.Color(153, 153, 153));
        panelCurves1.setPreferredSize(new java.awt.Dimension(558, 80));

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check.png"))); // NOI18N
        btn_modificar.setText("<html><p>Guardar</p><p>Modificaciones</p></html>");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_aceptar)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel1);

        add(jScrollPane4);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarInterface(boolean modificar) {
        if (modificar) {
            btn_modificar.setEnabled(true);
        } else {
            btn_modificar.setEnabled(false);
        }
        cbx_condicion_af.addItem(Hosteria.getAFILIADO());
        cbx_condicion_af.addItem(Hosteria.getTERCERO());


        List<Estado_Civil> estados = unaHosteria.getEstados_civiles();
        for (Estado_Civil unEstado : estados) {
            cbx_estado_civil.addItem(unEstado);
        }
        List<Sexo> sexos = unaHosteria.getSexos();
        for (Sexo unSexo : sexos) {
            cbx_sexo.addItem(unSexo);
        }

        pnlD = new Panel_Direccion(unaHosteria);
        pnl_direccion.setLayout(new BoxLayout(pnl_direccion, BoxLayout.LINE_AXIS));
        pnl_direccion.add(pnlD);

        pnlD.getCBX_Pais().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                JComboBox cbx = (JComboBox) ie.getSource();
                if (cbx.getSelectedIndex() != -1) {
                    Pais unPais = (Pais) cbx.getSelectedItem();
                    lbl_tipoDNI.setText(unPais.getTipoDocumento().toString());
                }
            }
        });
    }

    private void txt_nombre_visActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_visActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_visActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        boolean todoOk = true;

        String ape_vis = txt_apellido_vis.getText();
        String nomb_vis = txt_nombre_vis.getText();
        Date fecha_nac = DP_fecha_nacimiento.getDate();
        Estado_Civil st_civil = (Estado_Civil) cbx_estado_civil.getSelectedItem();
        String tel_vis = txt_telefono.getText();
        String e_mail = txt_mail.getText();
        String ocupacion = txt_ocupacion.getText();
        Sexo sexo = (Sexo) cbx_sexo.getSelectedItem();
        Pais unPais = pnlD.getPais();
//        cbx_tipo_doc.setSelectedItem(unPais.getTipoDocumento());
//        cbx_tipo_doc.setEnabled(false);
        Provincia unaProvincia = pnlD.getProvincia();
        Localidad unaLocalidad = pnlD.getLocalidad();
        String unDomicilio = txt_domicilio.getText();
        String motivo_visita = String.valueOf(cbx_motivo_visita.getSelectedItem());
        String dni = txt_nro_doc.getText();
        String condicion_af = null;
        if (cbx_condicion_af.getSelectedItem().equals(Hosteria.AFILIADO)) {
            condicion_af = Hosteria.AFILIADO;

        } else if (cbx_condicion_af.getSelectedItem().equals(Hosteria.TERCERO)) {
            condicion_af = Hosteria.TERCERO;
        }
        String nro_carnet = txt_nro_carnet.getText();

        if (nomb_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para el Visitante");
        }
        if (ape_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "Debe ingresar un apellido para el Visitante");
        }
        if (!e_mail.isEmpty()) {
            if (GUIM.validarMail(e_mail) == false) {
                todoOk = false;
                JOptionPane.showMessageDialog(this, "La direccion de correo electrónico no es valida");
            }
        }
        if (unDomicilio.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "No ha ingresado un Domicilio para el visitante");

        }
        if (tel_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " No se ha ingresado el numero telefónico del visitante");

        }
        if (unPais == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar un país de procedencia");
        }
        if (unaProvincia == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar una provincia de procedencia");
        }
        if (unaLocalidad == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar una localidad de procedencia");
        }
        if (dni == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " No se ha ingresado el numero de identidad del visitante");
        }

        if (condicion_af.equals(Hosteria.AFILIADO) && nro_carnet.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe ingresar el número de carnet del Afiliado");
        }

        if (todoOk) {
            try {
                Direccion unaDireccion = unaHosteria.altaDireccion(unPais, unaProvincia, unaLocalidad, unDomicilio);
                unaHosteria.altaVisitante(dni, nomb_vis, ape_vis, e_mail, st_civil, motivo_visita, ocupacion, tel_vis, condicion_af, nro_carnet, unaDireccion, fecha_nac, sexo);
                SwingUtilities.getWindowAncestor(this).dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    // <editor-fold defaultstate="collapsed" desc=" Validaciones KeyTyped "> 
    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_nombre_visKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_visKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombre_visKeyTyped

    private void txt_apellido_visKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_visKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellido_visKeyTyped

    private void txt_ocupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ocupacionKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ocupacionKeyTyped

    private void txt_mailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_mailFocusLost
        String e_mail = txt_mail.getText();
        if (!e_mail.isEmpty()) {
            if (GUIM.validarMail(e_mail)) {
                lbl_correo.setIcon(new ImageIcon(GUIM.class.getResource("/Imagenes/ok.png")));
            } else {
                lbl_correo.setIcon(new ImageIcon(GUIM.class.getResource("/Imagenes/ups.png")));
            }
        }
    }//GEN-LAST:event_txt_mailFocusLost

    private void txt_nro_docKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro_docKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nro_docKeyTyped
    // </editor-fold>

    private void cbx_condicion_afItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_condicion_afItemStateChanged
        if (cbx_condicion_af.getSelectedItem().equals(Hosteria.TERCERO)) {
            txt_nro_carnet.setText("");

            txt_nro_carnet.setEnabled(false);
        } else {
            txt_nro_carnet.removeAll();
            txt_nro_carnet.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_condicion_afItemStateChanged

    private void txt_nro_carnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro_carnetKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_txt_nro_carnetKeyTyped

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        boolean todoOk = true;
        String ape_vis = txt_apellido_vis.getText();
        String nomb_vis = txt_nombre_vis.getText();
        Date fecha_nac = DP_fecha_nacimiento.getDate();
        Estado_Civil st_civil = (Estado_Civil) cbx_estado_civil.getSelectedItem();
        String tel_vis = txt_telefono.getText();
        String e_mail = txt_mail.getText();
        String ocupacion = txt_ocupacion.getText();
        Sexo sexo = (Sexo) cbx_sexo.getSelectedItem();
        Pais unPais = pnlD.getPais();
//        cbx_tipo_doc.setSelectedItem(unPais.getTipoDocumento());
//        cbx_tipo_doc.setEnabled(false);
        Provincia unaProvincia = pnlD.getProvincia();
        Localidad unaLocalidad = pnlD.getLocalidad();
        String unDomicilio = txt_domicilio.getText();
        String motivo_visita = String.valueOf(cbx_motivo_visita.getSelectedItem());
        String dni = txt_nro_doc.getText();
        String condicion_af = null;
        if (cbx_condicion_af.getSelectedItem().equals(Hosteria.AFILIADO)) {
            condicion_af = Hosteria.AFILIADO;

        } else if (cbx_condicion_af.getSelectedItem().equals(Hosteria.TERCERO)) {
            condicion_af = Hosteria.TERCERO;
        }
        String nro_carnet = txt_nro_carnet.getText();

        if (nomb_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para el Visitante");
        }
        if (ape_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "Debe ingresar un apellido para el Visitante");
        }
        if (!e_mail.isEmpty()) {
            if (GUIM.validarMail(e_mail) == false) {
                todoOk = false;
                JOptionPane.showMessageDialog(this, "La direccion de correo electrónico no es valida");
            }
        }
        if (unDomicilio.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, "No ha ingresado un Domicilio para el visitante");

        }
        if (tel_vis.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " No se ha ingresado el numero telefónico del visitante");

        }
        if (unPais == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar un país de procedencia");
        }
        if (unaProvincia == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar una provincia de procedencia");
        }
        if (unaLocalidad == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe seleccionar una localidad de procedencia");
        }
        if (dni == null) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " No se ha ingresado el numero de identidad del visitante");
        }

        if (condicion_af.equals(Hosteria.AFILIADO) && nro_carnet.isEmpty()) {
            todoOk = false;
            JOptionPane.showMessageDialog(this, " Debe ingresar el número de carnet del Afiliado");
        }

        if (todoOk) {
            try {
                Direccion unaDireccion = unaHosteria.altaDireccion(unPais, unaProvincia, unaLocalidad, unDomicilio);
                unaHosteria.modificaVisitante(theVisitor, ape_vis, nomb_vis, unaDireccion, tel_vis, e_mail, fecha_nac, dni, sexo, motivo_visita, ocupacion, condicion_af, nro_carnet);
                SwingUtilities.getWindowAncestor(this).dispose();
            } catch (Exception ex) {
                SwingUtilities.getWindowAncestor(this).dispose();
            }

        }
    }//GEN-LAST:event_btn_modificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DP_fecha_nacimiento;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cbx_condicion_af;
    private javax.swing.JComboBox cbx_estado_civil;
    private javax.swing.JComboBox cbx_motivo_visita;
    private javax.swing.JComboBox cbx_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_tipoDNI;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JPanel pnl_direccion;
    private javax.swing.JTextField txt_apellido_vis;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre_vis;
    private javax.swing.JTextField txt_nro_carnet;
    private javax.swing.JTextField txt_nro_doc;
    private javax.swing.JTextField txt_ocupacion;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
