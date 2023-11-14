/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.persistencia;

import co.edu.unicolombo.pb.entidades.BuscaEmpleo;
import co.edu.unicolombo.pb.entidades.Empresa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author Jesus Ramos
 */
public class Almacenamiento {
    public static String rutaBase = System.getProperty("user.home")+File.separator+"MyData";
    public static String nombreArchivo = "DatosDesempleados.dat";
    public static String nombreArchivoEm = "DatosEmpresa.dat";
    
    
    public static void guardarBE(HashMap<String, BuscaEmpleo> bc1) throws IOException{
        String rutaCompleta = rutaBase + File.separator + nombreArchivo;
        File archivo = new File(rutaCompleta);
        
        if (!archivo.exists()) {
            File carpeta = new File (archivo.getParent());
            if(!carpeta.exists()){
            carpeta.mkdir();
            }
            archivo.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo)); 
        oos.writeObject(bc1);
    }
    
    public static HashMap<String, BuscaEmpleo> recuperarBE () throws Exception {
    String rutaCompleta = rutaBase + File.separator + nombreArchivo;
        File archivo = new File(rutaCompleta);
        if (!archivo.exists()) {
            archivo.createNewFile();
            throw new Exception("La basa de datos esta vacia");
        }
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(archivo)); 
        HashMap<String, BuscaEmpleo> desempleadoBd = (HashMap<String, BuscaEmpleo>) ois1.readObject();
        return desempleadoBd;
               
    }
    
     public static void guardarE(HashMap<String, Empresa> be) throws IOException{
        String rutaCompleta = rutaBase + File.separator + nombreArchivoEm;
        File archivoEm = new File(rutaCompleta);
           
        if (!archivoEm.exists()) {
            File carpeta = new File (archivoEm.getParent());
            if(!carpeta.exists()){
            carpeta.mkdir();
            }
            archivoEm.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoEm)); 
        oos.writeObject(be);
    }
    
    public static HashMap<String, Empresa> recuperarE () throws Exception {
    String rutaCompleta = rutaBase + File.separator + nombreArchivoEm;
        File archivoEm = new File(rutaCompleta);
        if (!archivoEm.exists()) {
            archivoEm.createNewFile();
            throw new Exception("La basa de datos esta vacia");
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoEm)); 
        HashMap<String, Empresa> empresaBd = (HashMap<String, Empresa>) ois.readObject();
        return empresaBd;
               
    }


}
