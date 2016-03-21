package Interface.Personas;

import Interface.Acceso;
import Interface.Domicilios.Panel_Direccion;
import Interface.GUIM;
import LN.Domicilios.Direccion;
import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Persona.Estado_Civil;
import LN.Persona.Sexo;
import LN.Persona.Usuario.Rol;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Afiliado;
import LN.Varios.Hosteria;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ABM_Usuario extends javax.swing.JPanel implements Observer {

    private Panel_Direccion pnlD;

    public ABM_Usuario(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        unaHosteria.addObserver(this);
        initComponents();
        iniciarInterface();



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Usuario = new javax.swing.JTable();
        pnl_desplegable = new org.jdesktop.swingx.JXTaskPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_tipoDNI = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nombre_Usuario = new javax.swing.JTextField();
        txt_apellido_Usuario = new javax.swing.JTextField();
        txt_nro_DNI = new javax.swing.JTextField();
        txt_nro_carnet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ussername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cbx_rol = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        pnl_direccion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbx_estado_civil = new javax.swing.JComboBox();
        lbl_correo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbx_sexo = new javax.swing.JComboBox();
        DP_fecha_nacimiento = new org.jdesktop.swingx.JXDatePicker();
        pnl_advertencias = new org.edisoncor.gui.panel.PanelCurves();
        jTextField1 = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_nuevoUsuario = new javax.swing.JButton();
        btn_eliminarUsuario = new javax.swing.JButton();
        btn_modificarUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 550));

        jPanel3.setPreferredSize(new java.awt.Dimension(738, 406));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(50, 50));

        tbl_Usuario.setAutoCreateRowSorter(true);
        tbl_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Ussername", "Rol", "DNI", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Usuario.setMinimumSize(new java.awt.Dimension(50, 100));
        tbl_Usuario.setPreferredSize(null);
        jScrollPane2.setViewportView(tbl_Usuario);

        pnl_desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Document.png"))); // NOI18N
        pnl_desplegable.setScrollOnExpand(true);
        pnl_desplegable.setTitle("Datos de Usuario");
        pnl_desplegable.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel5.setText("Apellido:");

        lbl_tipoDNI.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lbl_tipoDNI.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel17.setText("Carnet:");

        txt_nombre_Usuario.setNextFocusableComponent(txt_apellido_Usuario);
        txt_nombre_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_UsuarioKeyTyped(evt);
            }
        });

        txt_apellido_Usuario.setNextFocusableComponent(txt_nro_DNI);
        txt_apellido_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_UsuarioKeyTyped(evt);
            }
        });

        txt_nro_DNI.setNextFocusableComponent(txt_nro_carnet);
        txt_nro_DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro_DNIKeyTyped(evt);
            }
        });

        txt_nro_carnet.setNextFocusableComponent(txt_ussername);
        txt_nro_carnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro_carnetKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel2.setText("Ussername:");

        txt_ussername.setNextFocusableComponent(txt_password);

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel10.setText("Contraseña:");

        txt_password.setNextFocusableComponent(cbx_rol);

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel3.setText("Rol:");

        cbx_rol.setNextFocusableComponent(txt_telefono);

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");

        txt_telefono.setNextFocusableComponent(txt_domicilio);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel16.setText("Domicilio:");

        pnl_direccion.setBorder(null);
        pnl_direccion.setMinimumSize(new java.awt.Dimension(228, 102));
        pnl_direccion.setPreferredSize(new java.awt.Dimension(227, 102));
        pnl_direccion.setLayout(new javax.swing.BoxLayout(pnl_direccion, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secundarios (Opcional)"));
        jPanel2.setPreferredSize(new java.awt.Dimension(615, 238));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel9.setText("E-mail:");

        txt_mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_mailFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel6.setText("Estado Civil:");

        lbl_correo.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_correo.setMinimumSize(new java.awt.Dimension(25, 25));

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel13.setText("Fecha de Nacimiento:");

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel7.setText("Sexo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_sexo, 0, 106, Short.MAX_VALUE)
                    .addComponent(cbx_estado_civil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_mail)
                    .addComponent(DP_fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbx_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(DP_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout pnl_desplegableLayout = new javax.swing.GroupLayout(pnl_desplegable.getContentPane());
        pnl_desplegable.getContentPane().setLayout(pnl_desplegableLayout);
        pnl_desplegableLayout.setHorizontalGroup(
            pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_desplegableLayout.createSequentialGroup()
                .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nro_carnet))
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(lbl_tipoDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nro_DNI))
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellido_Usuario)))
                .addGap(18, 18, 18)
                .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_telefono)
                    .addComponent(txt_password)
                    .addComponent(txt_ussername)
                    .addComponent(cbx_rol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        pnl_desplegableLayout.setVerticalGroup(
            pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_desplegableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txt_nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_ussername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_apellido_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipoDNI)
                            .addComponent(txt_nro_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_nro_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_desplegableLayout.createSequentialGroup()
                        .addComponent(pnl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnl_desplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_advertenciasLayout = new javax.swing.GroupLayout(pnl_advertencias);
        pnl_advertencias.setLayout(pnl_advertenciasLayout);
        pnl_advertenciasLayout.setHorizontalGroup(
            pnl_advertenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_advertenciasLayout.setVerticalGroup(
            pnl_advertenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_advertencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_desplegable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_advertencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Usuarios");
        jTextField1.setFocusable(false);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));

        btn_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btn_nuevoUsuario.setText("   Nuevo");
        btn_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoUsuarioActionPerformed(evt);
            }
        });

        btn_eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminarUsuario.setText("Eliminar");
        btn_eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUsuarioActionPerformed(evt);
            }
        });

        btn_modificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificarUsuario.setText("Modificar");
        btn_modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarUsuarioActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/parametros.png"))); // NOI18N
        jButton1.setText("<html><p>Editar</p><p>Roles</p></html>");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(btn_eliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_nuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_nuevoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarInterface() {
//    if (Acceso.getLogueado() != null) {
//            if (Acceso.getLogueado() instanceof Operador) {
//                btn_eliminarUsuario.setEnabled(false);
//            } else if (Acceso.getLogueado() instanceof Administrador) {
//                btn_eliminarUsuario.setEnabled(true);
//            }
//        }
        pnl_desplegable.setCollapsed(true);
        for (Rol unRol : unaHosteria.getRoles()) {
            cbx_rol.addItem(unRol);
        }

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

        tbl_Usuario.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if(tbl_Usuario.getSelectedRowCount() > 0){
                        Usuario unUsuario = (Usuario) tbl_Usuario.getValueAt(tbl_Usuario.getSelectedRow(), 0);
                        txt_apellido_Usuario.setText(unUsuario.getApellido());
                        txt_nombre_Usuario.setText(unUsuario.getNombre());
                        txt_domicilio.setText(unUsuario.getDireccion().getDomicilio());
                        txt_nro_DNI.setText(unUsuario.getDni());
                        txt_nro_carnet.setText(unUsuario.getNumeroCarnet());
                        txt_ussername.setText(unUsuario.getUsserame());
                        txt_telefono.setText(unUsuario.getTelefono());
                        txt_password.setText(unUsuario.getPasword());
                        cbx_rol.setSelectedItem(unUsuario.getRol());
                        cbx_sexo.setSelectedItem(unUsuario.getSexo());
                        cbx_estado_civil.setSelectedItem(unUsuario.getEstado_civil());
                        cbx_sexo.setSelectedItem(unUsuario.getSexo());
                        pnlD.getCBX_Pais().setSelectedItem(unUsuario.getDireccion().getPais());
                        pnlD.getCbx_provincia().setSelectedItem(unUsuario.getDireccion().getProvincia());
                        pnlD.getCbx_localidad().setSelectedItem(unUsuario.getDireccion().getLocalidad());
                        DP_fecha_nacimiento.setDate(unUsuario.getFnac());

}



                    }
                });

        GUIM.cargarTablaUsuarios(tbl_Usuario, unaHosteria.getUsuarios());
        pnl_desplegable.setCollapsed(false);
    }

    private void btn_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoUsuarioActionPerformed

        boolean todoOk = true;

        String apeUsser = txt_apellido_Usuario.getText();
        String nomUsser = txt_nombre_Usuario.getText();
        Date fecha_nac = DP_fecha_nacimiento.getDate();
        String usserName = txt_ussername.getText();
        String password = txt_password.getText();
        String dniUsser = txt_nro_DNI.getText();
        Rol rol = (Rol) cbx_rol.getSelectedItem();
        String telefonoUsser = txt_telefono.getText();
        Pais unPais = pnlD.getPais();
        Provincia unaProvincia = pnlD.getProvincia();
        Localidad unaLocalidad = pnlD.getLocalidad();
        String unDomicilio = txt_domicilio.getText();
        String e_mail = txt_mail.getText();
        Sexo sexo = (Sexo) cbx_sexo.getSelectedItem();
        Estado_Civil st_civil = (Estado_Civil) cbx_estado_civil.getSelectedItem();
        String condicion_af = Hosteria.getAFILIADO();
        String nro_carnet = txt_nro_carnet.getText();

        String creadoHora = GUIM.getHoraActual();

        if (nomUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, "Debe ingresar el Nombre del Usuario");
        }
        if (apeUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, "Debe ingresar el Apellido del Usuario");
        }
        if (!e_mail.isEmpty()) {
            if (GUIM.validarMail(e_mail) == false) {
                todoOk = false;
                GUIM.mostrarSms(pnl_advertencias, 2, "La direccion de correo electrónico no es valida");
            }
        }
        if (fecha_nac == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No ha seleccionado una fecha de nacimiento");
        }
        if (telefonoUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No se ha ingresado el numero telefónico del Usuario");
        }
        if (unPais == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar un País de procedencia");
        }
        if (unaProvincia == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar una Provincia de procedencia");
        }
        if (unaLocalidad == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar una Pocalidad de procedencia");
        }
        if (dniUsser == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No se ha ingresado el numero de identidad del Usuario");
        }

        if (todoOk) {
            try {
                Direccion unaDireccion = unaHosteria.altaDireccion(unPais, unaProvincia, unaLocalidad, unDomicilio);

                unaHosteria.altaUsuario(nomUsser, apeUsser, dniUsser, rol, password, usserName, telefonoUsser, unaDireccion, unDomicilio, st_civil, sexo, fecha_nac, creadoHora, e_mail, nro_carnet);
                GUIM.mostrarSms(pnl_advertencias, 0, " El nuevo Usuario se ha cargado con exito");

                unaHosteria.crearAuditoria("ADD", "Agrego el usuario: " + usserName + " (" + apeUsser + " " + nomUsser + ")", Acceso.getUsuario(), GUIM.getHoraActual());
            } catch (Exception ex) {
                GUIM.mostrarSms(pnl_advertencias, 1, ex.getMessage());
            }

        }

    }//GEN-LAST:event_btn_nuevoUsuarioActionPerformed

    private void limpiarCampos() {
        txt_apellido_Usuario.setText("");
        txt_nombre_Usuario.setText("");
        txt_domicilio.setText("");
        txt_nro_DNI.setText("");
        txt_ussername.setText("");
        txt_telefono.setText("");
        cbx_rol.setSelectedIndex(0);
        cbx_sexo.setSelectedIndex(0);
    }

    // <editor-fold defaultstate="collapsed" desc=" Validacion de Componentes"> 
    private void txt_nombre_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_UsuarioKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_txt_nombre_UsuarioKeyTyped

    private void txt_apellido_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_UsuarioKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_txt_apellido_UsuarioKeyTyped

    private void txt_nro_DNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro_DNIKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_txt_nro_DNIKeyTyped

    private void txt_nro_carnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro_carnetKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nro_carnetKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped
