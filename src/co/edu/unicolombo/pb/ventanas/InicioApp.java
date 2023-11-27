/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.pb.ventanas;

import co.edu.unicolombo.pb.entidades.Empresa;
import co.edu.unicolombo.pb.entidades.UsuarioC;
import co.edu.unicolombo.pb.entidades.UsuarioEm;
import co.edu.unicolombo.pb.persistencia.Almacenamiento;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Ramos
 */
public class InicioApp extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesionBuscaEmpleos
     */
    public InicioApp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEmpresa = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        registrarEmpresa = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("USUARIOS");

        jMenuItem2.setText("Mi perfil...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        menuEmpresa.setText("EMPRESAS");

        jMenuItem4.setText("Mi empresa...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuEmpresa.add(jMenuItem4);

        registrarEmpresa.setText("Registrar Empresa...");
        registrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpresaActionPerformed(evt);
            }
        });
        menuEmpresa.add(registrarEmpresa);

        jMenu6.setText("Reportes");

        jMenuItem6.setText("Listar todas...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Por Nombre...");
        jMenu6.add(jMenuItem7);

        menuEmpresa.add(jMenu6);

        jMenuBar1.add(menuEmpresa);

        jMenu5.setText("AYUDA");

        btnayuda.setText("Que somos");
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });
        jMenu5.add(btnayuda);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        PerfilUsuario v = new  PerfilUsuario();
        v.setLocationRelativeTo(null);
        PerfilUsuarioEmpresa u = new PerfilUsuarioEmpresa();
        u.setLocationRelativeTo(null);
        
         String correo = InicioSesionGlobal.campoCorreo.getText();
        
        
        try {
            UsuarioC.candidato = Almacenamiento.recuperarUC();
            UsuarioEm.usuarioEm = Almacenamiento.recuperarUE();
        } catch (Exception ex) {
            Logger.getLogger(InicioApp.class.getName()).log(Level.SEVERE, null, ex);
        }
            if (UsuarioC.candidato.containsKey(correo)) {
                
              UsuarioC e = UsuarioC.candidato.get(correo);
        if(e instanceof UsuarioC){
             v.setVisible(true);
            PerfilUsuario.etqProfesion.setText(e.nombre);
            PerfilUsuario.etqCedula.setText(e.cedula);
            PerfilUsuario.etqProfesion.setText(e.profesion);
            PerfilUsuario.etqCorreo.setText(e.correo);
            PerfilUsuario.etqExperiencia.setText(e.experiencia_laboral);
            PerfilUsuario.etqEdad.setText(e.edad);
        }
            }
            else if (UsuarioEm.usuarioEm.containsKey(correo)){
                
            UsuarioEm e = UsuarioEm.usuarioEm.get(correo);
            if(e instanceof UsuarioEm){
                 u.setVisible(true);
            PerfilUsuarioEmpresa.etqNombre.setText(e.nombre);
            PerfilUsuarioEmpresa.etqCedula.setText(e.cedula);
            PerfilUsuarioEmpresa.etqCargo.setText(e.cargo);
            PerfilUsuarioEmpresa.etqCorreo.setText(e.correo);
            }
            
         }
            
            
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    PerfilEmpresa Em = new PerfilEmpresa();
    Em.setLocationRelativeTo(this);

    String correo = InicioSesionGlobal.campoCorreo.getText();
            try {
                UsuarioEm.usuarioEm = Almacenamiento.recuperarUE();
                 Empresa.empresas = Almacenamiento.recuperarE();
        } catch (Exception ex) {
            Logger.getLogger(InicioApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (UsuarioEm.usuarioEm.containsKey(correo)) {
            UsuarioEm e = UsuarioEm.usuarioEm.get(correo);

            // Asegúrate de que el método getEmpresaAsociada() devuelva la empresa correctamente
            Empresa empresa = e.getEmpresaAsociada();

            if (empresa != null) {
                // Mostrar los datos de la empresa en la ventana PerfilEmpresa
                Em.setVisible(true);
                PerfilEmpresa.etqNombre.setText(empresa.nombre);
                PerfilEmpresa.etqNit.setText(empresa.nit);
                PerfilEmpresa.etqDireccion.setText(empresa.direccion);
                PerfilEmpresa.etqCorreo.setText(empresa.correo);
                PerfilEmpresa.etqTelefono.setText(empresa.telefono);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la empresa asociada.");
            }
}

// Dispose solo después de mostrar la ventana PerfilEmpresa
dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void registrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpresaActionPerformed
      VentanaRegistroEmpresa v = new VentanaRegistroEmpresa(this, true);
      v.setLocationRelativeTo(null);
      v.setVisible(true);
      dispose();
    }//GEN-LAST:event_registrarEmpresaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     VentanaListarEmpresa l = new VentanaListarEmpresa();
      l.setLocationRelativeTo(null);
      l.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
       VentanaAyuda a = new VentanaAyuda();
      a.setLocationRelativeTo(null);
      a.setVisible(true);
    }//GEN-LAST:event_btnayudaActionPerformed

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
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnayuda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu menuEmpresa;
    private javax.swing.JMenuItem registrarEmpresa;
    // End of variables declaration//GEN-END:variables
}
