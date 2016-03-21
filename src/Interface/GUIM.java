/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.Domicilios.ABM_Provincia;
import Interface.Hoteleria.Reservar_Habitacion;
import Interface.Hoteleria.Vista_Reservas;
import Interface.Renderers.Renderer_Reservas;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Movimiento_Hospedaje;
import LN.Alquileres.Registro_Pileta;
import LN.Alquileres.Reserva_Habitacion;
import LN.Alquileres.Reserva_Salon;
import LN.Articulos.Articulo;
import LN.Articulos.Articulo_Dinamico;
import LN.Articulos.Articulo_Estatico;
import LN.Articulos.Articulos_Adquiridos;
import LN.Articulos.Unidad_de_Medida;
import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Visitante;
import LN.Caja.Conceptos;
import LN.Articulos.Faltante;
import LN.Varios.Hosteria;
import LN.Caja.Movimiento;
import LN.Caja.Tarjeta;
import LN.Persona.Usuario.Rol;
import Log_Auditoria.Auditoria_Operacional;
import Log_Auditoria.Entidad_Revisada;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jdesktop.swingx.JXDatePicker;
//persistir = f

public class GUIM {

    private static int fila;
    private static int columna;
    public static int f1 = 0;
    public static int c1 = 0;
    public static int f2 = 0;
    public static int c2 = 0;

