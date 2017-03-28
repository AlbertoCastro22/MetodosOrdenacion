
package Ventanas;
import Tablas.*;
import Ventanas.*;
public class framePrincipal extends javax.swing.JFrame {
    Simulador simulador=new Simulador();
    Tabla tabla;
    Campo campo;
    agregarTabla t;
    public framePrincipal() {
        super("SIMULADOR");
        initComponents();
        //simulador=new Simulador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearTabla = new javax.swing.JButton();
        InsertarDatos = new javax.swing.JButton();
        BorrarTabla = new javax.swing.JButton();
        MostrarTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearTabla.setText("Crear Tabla");
        CrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTablaActionPerformed(evt);
            }
        });

        InsertarDatos.setText("Insertar Datos");
        InsertarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarDatosActionPerformed(evt);
            }
        });

        BorrarTabla.setText("Borrar tabla");
        BorrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTablaActionPerformed(evt);
            }
        });

        MostrarTabla.setText("Mostrar tabla");
        MostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTablaActionPerformed(evt);
            }
        });

        jLabel1.setText("                   Base De Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InsertarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BorrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(InsertarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BorrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(MostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTablaActionPerformed
        // TODO add your handling code here:
        agregarTabla a = new agregarTabla(simulador);
        a.setVisible(true);
        
    }//GEN-LAST:event_CrearTablaActionPerformed

    private void MostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTablaActionPerformed
        // TODO add your handling code here:
        MostrarTabla m=new MostrarTabla();
        m.setVisible(true);
        
    }//GEN-LAST:event_MostrarTablaActionPerformed

    private void InsertarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarDatosActionPerformed
        // TODO add your handling code here:
       // simulador=t.;
        
        
        InsertarDatos2 i = new InsertarDatos2(simulador);
        i.setVisible(true);
        //simulador.recorrer();
       // insertarDatos2 i=nr
        //i.setVisible(true);
       
    }//GEN-LAST:event_InsertarDatosActionPerformed

    private void BorrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTablaActionPerformed
        // TODO add your handling code here:
        
        BorrarTabla b = new BorrarTabla();
        b.setVisible(true);
       
    }//GEN-LAST:event_BorrarTablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new framePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarTabla;
    private javax.swing.JButton CrearTabla;
    private javax.swing.JButton InsertarDatos;
    private javax.swing.JButton MostrarTabla;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
