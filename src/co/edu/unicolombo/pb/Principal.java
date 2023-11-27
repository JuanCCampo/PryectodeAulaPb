/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unicolombo.pb;


import co.edu.unicolombo.pb.ventanas.InicioSesionGlobal;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author User_Sena
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        
         try {
                    UIManager.setLookAndFeel(new BernsteinLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(InicioSesionGlobal.class.getName()).log(Level.SEVERE, null, ex);
                }
              
           InicioSesionGlobal v = new InicioSesionGlobal();
           v.setTitle("UNEMPLEO");
           v.setVisible(true);
           v.setLocationRelativeTo(null);
                
            }
        
        
        
        
    }
    

