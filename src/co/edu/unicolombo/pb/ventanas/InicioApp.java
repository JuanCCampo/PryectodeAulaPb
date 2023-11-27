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

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEmpresa = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        registrarEmpresa = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        loquesomos = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unempleo");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/descarga.png"))); // NOI18N
        jLabel9.setText("BIENVENIDOS A UNEMPLEO");

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

        jMenuItem1.setText("Listar Empresa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuEmpresa.add(jMenuItem1);

        jMenuBar1.add(menuEmpresa);

        jMenu2.setText("AYUDA");

        loquesomos.setText("QUE SOMOS");
        loquesomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loquesomosActionPerformed(evt);
            }
        });
        jMenu2.add(loquesomos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        PerfilUsuario v = new PerfilUsuario();
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
            if (e instanceof UsuarioC) {
                v.setVisible(true);
                PerfilUsuario.etqProfesion.setText(e.nombre);
                PerfilUsuario.etqCedula.setText(e.cedula);
                PerfilUsuario.etqProfesion.setText(e.profesion);
                PerfilUsuario.etqCorreo.setText(e.correo);
                PerfilUsuario.etqExperiencia.setText(e.experiencia_laboral);
                PerfilUsuario.etqEdad.setText(e.edad);
            }
        } else if (UsuarioEm.usuarioEm.containsKey(correo)) {
            
            UsuarioEm e = UsuarioEm.usuarioEm.get(correo);
            if (e instanceof UsuarioEm) {
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


        setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void registrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpresaActionPerformed
        VentanaRegistroEmpresa v = new VentanaRegistroEmpresa(this, true);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registrarEmpresaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       ListaEmpresa e = new ListaEmpresa();
       e.setVisible(true);
       e.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void loquesomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loquesomosActionPerformed
AYUDA a = new AYUDA();
a.setVisible(true);
a.setLocationRelativeTo(null);
    }//GEN-LAST:event_loquesomosActionPerformed

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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem loquesomos;
    private javax.swing.JMenu menuEmpresa;
    private javax.swing.JMenuItem registrarEmpresa;
    // End of variables declaration//GEN-END:variables
}
