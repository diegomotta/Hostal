package Interface.Hoteleria;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Salon;
import LN.Alquileres.Tarifa_Salon;
import LN.Varios.Hosteria;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Parametros_Salon extends javax.swing.JPanel {

    Hosteria unaHosteria;

    public Parametros_Salon(Hosteria unHosteria) {
        this.unaHosteria = unHosteria;
        initComponents();
        GUIM.decimalPositivo(txt_S);
        GUIM.decimalPositivo(txt_SC);
        GUIM.decimalPositivo(txt_SCS);
        GUIM.decimalPositivo(txt_SL);
        GUIM.decimalPositivo(txt_SLC);
        GUIM.decimalPositivo(txt_SLCS);
        GUIM.decimalPositivo(txt_SLS);
        GUIM.decimalPositivo(txt_SS);
        cargarInterface();




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraAgregarLimpieza = new javax.swing.ButtonGroup();
        paraEliminarLimpieza = new javax.swing.ButtonGroup();
        paraAgregarHabilitado = new javax.swing.ButtonGroup();
        ParaEliminarHabilitado = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        radio_sucia = new javax.swing.JRadioButton();
        radio_deshabilitado = new javax.swing.JRadioButton();
        radio_limpia = new javax.swing.JRadioButton();
        radio_habilitado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cbx_salonSeleccionado = new javax.swing.JComboBox();
        check_climatizacion_mod = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txt_capacidad_mod = new javax.swing.JTextField();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_SL = new javax.swing.JTextField();
        txt_SLS = new javax.swing.JTextField();
        txt_S = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_SS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_SCS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_SLCS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_SC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_SLC = new javax.swing.JTextField();
        jXTaskPane2 = new org.jdesktop.swingx.JXTaskPane();
        btn_eliminarSalon = new javax.swing.JButton();
        jLabelelim = new javax.swing.JLabel();
        cbx_Salon_a_Eliminarse = new javax.swing.JComboBox();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        btn_agregarSalon = new javax.swing.JButton();
        radio_nuevaDehabilitada = new javax.swing.JRadioButton();
        radio_nuevaHabilitada = new javax.swing.JRadioButton();
        radio_nuevaSucia = new javax.swing.JRadioButton();
        radio_nuevaLimpia = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_numeroSalon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        check_climatizacion_add = new javax.swing.JCheckBox();
        txt_capacidad_add = new javax.swing.JTextField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Parámetros del Salón");
        jTextField1.setFocusable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones de Estado"));

        radio_sucia.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_sucia.setText("Sucio");

        radio_deshabilitado.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_deshabilitado.setText("No Habilitado");

        radio_limpia.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_limpia.setText("Limpio");

        radio_habilitado.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_habilitado.setText("Habilitado");

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Salón Número:");

        cbx_salonSeleccionado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_salonSeleccionadoItemStateChanged(evt);
            }
        });

        check_climatizacion_mod.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        check_climatizacion_mod.setText("¿Ambiente Climatizado?");
        check_climatizacion_mod.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Capacidad Máxima");

        txt_capacidad_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_capacidad_modKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_salonSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(check_climatizacion_mod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_capacidad_mod))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_habilitado)
                    .addComponent(radio_deshabilitado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_limpia)
                    .addComponent(radio_sucia))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbx_salonSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_habilitado)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_capacidad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(check_climatizacion_mod))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radio_deshabilitado)
                                .addComponent(radio_sucia))))
                    .addComponent(radio_limpia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Aceptar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btn_Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        btn_Cancelar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarifas del Salón"));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setText("Salón + Limpieza:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setText("Salón + Limpieza + Sonido");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Salón:");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel8.setText("Salón + Sonido:");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel10.setText("Salón + Cocina + Sonido");

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel11.setText("Todos:");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel9.setText("Salón + Cocina:");

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel12.setText("Salón + Limpieza + Cocina");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SLS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SCS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SLC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_S, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SLCS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_SCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txt_SLCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txt_SLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_SLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(5, 5, 5))
        );

        jXTaskPane2.setCollapsed(true);
        jXTaskPane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reciclar.png"))); // NOI18N
        jXTaskPane2.setScrollOnExpand(true);
        jXTaskPane2.setTitle("Eliminar un Salón");
        jXTaskPane2.setAutoscrolls(true);

        btn_eliminarSalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarSalon.setText("Eliminar");
        btn_eliminarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarSalonActionPerformed(evt);
            }
        });

        jLabelelim.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabelelim.setText("Seleccione el Salón a ser Eliminado");

        cbx_Salon_a_Eliminarse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_Salon_a_EliminarseItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jXTaskPane2Layout = new javax.swing.GroupLayout(jXTaskPane2.getContentPane());
        jXTaskPane2.getContentPane().setLayout(jXTaskPane2Layout);
        jXTaskPane2Layout.setHorizontalGroup(
            jXTaskPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelelim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_Salon_a_Eliminarse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminarSalon)
                .addGap(22, 22, 22))
        );
        jXTaskPane2Layout.setVerticalGroup(
            jXTaskPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelelim)
                .addComponent(btn_eliminarSalon)
                .addComponent(cbx_Salon_a_Eliminarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jXTaskPane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        jXTaskPane1.setScrollOnExpand(true);
        jXTaskPane1.setTitle("Agregar un nuevo Salón de Eventos");
        jXTaskPane1.setAutoscrolls(true);

        btn_agregarSalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_agregarSalon.setText("Agregar");
        btn_agregarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarSalonActionPerformed(evt);
            }
        });

        radio_nuevaDehabilitada.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_nuevaDehabilitada.setText("No Habilitado");
        radio_nuevaDehabilitada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_nuevaDehabilitadaActionPerformed(evt);
            }
        });

        radio_nuevaHabilitada.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_nuevaHabilitada.setText("Habilitado");

        radio_nuevaSucia.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_nuevaSucia.setText("Sucio");

        radio_nuevaLimpia.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio_nuevaLimpia.setText("Limpio");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel6.setText("Número de Salón:");

        txt_numeroSalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_numeroSalonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numeroSalonKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Capacidad Máxima:");

        check_climatizacion_add.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        check_climatizacion_add.setText("¿Ambiente Climatizado?");
        check_climatizacion_add.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txt_capacidad_add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_capacidad_addKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jXTaskPane1Layout = new javax.swing.GroupLayout(jXTaskPane1.getContentPane());
        jXTaskPane1.getContentPane().setLayout(jXTaskPane1Layout);
        jXTaskPane1Layout.setHorizontalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_numeroSalon))
                    .addComponent(check_climatizacion_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_capacidad_add))
                .addGap(18, 18, 18)
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_nuevaHabilitada)
                    .addComponent(radio_nuevaDehabilitada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_nuevaSucia)
                    .addComponent(radio_nuevaLimpia))
                .addGap(18, 18, 18)
                .addComponent(btn_agregarSalon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXTaskPane1Layout.setVerticalGroup(
            jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_capacidad_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_numeroSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_climatizacion_add))
                    .addGroup(jXTaskPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXTaskPane1Layout.createSequentialGroup()
                                .addComponent(radio_nuevaHabilitada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jXTaskPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radio_nuevaDehabilitada)
                                    .addComponent(radio_nuevaSucia)))
                            .addComponent(radio_nuevaLimpia)
                            .addComponent(btn_agregarSalon))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jXTaskPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jXTaskPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancelar)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aceptar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        Salon seleccionado = (Salon) cbx_salonSeleccionado.getSelectedItem();
        boolean limpia = false;
        boolean habilitada = false;

        if (radio_deshabilitado.isSelected()) {
            habilitada = false;
        } else if (radio_habilitado.isSelected()) {
            habilitada = true;
        }

        if (radio_limpia.isSelected()) {
            limpia = true;
        } else if (radio_sucia.isSelected()) {
            limpia = false;
        }

        double precios[] = new double[8];
        double tarifasAnteriores[] = new double[8];

        precios[0] = Double.valueOf(txt_S.getText());
        precios[1] = Double.valueOf(txt_SL.getText());
        precios[2] = Double.valueOf(txt_SC.getText());
        precios[3] = Double.valueOf(txt_SS.getText());
        precios[4] = Double.valueOf(txt_SLS.getText());
        precios[5] = Double.valueOf(txt_SCS.getText());
        precios[6] = Double.valueOf(txt_SLC.getText());
        precios[7] = Double.valueOf(txt_SLCS.getText());

        for (Tarifa_Salon unaTarifa : unaHosteria.getTarifas_Salon()) {
            switch (unaTarifa.getTipo()) {
                case "Salon":
                    tarifasAnteriores[0] = unaTarifa.getPrecio();
                case "Salon + Limpieza":
                    tarifasAnteriores[1] = unaTarifa.getPrecio();
                case "Salon + Cocina":
                    tarifasAnteriores[2] = unaTarifa.getPrecio();
                case "Salon + Sonido":
                    tarifasAnteriores[3] = unaTarifa.getPrecio();
                case "Salon + Limpieza + Sonido":
                    tarifasAnteriores[4] = unaTarifa.getPrecio();
                case "Salon + Cocina + Sonido":
                    tarifasAnteriores[5] = unaTarifa.getPrecio();
                case "Salon + Limpieza + Cocina":
                    tarifasAnteriores[6] = unaTarifa.getPrecio();
                case "Completo":
                    tarifasAnteriores[7] = unaTarifa.getPrecio();

            }
        }

        if (precios[0] != tarifasAnteriores[0]) {
            unaHosteria.crearAuditoria("MOD", "Modificó la tarifa del Salon (Salon) de " + String.valueOf(tarifasAnteriores[0]) + " a " + txt_S.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
        }
        if (precios[1] != tarifasAnteriores[1]) {
            unaHosteria.crearAuditoria("MOD", "Modificó la tarifa del Salon (Salon + Limpieza) de " + String.valueOf(tarifasAnteriores[1]) + " a " + txt_SL.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
        }
        if (precios[2] != tarifasAnteriores[2]) {
            unaHosteria.crearAuditoria("MOD", "Modificó la tarifa del Salon (Salon + Limpieza + Sonido) de " + String.valueOf(tarifasAnteriores[2]) + " a " + txt_SLS.getText(), Acceso.getUsuario(), GUIM.getHoraActual());
        }


        unaHosteria.cambiarEstado_Salon(seleccionado, habilitada, limpia, precios);
//        unaHosteria.crearAuditoria("MOD", "Modificó un estado (Habitacion " + unaHabitacion.getNumero() + ")", Acceso.getUsuario(), GUIM.getHoraActual());
        //        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_eliminarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarSalonActionPerformed
        Salon aEliminar = (Salon) cbx_Salon_a_Eliminarse.getSelectedItem();
        try {
            unaHosteria.eliminarSalon(aEliminar);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_eliminarSalonActionPerformed

    private void cbx_Salon_a_EliminarseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_Salon_a_EliminarseItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_Salon_a_EliminarseItemStateChanged

    private void btn_agregarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarSalonActionPerformed
        Integer numeroSalon = Integer.valueOf(txt_numeroSalon.getText());

        boolean habilitacion = false;
        boolean limpieza = false;
        boolean reactivar = false;
        boolean climatizacion = false;
        Integer maximo = 0;

        if (!"".equals(txt_numeroSalon.getText())) {
            if (radio_nuevaHabilitada.isSelected()) {
                habilitacion = true;
            } else if (radio_nuevaDehabilitada.isSelected()) {
                habilitacion = false;
            }
            if (radio_nuevaLimpia.isSelected()) {
                limpieza = true;
            } else if (radio_nuevaSucia.isSelected()) {
                limpieza = false;
            }

            if (check_climatizacion_add.isSelected()) {
                climatizacion = true;
            } else {
                climatizacion = false;
            }

            if (!txt_capacidad_add.getText().isEmpty()) {
                maximo = Integer.parseInt(txt_capacidad_add.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar la capacidad de ocupantes que soportará");
            }

            for (Salon unSalon : unaHosteria.getSalones()) {
                if (numeroSalon.equals(unSalon.getNumero())) {
                    int res = JOptionPane.showConfirmDialog(this, "Éste Número corresponde a un Salón eliminado con anterioridad, ¿Desea Reactivarlo?",
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        reactivar = true;

                    }
                }

            }

            if (reactivar) {
                unaHosteria.reactivarSalon(numeroSalon);
                JOptionPane.showMessageDialog(this, "La nuevo Salón número " + numeroSalon + " se ha agregado con exito");

            } else {
                try {

                    unaHosteria.agregarSalon(String.valueOf(numeroSalon), limpieza, habilitacion, maximo, climatizacion, true);
                    JOptionPane.showMessageDialog(this, "La nuevo Salón número " + numeroSalon + " se ha agregado con exito");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe igresar un Número de Salón para continuar");
            txt_numeroSalon.grabFocus();
        }
    }//GEN-LAST:event_btn_agregarSalonActionPerformed

    private void cbx_salonSeleccionadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_salonSeleccionadoItemStateChanged

        Salon salonSeleccionado = (Salon) cbx_salonSeleccionado.getSelectedItem();
        if (salonSeleccionado.isHabilitado()) {
            radio_habilitado.setSelected(true);
        } else if (!salonSeleccionado.isHabilitado()) {
            radio_deshabilitado.setSelected(true);
        }

        if (salonSeleccionado.isEstado_limpieza()) {
            radio_limpia.setSelected(true);
        } else if (!salonSeleccionado.isEstado_limpieza()) {
            radio_sucia.setSelected(true);
        }
        if (salonSeleccionado.isRefrigeracion()) {
            check_climatizacion_mod.setSelected(true);
        } else {
            check_climatizacion_mod.setSelected(false);
        }

        txt_capacidad_mod.setText(String.valueOf(salonSeleccionado.getCapacidadMaxima()));
    }//GEN-LAST:event_cbx_salonSeleccionadoItemStateChanged

    private void radio_nuevaDehabilitadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_nuevaDehabilitadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_nuevaDehabilitadaActionPerformed

    private void txt_numeroSalonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroSalonKeyPressed
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numeroSalonKeyPressed

    private void txt_numeroSalonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroSalonKeyTyped
        if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numeroSalonKeyTyped

    private void txt_capacidad_addKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capacidad_addKeyTyped
if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_capacidad_addKeyTyped

    private void txt_capacidad_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_capacidad_modKeyTyped
if (!GUIM.enteroPuro(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_capacidad_modKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ParaEliminarHabilitado;
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_agregarSalon;
    private javax.swing.JButton btn_eliminarSalon;
    private javax.swing.JComboBox cbx_Salon_a_Eliminarse;
    private javax.swing.JComboBox cbx_salonSeleccionado;
    private javax.swing.JCheckBox check_climatizacion_add;
    private javax.swing.JCheckBox check_climatizacion_mod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelelim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane2;
    private javax.swing.ButtonGroup paraAgregarHabilitado;
    private javax.swing.ButtonGroup paraAgregarLimpieza;
    private javax.swing.ButtonGroup paraEliminarLimpieza;
    private javax.swing.JRadioButton radio_deshabilitado;
    private javax.swing.JRadioButton radio_habilitado;
    private javax.swing.JRadioButton radio_limpia;
    private javax.swing.JRadioButton radio_nuevaDehabilitada;
    private javax.swing.JRadioButton radio_nuevaHabilitada;
    private javax.swing.JRadioButton radio_nuevaLimpia;
    private javax.swing.JRadioButton radio_nuevaSucia;
    private javax.swing.JRadioButton radio_sucia;
    private javax.swing.JTextField txt_S;
    private javax.swing.JTextField txt_SC;
    private javax.swing.JTextField txt_SCS;
    private javax.swing.JTextField txt_SL;
    private javax.swing.JTextField txt_SLC;
    private javax.swing.JTextField txt_SLCS;
    private javax.swing.JTextField txt_SLS;
    private javax.swing.JTextField txt_SS;
    private javax.swing.JTextField txt_capacidad_add;
    private javax.swing.JTextField txt_capacidad_mod;
    private javax.swing.JTextField txt_numeroSalon;
    // End of variables declaration//GEN-END:variables

    private void cargarInterface() {

        paraAgregarLimpieza.add(radio_nuevaLimpia);
        paraAgregarLimpieza.add(radio_nuevaSucia);
        paraAgregarHabilitado.add(radio_nuevaHabilitada);
        paraAgregarHabilitado.add(radio_nuevaDehabilitada);
        paraEliminarLimpieza.add(radio_limpia);
        paraEliminarLimpieza.add(radio_sucia);
        ParaEliminarHabilitado.add(radio_habilitado);
        ParaEliminarHabilitado.add(radio_deshabilitado);

        radio_nuevaHabilitada.setSelected(true);
        radio_nuevaLimpia.setSelected(true);

        cbx_Salon_a_Eliminarse.setModel(new DefaultComboBoxModel());
        cbx_salonSeleccionado.setModel(new DefaultComboBoxModel());

        check_climatizacion_add.setSelected(false);
        check_climatizacion_mod.setSelected(false);

        for (Salon salones : unaHosteria.getSalones()) {
            if (salones.getEstado_ocupacion().equals("Disponible")) {
                cbx_Salon_a_Eliminarse.addItem(salones);
            }
            cbx_salonSeleccionado.addItem(salones);
        }


        for (Tarifa_Salon unaTarifa_Salon : unaHosteria.getTarifas_Salon()) {
            switch (unaTarifa_Salon.getTipo()) {
                case Tarifa_Salon.S:
                    txt_S.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SL:
                    txt_SL.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SC:
                    txt_SC.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SS:
                    txt_SS.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SLS:
                    txt_SLS.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SCS:
                    txt_SCS.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SLC:
                    txt_SLC.setText(String.valueOf(unaTarifa_Salon.getPrecio()));
                case Tarifa_Salon.SLCS:
                    txt_SLCS.setText(String.valueOf(unaTarifa_Salon.getPrecio()));


            }
        }

        txt_numeroSalon.setText(valorSalon());
    }

    private String valorSalon() {
        List<Salon> filtro = new LinkedList<>();
        filtro.clear();
        Integer numero = 0;
        for (Salon unSalon : unaHosteria.getSalones()) {
            if (!unSalon.isEliminado()) {
                if (unSalon.getNumero() > numero) {
                    numero = unSalon.getNumero();
                }
            }
        }
        return String.valueOf(numero + 1);
    }
}
