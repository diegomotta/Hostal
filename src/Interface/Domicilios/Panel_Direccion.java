/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Domicilios;

import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Varios.Hosteria;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lukas
 */
public class Panel_Direccion extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form direction
     */
    public Panel_Direccion(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        unaHosteria.addObserver(this);
        
        initComponents();
        cargarComboPais();
        
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();
        buttonCircle2 = new org.edisoncor.gui.button.ButtonCircle();
        buttonCircle3 = new org.edisoncor.gui.button.ButtonCircle();
        cbx_pais = new javax.swing.JComboBox();
        cbx_provincia = new javax.swing.JComboBox();
        cbx_localidad = new javax.swing.JComboBox();

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel4.setText("Pais:");

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel3.setText("Provincia:");

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel2.setText("Localidad:");

        buttonCircle1.setText("buttonCircle1");
        buttonCircle1.setToolTipText("Editar Paises");
        buttonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle1ActionPerformed(evt);
            }
        });

        buttonCircle2.setText("buttonCircle1");
        buttonCircle2.setToolTipText("Editar Localidades");
        buttonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle2ActionPerformed(evt);
            }
        });

        buttonCircle3.setText("buttonCircle1");
        buttonCircle3.setToolTipText("Editar Provincias");
        buttonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle3ActionPerformed(evt);
            }
        });

        cbx_pais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_paisItemStateChanged(evt);
            }
        });

        cbx_provincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_provinciaItemStateChanged(evt);
            }
        });

        cbx_localidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_localidadItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_pais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_localidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_provincia, 0, 135, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCircle3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCircle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCircle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cbx_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbx_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarComboPais() {
        if (!unaHosteria.getPaises().isEmpty()) {
            List<Pais> paises = unaHosteria.getPaises();
            for (Pais unPais : paises) {
                cbx_pais.addItem(unPais);
            }
            
        }
    }
    private void cbx_paisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_paisItemStateChanged
        
        if (cbx_pais.getItemCount() != 0) {
            cbx_provincia.removeAllItems();
            List<Provincia> provincias = ((Pais) cbx_pais.getSelectedItem()).getProvincias();
            cbx_localidad.setEnabled(false);
            cbx_provincia.setEnabled(true);
            if (!provincias.isEmpty()) {
                for (Provincia unaProvincia : provincias) {
                    cbx_provincia.addItem(unaProvincia);
                }
                
            } else {
                cbx_localidad.setEnabled(false);
                cbx_provincia.setEnabled(false);
            }
        } else {
            cbx_provincia.setEnabled(false);
            cbx_localidad.setEnabled(false);
        }
        
    }//GEN-LAST:event_cbx_paisItemStateChanged
    
    private void cbx_provinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_provinciaItemStateChanged
        if (cbx_provincia.getItemCount() != 0) {
            cbx_localidad.removeAllItems();
            List<Localidad> localidades = ((Provincia) cbx_provincia.getSelectedItem()).getLocalidades();
            if (localidades != null) {
                for (Localidad unaLocalidad : localidades) {
                    cbx_localidad.addItem(unaLocalidad);
                }
            } else {
                cbx_localidad.setEnabled(false);
            }
        } else {
            cbx_localidad.removeAllItems();
            cbx_localidad.setEnabled(false);
        }
    }//GEN-LAST:event_cbx_provinciaItemStateChanged
    
    private void cbx_localidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_localidadItemStateChanged
        if (cbx_localidad.getItemCount() == 0) {
            cbx_localidad.setEnabled(false);
        } else {
            cbx_localidad.setEnabled(true);
        }
        
    }//GEN-LAST:event_cbx_localidadItemStateChanged
    
    private void buttonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle1ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        
        ABM_Pais gestorPais = new ABM_Pais(unaHosteria);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gestorPais);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.show();
        cbx_pais.removeAllItems();
        for (Pais unPais : unaHosteria.getPaises()) {
            cbx_pais.addItem(unPais);
        }
    }//GEN-LAST:event_buttonCircle1ActionPerformed
    
    private void buttonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle3ActionPerformed
        JDialog frame;
        if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
            frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
        } else {
            frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
        }
        if (cbx_pais.getSelectedItem() != -1) {
            Pais unPais = (Pais) cbx_pais.getSelectedItem();
            
            ABM_Provincia gestorProvincia = new ABM_Provincia(unaHosteria, unPais);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(gestorProvincia);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.show();
        }
        cbx_provincia.removeAllItems();
        for (Provincia unProvincia : ((Pais) cbx_pais.getSelectedItem()).getProvincias()) {
            cbx_provincia.addItem(unProvincia);
        }
    }//GEN-LAST:event_buttonCircle3ActionPerformed
    
    private void buttonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle2ActionPerformed
        JDialog frame;
        if (cbx_pais.getItemCount() != 0) {
            if (cbx_provincia.getItemCount() != 0) {
                if (SwingUtilities.getWindowAncestor(this) instanceof JDialog) {
                    frame = new JDialog((JDialog) SwingUtilities.getWindowAncestor(this), true);
                } else {
                    frame = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), true);
                }
                Pais unPais = (Pais) cbx_pais.getSelectedItem();
                Provincia unaProvincia = (Provincia) cbx_provincia.getSelectedItem();
                ABM_Localidad gestorLocalidad = new ABM_Localidad(unaHosteria, unPais, unaProvincia);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(gestorLocalidad);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.show();
                
                cbx_localidad.removeAllItems();
                for (Localidad unaLocalidad : ((Provincia) cbx_provincia.getSelectedItem()).getLocalidades()) {
                    cbx_localidad.addItem(unaLocalidad);
                }
            }
            
        }
        
        
        
    }//GEN-LAST:event_buttonCircle2ActionPerformed
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle2;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle3;
    private javax.swing.JComboBox cbx_localidad;
    private javax.swing.JComboBox cbx_pais;
    private javax.swing.JComboBox cbx_provincia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    public Pais getPais() {
        return (Pais) cbx_pais.getSelectedItem();
    }
    
    public JComboBox getCBX_Pais() {
        return this.cbx_pais;
    }

    public JComboBox getCbx_localidad() {
        return cbx_localidad;
    }

    public void setCbx_localidad(JComboBox cbx_localidad) {
        this.cbx_localidad = cbx_localidad;
    }

    public JComboBox getCbx_provincia() {
        return cbx_provincia;
    }

    public void setCbx_provincia(JComboBox cbx_provincia) {
        this.cbx_provincia = cbx_provincia;
    }
    
    public Provincia getProvincia() {
        return (Provincia) cbx_provincia.getSelectedItem();
    }
    
    public Localidad getLocalidad() {
        return (Localidad) cbx_localidad.getSelectedItem();
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Pais) {
            cargarComboPais();            
        } else if (arg instanceof Provincia) {
            cbx_paisItemStateChanged(null);
        } else {
            cbx_provinciaItemStateChanged(null);
        }
    }
}
