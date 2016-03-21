package Interface.Hoteleria;

import Interface.Acceso;
import Interface.CajaPrincipal.Apertura_Caja;
import Interface.CajaPrincipal.Vista_Caja;
import Interface.GUIM;
import Interface.Personas.Vista_Visitante;
import Interface.Renderers.Pintar_Celdas;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Alquileres.Reserva_Salon;
import LN.Alquileres.Salon;
import LN.Alquileres.Tarifa_Salon;
import LN.Caja.Caja;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Vista_alquileresSalon extends javax.swing.JPanel {

    public static Hosteria unaHosteria;
    private Visitante huesped_alquiler;
    private Reserva_Salon seleccionada;
    private Hospedaje_Salon elHospedaje_Salon;

    public Vista_alquileresSalon(Hosteria unaHosteria) {
        Vista_alquileresSalon.unaHosteria = unaHosteria;
        initComponents();


        iniciarInterface();

        tbl_hospedajesSalon.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tbl_hospedajesSalon.getSelectedRowCount() > 0) {
                    Hospedaje_Salon unHospedaje = (Hospedaje_Salon) tbl_hospedajesSalon.getValueAt(tbl_hospedajesSalon.getSelectedRow(), 0);
//                Visitante unVisitante = unHospedaje.getUnVisitante();
                    List<Movimiento_Hospedaje> misMovimientos = unHospedaje.getMovimientos();

                    if (unHospedaje.getMovimientos() != null) {
                        GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, misMovimientos);
                    }
//                txt_Total.setText(String.valueOf((unHospedaje.getServicio().getPrecio()) * (calcularTotal(unHospedaje))));
//                txt_representante.setText(unVisitante.getApellido() + " " + unVisitante.getNombre());
                    cbx_tarifas_salon.setSelectedItem(unHospedaje.getServicio());

                    txt_descuentoHospedaje.setText(String.valueOf(unHospedaje.getDescuento()));
                    dp_entro.setDate(unHospedaje.getIngreso());
                    dp_salio.setDate(unHospedaje.getEgreso());

                }
            }
        });


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelRect3 = new org.edisoncor.gui.panel.PanelRect();
        btn_Lista_Reservas = new javax.swing.JButton();
        btn_Alquilar_Salon = new javax.swing.JButton();
        btn_checkOUT_Salon = new javax.swing.JButton();
        btn_debito_credito = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jXTaskPane2 = new org.jdesktop.swingx.JXTaskPane();
        jPanel3 = new javax.swing.JPanel();
        dp_diaIN = new org.jdesktop.swingx.JXDatePicker();
        dp_diaOUT = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Descuento = new javax.swing.JTextField();
        txt_Precio_Unitario = new javax.swing.JTextField();
        txt_Total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbx_tipo_alquiler = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_representante = new javax.swing.JTextField();
        btn_capturar = new javax.swing.JButton();
        buttonCircle3 = new org.edisoncor.gui.button.ButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        cbx_salon = new javax.swing.JComboBox();
        lbl_info1 = new javax.swing.JLabel();
        lbl_info2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hospedajesSalon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_descuentoHospedaje = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Cuentas_Huesped = new javax.swing.JTable();
        dp_entro = new org.jdesktop.swingx.JXDatePicker();
        dp_salio = new org.jdesktop.swingx.JXDatePicker();
        btn_editar = new javax.swing.JButton();
        chec_editar = new javax.swing.JCheckBox();
        cbx_tarifas_salon = new javax.swing.JComboBox();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Salón de Eventos");
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

        btn_Lista_Reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Historial.png"))); // NOI18N
        btn_Lista_Reservas.setText("<html><p> Historial</p><p>Alquileres</p></html>");
        btn_Lista_Reservas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Lista_Reservas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Lista_Reservas.setToolTipText("Muestra un resumen de los Alquileres hechos en el pasado");
        btn_Lista_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lista_ReservasActionPerformed(evt);
            }
        });

        btn_Alquilar_Salon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check.png"))); // NOI18N
        btn_Alquilar_Salon.setText("<html><p style=\"text-align:right\">    Alquilar</p><p style=\"text-align:right\">   Salon</p></html>");
        btn_Alquilar_Salon.setToolTipText("Almacena un nuevo Alquiler del Salón");
        btn_Alquilar_Salon.setActionCommand("");
        btn_Alquilar_Salon.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Alquilar_Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Alquilar_SalonActionPerformed(evt);
            }
        });

        btn_checkOUT_Salon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alpha Dista Icon 17.png"))); // NOI18N
        btn_checkOUT_Salon.setText("<html><p style=\"text-align:right\">Check</p><p style=\"text-align:right\">OUT</p></html>");
        btn_checkOUT_Salon.setToolTipText("Realiza el cierre del Alquiler Activo");
        btn_checkOUT_Salon.setActionCommand("");
        btn_checkOUT_Salon.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_checkOUT_Salon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_checkOUT_Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkOUT_SalonActionPerformed(evt);
            }
        });

        btn_debito_credito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency.png"))); // NOI18N
        btn_debito_credito.setText("<html><p>Crédito</p><p>Débito</p></html>");
        btn_debito_credito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_debito_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_debito_creditoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(0);
        jButton2.setMaximumSize(null);
        jButton2.setMinimumSize(null);

        javax.swing.GroupLayout panelRect3Layout = new javax.swing.GroupLayout(panelRect3);
        panelRect3.setLayout(panelRect3Layout);
        panelRect3Layout.setHorizontalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Lista_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Alquilar_Salon, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(btn_checkOUT_Salon)
                        .addComponent(btn_debito_credito)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRect3Layout.setVerticalGroup(
            panelRect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_Alquilar_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_checkOUT_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_debito_credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Lista_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jXTaskPane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salon.png"))); // NOI18N
        jXTaskPane2.setTitle("Alquilar el Salon de Eventos");
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(2);
        jXTaskPane2.getContentPane().setLayout(verticalLayout1);

        jPanel3.setBorder(null);

        dp_diaOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_diaOUTActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Ingreso:");

        jLabel6.setText("Fecha de Egreso");

        txt_Descuento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_DescuentoCaretUpdate(evt);
            }
        });
        txt_Descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DescuentoKeyTyped(evt);
            }
        });

        txt_Precio_Unitario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_Precio_UnitarioCaretUpdate(evt);
            }
        });

        jLabel7.setText("Precio Unitario:");

        jLabel8.setText("Descuento %:");

        jLabel9.setText("TOTAL:");

        cbx_tipo_alquiler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tipo_alquilerItemStateChanged(evt);
            }
        });

        jLabel10.setText("Tarifa");

        jLabel22.setText("A nombre de:");

        txt_representante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_representanteMouseClicked(evt);
            }
        });

        btn_capturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REAL OSX SYSTEM GRAB OLD.png"))); // NOI18N
        btn_capturar.setText("Campurar Reserva");
        btn_capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capturarActionPerformed(evt);
            }
        });

        buttonCircle3.setText("buttonCircle3");
        buttonCircle3.setPreferredSize(new java.awt.Dimension(23, 23));
        buttonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Salón Nro:");

        cbx_salon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_salonItemStateChanged(evt);
            }
        });

        lbl_info1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_info2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dp_diaOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dp_diaIN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21)
                                .addComponent(txt_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Descuento)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_tipo_alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_Total)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel1))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_info2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(lbl_info1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cbx_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbx_tipo_alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)))
                                .addGap(4, 4, 4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addComponent(lbl_info1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_info2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_diaIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dp_diaOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btn_capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jXTaskPane2.getContentPane().add(jPanel3);

        tbl_hospedajesSalon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salón", "Huesped"
            }
        ));
        jScrollPane1.setViewportView(tbl_hospedajesSalon);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del Hospedaje"));

        jLabel2.setText("Tipo de Servicio:");

        jLabel3.setText("Desde:");

        jLabel4.setText("Hasta:");

        jLabel11.setText("Descuento:");

        txt_descuentoHospedaje.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_descuentoHospedajeCaretUpdate(evt);
            }
        });

        tbl_Cuentas_Huesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Detalle", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_Cuentas_Huesped);

        dp_salio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_salioActionPerformed(evt);
            }
        });

        btn_editar.setText("Guardar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        chec_editar.setText("Modificar");
        chec_editar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chec_editarStateChanged(evt);
            }
        });
        chec_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chec_editarActionPerformed(evt);
            }
        });

        cbx_tarifas_salon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tarifas_salonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dp_entro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dp_salio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chec_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_tarifas_salon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_descuentoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_tarifas_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_descuentoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(dp_entro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_salio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar)
                    .addComponent(chec_editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXTaskPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTaskPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(panelRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_Lista_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lista_ReservasActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Historial_Salon unaLista = new Historial_Salon(unaHosteria);

        frame.getContentPane().removeAll();
        frame.getContentPane().add(unaLista);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

    }//GEN-LAST:event_btn_Lista_ReservasActionPerformed

    private void txt_Precio_UnitarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_Precio_UnitarioCaretUpdate
//        calcularDescuento();
    }//GEN-LAST:event_txt_Precio_UnitarioCaretUpdate

    private void btn_Alquilar_SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Alquilar_SalonActionPerformed

        Calendar hoy = Calendar.getInstance();
        Calendar fechaIngresada = Calendar.getInstance();
        fechaIngresada.setTime(dp_diaIN.getDate());

        if (hoy.get(Calendar.DAY_OF_YEAR) != fechaIngresada.get(Calendar.DAY_OF_YEAR)) {
            JOptionPane.showMessageDialog(this, "Usted no puede alquilar el Salon para una fecha que no sea el dia de hoy");
        } else {

            double descuento = 0.00;
            Date diaIn = dp_diaIN.getDate();
            Date diaOut = dp_diaOUT.getDate();

            Salon elSalon = (Salon) cbx_salon.getSelectedItem();

            Reserva_Salon siExistiera = unaHosteria.obtener_reservaSalon(elSalon, diaIn, diaOut, huesped_alquiler);
            if (siExistiera != null) {
                seleccionada = siExistiera;
            } else {
                seleccionada = null;
            }

            Tarifa_Salon unaTarifa_Salon = (Tarifa_Salon) cbx_tipo_alquiler.getSelectedItem();
            if (!txt_Descuento.getText().isEmpty()) {
                descuento = Double.valueOf(txt_Descuento.getText());
            }

            int cantidadDias = GUIM.diferenciasDeFechas(diaIn, diaOut);
            Double aPagar = Double.parseDouble(txt_Total.getText()) * cantidadDias;


            if (huesped_alquiler != null) {

                try {
                    if (seleccionada != null) {
                        unaHosteria.eliminar_reservaSalon(seleccionada);
                    }

                    Hospedaje_Salon alquilar_Salon = unaHosteria.checkIN_Salon(huesped_alquiler, diaOut, diaOut, elSalon, unaTarifa_Salon, descuento);
                    unaHosteria.crearAuditoria("ADD", "Agrego un Hospedaje a nombre de : " + huesped_alquiler.getApellido() + " " + huesped_alquiler.getNombre() + ", Salón " + elSalon.getNumero() + ", tipo " + unaTarifa_Salon.getTipo(), Acceso.getUsuario(), GUIM.getHoraActual());
                    unaHosteria.altaMovimiento_Hospedaje(aPagar, unaTarifa_Salon.getTipo(), alquilar_Salon.getIngreso(), alquilar_Salon, GUIM.getHoraActual());

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                iniciarInterface();
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un Visitante para realizar la operacion");
            }

        }
    }//GEN-LAST:event_btn_Alquilar_SalonActionPerformed

    private void btn_capturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capturarActionPerformed
        Calendar hoy = Calendar.getInstance();
        Calendar diaReserva = Calendar.getInstance();
        Salon elSalon = (Salon) cbx_salon.getSelectedItem();

        List<Reserva_Salon> Lista_del_dia = new LinkedList<>();
        for (Reserva_Salon unaReserva_Salon : unaHosteria.getReservas_Salon()) {
            diaReserva.setTime(unaReserva_Salon.getDesdeFecha());
            if (diaReserva.get(Calendar.DAY_OF_YEAR) == hoy.get(Calendar.DAY_OF_YEAR) && unaReserva_Salon.getElSalon().getNumero().equals(elSalon.getNumero())) {
                Lista_del_dia.add(unaReserva_Salon);
            }

        }

        if (!Lista_del_dia.isEmpty()) {
            JDialog frame;
            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
            } else {
                frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            }
            Capturar_RS unaLista = new Capturar_RS(Lista_del_dia);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(unaLista);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();

            if (unaLista.getUnaReserva_Salon() != null) {
                seleccionada = unaLista.getUnaReserva_Salon();
                huesped_alquiler = seleccionada.getUnVisitante();
                txt_representante.setText(huesped_alquiler.getApellido() + " " + huesped_alquiler.getNombre());
                dp_diaIN.setDate(seleccionada.getDesdeFecha());
                dp_diaOUT.setDate(seleccionada.getHastaFecha());
                cbx_tipo_alquiler.setSelectedItem(seleccionada.getTipo());
                txt_Precio_Unitario.setText(String.valueOf(seleccionada.getTipo().getPrecio()));
                txt_Total.setText(String.valueOf(seleccionada.getTipo().getPrecio() * seleccionada.getCantidad_de_Noches()));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existen reservas para el dia de la fecha");
        }



    }//GEN-LAST:event_btn_capturarActionPerformed

    private void btn_checkOUT_SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkOUT_SalonActionPerformed

        if (tbl_hospedajesSalon.getSelectedRowCount() != 0) {
            if (verificar_Caja()) {
                Hospedaje_Salon unHospedaje_Salon = (Hospedaje_Salon) tbl_hospedajesSalon.getValueAt(tbl_hospedajesSalon.getSelectedRow(), 0);
                if (unHospedaje_Salon != null) {
                    JDialog frame;
                    if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                        frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                    } else {
                        frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                    }
                    CheckOUT_Salon out = new CheckOUT_Salon(unaHosteria, unHospedaje_Salon);
                    frame.setContentPane(out);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.show();
                    iniciarInterface();

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alquiler de la tabla de Alquileres para continuar la operacion");
        }
    }//GEN-LAST:event_btn_checkOUT_SalonActionPerformed

    private void txt_DescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DescuentoKeyTyped
        if (!GUIM.esEntero(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_DescuentoKeyTyped

    private void dp_diaOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_diaOUTActionPerformed
        if (dp_diaOUT.getDate().before(dp_diaIN.getDate()) || dp_diaOUT.getDate().equals(dp_diaIN.getDate())) {
            JOptionPane.showMessageDialog(this, "La Fecha de Salida no puede ser anterior o igual a la Fecha de Entrada");
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dp_diaIN.getDate());
            calendario.add(Calendar.DAY_OF_MONTH, 1);
            dp_diaOUT.setDate(calendario.getTime());
        }
        calcularMontoaPagar();
    }//GEN-LAST:event_dp_diaOUTActionPerformed

    private void txt_representanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_representanteMouseClicked

        Visitante unVisitante = abrir_panel_captura_visitante();
        if (unVisitante != null) {
            txt_representante.setText(unVisitante.getApellido() + " " + unVisitante.getNombre());
            huesped_alquiler = unVisitante;
        }

    }//GEN-LAST:event_txt_representanteMouseClicked

    private void buttonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle3ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Parametros_Salon unPar = new Parametros_Salon(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(unPar);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_buttonCircle3ActionPerformed

    private void cbx_salonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_salonItemStateChanged
        if (cbx_salon.getSelectedIndex() != -1) {
            Salon elSalon = (Salon) cbx_salon.getSelectedItem();
            if (elSalon.isRefrigeracion()) {
                lbl_info2.setText("Dispone de Ambiente Climatizado");
            } else {
                lbl_info2.setText("No dispone de Ambiente Climatizado");
            }
            lbl_info1.setText("Capacidad máxima de " + String.valueOf(elSalon.getCapacidadMaxima()) + " personas");
        }
    }//GEN-LAST:event_cbx_salonItemStateChanged

    private void btn_debito_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_debito_creditoActionPerformed
        if (tbl_hospedajesSalon.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un hospedaje para continuar");

        } else {

            Hospedaje_Salon unHospedaje = (Hospedaje_Salon) tbl_hospedajesSalon.getValueAt(tbl_hospedajesSalon.getSelectedRow(), 0);

            JDialog frame;
            if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
            } else {
                frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            }
            Debito_Credito movimiento = new Debito_Credito(unaHosteria, unHospedaje);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(movimiento);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();

            List<Movimiento_Hospedaje> misMovimientos = unHospedaje.getMovimientos();
            if (unHospedaje.getMovimientos() != null) {
                GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, misMovimientos);
            }
        }

    }//GEN-LAST:event_btn_debito_creditoActionPerformed

    private void cbx_tipo_alquilerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tipo_alquilerItemStateChanged

        if (evt.getItem() instanceof Tarifa_Salon) {
            txt_Precio_Unitario.setText(String.valueOf(((Tarifa_Salon) evt.getItem()).getPrecio()));
        }
        calcularMontoaPagar();
    }//GEN-LAST:event_cbx_tipo_alquilerItemStateChanged

    private void txt_DescuentoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_DescuentoCaretUpdate

        if (!txt_Descuento.getText().isEmpty()) {
            if (cbx_tipo_alquiler.getItemCount() != 0) {
                calcularMontoaPagar();
            }

        }
    }//GEN-LAST:event_txt_DescuentoCaretUpdate

    private void chec_editarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chec_editarStateChanged
    }//GEN-LAST:event_chec_editarStateChanged

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Hospedaje_Salon unHospedaje_Salon = (Hospedaje_Salon) tbl_hospedajesSalon.getValueAt(tbl_hospedajesSalon.getSelectedRow(), 0);
        Date egreso = dp_salio.getDate();
        Tarifa_Salon unaTarifa = (Tarifa_Salon) cbx_tarifas_salon.getSelectedItem();
        Double descuento = Double.parseDouble(txt_Descuento.getText());
        unaHosteria.mod_HospedajeSalon(unHospedaje_Salon, unaTarifa, egreso, descuento);
        GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, unHospedaje_Salon.getMovimientos());
        chec_editar.setSelected(false);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void dp_salioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_salioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dp_salioActionPerformed

    private void cbx_tarifas_salonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tarifas_salonItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tarifas_salonItemStateChanged

    private void chec_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chec_editarActionPerformed
        if (chec_editar.isSelected()) {
            btn_editar.setEnabled(true);
            cbx_tarifas_salon.setEditable(true);
            dp_salio.setEditable(true);
            txt_Descuento.setEditable(true);

        } else {
            btn_editar.setEnabled(false);
            cbx_tarifas_salon.setEditable(false);
            dp_salio.setEditable(false);
            txt_Descuento.setEditable(false);
        }
    }//GEN-LAST:event_chec_editarActionPerformed

    private void txt_descuentoHospedajeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_descuentoHospedajeCaretUpdate
        if (!txt_Descuento.getText().isEmpty()) {
            if (Double.parseDouble(txt_Descuento.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "No puede ingresar un valor mayor al 100 %");
                txt_Descuento.setText("0.00");
            };
        }
    }//GEN-LAST:event_txt_descuentoHospedajeCaretUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alquilar_Salon;
    private javax.swing.JButton btn_Lista_Reservas;
    private javax.swing.JButton btn_capturar;
    private javax.swing.JButton btn_checkOUT_Salon;
    private javax.swing.JButton btn_debito_credito;
    private javax.swing.JButton btn_editar;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle3;
    private javax.swing.JComboBox cbx_salon;
    private javax.swing.JComboBox cbx_tarifas_salon;
    private javax.swing.JComboBox cbx_tipo_alquiler;
    private javax.swing.JCheckBox chec_editar;
    private org.jdesktop.swingx.JXDatePicker dp_diaIN;
    private org.jdesktop.swingx.JXDatePicker dp_diaOUT;
    private org.jdesktop.swingx.JXDatePicker dp_entro;
    private org.jdesktop.swingx.JXDatePicker dp_salio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane2;
    private javax.swing.JLabel lbl_info1;
    private javax.swing.JLabel lbl_info2;
    private org.edisoncor.gui.panel.PanelRect panelRect3;
    private javax.swing.JTable tbl_Cuentas_Huesped;
    private javax.swing.JTable tbl_hospedajesSalon;
    private javax.swing.JTextField txt_Descuento;
    private javax.swing.JTextField txt_Precio_Unitario;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_descuentoHospedaje;
    private javax.swing.JTextField txt_representante;
    // End of variables declaration//GEN-END:variables

    private void iniciarInterface() {

        if (Acceso.getLogueado() != null) {
            Object unUsuario = Acceso.getLogueado();


            if (unUsuario instanceof Usuario) {
                Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();
                if (!permisos.containsKey("resalq")) {
                    btn_Alquilar_Salon.setEnabled(false);
                } else {
                    btn_Alquilar_Salon.setEnabled(true);
                }

                if (!permisos.containsKey("pout")) {
                    btn_checkOUT_Salon.setEnabled(false);
                } else {
                    btn_checkOUT_Salon.setEnabled(true);
                }

                if (!permisos.containsKey("pim")) {
                    btn_debito_credito.setEnabled(false);
                } else {
                    btn_debito_credito.setEnabled(true);
                }
            }
        }


        jXTaskPane2.setCollapsed(true);
        this.tbl_hospedajesSalon.getColumn("Salón").setMaxWidth(50);

        Calendar calendario = Calendar.getInstance();

        dp_diaIN.setDate(calendario.getTime());
        dp_entro.setDate(calendario.getTime());
        calendario.add(Calendar.DAY_OF_MONTH, 1);
        dp_diaOUT.setDate(calendario.getTime());
        dp_salio.setDate(calendario.getTime());
        txt_Descuento.setText("0.0");


        cbx_salon.setModel(new DefaultComboBoxModel());
        cbx_tipo_alquiler.setModel(new DefaultComboBoxModel());

        for (Salon losSalones : unaHosteria.getSalones()) {
            cbx_salon.addItem(losSalones);
        }

        for (Tarifa_Salon unaTarifa_Salon : unaHosteria.getTarifas_Salon()) {
            cbx_tipo_alquiler.addItem(unaTarifa_Salon);
            cbx_tarifas_salon.addItem(unaTarifa_Salon);
        }
        cbx_tipo_alquiler.setSelectedIndex(0);
        cbx_tarifas_salon.setSelectedIndex(0);
        txt_Precio_Unitario.setText(String.valueOf(((Tarifa_Salon) cbx_tipo_alquiler.getSelectedItem()).getPrecio()));



        List<Hospedaje_Salon> activos = new LinkedList<>();
        for (Hospedaje_Salon unHospedaje_Salon : unaHosteria.getAlquileresSalon()) {
            if (!unHospedaje_Salon.isCheck_out()) {
                activos.add(unHospedaje_Salon);
            }
        }
        GUIM.cargarTablaAlquileres(tbl_hospedajesSalon, activos);
        GUIM.limpiar_tabla(tbl_Cuentas_Huesped);
        txt_descuentoHospedaje.setText("0.00");
        
        this.updateUI();

    }

