/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.persistencia;

import co.edu.unicolombo.pb.entidades.Convocatoria;
import co.edu.unicolombo.pb.entidades.Empresa;

import co.edu.unicolombo.pb.entidades.UsuarioC;
import co.edu.unicolombo.pb.entidades.UsuarioEm;
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
    /*Esto es lo que nos permite usar los datos en diferentes ventanas por favor evitar editar el codigo*/
    public static String rutaBase = System.getProperty("user.home")+File.separator+"MyData";
    public static String nombreArchivo = "DatosUsuario.dat";
    public static String nombreArchivoUC = "DatosUsuarioC.dat";
    public static String nombreArchivoUEm = "DatosUsuarioEm.dat";
    public static String nombreArchivoEm = "DatosEmpresa.dat";
    public static String nombreArchivoConvocatorias = "Convocatorias.dat";
    //metodo que nos permite guardar los busca empleos
   
      public static void guardarUE(HashMap<String, UsuarioEm> bc2) throws IOException{
        String rutaCompleta = rutaBase + File.separator + nombreArchivoUEm;
        File archivo = new File(rutaCompleta);
        
        if (!archivo.exists()) {
            File carpeta = new File (archivo.getParent());
            if(!carpeta.exists()){
            carpeta.mkdir();
            }
            archivo.createNewFile();
        }
        ObjectOutputStream oos12 = new ObjectOutputStream(new FileOutputStream(archivo)); 
        oos12.writeObject(bc2);
    }
       public static HashMap<String, UsuarioEm> recuperarUE () throws Exception {
    String rutaCompleta = rutaBase + File.separator + nombreArchivoUEm;
        File archivo = new File(rutaCompleta);
        if (!archivo.exists()) {
            archivo.createNewFile();
            throw new Exception("La basa de datos esta vacia");
        }
        ObjectInputStream ois11 = new ObjectInputStream(new FileInputStream(archivo)); 
        HashMap<String, UsuarioEm> usuarioBd = (HashMap<String, UsuarioEm>) ois11.readObject();
        return usuarioBd;
       }
       
    public static void guardarUC(HashMap<String, UsuarioC> bc11) throws IOException{
        String rutaCompleta = rutaBase + File.separator + nombreArchivoUC;
        File archivo = new File(rutaCompleta);
        
        if (!archivo.exists()) {
            File carpeta = new File (archivo.getParent());
            if(!carpeta.exists()){
            carpeta.mkdir();
            }
            archivo.createNewFile();
        }
        ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream(archivo)); 
        oos3.writeObject(bc11);
    }

     public static HashMap<String, UsuarioC> recuperarUC () throws Exception {
    String rutaCompleta = rutaBase + File.separator + nombreArchivoUC;
        File archivo = new File(rutaCompleta);
        if (!archivo.exists()) {
            archivo.createNewFile();
            throw new Exception("La basa de datos esta vacia");
        }
        ObjectInputStream ois111 = new ObjectInputStream(new FileInputStream(archivo)); 
        HashMap<String, UsuarioC> usuarioCBd = (HashMap<String, UsuarioC>) ois111.readObject();
        return usuarioCBd;
               
    }
    //metodos que nos permiten guardar las empresas
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
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(archivoEm)); 
        oos2.writeObject(be);
    }
    //metodo que nos permite traerlas devuelta
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
   public static void guardarConvocatorias(HashMap<Integer, Convocatoria> be5) throws IOException {
    String rutaCompleta = rutaBase + File.separator + nombreArchivoConvocatorias;
    File archivoConvocatorias = new File(rutaCompleta);

    if (!archivoConvocatorias.exists()) {
        File carpeta = new File(archivoConvocatorias.getParent());
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        archivoConvocatorias.createNewFile();
    }

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoConvocatorias))) {
        oos.writeObject(be5);
    }
}

public static HashMap<Integer, Convocatoria> recuperarConvocatorias() throws Exception {
    String rutaCompleta = rutaBase + File.separator + nombreArchivoConvocatorias;
    File archivoConvocatorias = new File(rutaCompleta);

    if (!archivoConvocatorias.exists()) {
        archivoConvocatorias.createNewFile();
        throw new Exception("La base de datos de convocatorias está vacía");
    }

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoConvocatorias))) {
        return (HashMap<Integer, Convocatoria>) ois.readObject();
    }
}
 
}
