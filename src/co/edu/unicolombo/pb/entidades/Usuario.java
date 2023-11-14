/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import java.io.Serializable;
import org.eclipse.persistence.sessions.serializers.Serializer;

/**
 *
 * @author Jesus Ramos
 */
public class Usuario implements Serializable{
    public String contrasena;
    public String correo; 
    public String nombre;
    public String TipoUsuario;
}