    public static void decimalPositivo(JTextField unTXT) {
        unTXT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (!GUIM.esEntero(e.getKeyChar())) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

        unTXT.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                JTextField txt = (JTextField) e.getSource();
                try {
                    new Double(txt.getText());
                } catch (Exception ex) {
                    txt.setText("0");

                }
            }
        });




    }

    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        return formateador.format(ahora);
    }

    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

    public static void AddKeyEnter(JButton button) {
        button.registerKeyboardAction(button.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);
        button.registerKeyboardAction(button.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
    }

    //(Retorna el numero de dias entre dos fechas)
    public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }

    public static boolean esEntero(char caracter) {
        boolean res = true;
        //12 = borrar; 127 = suprimir; 46 = punto; 44 = coma
        if (!Character.isDigit(caracter)) {
            if (caracter != (char) '\b') {
                if (caracter != (char) 127) {
                    if (caracter != (char) 46) {
                        res = false;
                        java.awt.Toolkit.getDefaultToolkit().beep();
                    }

                }
            }
        }
        return res;
    }

    public static boolean enteroPuro(char caracter) {
        boolean res = true;
        //12 = borrar; 127 = suprimir; 46 = punto; 44 = coma
        if (!Character.isDigit(caracter)) {
            if (caracter != (char) '\b') {
                if (caracter != (char) 127) {
                    res = false;
                    java.awt.Toolkit.getDefaultToolkit().beep();


                }
            }
        }
        return res;
    }

    public static boolean esLetra(char caracter) {
        boolean res = true;
        //12 = borrar; 127 = suprimir; 46 = punto; 44 = coma
        if (!Character.isLetter(caracter)) {
            if (caracter != (char) '\b') {
                if (caracter != (char) 127) {
                    if (caracter != (char) 32) {
                        res = false;
                        java.awt.Toolkit.getDefaultToolkit().beep();
                    }

                }
            }
        }
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" Gestion de Tablas "> 
    public static void limpiar_tabla(JTable tabla) {
        int filas = tabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }

    public static void cargarTablaPaises(JTable tabla, List<Pais> lista) {
        limpiar_tabla(tabla);
        for (Pais unPais : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unPais.toVector());
        }
    }

    public static void cargarTablaTarjetas(JTable tabla, List<Tarjeta> lista) {
        limpiar_tabla(tabla);
        for (Tarjeta unaTarjeta : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unaTarjeta.toVector());
        }
    }

    public static void cargarTablaRoles(JTable tabla, List<Rol> lista) {
        limpiar_tabla(tabla);
        for (Rol unRol : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unRol.toVector());
        }
    }

    public static void cargarTablaCompras(JTable tabla, List<Articulos_Adquiridos> lista) {
        limpiar_tabla(tabla);
        for (Articulos_Adquiridos unart : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unart.toVector());
        }
    }

    public static void cargarTablaCaja(JTable tabla, List<Movimiento> lista, JXDatePicker desde, JXDatePicker hasta) {
        limpiar_tabla(tabla);
        for (Movimiento unMovimiento : lista) {

            ((DefaultTableModel) tabla.getModel()).addRow((unMovimiento).toVector());
        }
    }

    public static void cargarTablaReservas(JTable tabla, List<Reserva_Habitacion> lista) {
        limpiar_tabla(tabla);
        for (Reserva_Habitacion unaReserva : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow((unaReserva).toVector());
        }
    }

    public static void cargarReservasSalon(JTable tabla, List<Reserva_Salon> lista) {
        limpiar_tabla(tabla);
        for (Reserva_Salon unaReserva : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow((unaReserva).toVector());
        }
    }

    public static void cargarTablaUnidades(JTable tabla, List<Unidad_de_Medida> lista) {
        limpiar_tabla(tabla);
        for (Unidad_de_Medida unaUnidad : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unaUnidad.toVector());
        }
    }

    public static void cargarCuentasHuesped(JTable tabla, List<Movimiento_Hospedaje> misMovimientos) {
        limpiar_tabla(tabla);
        for (Movimiento_Hospedaje unMH : misMovimientos) {
            ((DefaultTableModel) tabla.getModel()).addRow(((Movimiento_Hospedaje) unMH).toMovimiento());
        }

    }

    public static void cargarTablaHospedajes(JTable tabla, List<Hospedaje_Habitacion> lista) {
        limpiar_tabla(tabla);
        for (Object unAlq : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(((Hospedaje_Habitacion) unAlq).toVector());
        }
    }

    public static void cargarTablaAlquileres(JTable tabla, List<Hospedaje_Salon> lista) {
        limpiar_tabla(tabla);
        for (Hospedaje_Salon unAlq : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unAlq.toVector());
        }
    }
    public static void cargarHistorialSalon(JTable tabla, List<Hospedaje_Salon> lista) {
        limpiar_tabla(tabla);
        for (Hospedaje_Salon unAlq : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unAlq.toVector2());
        }
    }
    public static void cargarHistorialHabitacion(JTable tabla, List<Hospedaje_Habitacion> lista) {
        limpiar_tabla(tabla);
        for (Hospedaje_Habitacion unAlq : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unAlq.toVector3());
        }
    }

    public static void cargarTablaHistorial(JTable tabla, List<Hospedaje_Habitacion> lista) {
        limpiar_tabla(tabla);
        for (Object unAlq : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(((Hospedaje_Habitacion) unAlq).toHistorial());
        }
    }

    public static void cargarTablaOperaciones(JTable tabla, List<Auditoria_Operacional> lista) {
        limpiar_tabla(tabla);
        for (Auditoria_Operacional unaOperacional : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unaOperacional.toVector());
        }
    }

    public static void cargarTablaAuditoria(JTable tabla, List<Entidad_Revisada> lista) {
        limpiar_tabla(tabla);
        String[] filas = new String[5];
        for (Entidad_Revisada lala : lista) {
            filas[0] = String.valueOf(lala.getCustomTimestamp());
            filas[1] = lala.getAccion();
            filas[2] = lala.getEntityClassName();
            filas[3] = lala.getUsuario();
            filas[4] = lala.getMomento().toString();
            ((DefaultTableModel) tabla.getModel()).addRow(filas);
        }

    }

    public static void cargarTablaArticulos(JTable tabla, List<Articulo> lista) {
        limpiar_tabla(tabla);
        for (Articulo unArticulo : lista) {
            if (unArticulo instanceof Articulo_Estatico) {
                ((DefaultTableModel) tabla.getModel()).addRow(((Articulo_Estatico) unArticulo).toVector());
            } else if (unArticulo instanceof Articulo_Dinamico) {

                ((DefaultTableModel) tabla.getModel()).addRow(((Articulo_Dinamico) unArticulo).toVector());
            }

        }
    }

    public static void cargarTablaFaltantes(JTable tabla, List<Faltante> lista) {
        limpiar_tabla(tabla);
        for (Faltante unfaltante : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unfaltante.toVector());
        }
    }

    public static void cargarTablaUsuarios(JTable tabla, List<Usuario> lista) {
        limpiar_tabla(tabla);
        for (Usuario unUsuario : lista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unUsuario.toVector());
        }
    }

    public static void recargarme(Hosteria unaHosteria, JFrame unp) {
        ABM_Provincia gestorPais = new ABM_Provincia(unaHosteria);
        unp.getContentPane().removeAll();
        unp.getContentPane().add(gestorPais);
        unp.pack();
    }

    public static void cargarTablaProvincias(JTable tabla, List<Provincia> unaLista) {
        limpiar_tabla(tabla);
        for (Provincia unaProvincia : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(((Provincia) unaProvincia).toVector());
        }
    }

    public static void cargarTablaLocalidades(JTable tabla, List<Localidad> unaLista) {
        limpiar_tabla(tabla);
        for (Localidad unaLocalidad : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(((Localidad) unaLocalidad).toVector());
        }
    }

    public static void cargarTablaVisitantes(JTable tabla, List<Visitante> unaLista) {
        limpiar_tabla(tabla);
        for (Visitante unVisitante : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unVisitante.toVector());
        }
    }

    public static void cargarTablaConceptos(JTable tabla, List<Conceptos> unaLista) {
        limpiar_tabla(tabla);
        for (Conceptos unConcepto : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unConcepto.toVector());
        }
    }

    public static void cargarTablaRegistros(JTable tabla, List<Registro_Pileta> unaLista) {
        limpiar_tabla(tabla);
        for (Registro_Pileta unRegistro_Pileta : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unRegistro_Pileta.toRegistro());
        }
    }

    public static void cargarTablaOUT(JTable tabla, List<Movimiento_Hospedaje> unaLista) {
        limpiar_tabla(tabla);
        for (Movimiento_Hospedaje unMovimiento_Hospedaje : unaLista) {
            ((DefaultTableModel) tabla.getModel()).addRow(unMovimiento_Hospedaje.toOUT());
        }
    }

    // </editor-fold>
    public static void mostrarSms(JPanel pnl, int tipo, String texto) {
        ImageIcon img;
        if (tipo == 0) {
            img = new ImageIcon(GUIM.class.getResource("/Imagenes/Guardado.png"));
        } else if (tipo == 1) {
            img = new ImageIcon(GUIM.class.getResource("/Imagenes/Stop.png"));

        } else {
            img = new ImageIcon(GUIM.class.getResource("/Imagenes/Cuidado.png"));
        }

//        JLabel lbl = new JLabel("<html>" + texto + "</html>");
        JLabel lbl = new JLabel("<html>" + texto + "</html>");
        lbl.setVisible(true);

        //lbl.setBounds(0, 0, lbl.getWidth(), lbl.getHeight());

        lbl.setIcon(img);
        int y = 0;
        if (pnl.getComponentCount() != 0) {
            y = pnl.getComponent(pnl.getComponentCount() - 1).getY() + pnl.getComponent(pnl.getComponentCount() - 1).getHeight() + 2;
        }
        pnl.add(lbl);
        lbl.setBounds(0, y, lbl.getPreferredSize().width, lbl.getPreferredSize().height);
        pnl.setPreferredSize(new Dimension(pnl.getWidth(), lbl.getLocation().y + lbl.getHeight() + 2));

        pnl.setSize(new Dimension(pnl.getWidth(), lbl.getLocation().y + lbl.getHeight() + 2));
//        lbl.setSize(lbl.getPreferredSize());
//        System.out.print(pnl.getSize() + "  "+ );
    }

    public static boolean validarMail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {

            return true;
        } else {
            return false;
        }
    }

    public static JTable crear_tabla_Salon() {
        DefaultTableModel tm = new DefaultTableModel(2, 29) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (0 == column || 0 == row) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Calendar calendario = Calendar.getInstance();
        int dia_del_mes = (calendario.get(Calendar.DAY_OF_MONTH)) - 1;
        for (int j = 1; j < tm.getColumnCount(); j++) {
            int mes_del_anio = calendario.get(Calendar.MONTH);
            tm.setValueAt(dia_del_mes + "/" + (mes_del_anio + 1), 0, j);

            dia_del_mes = calendario.get(Calendar.DAY_OF_MONTH);
            calendario.add(Calendar.DAY_OF_MONTH, 1);
        }

        final JTable t = new JTable(tm) {
            @Override
            public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
                if (columnIndex == 0) {
                    super.changeSelection(rowIndex, columnIndex + 1, toggle, extend);
                } else if (rowIndex == 0) {
                    super.changeSelection(rowIndex + 1, columnIndex, toggle, extend);
                } else {
                    super.changeSelection(rowIndex, columnIndex, toggle, extend);
                }
            }
        };

        t.getColumnModel().getColumn(0).setCellRenderer(t.getTableHeader().getDefaultRenderer());

        t.setDefaultRenderer(Object.class, new Renderer_Reservas());
        t.setAutoscrolls(true);


        t.setShowGrid(true);
        t.setGridColor(Color.BLUE);
        t.getColumn(t.getColumnName(0)).setMaxWidth(400);

