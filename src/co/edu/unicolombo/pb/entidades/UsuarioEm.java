/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import co.edu.unicolombo.pb.persistencia.Almacenamiento;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Jesus Ramos
 */
public class UsuarioEm implements Serializable{
 public static HashMap<String, UsuarioEm> usuarioEm = new HashMap<>();
  public String contrasena;
    public String correo; 
    public String nombre;
    public String cedula;   
    public String cargo;
    public Empresa empresaAsociada;
     public List<Empresa> empresas = new ArrayList<>();

    public UsuarioEm(String contrasena, String correo, String nombre, String cedula, String cargo) {
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.cargo = cargo;
        this.empresaAsociada = empresaAsociada;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(Empresa empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
   
public void crearEmpresa(String nombreEmpresa, String nit, String telefono, String mision, String vision, String direccion, String correo) {
    // Crear una nueva empresa y establecer la referencia en el usuario
    this.empresaAsociada = new Empresa(nombreEmpresa, nit, telefono, direccion, correo);
    // Agregar la empresa a la lista de empresas del usuario (opcional)
    this.empresas.add(empresaAsociada);
    // Guardar el usuario actualizado en el almacenamiento
    try {
        Almacenamiento.guardarUE(UsuarioEm.usuarioEm);
    } catch (IOException error) {
        System.out.println("Error al guardar el usuario empresarial: " + error.getMessage());
    }
}
  
  public Empresa obtenerEmpresaAsociada() {
        return this.empresaAsociada;
    }
    
   

@Override
public String toString() {
    return "UsuarioEm{" +
            ", correo='" + correo + '\'' +
            ", nombre='" + nombre + '\'' +
            ", cedula='" + cedula + '\'' +
            ", cargo='" + cargo + '\'' +
            ", empresaAsociada=" + empresaAsociada +
            '}';
}
  
     
}
