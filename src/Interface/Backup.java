package Interface;

import Interface.Backup.Pintando;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Backup extends javax.swing.JPanel {

    public Backup() {
        initComponents();
    }

    public class Pintando extends Thread {

        boolean bandera = false;

        @Override
        public void run() throws NoSuchMethodError {

            while (true) {
                int i = 1;
                int x = 0;
                //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
                while (x <= tiempo) {
                    try {
                        Thread.sleep(100);
                        i = (i > 100) ? 1 : i + 1;
                        barraProgreso.setValue(i);
                        barraProgreso.repaint();

                    } catch (InterruptedException e) {
                    }
                    x++;
                }
                bandera = true;

                if (bandera) {
                    barraProgreso.setValue(100);
                    JOptionPane.showMessageDialog(null, "La Copia de Seguridad se ha realizado con exito");
                    break;//rompe ciclo    

                }
            }
                this.destroy();          
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Copias de Seguridad");
        jTextField1.setFocusable(false);

        jButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuraciones.png"))); // NOI18N
        jButton1.setText("Iniciar Respaldo");
        jButton1.setAlignmentY(0.0F);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("");

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Pintando pintar = new Pintando();
        pintar.start();
        realizaBackup();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void realizaBackup() {
        Calendar unDate = Calendar.getInstance();
        String fechaActual = String.valueOf(unDate.get(Calendar.DAY_OF_MONTH)) + "_" + String.valueOf(unDate.get(Calendar.MONTH) + 1) + "_" + String.valueOf(unDate.get(Calendar.YEAR));
        String horaActual = "_" + String.valueOf(unDate.get(Calendar.HOUR_OF_DAY)) + "_" + String.valueOf(unDate.get(Calendar.MINUTE));

        final String[] comandos = new String[15];
        comandos[0] = "C:/Program Files/PostgreSQL/9.1/bin/pg_dump.exe";
        comandos[1] = "-i";
        comandos[2] = "-h";
        comandos[3] = "localhost";     //ou  comandos.add("192.168.0.1");   
        comandos[4] = "-p";
        comandos[5] = "5432";
        comandos[6] = "-U";
        comandos[7] = "postgres";
        comandos[8] = "-F";
        comandos[9] = "c";
        comandos[10] = "-b";
        comandos[11] = "-v";
        comandos[12] = "-f";
        comandos[13] = "C:/respaldo/copia (" + fechaActual + horaActual + ").backup";
        comandos[14] = "Verydis";

        ProcessBuilder pb = new ProcessBuilder(comandos);

        pb.environment().put("PGPASSWORD", "verydis1750");



        try {
            final Process process = pb.start();
            try (BufferedReader r = new BufferedReader(
                            new InputStreamReader(process.getErrorStream()))) {
                String line = r.readLine();
                while (line != null) {
                    System.err.println(line);
                    line = r.readLine();
                }
            }

            process.waitFor();
            process.destroy();


        } catch (IOException | InterruptedException e) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    public static boolean band = false;
    private static int tiempo = 30;
}