//ajustar el tamaño de la primer columna
        TableColumnModel modeloColumna = t.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < t.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            if (i == 0) {
                columnaTabla.setPreferredWidth(200);
            }
        }

        t.setValueAt("Salón", 1, 0);

        return t;

    }

    public static JTable crear_tabla_Reservas() {
        Hosteria unaHosteria = Vista_Reservas.getUnaHosteria();

        List<Habitacion> lasActivas = new LinkedList<>();

        for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
            if (!unaHabitacion.isEliminado()) {
                lasActivas.add(unaHabitacion);
            }
        }

        DefaultTableModel tm = new DefaultTableModel(lasActivas.size() + 1, 64) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (0 == column || 0 == row) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };


//        String[] dias = new String[tm.getColumnCount()];
        Calendar calendario = Calendar.getInstance();
//        tm.setColumnIdentifiers(dias);


        int dia_del_mes = (calendario.get(Calendar.DAY_OF_MONTH)) - 1;
        for (int j = 1; j < tm.getColumnCount(); j++) {
            int mes_del_anio = calendario.get(Calendar.MONTH);
            tm.setValueAt(dia_del_mes + "/" + (mes_del_anio + 1), 0, j);

            dia_del_mes = calendario.get(Calendar.DAY_OF_MONTH);
            calendario.add(Calendar.DAY_OF_MONTH, 1);
        }
        int contador = 0;
        for (Habitacion unaHabitacion : lasActivas) {
            contador += 1;
            tm.setValueAt("Habitación " + unaHabitacion.getNumero(), contador, 0);
        }



        final JTable t = new JTable(tm) {
            @Override
            public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
                if (columnIndex == 0) {
                    super.changeSelection(rowIndex, columnIndex + 1, toggle, extend);
                } else if (rowIndex == 0) {
                    super.changeSelection(rowIndex + 1, columnIndex, toggle, extend);
                } else {
                    super.changeSelection(rowIndex, columnIndex, toggle, extend);
                }
            }
        };

        t.getColumnModel().getColumn(0).setCellRenderer(t.getTableHeader().getDefaultRenderer());

        t.setDefaultRenderer(Object.class, new Renderer_Reservas());
        t.setAutoscrolls(true);


        t.setShowGrid(true);
        t.setGridColor(Color.BLUE);
        t.getColumn(t.getColumnName(0)).setMaxWidth(400);