// </editor-fold>

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

    private void btn_modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarUsuarioActionPerformed

        boolean todoOk = true;

        String apeUsser = txt_apellido_Usuario.getText();
        String nomUsser = txt_nombre_Usuario.getText();
        Date fecha_nac = DP_fecha_nacimiento.getDate();
        String usserName = txt_ussername.getText();
        String password = txt_password.getText();
        String dniUsser = txt_nro_DNI.getText();
        Rol rol = (Rol) cbx_rol.getSelectedItem();
        String telefonoUsser = txt_telefono.getText();
        Pais unPais = pnlD.getPais();
        Provincia unaProvincia = pnlD.getProvincia();
        Localidad unaLocalidad = pnlD.getLocalidad();
        String unDomicilio = txt_domicilio.getText();
        String e_mail = txt_mail.getText();
        Sexo sexo = (Sexo) cbx_sexo.getSelectedItem();
        Estado_Civil st_civil = (Estado_Civil) cbx_estado_civil.getSelectedItem();
        String condicion_af = Hosteria.getAFILIADO();
        String nro_carnet = txt_nro_carnet.getText();
        String creadoDia = GUIM.getFechaActual();
        String creadoHora = GUIM.getHoraActual();

        if (nomUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, "Debe ingresar el Nombre del Usuario");
        }
        if (apeUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, "Debe ingresar el Apellido del Usuario");
        }
        if (!e_mail.isEmpty()) {
            if (GUIM.validarMail(e_mail) == false) {
                todoOk = false;
                GUIM.mostrarSms(pnl_advertencias, 2, "La direccion de correo electrónico no es valida");
            }
        }
        if (fecha_nac == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No ha seleccionado una fecha de nacimiento");
        }
        if (telefonoUsser.isEmpty()) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No se ha ingresado el numero telefónico del Usuario");
        }
        if (unPais == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar un País de procedencia");
        }
        if (unaProvincia == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar una Provincia de procedencia");
        }
        if (unaLocalidad == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " Debe seleccionar una Pocalidad de procedencia");
        }
        if (dniUsser == null) {
            todoOk = false;
            GUIM.mostrarSms(pnl_advertencias, 2, " No se ha ingresado el numero de identidad del Usuario");
        }

        if (todoOk) {
            try {
                Direccion unaDireccion = unaHosteria.altaDireccion(unPais, unaProvincia, unaLocalidad, unDomicilio);
                Usuario unUsser = (Usuario) tbl_Usuario.getValueAt(tbl_Usuario.getSelectedRow(), 0);
                unaHosteria.modificarUsuario(unUsser, nomUsser, apeUsser, dniUsser, rol, password, nro_carnet, usserName, telefonoUsser, unaDireccion, st_civil, 
                        sexo, fecha_nac, creadoHora, e_mail);
                JOptionPane.showMessageDialog(this, " El Usuario " + nomUsser + " se ha modificado con exito");
//                GUIM.cargarTablaUsuarios(tbl_Usuario, unaHosteria.getUsuarios());
                unaHosteria.crearAuditoria("MOD", "Modificó el usuario: " + usserName + " (" + apeUsser + " " + nomUsser + ")", Acceso.getUsuario(), GUIM.getHoraActual());

                this.updateUI();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }
    }//GEN-LAST:event_btn_modificarUsuarioActionPerformed

    private void btn_eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUsuarioActionPerformed
        if (tbl_Usuario.getSelectedRow() != -1) {
            Usuario unUsuario = (Usuario) tbl_Usuario.getValueAt(tbl_Usuario.getSelectedRow(), 0);
            String name = unUsuario.getUsserame();
            String apeUsser = unUsuario.getApellido();
            String nombreUsser = unUsuario.getNombre();
            if (unUsuario.getUsserame().toUpperCase().equals(Acceso.getUsuario().toUpperCase())) {
                JOptionPane.showMessageDialog(this, "Usted no puede eliminar el usuario con el que esta trabajando actualmente");
            } else {

                int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el Usuario " + name, "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    try {
                        unaHosteria.bajaUsuario(unUsuario);
//                        GUIM.cargarTablaUsuarios(tbl_Usuario, unaHosteria.getUsuarios());
                        pnl_advertencias.removeAll();
                        GUIM.mostrarSms(pnl_advertencias, 0, "El usuario " + name + " se ha eliminado del Sistema");
                        limpiarCampos();
                        unaHosteria.crearAuditoria("DEL", "Eliminó el usuario: " + name + " (" + apeUsser + " " + nombreUsser + ")", Acceso.getUsuario(), GUIM.getHoraActual());
                    } catch (Exception e) {
                        GUIM.mostrarSms(pnl_advertencias, 2, e.getMessage());
                        limpiarCampos();
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_eliminarUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Gestor_de_Roles unGestor = new Gestor_de_Roles(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(unGestor);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_jButton1ActionPerformed
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DP_fecha_nacimiento;
    private javax.swing.JButton btn_eliminarUsuario;
    private javax.swing.JButton btn_modificarUsuario;
    private javax.swing.JButton btn_nuevoUsuario;
    private javax.swing.JComboBox cbx_estado_civil;
    private javax.swing.JComboBox cbx_rol;
    private javax.swing.JComboBox cbx_sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_tipoDNI;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private org.edisoncor.gui.panel.PanelCurves pnl_advertencias;
    private org.jdesktop.swingx.JXTaskPane pnl_desplegable;
    private javax.swing.JPanel pnl_direccion;
    private javax.swing.JTable tbl_Usuario;
    private javax.swing.JTextField txt_apellido_Usuario;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre_Usuario;
    private javax.swing.JTextField txt_nro_DNI;
    private javax.swing.JTextField txt_nro_carnet;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_ussername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Rol) {
            cbx_rol.removeAllItems();
            for (Rol unRol : unaHosteria.getRoles()) {
                cbx_rol.addItem(unRol);
            }
        } else if (arg instanceof Usuario) {
            GUIM.cargarTablaUsuarios(tbl_Usuario, unaHosteria.getUsuarios());
            limpiarCampos();
        }
    }
}
