/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import co.edu.unicolombo.pb.persistencia.Almacenamiento;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Jesus Ramos
 */
public class Empresa implements Serializable{

    public static HashMap<String, Empresa> empresas = new HashMap<>();
    public String nombre;
    public String nit;
    public String telefono;
    public String direccion;
    public String mision;
    public String vision;
    public UsuarioEm usuarioEm;
    public Convocatoria nuevaConvocatoria;
    public static List <Convocatoria> convocatorias = new ArrayList<>();

    public String correo; 

    public Empresa(String nombre, String nit, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mision = mision;
        this.vision = vision;
        this.correo = correo;
    }

    public Convocatoria getNuevaConvocatoria() {
        return nuevaConvocatoria;
    }


    public void setNuevaConvocatoria(Convocatoria nuevaConvocatoria) {
        this.nuevaConvocatoria = nuevaConvocatoria;
    }

    public static List<Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    public static void setConvocatorias(List<Convocatoria> convocatorias) {
        Empresa.convocatorias = convocatorias;
    }

  
    

  

    public static HashMap<String, Empresa> getEmpresas() {
        return empresas;
    }

    public static void setEmpresas(HashMap<String, Empresa> empresas) {
        Empresa.empresas = empresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

       @Override
public String toString() {
    return "Empresa{" +
            "nombre='" + nombre + '\'' +
            ", nit='" + nit + '\'' +
            ", telefono='" + telefono + '\'' +
            ", direccion='" + direccion + '\'' +
            ", convocatorias=" + convocatorias +
            ", correo='" + correo + '\'' +
            '}';
}
   
public void crearConvocatoria(int numeroConvocatoria, Date fechaInicio, Date fechaFin, String vacante, String sueldo) {
    // Crear una nueva convocatoria
     nuevaConvocatoria = new Convocatoria(numeroConvocatoria, fechaInicio, fechaFin, vacante, sueldo);
    
    // Agregar la convocatoria al ArrayList de convocatorias de la empresa
    this.convocatorias.add(nuevaConvocatoria);
  
    try {
        // Guardar la empresa actualizada en el almacenamiento
        Almacenamiento.guardarE(Empresa.empresas);
    } catch (IOException error) {
        System.out.println("Error al guardar la empresa: " + error.getMessage());
    }
}

}