//    public static void cargarGrilla(JTable unaTabla) {
//
//        if (!unaHosteria.getAlquileresSalon().isEmpty()) {
//            for (Hospedaje_Salon unHospedaje_Salon : unaHosteria.getAlquileresSalon()) {
//                if (!unHospedaje_Salon.isCheck_out()) {
//
//                    int cant = unHospedaje_Salon.getCantidad_dias();
//
//                    Calendar salio = Calendar.getInstance();
//                    salio.setTime(unHospedaje_Salon.getEgreso());
//                    int dia_salida = salio.get(Calendar.DAY_OF_MONTH);
//                    int mes_salida = salio.get(Calendar.MONTH);
//
//                    DefaultTableModel modelo = (DefaultTableModel) unaTabla.getModel();
//
//                    for (int j = modelo.getColumnCount() - 1; j > 1; j--) {
//                        if (modelo.getValueAt(0, j).equals((dia_salida - 1) + "/" + (mes_salida + 1))) {
//                            for (int c = j; c > (j - cant); c--) {
//
//                                if (c >= 1) {
//                                    unaTabla.setValueAt(unHospedaje_Salon, 1, c);
//                                    TableColumn tcol = unaTabla.getColumnModel().getColumn(c);
//                                    tcol.setCellRenderer(new Pintar_Celdas());
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        if (!unaHosteria.getReservas_Salon().isEmpty()) {
//            for (Reserva_Salon unaReserva : unaHosteria.getReservas_Salon()) {
//                int cant = unaReserva.getCantidad_de_Noches();
//
//                Calendar salio = Calendar.getInstance();
//                salio.setTime(unaReserva.getHastaFecha());
//                int dia_salida = salio.get(Calendar.DAY_OF_MONTH);
//                int mes_salida = salio.get(Calendar.MONTH);
//
//                DefaultTableModel modelo = (DefaultTableModel) unaTabla.getModel();
//
//                for (int j = modelo.getColumnCount() - 1; j > 1; j--) {
//                    if (modelo.getValueAt(0, j).equals((dia_salida - 1) + "/" + (mes_salida + 1))) {
//                        for (int c = j; c > (j - cant); c--) {
//
//                            if (c >= 1) {
//                                unaTabla.setValueAt(unaReserva, 1, c);
//                                TableColumn tcol = unaTabla.getColumnModel().getColumn(c);
//                                tcol.setCellRenderer(new Pintar_Celdas());
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }

    private Visitante abrir_panel_captura_visitante() {
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Vista_Visitante panel_captura_visitante = new Vista_Visitante(unaHosteria, null);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel_captura_visitante);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        if (panel_captura_visitante.getSelected_Visitante().getSelectedRowCount() != 0) {
            return (Visitante) panel_captura_visitante.getSelected_Visitante().getValueAt(panel_captura_visitante.getSelected_Visitante().getSelectedRow(), 0);
        } else {
            return null;
        }
    }

    private boolean verificar_Caja() {
        boolean ok = false;
        Caja unaCaja = unaHosteria.getCajaPrincipal();
        Vista_Caja unavista = new Vista_Caja(unaHosteria, unaCaja);

        if (unavista.loteVigente() != null) {
            if (unavista.loteVigente().isCerrado()) {
                int res = JOptionPane.showConfirmDialog(this, "Debe existir un Lote que no se haya cerrado al que pueda asignar el Check-OUT, debe inicializar un nuevo Lote para continuar la operacion",
                        "Advertencia", JOptionPane.YES_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                    Apertura_Caja apertura = new Apertura_Caja(unaCaja);
                    jf.getContentPane().removeAll();
                    jf.getContentPane().add(apertura);
                    jf.pack();
                    jf.setLocationRelativeTo(null);
                    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    jf.show();
                    ok = true;

                }
            } else {
                ok = true;
            }
        } else {
            int res = JOptionPane.showConfirmDialog(this, "Aun no existe ningun Lote al que pueda asignar el Check-OUT, debe inicializar un Lote para continuar la operacion",
                    "Advertencia", JOptionPane.YES_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);

                Apertura_Caja apertura = new Apertura_Caja(unaCaja);
                jf.getContentPane().removeAll();
                jf.getContentPane().add(apertura);
                jf.pack();
                jf.setLocationRelativeTo(null);
                jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jf.show();
                ok = true;

            }
        }
        return ok;

    }

    private void calcularMontoaPagar() {
        Double precioUnitario = ((Tarifa_Salon) cbx_tipo_alquiler.getSelectedItem()).getPrecio();
        Integer dias = GUIM.diferenciasDeFechas(dp_diaIN.getDate(), dp_diaOUT.getDate());
        Double descuentoUnitario = Double.parseDouble(txt_Descuento.getText());
        Double totalPrecio;
        if (dias == 0) {
            totalPrecio = precioUnitario - ((descuentoUnitario * precioUnitario) / 100);
        } else {
            totalPrecio = (precioUnitario - ((descuentoUnitario * precioUnitario) / 100)) * dias;
        }
        txt_Total.setText(String.valueOf(totalPrecio));


    }

    private int calcularTotal(Hospedaje_Salon unHospedaje) {
        Calendar entrada = Calendar.getInstance();
        Calendar salida = Calendar.getInstance();
        entrada.setTime(unHospedaje.getIngreso());
        salida.setTime(unHospedaje.getEgreso());
        int cantDias = salida.get(Calendar.DAY_OF_YEAR) - entrada.get(Calendar.DAY_OF_YEAR);
        if (cantDias == 0) {
            cantDias = 1;
        }
        return (cantDias);
    }
}
