package Interface;

import LN.Varios.Hosteria;
import java.awt.HeadlessException;
import java.awt.Window;
import javax.swing.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//persistir = f
public class Main {

    private static SessionFactory sessionFactory;
    private static Session session;

    public static void main(String args[]) throws ClassNotFoundException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {

            Hosteria unaHosteria = null;
            JFrame frame = new JFrame();
            frame.setUndecorated(true);
            Cargando inicio = new Cargando();
            frame.getContentPane().removeAll();
            frame.getContentPane().add(inicio);
            frame.setType(Window.Type.POPUP);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show(true);

            if (Hosteria.persistencia.get(Hosteria.class) != null) {
                unaHosteria = (Hosteria) Hosteria.persistencia.get(Hosteria.class);
            } else {

                JDialog frame2;
                if (SwingUtilities.getWindowAncestor(frame) instanceof JDialog) {
                    frame2 = new JDialog((JDialog) SwingUtilities.getWindowAncestor(frame), true);
                } else {
                    frame2 = new JDialog((JFrame) SwingUtilities.getWindowAncestor(frame), true);
                }
                Vista_Empresa unaVista = new Vista_Empresa(null);
                frame2.getContentPane().removeAll();
                frame2.getContentPane().add(unaVista);
                frame2.pack();
                frame2.setLocationRelativeTo(null);
                frame2.show();
                unaHosteria = unaVista.getNuevaHosteria();
            }
            frame.show(false);

            JFrame acceso = new JFrame();
            Acceso gestor = new Acceso(unaHosteria);
            acceso.getContentPane().removeAll();
            acceso.getContentPane().add(gestor);
            acceso.setType(Window.Type.POPUP);
            acceso.pack();
            acceso.setLocationRelativeTo(null);
            acceso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            acceso.show(true);
//            principalAdministrador unPrinc = new principalAdministrador(unaHosteria);
        } catch (HeadlessException | HibernateException e) {
            System.out.println(e.getMessage());
        }


    }
}
