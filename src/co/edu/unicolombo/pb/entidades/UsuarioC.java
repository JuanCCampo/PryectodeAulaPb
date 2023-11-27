/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;


import java.io.Serializable;
import java.util.*;


/**
 *
 * @author Jesus Ramos,camilo essalas y juan campo.
 */
public class UsuarioC implements Serializable{
    public static HashMap<String, UsuarioC> candidato = new HashMap<>();

    public static UsuarioC getUsuarioActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public String contrasena;
    public String correo; 
    public String nombre;
    public String cedula;
    public String profesion;
    public String experiencia_laboral;
    public String edad;
    
    
    
}