//ajustar el tamaño de la primer columna
        TableColumnModel modeloColumna = t.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < t.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            if (i == 0) {
                columnaTabla.setPreferredWidth(200);
            }
        }

        final PopupMenu popup = new PopupMenu();

        MenuItem m1 = new MenuItem("Nueva Reserva");

        MenuItem m2 = new MenuItem("bbbbbb");
        popup.add(m1);
        popup.add(m2);
        t.add(popup);


        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PopupMenu elMenu = (PopupMenu) (((MenuItem) ae.getSource()).getParent());
                JTable laTable = (JTable) elMenu.getParent();


            }
        });


        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                super.mousePressed(me);
                setF1(t.getSelectedRow());
                setC1(t.getSelectedColumn());

            }

            @Override
            public void mouseReleased(MouseEvent e) {

                if (e.isPopupTrigger()) {
                    popup.show(t, e.getX(), e.getY());

                }
                if (e.getButton() == MouseEvent.BUTTON1) {
                    setF2(t.getSelectedRow());
                    setC2(t.getSelectedColumnCount());


                    Hosteria unaHosteria = Vista_Reservas.getUnaHosteria();
                    JDialog frame;
                    if (SwingUtilities.getWindowAncestor(t) instanceof JDialog) {
                        frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(t), true);
                    } else {
                        frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(t), true);
                    }
                    Reservar_Habitacion laReserva = new Reservar_Habitacion(unaHosteria, getF1(), getC1(), getF2(), getC2());
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(laReserva);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.show();

                    Vista_Reservas.cargarGrilla(t);
                }

            }
        });






        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (me.getButton() == MouseEvent.BUTTON3) {
//                    fila = t.getSelectedRow();
//                    columna = t.getSelectedColumn();
//
//                    Hosteria unaHosteria = Vista_Reservas.getUnaHosteria();
//                    JDialog frame;
//                    if (SwingUtilities.getWindowAncestor(t) instanceof JDialog) {
//                        frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(t), true);
//                    } else {
//                        frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(t), true);
//                    }
//
//
//                    Reservar_Habitacion laReserva = new Reservar_Habitacion(unaHosteria, fila);
//                    frame.getContentPane().removeAll();
//                    frame.getContentPane().add(laReserva);
//                    frame.pack();
//                    frame.setLocationRelativeTo(null);
//                    frame.show();
                }

                super.mouseClicked(me);
            }
        });



//        unPanel.add(t);
        return t;


    }

    public static Habitacion retornarHabitacion(Integer unTXT, Hosteria unaHosteria) {
        Habitacion laHabitacion = null;
        for (Habitacion unaHabitacion : unaHosteria.getHabitaciones()) {
            if (unaHabitacion.getId().equals(unTXT)) {
                laHabitacion = unaHabitacion;
            }
        }
        return laHabitacion;
    }

    public static int getC1() {
        return c1;
    }

    public static void setC1(int c1) {
        GUIM.c1 = c1;
    }

    public static int getF2() {
        return f2;
    }

    public static void setF2(int f2) {
        GUIM.f2 = f2;
    }

    public static int getC2() {
        return c2;
    }

    public static void setC2(int c2) {
        GUIM.c2 = c2;
    }

    public static int getF1() {
        return f1;
    }

    public static void setF1(int f1) {
        GUIM.f1 = f1;
    }

    public static byte[] toArrayByte(String url) {
        File file = new File(url);
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //convert file into array of bytes
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bFile;
    }
}
