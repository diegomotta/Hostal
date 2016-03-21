package Interface.Hoteleria;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Alquileres.Tarifa_Habitacion;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Afiliado;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Huespedes extends javax.swing.JPanel {

    private boolean sepermite;

    public Vista_Huespedes(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();
        carcar_Alquileres();

        for (Tarifa_Habitacion unTarifa : unaHosteria.getTarifas_Habitacion()) {
            cbx_Tarifas_Hab.addItem(unTarifa);
        }

        cbx_Tarifas_Hab.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (cbx_Tarifas_Hab.getSelectedIndex() != -1) {
                    Tarifa_Habitacion unaTarifa = (Tarifa_Habitacion) cbx_Tarifas_Hab.getSelectedItem();

                    switch (unaTarifa.getTipo()) {
                        case "Single":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Doble Matrimonial":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Doble Separada":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Matrimonial + 1":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Trible Separada":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Matrimonial + 2":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Cuadruble Separada":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));
                        case "Sin Cargo":
                            txt_Precio_Unitario.setText(String.valueOf(unaTarifa.getPrecio()));

                    }
                }
            }
        });

        tbl_hospedajes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
//                if (tbl_hospedajes.getRowCount() != 0) {
                if (tbl_hospedajes.getSelectedRowCount() > 0) {

                    Hospedaje_Habitacion unHospedaje = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
                    Visitante unVisitante = unHospedaje.getUnVisitante();
                    List<Movimiento_Hospedaje> misMovimientos = unHospedaje.getMovimientos();

                    if (unHospedaje.getMovimientos() != null) {
                        GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, misMovimientos);
                    }

                    txt_Total.setText(String.valueOf((unHospedaje.getUnaTarifa_Habitacion().getPrecio()) * (calcularTotal(unHospedaje))));

                    txt_apellido_vis.setText(unVisitante.getApellido());
                    txt_Nombre_Vis.setText(unVisitante.getNombre());
                    txt_ocupacion.setText(unVisitante.getOcupacion());
                    txt_motivoVis.setText(unVisitante.getMotivo_visita());
                    txt_telefono.setText(unVisitante.getTelefono());
                    txt_EstadoCivil.setText(unVisitante.getEstado_civil().toString());
                    txt_Email_Vis.setText(unVisitante.getE_mail());
                    txt_sexoVis.setText(unVisitante.getSexo().toString());
                    txt_Pais_vis.setText(unVisitante.getDireccion().getPais().toString());
                    txt_Porvincia_Vis.setText(unVisitante.getDireccion().getProvincia().toString());
                    txt_Localidad_Vis.setText(unVisitante.getDireccion().getLocalidad().toString());
                    txt_Domicilio_Vis.setText(unVisitante.getDireccion().getDomicilio());
                    txt_CondAf_Vis.setText(unVisitante.getCondicion_af());
                    txt_Documento_Vis.setText(unVisitante.getDni());
                    if (unVisitante.getFnac() != null) {
                        txt_FechaNac_Vis.setText(new SimpleDateFormat("dd/MM/yyyy").format(unVisitante.getFnac()));
                    } else {
                        txt_FechaNac_Vis.setText("Sin Detalle");
                    }
                    txt_representante.setText(unVisitante.getApellido() + " " + unVisitante.getNombre());
                    if (unVisitante instanceof Afiliado) {
                        txt_nro_carnet.setText(((Afiliado) unVisitante).getNumero_carnet());
                    } else {
                        txt_nro_carnet.setText("No posee dicho Número");
                    }
                    txt_Descuento.setText(String.valueOf(unHospedaje.getDescuento()));
                    txt_cantidad_dias.setText(String.valueOf(GUIM.diferenciasDeFechas(unHospedaje.getIngreso(), unHospedaje.getEgreso())));
                    dp_diaIN.setDate(unHospedaje.getIngreso());
                    dp_diaOUT.setDate(unHospedaje.getEgreso());

                    for (int i = 0; i < cbx_Tarifas_Hab.getItemCount() - 1; i++) {

                        if (unHospedaje.getUnaTarifa_Habitacion().getTipo().equals(((Tarifa_Habitacion) cbx_Tarifas_Hab.getItemAt(i)).getTipo())) {
                            cbx_Tarifas_Hab.setSelectedIndex(i);
                            break;
                        }
                    }

                }
            }
