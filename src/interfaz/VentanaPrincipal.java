/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import co.edu.unicolombo.ingsistemas.pb.VentanaBuscarEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaBuscarUsuario;
import co.edu.unicolombo.ingsistemas.pb.VentanaRegistroEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaInicioSesionEmpresa;
import co.edu.unicolombo.ingsistemas.pb.VentanaUsuarioInicioSesion;
import co.edu.unicolombo.ingsistemas.pb.VentanaRegistroUsuario;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/**
 *
 * 
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    public HashMap<String, ArrayList<String>> Usuario = new HashMap<>();
    
    public VentanaPrincipal() {
      
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEmpresa = new javax.swing.JButton();
        BtnUsuario1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAyuda = new javax.swing.JMenu();
        itemIndice = new javax.swing.JMenuItem();
        itemTutorial = new javax.swing.JMenuItem();
        itemAcercade = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEmpresa.setBackground(new java.awt.Color(255, 255, 0));
        btnEmpresa.setForeground(new java.awt.Color(255, 255, 0));
        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/pngwing.com (1).png"))); // NOI18N
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        BtnUsuario1.setBackground(new java.awt.Color(255, 255, 0));
        BtnUsuario1.setForeground(new java.awt.Color(255, 255, 0));
        BtnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/_64_user.png"))); // NOI18N
        BtnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuario1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/descarga.png"))); // NOI18N
        jLabel9.setText("BIENVENIDOS A UNEMPLEO");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N

        itemIndice.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemIndice.setText("Indice...");
        menuAyuda.add(itemIndice);

        itemTutorial.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemTutorial.setText("Tutorial...");
        itemTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTutorialActionPerformed(evt);
            }
        });
        menuAyuda.add(itemTutorial);

        itemAcercade.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        itemAcercade.setText("Acerca de...");
        menuAyuda.add(itemAcercade);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(BtnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void itemTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTutorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTutorialActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
      VentanaInicioSesionEmpresa IE = new VentanaInicioSesionEmpresa (this,true);
      IE.setLocationRelativeTo(this);
      IE.setVisible(true);
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void BtnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuario1ActionPerformed
       VentanaUsuarioInicioSesion US = new VentanaUsuarioInicioSesion(true, this);
     US.setLocationRelativeTo(this);
     US.setVisible(true);
    }//GEN-LAST:event_BtnUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 
                try {
                    UIManager.setLookAndFeel(new HiFiLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
       
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUsuario1;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JMenuItem itemAcercade;
    private javax.swing.JMenuItem itemIndice;
    private javax.swing.JMenuItem itemTutorial;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAyuda;
    // End of variables declaration//GEN-END:variables
}