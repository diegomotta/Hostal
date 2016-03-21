package Interface.Hoteleria;

import Interface.CajaPrincipal.Cupones_Tarjetas;
import Interface.Acceso;
import Interface.CajaPrincipal.Apertura_Caja;
import Interface.CajaPrincipal.Cierre_Caja;
import Interface.GUIM;
import Interface.Personas.Vista_Visitante;
import LN.Alquileres.Pileta;
import LN.Alquileres.Registro_Pileta;
import LN.Caja.Caja;
import LN.Caja.Cupon;
import LN.Caja.Lote;
import LN.Persona.Visitante.Afiliado;
import LN.Persona.Visitante.Visitante;
import LN.Varios.Hosteria;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Vista_Pileta extends javax.swing.JPanel implements Observer {

    private Lote unLote;
    private Caja unCaja;
    private Hosteria unaHosteria;
    private static Visitante unAfiliado;
    private Pileta unaPileta;
    private Integer cantitidadInvitados;
    private Double precio;

    public Vista_Pileta(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        this.unaPileta = unaHosteria.getPileta();
        unaPileta.addObserver(this);
        this.cantitidadInvitados = unaPileta.getCantidad_invitados();
        this.precio = unaPileta.getPrecio_invitado();

        unaPileta.addObserver(this);
        initComponents();
        iniciarInterface();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_Afiliado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinner_afiliados = new javax.swing.JSpinner();
        spinner_personas = new javax.swing.JSpinner();
        buttonCircle2 = new org.edisoncor.gui.button.ButtonCircle();
        jLabel4 = new javax.swing.JLabel();
        txt_total_a_pagar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_excedentes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbx_formaPago = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_comprobante = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_abrirLote = new javax.swing.JButton();
        btn_modificar_parametros = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_precio_invitado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_total_bañeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        chec_todos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registros_pileta = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Pileta de Natación");
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Registro"));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("Encargado:");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Total de Afiliados:");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Total de Personas:");

        spinner_afiliados.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinner_afiliados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinner_afiliados.setOpaque(true);
        spinner_afiliados.setVerifyInputWhenFocusTarget(false);
        spinner_afiliados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_afiliadosStateChanged(evt);
            }
        });
        spinner_afiliados.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                spinner_afiliadosComponentAdded(evt);
            }
        });

        spinner_personas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinner_personas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_personasStateChanged(evt);
            }
        });

        buttonCircle2.setText("buttonCircle1");
        buttonCircle2.setToolTipText("Buscar un Afiliado");
        buttonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Execentes");

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Monto a Pagar:");

        txt_excedentes.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_excedentesCaretUpdate(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel8.setText("Forma de Pago:");

        cbx_formaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta" }));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel9.setText("Nro. Comprobante Interno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_excedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_formaPago, 0, 229, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_comprobante))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Afiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinner_personas)
                            .addComponent(spinner_afiliados, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Afiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(spinner_afiliados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(spinner_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_excedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)))
        );

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_abrirLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_abrirLote.setText("Registrar");
        btn_abrirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirLoteActionPerformed(evt);
            }
        });

        btn_modificar_parametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificar_parametros.setText("<html><p>Modificar</p><p>Parámetros</p></html>");
        btn_modificar_parametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_parametrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_modificar_parametros, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_abrirLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_abrirLote)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Información de Estado"));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Costo por invitado excedente:");

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Total de bañeros registrados:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRINTER.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chec_todos.setText("Ver Todos");
        chec_todos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chec_todosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio_invitado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_total_bañeros, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chec_todos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio_invitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_total_bañeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(chec_todos)))
        );

        tbl_registros_pileta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encargado de Grupo", "Cantidad de Personas", "Monto Adjudicado", "Fecha y Hora"
            }
        ));
        jScrollPane1.setViewportView(tbl_registros_pileta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buttonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle2ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Vista_Visitante panel_captura_visitante = new Vista_Visitante(unaHosteria, unAfiliado);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel_captura_visitante);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

        if (panel_captura_visitante.getSelected_Visitante().getSelectedRowCount() != 0) {
            Visitante unVisitante = (Visitante) panel_captura_visitante.getSelected_Visitante().getValueAt(panel_captura_visitante.getSelected_Visitante().getSelectedRow(), 0);
            unAfiliado = unVisitante;
            if (unAfiliado != null) {
                txt_Afiliado.setText(unAfiliado.getApellido() + " " + unAfiliado.getNombre());
            }
        }
    }//GEN-LAST:event_buttonCircle2ActionPerformed

    private void btn_abrirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirLoteActionPerformed
        unLote = unaHosteria.getCajaPrincipal().obtenerLote_Vigente();

        if (unLote != null) {
            if (!unLote.isCerrado()) {
                if (es_delDia(unLote)) {

                    if (unAfiliado instanceof Afiliado) {
                        try {
                            int cantidad_afiliado = Integer.parseInt(String.valueOf(spinner_afiliados.getValue()));
                            int cantidad_personas = Integer.parseInt(String.valueOf(spinner_personas.getValue()));
                            double monto_entradas = Double.valueOf(txt_total_a_pagar.getText());
                            Date fecha_registro = new Date();
                            Integer comprobante = Integer.parseInt(txt_comprobante.getText());

                            if (!unaHosteria.existeComprobante(comprobante)) {
                                if (monto_entradas == 0.0) {
                                    unaPileta.registrar_Entrada((Afiliado) unAfiliado, cantidad_afiliado, cantidad_personas, monto_entradas, fecha_registro, false, null);
                                    unaHosteria.crearAuditoria("ADD", "Agrego un Registro de Entrada a nombre de: " + ((Afiliado) unAfiliado).getApellido() + " " + ((Afiliado) unAfiliado).getNombre() + " a la Pileta de Natación", Acceso.getUsuario(), GUIM.getHoraActual());
                                } else {

                                    if (cbx_formaPago.getSelectedIndex() == 1) {
                                        JDialog jf;
                                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                                        } else {
                                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                                        }
                                        Cupones_Tarjetas cupones = new Cupones_Tarjetas(unaHosteria.getCajaPrincipal(), monto_entradas, unAfiliado);
                                        jf.getContentPane().removeAll();
                                        jf.getContentPane().add(cupones);
                                        jf.pack();
                                        jf.setLocationRelativeTo(null);
                                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        jf.show();

                                        if (cupones.getNuevoCupon() != null) {
                                            Cupon unCupon = cupones.getNuevoCupon();

                                            unaPileta.registrar_Entrada((Afiliado) unAfiliado, cantidad_afiliado, cantidad_personas, monto_entradas, fecha_registro, true, unCupon);
                                            unLote.altaMovimiento(fecha_registro, GUIM.getHoraActual(), monto_entradas, "Ingreso", "Entrada a la Pileta de Natación (Cupón número " + unCupon.getNumeroCupon() + ")", "Tarjeta", comprobante);
                                            unaHosteria.crearAuditoria("ADD", "Agrego un Registro de Entrada a nombre de: " + ((Afiliado) unAfiliado).getApellido() + " " + ((Afiliado) unAfiliado).getNombre() + " a la Pileta de Natación", Acceso.getUsuario(), GUIM.getHoraActual());
                                            unaHosteria.agregarComprobante(comprobante);
                                            unAfiliado = null;

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Usted no ha registrado el Cupón correctamente, por favor vuelva a intentarlo");
                                        }
                                    } else if (cbx_formaPago.getSelectedIndex() == 0) {


                                        try {

                                            unaPileta.registrar_Entrada((Afiliado) unAfiliado, cantidad_afiliado, cantidad_personas, monto_entradas, fecha_registro, false, null);
                                            unLote.altaMovimiento(fecha_registro, GUIM.getHoraActual(), monto_entradas, "Ingreso", "Entrada a la Pileta de Natación", "Efectivo", comprobante);
                                            unaHosteria.crearAuditoria("ADD", "Agrego un Registro de Entrada a nombre de: " + ((Afiliado) unAfiliado).getApellido() + " " + ((Afiliado) unAfiliado).getNombre() + " a la Pileta de Natación", Acceso.getUsuario(), GUIM.getHoraActual());
                                            unaHosteria.agregarComprobante(comprobante);
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(this, e.getMessage());
                                        }



                                    }
                                }

                            } else {

                                JOptionPane.showMessageDialog(this, "El número de comprobante ingresado ya existe");
                            }


                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage());


                        }

                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "El representante de grupo debe ser un Afiliado");
                    }


                } else {
                    int res = JOptionPane.showConfirmDialog(this, "Aún no se ha realizado el cierre de caja de las ultimas actividades, ¿desea cerrarlo?",
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        JDialog jf;
                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                        } else {
                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                        }
                        Cierre_Caja cierre = new Cierre_Caja(unaHosteria.getCajaPrincipal(), unLote);
                        jf.getContentPane().removeAll();
                        jf.getContentPane().add(cierre);
                        jf.pack();
                        jf.setLocationRelativeTo(null);
                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jf.show();
                    }
                }
            } else {
                if (es_delDia(unLote)) {
                    JOptionPane.showMessageDialog(this, "El Lote del dia de hoy ya ha sido cerrado");
                } else {
                    int res = JOptionPane.showConfirmDialog(this, "Aún no existen Lotes inicializados, ¿desea abrir un nuevo Lote?",
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (res == JOptionPane.YES_OPTION) {
                        JDialog jf;
                        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                            jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                        } else {
                            jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                        }
                        Apertura_Caja abrir = new Apertura_Caja(unaHosteria.getCajaPrincipal());
                        jf.getContentPane().removeAll();
                        jf.getContentPane().add(abrir);
                        jf.pack();
                        jf.setLocationRelativeTo(null);
                        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jf.show();

                    }
                }
            }

        } else {
            int res = JOptionPane.showConfirmDialog(this, "Aún no existen Lotes inicializados, ¿desea abrir su primer Lote?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {


                JDialog jf;
                if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                    jf = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                } else {
                    jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                }
                Apertura_Caja abrir = new Apertura_Caja(unaHosteria.getCajaPrincipal());
                jf.getContentPane().removeAll();
                jf.getContentPane().add(abrir);
                jf.pack();
                jf.setLocationRelativeTo(null);
                jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jf.show();

            }
        }
    }//GEN-LAST:event_btn_abrirLoteActionPerformed
    private void btn_modificar_parametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_parametrosActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        Parametros_Pileta parametros = new Parametros_Pileta(unaHosteria.getPileta());
        frame.getContentPane().removeAll();
        frame.getContentPane().add(parametros);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();

    }//GEN-LAST:event_btn_modificar_parametrosActionPerformed

    private void spinner_afiliadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_afiliadosStateChanged
        int proximo = (int) spinner_afiliados.getValue();
        spinner_personas.getModel().setValue(proximo);


    }//GEN-LAST:event_spinner_afiliadosStateChanged

    private void spinner_personasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_personasStateChanged

        Integer afiliados = (int) spinner_afiliados.getModel().getValue();
        Integer personas = (int) spinner_personas.getModel().getValue();
        Integer excedentes = personas - (afiliados * cantitidadInvitados);
        if (personas != afiliados) {
            if (personas < afiliados) {
                JOptionPane.showMessageDialog(this, "En número total de personas debe ser mayor o igual a la cantidad de Afiliados");
                spinner_personas.setValue(spinner_afiliados.getValue());
            } else {
                int permitido = afiliados * cantitidadInvitados;
                if (personas.compareTo(permitido) < 0) {
                    txt_excedentes.setText("0");
                    txt_total_a_pagar.setText("0.0");
                } else {
                    txt_excedentes.setText(String.valueOf(excedentes));
                    txt_total_a_pagar.setText(String.valueOf(excedentes * precio));

                }
            }
        } else {
            txt_excedentes.setText("0");
            txt_total_a_pagar.setText("0.0");
        }
    }//GEN-LAST:event_spinner_personasStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            List<Registro_Pileta> historial = new LinkedList<>();



            if (chec_todos.isSelected()) {
                historial.clear();
                historial = unaHosteria.getPileta().getRegistros();
            } else {
                historial.clear();
                Calendar hoy = Calendar.getInstance();
                Calendar fechaRegistro = Calendar.getInstance();
                hoy.setTime(new Date());
                for (Registro_Pileta unRegistro : unaPileta.getRegistros()) {
                    fechaRegistro.setTime(unRegistro.getFecha_entrada());
                    if (hoy.get(Calendar.DAY_OF_YEAR) == fechaRegistro.get(Calendar.DAY_OF_YEAR)) {
                        historial.add(unRegistro);
                    }
                }
            }





            HashMap<String, Object> parametros = new HashMap();
            parametros.clear();
            parametros.put("us", Acceso.getUsuario());
            parametros.put("logo", unaHosteria.getLogo());
            parametros.put("pa", unaHosteria.getMiPais());
            parametros.put("pcia", unaHosteria.getMiProvincia());
            parametros.put("ciud", unaHosteria.getMiCiudad());
            parametros.put("calle", unaHosteria.getMiCalle());
            parametros.put("nomb", unaHosteria.getNombre());
            parametros.put("Pileta", unaPileta);


            JasperReport jasper = JasperCompileManager.compileReport("src/Reportes/Registro_Pileta.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper, parametros, new JRBeanCollectionDataSource(historial));
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
            frame.setSize(800, 700);
            frame.show();

//            jviewer.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_excedentesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_excedentesCaretUpdate
        if (!txt_excedentes.getText().isEmpty()) {
            if (Integer.parseInt(txt_excedentes.getText()) == 0) {
                cbx_formaPago.setEnabled(false);
            } else {
                cbx_formaPago.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txt_excedentesCaretUpdate

    private void spinner_afiliadosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_spinner_afiliadosComponentAdded
    }//GEN-LAST:event_spinner_afiliadosComponentAdded

    private void chec_todosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chec_todosItemStateChanged

        iniciarInterface();
    }//GEN-LAST:event_chec_todosItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirLote;
    private javax.swing.JButton btn_modificar_parametros;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle2;
    private javax.swing.JComboBox cbx_formaPago;
    private javax.swing.JCheckBox chec_todos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JSpinner spinner_afiliados;
    private javax.swing.JSpinner spinner_personas;
    private javax.swing.JTable tbl_registros_pileta;
    private javax.swing.JTextField txt_Afiliado;
    private javax.swing.JTextField txt_comprobante;
    private javax.swing.JTextField txt_excedentes;
    private javax.swing.JTextField txt_precio_invitado;
    private javax.swing.JTextField txt_total_a_pagar;
    private javax.swing.JTextField txt_total_bañeros;
    // End of variables declaration//GEN-END:variables

    private boolean es_delDia(Lote unLote) {
        boolean ok = false;

        if (unLote != null) {
            Calendar hoy = Calendar.getInstance();
            Calendar fechaLote = Calendar.getInstance();
            fechaLote.setTime(unLote.getFechaLote());
            if (hoy.get(Calendar.DAY_OF_YEAR) == fechaLote.get(Calendar.DAY_OF_YEAR)) {
                ok = true;
            }
        }
        return ok;
    }

    private void iniciarInterface() {
        unCaja = unaHosteria.getCajaPrincipal();

        Integer comprobante = unaHosteria.getCajaPrincipal().obtenerNC();
        txt_excedentes.setText("0");
        txt_total_a_pagar.setText("0.0");
        txt_excedentes.setEditable(false);
        txt_total_a_pagar.setEditable(false);
        txt_precio_invitado.setEditable(false);
        txt_precio_invitado.setFocusable(false);
        txt_precio_invitado.setText(String.valueOf(unaPileta.getPrecio_invitado()));
        txt_comprobante.setText(String.valueOf(comprobante));
        spinner_afiliados.getModel().setValue(1);
        spinner_personas.getModel().setValue(1);
        txt_Afiliado.setText("");



        Calendar mañana = Calendar.getInstance();
        mañana.add(Calendar.DAY_OF_YEAR, +1);
        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_YEAR, -1);

        List<Registro_Pileta> unFiltro = new LinkedList<>();

        if (chec_todos.isSelected()) {
            GUIM.cargarTablaRegistros(tbl_registros_pileta, unaPileta.getRegistros());
            txt_total_bañeros.setText(String.valueOf(unaPileta.getRegistros().size()));
        } else {

            Calendar hoy = Calendar.getInstance();
            Calendar fechaRegistro = Calendar.getInstance();
            hoy.setTime(new Date());
            for (Registro_Pileta unRegistro : unaPileta.getRegistros()) {
                fechaRegistro.setTime(unRegistro.getFecha_entrada());
                if (hoy.get(Calendar.DAY_OF_YEAR) == fechaRegistro.get(Calendar.DAY_OF_YEAR)) {
                    unFiltro.add(unRegistro);
                }

            }
            GUIM.cargarTablaRegistros(tbl_registros_pileta, unFiltro);
            txt_total_bañeros.setText(String.valueOf(unFiltro.size()));
        }
    }

    public Lote ultimoLote() {
        boolean estaCerrado = false;
        Lote ultimo_Lote_Cerrado = null;
        List<Lote> lotesAnteriores = unCaja.getLotes();


        if (!lotesAnteriores.isEmpty()) {
            ultimo_Lote_Cerrado = lotesAnteriores.get(lotesAnteriores.size() - 1);
        }
        return ultimo_Lote_Cerrado;
    }

    private void lote_del_Dia() {
        Date hoy = new Date();
//        Calendar mañana = Calendar.getInstance();
//        mañana.add(Calendar.DAY_OF_MONTH, 1);
        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_MONTH, -2);
        for (Lote l : unCaja.getLotes()) {
            if ((l.getFechaLote().after(ayer.getTime())) && (l.getFechaLote().before(hoy))) {
                this.unLote = l;
            }
        }
    }

    private Lote lote_de_ayer() {
        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_MONTH, -1);

        Calendar anteayer = Calendar.getInstance();
        anteayer.add(Calendar.DAY_OF_MONTH, -2);
        for (Lote l : unCaja.getLotes()) {
            if ((l.getFechaLote().after(anteayer.getTime())) && (l.getFechaLote().before(ayer.getTime()))) {
                this.unLote = l;
            }
        }
        return unLote;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Pileta) {
            spinner_personasStateChanged(null);
            txt_precio_invitado.setText(String.valueOf(unaPileta.getPrecio_invitado()));
            iniciarInterface();
        } else if (arg instanceof Registro_Pileta) {
            iniciarInterface();
        }
    }
}