//            }
        });

        txt_Descuento.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent ce) {
                calcularDescuento();
            }
        });

        this.updateUI();
    }

    private void carcar_Alquileres() {

        if (Acceso.getLogueado() != null) {
            Object unUsuario = Acceso.getLogueado();
            if (unUsuario instanceof Usuario) {
                Map<String, Permisos> permisos = ((Usuario) unUsuario).getRol().getPermisos();

                if (!permisos.containsKey("pout")) {
                    btn_checkOUT.setEnabled(false);
                    sepermite = false;
                } else {
                    btn_checkOUT.setEnabled(true);
                    sepermite = true;
                }

                if (!permisos.containsKey("pim")) {
                    btn_debcred.setEnabled(false);
                } else {
                    btn_debcred.setEnabled(true);
                }
            }
        }

        List<Hospedaje_Habitacion> actuales = new LinkedList<>();
        for (Hospedaje_Habitacion unHospedaje : unaHosteria.getAlquileresHabitacion()) {
            if (!unHospedaje.isCheck_out()) {
                actuales.add(unHospedaje);
            }
        }
        if (actuales.isEmpty()) {
            btn_checkOUT.setEnabled(false);
            btn_debcred.setEnabled(false);
        } else {
            if (sepermite) {
                btn_checkOUT.setEnabled(true);
                btn_debcred.setEnabled(true);

            }
            GUIM.cargarTablaHospedajes(tbl_hospedajes, actuales);
        }
        this.updateUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_hospedajes = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        dp_diaIN = new org.jdesktop.swingx.JXDatePicker();
        dp_diaOUT = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_horaIN = new javax.swing.JLabel();
        txt_Precio_Unitario = new javax.swing.JTextField();
        txt_Descuento = new javax.swing.JTextField();
        txt_Total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_Tarifas_Hab = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_representante = new javax.swing.JTextField();
        txt_cantidad_dias = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        chec_editar = new javax.swing.JCheckBox();
        btn_editar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Cuentas_Huesped = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Nombre_Vis = new javax.swing.JTextField();
        txt_apellido_vis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_Email_Vis = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_ocupacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_sexoVis = new javax.swing.JTextField();
        txt_EstadoCivil = new javax.swing.JTextField();
        txt_motivoVis = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbl_tipoDNI = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_CondAf_Vis = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_nro_carnet = new javax.swing.JTextField();
        txt_Documento_Vis = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_FechaNac_Vis = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_Pais_vis = new javax.swing.JTextField();
        txt_Porvincia_Vis = new javax.swing.JTextField();
        txt_Localidad_Vis = new javax.swing.JTextField();
        txt_Domicilio_Vis = new javax.swing.JTextField();
        btn_ferFicha = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_checkOUT = new javax.swing.JButton();
        btn_nuevoIN = new javax.swing.JButton();
        btn_debcred = new javax.swing.JButton();
        btn_cambiarHabitacion = new javax.swing.JButton();
        btn_Lista_Reservas = new javax.swing.JButton();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        txt_Buscar_Huesped = new org.jdesktop.swingx.JXSearchField();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        tbl_hospedajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hab.", "Huesped"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_hospedajes);

        jPanel2.add(jScrollPane2);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de Alojamiento"));

        dp_diaIN.setFocusable(false);
        dp_diaIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_diaINActionPerformed(evt);
            }
        });
        dp_diaIN.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                dp_diaINCaretPositionChanged(evt);
            }
        });

        dp_diaOUT.setFocusable(false);
        dp_diaOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_diaOUTActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Ingreso:");

        jLabel2.setText("Fecha de Egreso");

        lbl_horaIN.setBackground(new java.awt.Color(153, 204, 0));

        txt_Precio_Unitario.setFocusable(false);
        txt_Precio_Unitario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_Precio_UnitarioCaretUpdate(evt);
            }
        });

        txt_Descuento.setFocusable(false);
        txt_Descuento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_DescuentoCaretUpdate(evt);
            }
        });

        txt_Total.setFocusable(false);

        jLabel3.setText("Precio Unitario:");

        jLabel4.setText("Descuento %:");

        jLabel5.setText("TOTAL:");

        cbx_Tarifas_Hab.setFocusable(false);

        jLabel6.setText("Tipo de Servicio:");

        jLabel22.setText("Representante:");

        txt_representante.setEditable(false);
        txt_representante.setFocusable(false);

        txt_cantidad_dias.setFocusable(false);

        jLabel23.setText("Cantidad de días:");

        chec_editar.setText("Modificar");
        chec_editar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chec_editarStateChanged(evt);
            }
        });

        btn_editar.setText("Guardar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dp_diaOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_horaIN, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dp_diaIN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Descuento)
                                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cantidad_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Precio_Unitario)
                            .addComponent(cbx_Tarifas_Hab, 0, 186, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chec_editar)
                        .addGap(3, 3, 3)
                        .addComponent(btn_editar)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_representante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dp_diaIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbl_horaIN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(dp_diaOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_Tarifas_Hab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chec_editar)
                            .addComponent(btn_editar))
                        .addGap(18, 18, 18))))
        );

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

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
        jScrollPane3.setViewportView(tbl_Cuentas_Huesped);

        jPanel3.add(jScrollPane3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hospedaje", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png")), jPanel5); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jPanel6.setPreferredSize(new java.awt.Dimension(615, 238));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel9.setText("Sexo:");

        txt_Nombre_Vis.setEditable(false);

        txt_apellido_vis.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel10.setText("Telefono:");

        txt_telefono.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel12.setText("E-mail:");

        txt_Email_Vis.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel18.setText("Ocupacion:");

        txt_ocupacion.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel11.setText("Estado Civil:");

        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel15.setText("Motivo de Visita:");

        txt_sexoVis.setEditable(false);

        txt_EstadoCivil.setEditable(false);

        txt_motivoVis.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Email_Vis))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefono)
                            .addComponent(txt_ocupacion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_motivoVis))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellido_vis, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EstadoCivil)
                            .addComponent(txt_sexoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Nombre_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_apellido_vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_motivoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_Email_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_sexoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentación"));

        lbl_tipoDNI.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        lbl_tipoDNI.setText("Identificacion:");

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel14.setText("Condicion de Afiliacion:");

        txt_CondAf_Vis.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel17.setText("Nro. de Carnet:");

        txt_nro_carnet.setEditable(false);

        txt_Documento_Vis.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel13.setText("Fecha de Nacimiento:");

        txt_FechaNac_Vis.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lbl_tipoDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Documento_Vis))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CondAf_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_FechaNac_Vis, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nro_carnet)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_CondAf_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_nro_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tipoDNI)
                        .addComponent(txt_Documento_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txt_FechaNac_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Procedencia"));

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel16.setText("Domicilio:");

        jLabel19.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel19.setText("País:");

        jLabel20.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel20.setText("Provincia:");

        jLabel21.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel21.setText("Localidad");

        txt_Pais_vis.setEditable(false);

        txt_Porvincia_Vis.setEditable(false);

        txt_Localidad_Vis.setEditable(false);

        txt_Domicilio_Vis.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pais_vis, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Localidad_Vis)))
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Porvincia_Vis, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txt_Domicilio_Vis))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_Pais_vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_Porvincia_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_Localidad_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_Domicilio_Vis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ferFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        btn_ferFicha.setText("Imprimir Ficha Personal");
        btn_ferFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ferFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ferFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ferFicha)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información del Huesped", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Havell.png")), jPanel4); // NOI18N

        lbl_titulo.setEditable(false);
        lbl_titulo.setBackground(new java.awt.Color(153, 153, 153));
        lbl_titulo.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Huespedes");
        lbl_titulo.setFocusable(false);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_checkOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alpha Dista Icon 17.png"))); // NOI18N
        btn_checkOUT.setText("<html><p>Check</p><p>OUT</p></html>");
        btn_checkOUT.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_checkOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkOUTActionPerformed(evt);
            }
        });

        btn_nuevoIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_nuevoIN.setText("Check-IN");
        btn_nuevoIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoINActionPerformed(evt);
            }
        });

        btn_debcred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency.png"))); // NOI18N
        btn_debcred.setText("<html><p>Débito</p><p>Crédito</p></html>");
        btn_debcred.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_debcred.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_debcred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_debcredActionPerformed(evt);
            }
        });

        btn_cambiarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refresh.png"))); // NOI18N
        btn_cambiarHabitacion.setText("<html><p>Cambiar</p><p>Habitación</p></html>");
        btn_cambiarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarHabitacionActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_checkOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_nuevoIN, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_debcred)
                    .addComponent(btn_cambiarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_Lista_Reservas))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_nuevoIN)
                .addGap(18, 18, 18)
                .addComponent(btn_checkOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_debcred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cambiarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Lista_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXTaskPane1.setCollapsed(true);
        jXTaskPane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        jXTaskPane1.setTitle("Buscar Huesped");

        txt_Buscar_Huesped.setPrompt("Nombre del Huseped");
        txt_Buscar_Huesped.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_Buscar_HuespedCaretUpdate(evt);
            }
        });
        jXTaskPane1.getContentPane().add(txt_Buscar_Huesped);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jXTaskPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(lbl_titulo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRect1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXTaskPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoINActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Check_IN out = new Check_IN(unaHosteria, null);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(out);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

        carcar_Alquileres();
    }//GEN-LAST:event_btn_nuevoINActionPerformed

    private void btn_checkOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkOUTActionPerformed
        if (tbl_hospedajes.getSelectedRowCount() != 0) {
            Hospedaje_Habitacion unHospedaje = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
            boolean ok = unHospedaje.verSalida(unHospedaje);
            if (ok) {
                JDialog frame;
                if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                    frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                } else {
                    frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                }
                Check_OUT out = new Check_OUT(unaHosteria, unHospedaje);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(out);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.show();
            } else {
                int res = JOptionPane.showConfirmDialog(this, "El Huesped se está retirando antes de la fecha prevista, ¿Desea retirar los cargos correspondientes a los dias posteriores?",
                        "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    unHospedaje.corregirMonto(unHospedaje);
                    GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, unHospedaje.getMovimientos());
                } else {
                    JDialog frame;
                    if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                        frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                    } else {
                        frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                    }
                    Check_OUT out = new Check_OUT(unaHosteria, unHospedaje);
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(out);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.show();
                }
            }
            GUIM.limpiar_tabla(tbl_Cuentas_Huesped);
            carcar_Alquileres();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Hospedaje para realizar ésta operación");
        }
        carcar_Alquileres();
        GUIM.limpiar_tabla(tbl_Cuentas_Huesped);


    }//GEN-LAST:event_btn_checkOUTActionPerformed

    private void txt_Precio_UnitarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_Precio_UnitarioCaretUpdate
        calcularDescuento();
    }//GEN-LAST:event_txt_Precio_UnitarioCaretUpdate

    private void btn_debcredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_debcredActionPerformed
        Hospedaje_Habitacion unHospedaje = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);

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

    }//GEN-LAST:event_btn_debcredActionPerformed

    private void txt_Buscar_HuespedCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_Buscar_HuespedCaretUpdate

        List<Hospedaje_Habitacion> losHospedajes = unaHosteria.getAlquileresHabitacion();
        List<Hospedaje_Habitacion> filtro = new LinkedList<>();
        if (!txt_Buscar_Huesped.getText().isEmpty()) {
            for (Hospedaje_Habitacion unHospedaje : losHospedajes) {
                if (unHospedaje.getUnVisitante().getNombre().toUpperCase().startsWith(txt_Buscar_Huesped.getText().toUpperCase())) {
                    filtro.add(unHospedaje);
                }
                GUIM.cargarTablaHospedajes(tbl_hospedajes, filtro);
            }
        } else {
            GUIM.cargarTablaHospedajes(tbl_hospedajes, unaHosteria.getAlquileresHabitacion());
        }

    }//GEN-LAST:event_txt_Buscar_HuespedCaretUpdate

    private void btn_cambiarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarHabitacionActionPerformed
        JDialog jf;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        List<Habitacion> disponibles = unaHosteria.getHabitaciones();
        Habitaciones_Disponibles habitaciones = new Habitaciones_Disponibles(disponibles);
        jf.getContentPane().removeAll();
        jf.getContentPane().add(habitaciones);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.show();




        if ((Habitacion) habitaciones.getHabitacionSeleccionada() != null) {

            Habitacion unaHabitacion = (Habitacion) habitaciones.getHabitacionSeleccionada();
            Hospedaje_Habitacion unHospedaje_Habitacion = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
            try {
                unHospedaje_Habitacion.cambiarHabitacion(unaHabitacion, unHospedaje_Habitacion);
                JOptionPane.showMessageDialog(this, "La transferencia se ha realizado con Exito");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            carcar_Alquileres();


        }


    }//GEN-LAST:event_btn_cambiarHabitacionActionPerformed

    private void dp_diaINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_diaINActionPerformed
    }//GEN-LAST:event_dp_diaINActionPerformed

    private void dp_diaINCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dp_diaINCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dp_diaINCaretPositionChanged

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Hospedaje_Habitacion unHospedaje_Habitacion = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
        Date egreso = dp_diaOUT.getDate();
        Tarifa_Habitacion unaTarifa = (Tarifa_Habitacion) cbx_Tarifas_Hab.getSelectedItem();
        Double descuento = Double.parseDouble(txt_Descuento.getText());
        unaHosteria.mod_HospedajeHabitacion(unHospedaje_Habitacion, unaTarifa, egreso, descuento);
        GUIM.cargarCuentasHuesped(tbl_Cuentas_Huesped, unHospedaje_Habitacion.getMovimientos());
        chec_editar.setSelected(false);

    }//GEN-LAST:event_btn_editarActionPerformed

    private void chec_editarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chec_editarStateChanged
        if (chec_editar.isSelected()) {
            btn_editar.setEnabled(true);
            cbx_Tarifas_Hab.setFocusable(true);
            dp_diaOUT.setFocusable(true);
            txt_Descuento.setFocusable(true);

        } else {
            btn_editar.setEnabled(false);
            cbx_Tarifas_Hab.setFocusable(false);
            dp_diaOUT.setFocusable(false);
            txt_Descuento.setFocusable(false);
        }
    }//GEN-LAST:event_chec_editarStateChanged

    private void dp_diaOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_diaOUTActionPerformed
        if (dp_diaOUT.getDate().before(dp_diaIN.getDate()) || dp_diaOUT.getDate().equals(dp_diaIN.getDate())) {
            JOptionPane.showMessageDialog(this, "La Fecha de Salida no puede ser anterior o igual a la Fecha de Entrada");
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dp_diaIN.getDate());
            calendario.add(Calendar.DAY_OF_MONTH, 1);
            dp_diaOUT.setDate(calendario.getTime());
        }
    }//GEN-LAST:event_dp_diaOUTActionPerformed

    private void btn_ferFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ferFichaActionPerformed


        HashMap<String, Object> parametros = new HashMap();
        parametros.clear();
        parametros.put("logo", unaHosteria.getLogo());
        parametros.put("pa", unaHosteria.getMiPais());
        parametros.put("pcia", unaHosteria.getMiProvincia());
        parametros.put("ciud", unaHosteria.getMiCiudad());
        parametros.put("calle", unaHosteria.getMiCalle());
        parametros.put("nomb", unaHosteria.getNombre());

        List<Visitante> terceros = new LinkedList<>();
        if (tbl_hospedajes.getSelectedRowCount() >= 1) {
            try {
                Hospedaje_Habitacion unHospedaje_Habitacion = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
                Visitante unVisitante = unHospedaje_Habitacion.getUnVisitante();

                terceros.add(unVisitante);
                JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/unVis.jrxml");
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(terceros));
                JasperViewer jviewer = new JasperViewer(jasperPrint, false);
                jviewer.show();
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un visitante de la tabla");
        }


    }//GEN-LAST:event_btn_ferFichaActionPerformed

    private void txt_DescuentoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_DescuentoCaretUpdate
        if (!txt_Descuento.getText().isEmpty()) {
            if (Double.parseDouble(txt_Descuento.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "No puede ingresar un valor mayor al 100 %");
                txt_Descuento.setText("0.00");
            }
        }
    }//GEN-LAST:event_txt_DescuentoCaretUpdate

    private void btn_Lista_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lista_ReservasActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Historial_Habitaciones unaLista = new Historial_Habitaciones(unaHosteria);

        frame.getContentPane().removeAll();
        frame.getContentPane().add(unaLista);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_btn_Lista_ReservasActionPerformed
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Lista_Reservas;
    private javax.swing.JButton btn_cambiarHabitacion;
    private javax.swing.JButton btn_checkOUT;
    private javax.swing.JButton btn_debcred;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_ferFicha;
    private javax.swing.JButton btn_nuevoIN;
    private javax.swing.JComboBox cbx_Tarifas_Hab;
    private javax.swing.JCheckBox chec_editar;
    private org.jdesktop.swingx.JXDatePicker dp_diaIN;
    private org.jdesktop.swingx.JXDatePicker dp_diaOUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private javax.swing.JLabel lbl_horaIN;
    private javax.swing.JLabel lbl_tipoDNI;
    private javax.swing.JTextField lbl_titulo;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tbl_Cuentas_Huesped;
    private javax.swing.JTable tbl_hospedajes;
    private org.jdesktop.swingx.JXSearchField txt_Buscar_Huesped;
    private javax.swing.JTextField txt_CondAf_Vis;
    private javax.swing.JTextField txt_Descuento;
    private javax.swing.JTextField txt_Documento_Vis;
    private javax.swing.JTextField txt_Domicilio_Vis;
    private javax.swing.JTextField txt_Email_Vis;
    private javax.swing.JTextField txt_EstadoCivil;
    private javax.swing.JTextField txt_FechaNac_Vis;
    private javax.swing.JTextField txt_Localidad_Vis;
    private javax.swing.JTextField txt_Nombre_Vis;
    private javax.swing.JTextField txt_Pais_vis;
    private javax.swing.JTextField txt_Porvincia_Vis;
    private javax.swing.JTextField txt_Precio_Unitario;
    private javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_apellido_vis;
    private javax.swing.JTextField txt_cantidad_dias;
    private javax.swing.JTextField txt_motivoVis;
    private javax.swing.JTextField txt_nro_carnet;
    private javax.swing.JTextField txt_ocupacion;
    private javax.swing.JTextField txt_representante;
    private javax.swing.JTextField txt_sexoVis;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private int calcularTotal(Hospedaje_Habitacion unHospedaje) {
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

    private void calcularDescuento() {
        Hospedaje_Habitacion unHospedaje = (Hospedaje_Habitacion) tbl_hospedajes.getValueAt(tbl_hospedajes.getSelectedRow(), 1);
        if (!txt_Precio_Unitario.getText().isEmpty()) {
            Double precioUnitario = Double.parseDouble(txt_Precio_Unitario.getText());
            if (txt_Descuento.getText().isEmpty()) {
                txt_Total.setText(String.valueOf((unHospedaje.getUnaTarifa_Habitacion().getPrecio()) * (calcularTotal(unHospedaje))));
                txt_Total.setText(String.valueOf(precioUnitario));
            } else {
                Double descuentoUnitario = Double.parseDouble(txt_Descuento.getText());
                Double totalPrecio = precioUnitario - ((descuentoUnitario * precioUnitario) / 100);
                txt_Total.setText(String.valueOf(totalPrecio));
                txt_Total.setText(String.valueOf((totalPrecio) * (calcularTotal(unHospedaje))));
            }
        }
    }

    public JTable getTabla_Huespedes() {
        return this.tbl_hospedajes;
    }
}
