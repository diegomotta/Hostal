package Interface.CajaPrincipal;

import Interface.GUIM;
import Interface.Renderers.Mi_CellRenderer;
import LN.Caja.Caja;
import LN.Caja.Lote;
import LN.Caja.Movimiento;
import LN.Varios.Hosteria;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Vista_Caja extends javax.swing.JPanel implements Observer {
    
    private Hosteria unaHosteria;
    private Caja unaCaja;
    private Lote unLote;
    
    public Vista_Caja(Hosteria unaHosteria, Caja unaCaja) {
        this.unaHosteria = unaHosteria;
        this.unaCaja = unaCaja;
        unaCaja.addObserver(this);
        initComponents();
        this.tbl_caja.getColumn("Tipo").setMaxWidth(200);
        this.tbl_caja.getColumn("Fuente").setMaxWidth(200);
        this.tbl_caja.getColumn("Importe").setMaxWidth(200);
        this.tbl_caja.getColumn("Fecha").setMaxWidth(200);
        this.tbl_caja.getColumn("Hora").setMaxWidth(200);
        this.tbl_caja.getColumn("Comp. Nro.").setMaxWidth(200);
        
        
        verificarCierrePendiente();
        cargarInformacion(unaCaja.obtenerLote_Vigente());
        
        tbl_caja.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_caja.getRowCount() != -1) {
                            btn_abrirLote.setEnabled(false);
                            btn_cerrarLote.setEnabled(true);
                            
                            btn_Ingresar_Mov.setEnabled(true);
                        } else {
                            btn_abrirLote.setEnabled(true);
                            btn_cerrarLote.setEnabled(false);
                            
                            btn_Ingresar_Mov.setEnabled(false);
                        }
                        
                    }
                });
        
        
        Date ahora = new Date();
        dp_desde.setDate(ahora);
        hasta();
        mostrarLoteActual();
        
        tbl_caja.setDefaultRenderer(Object.class, new Mi_CellRenderer());
        tbl_caja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    }
    
    private void mostrarLoteActual() {
        GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dp_desde = new org.jdesktop.swingx.JXDatePicker();
        dp_hasta = new org.jdesktop.swingx.JXDatePicker();
        btn_hoy = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_caja = new javax.swing.JTable();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_abrirLote = new javax.swing.JButton();
        btn_cerrarLote = new javax.swing.JButton();
        btn_Ingresar_Mov = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_Efectivo = new javax.swing.JLabel();
        lbl_tarjeta = new javax.swing.JLabel();
        lbl_totalOUT = new javax.swing.JLabel();
        lbl_totalIN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_saldo = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setMinimumSize(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Caja Principal");

        jLabel2.setText("Desde:");

        jLabel3.setText("Hasta:");

        dp_desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_desdeActionPerformed(evt);
            }
        });

        dp_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_hastaActionPerformed(evt);
            }
        });

        btn_hoy.setText("Hoy");
        btn_hoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_hoy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(dp_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dp_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hoy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setText("Caja");
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFocusable(false);
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setAutoscrolls(true);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setMaximumSize(null);
        jScrollPane2.setMinimumSize(null);

        tbl_caja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Fuente", "Importe", "Detalle", "Fecha", "Hora", "Comp. Nro."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_caja);

        jPanel4.add(jScrollPane2);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_abrirLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/webmone.png"))); // NOI18N
        btn_abrirLote.setText("Abrir Lote");
        btn_abrirLote.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_abrirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirLoteActionPerformed(evt);
            }
        });

        btn_cerrarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        btn_cerrarLote.setText("Cerrar Lote");
        btn_cerrarLote.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_cerrarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarLoteActionPerformed(evt);
            }
        });

        btn_Ingresar_Mov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/down.png"))); // NOI18N
        btn_Ingresar_Mov.setText("Ingresar");
        btn_Ingresar_Mov.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_Ingresar_Mov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar_MovActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/currency.png"))); // NOI18N
        jButton1.setText("Detalles");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogOff.png"))); // NOI18N
        jButton2.setText("<html><p>Reabrir</p><p>Lote</p></html>");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_abrirLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrarLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Ingresar_Mov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_abrirLote)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Ingresar_Mov)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel4.setText("Ingresos en Efectivo:");

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel6.setText("Ingresos en Tarjetas:");

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel7.setText("Total de Ingresos:");

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel8.setText("Total de Egresos:");

        lbl_Efectivo.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        lbl_Efectivo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_tarjeta.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        lbl_tarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_totalOUT.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        lbl_totalOUT.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_totalIN.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        lbl_totalIN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel9.setText("Saldo:");

        lbl_saldo.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        lbl_saldo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_totalIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_totalOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(lbl_Efectivo)
                        .addComponent(lbl_totalIN))
                    .addComponent(lbl_saldo)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(lbl_totalOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void verificarCierrePendiente() {
        int res = 0;
        Lote vigente = unaCaja.obtenerLote_Vigente();
        if (vigente != null) {
            if (!es_delDia(vigente)) {
                if (!vigente.isCerrado() && "".equals(vigente.getHoraCierre())) {
                    if (vigente.getMovimientos() != null) {
                        res = JOptionPane.showConfirmDialog(this, "Aún no se ha realizado el cierre de caja de las ultimas actividades, ¿desea cerrarlo?",
                                "Advertencia", JOptionPane.YES_NO_OPTION);
                    }
                    if (res == JOptionPane.YES_OPTION) {
                        btn_cerrarLoteActionPerformed(null);
                    }
                }
            }
        }
    }
    
    public Lote loteVigente() {
        Lote vigente = null;
        List<Lote> lotesAnteriores = unaCaja.getLotes();
        if (!lotesAnteriores.isEmpty()) {
            vigente = lotesAnteriores.get(lotesAnteriores.size() - 1);
        }
        return vigente;
    }
    
    public Lote ultimoLote_Cerrado() {
        boolean estaCerrado = false;
        Lote ultimo_Lote_Cerrado = null;
        List<Lote> lotesAnteriores = unaCaja.getLotes();
        if (!lotesAnteriores.isEmpty()) {
            if (lotesAnteriores.size() > 1) {
                ultimo_Lote_Cerrado = lotesAnteriores.get(lotesAnteriores.size() - 2);
            }
        }
        return ultimo_Lote_Cerrado;
    }
    
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
    
    private Lote lote_de_ayer() {
        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_MONTH, -1);
        
        Calendar anteayer = Calendar.getInstance();
        anteayer.add(Calendar.DAY_OF_MONTH, -2);
        for (Lote l : unaCaja.getLotes()) {
            if ((l.getFechaLote().after(anteayer.getTime())) && (l.getFechaLote().before(ayer.getTime()))) {
                this.unLote = l;
            }
        }
        return unLote;
    }
    
    private void hasta() {
        Date ahora = new Date();
        dp_desde.setDate(ahora);
        Calendar m = Calendar.getInstance();
        m.add(Calendar.DAY_OF_MONTH, 1);
        dp_hasta.setDate(m.getTime());
    }
    
    private List<Movimiento> listarMovimientos() {
        List<Movimiento> movim = new LinkedList<>();
        for (Lote l : unaCaja.getLotes()) {
            if ((l.getFechaLote().getTime() == dp_desde.getDate().getTime()) || (l.getFechaLote().getTime() > dp_desde.getDate().getTime())) {
                if ((l.getFechaLote().getTime() == dp_hasta.getDate().getTime()) || (l.getFechaLote().getTime() < dp_hasta.getDate().getTime())) {
                    for (Movimiento unMov : l.getMovimientos()) {
                        movim.add(unMov);
                    }
                }
            }
        }
        return movim;
    }
    
    private void btn_abrirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirLoteActionPerformed
        
        verificarCierrePendiente();
        
        Calendar hoy = Calendar.getInstance();
        Calendar fechaLote = Calendar.getInstance();
        
        if (unaCaja.obtenerLote_Vigente() != null) {
            fechaLote.setTime(unaCaja.obtenerLote_Vigente().getFechaLote());
            
            if (fechaLote.get(Calendar.DAY_OF_YEAR) == hoy.get(Calendar.DAY_OF_YEAR)) {
                int res = JOptionPane.showConfirmDialog(this, "La apertura de caja ya ha sido realizada el dia de hoy",
                        "Advertencia", JOptionPane.PLAIN_MESSAGE);
                
            } else {
                
                JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                Apertura_Caja apertura = new Apertura_Caja(unaCaja);
                jf.getContentPane().removeAll();
                jf.getContentPane().add(apertura);
                jf.pack();
                jf.setLocationRelativeTo(null);
                jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jf.show();
                GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
                
                this.updateUI();
            }
        } else {
            JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            Apertura_Caja apertura = new Apertura_Caja(unaCaja);
            jf.getContentPane().removeAll();
            jf.getContentPane().add(apertura);
            jf.pack();
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jf.show();
            GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
            
            this.updateUI();
        }
    }//GEN-LAST:event_btn_abrirLoteActionPerformed
    
    private void btn_cerrarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarLoteActionPerformed
        Lote oneLote = loteVigente();
        if (!oneLote.isCerrado()) {
            JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            Cierre_Caja cierre = new Cierre_Caja(unaCaja, oneLote);
            jf.getContentPane().removeAll();
            jf.getContentPane().add(cierre);
            jf.pack();
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jf.show();
            cargarInformacion(loteVigente());
        } else {
            JOptionPane.showMessageDialog(this, "El Lote que quiere cerrar ya ha sido cerrado previamente");
        }
        
        this.updateUI();
    }//GEN-LAST:event_btn_cerrarLoteActionPerformed
    
    private void btn_Ingresar_MovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar_MovActionPerformed
        
        if (es_delDia(loteVigente())) {
            JDialog jf = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
            Ingreso_Egreso comprar_pagar = new Ingreso_Egreso(unaHosteria, loteVigente());
            jf.getContentPane().removeAll();
            jf.getContentPane().add(comprar_pagar);
            jf.pack();
            jf.setLocationRelativeTo(null);
            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jf.show();
            
            GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
            cargarInformacion(loteVigente());
            this.updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "Debe realizar una Apertura de Lote para continuar con esta operacion");
        }
        
        
        
        
    }//GEN-LAST:event_btn_Ingresar_MovActionPerformed
    
    private void btn_hoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoyActionPerformed
        hasta();
        GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
        
    }//GEN-LAST:event_btn_hoyActionPerformed
    
    private void dp_desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_desdeActionPerformed
        GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
    }//GEN-LAST:event_dp_desdeActionPerformed
    
    private void dp_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_hastaActionPerformed
        GUIM.cargarTablaCaja(tbl_caja, listarMovimientos(), dp_desde, dp_hasta);
    }//GEN-LAST:event_dp_hastaActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        
        Resumenes unRes = new Resumenes(unaHosteria.getCajaPrincipal());
        frame.getContentPane().removeAll();
        frame.getContentPane().add(unRes);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Lote ultimoLote = unaCaja.obtenerLote_Vigente();
        unaCaja.reabrirLote(ultimoLote);
        JOptionPane.showMessageDialog(this, "Se ha vuelto a abrir el presente Lote");
        
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar_Mov;
    private javax.swing.JButton btn_abrirLote;
    private javax.swing.JButton btn_cerrarLote;
    private javax.swing.JButton btn_hoy;
    private org.jdesktop.swingx.JXDatePicker dp_desde;
    private org.jdesktop.swingx.JXDatePicker dp_hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_Efectivo;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JLabel lbl_tarjeta;
    private javax.swing.JLabel lbl_totalIN;
    private javax.swing.JLabel lbl_totalOUT;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JTable tbl_caja;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        verificarCierrePendiente();
        cargarInformacion(unaCaja.obtenerLote_Vigente());
        
        
        tbl_caja.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (tbl_caja.getRowCount() != -1) {
                            btn_abrirLote.setEnabled(false);
                            btn_cerrarLote.setEnabled(true);
                            
                            btn_Ingresar_Mov.setEnabled(true);
                        } else {
                            btn_abrirLote.setEnabled(true);
                            btn_cerrarLote.setEnabled(false);
                            
                            btn_Ingresar_Mov.setEnabled(false);
                        }
                        
                    }
                });
        
        
        Date ahora = new Date();
        dp_desde.setDate(ahora);
        hasta();
        mostrarLoteActual();
        cargarInformacion(unaCaja.obtenerLote_Vigente());
        
    }
    
    private void cargarInformacion(Lote elLote) {
        double totalTarjetas = 0.00;
        double totalSalidas = 0.00;
        double totalEntradas = 0.00;
        
        if (elLote != null) {
            for (Movimiento unMovimiento : elLote.getMovimientos()) {
                if (unMovimiento.getFuente().equals("Tarjeta")) {
                    totalTarjetas += unMovimiento.getImporte();
                } else if (unMovimiento.getFuente().equals("Efectivo")) {
                    if ("Egreso".equals(unMovimiento.getTipo())) {
                        totalSalidas += unMovimiento.getImporte();
                    } else {
                        totalEntradas += unMovimiento.getImporte();
                    }
                }
                
            }
            
            
            Double totalIN = (totalEntradas + totalTarjetas);
            Double saldo = (totalEntradas - totalSalidas);
            
            lbl_saldo.setText(String.valueOf(saldo));
            lbl_Efectivo.setText(String.valueOf(totalEntradas));
            lbl_totalOUT.setText(String.valueOf(totalSalidas));
            lbl_tarjeta.setText(String.valueOf(totalTarjetas));
            lbl_totalIN.setText(String.valueOf(totalIN));
            
            verSaldo(saldo);
            
        }
    }
    
    private void verSaldo(Double saldo) {
        if (saldo < 0) {
            lbl_info.setText("Atención, el saldo es Negativo (Verifique sus Movimientos de Caja)");
            lbl_info.setForeground(Color.red);
        } else {
            lbl_info.setText("");
        }
    }
}
