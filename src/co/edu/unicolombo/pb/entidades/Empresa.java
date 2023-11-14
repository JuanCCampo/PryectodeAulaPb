/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Jesus Ramos
 */
public class Empresa extends Usuario implements Serializable{
    public static HashMap<String, Empresa> empresas = new HashMap<>();
    public String nit;
    public String telefono;
    public ArrayList <Convocatoria> convocatorias = new ArrayList<>();
    
    
     public Empresa(String nit, String telefono) {
        this.nit = nit;
        this.telefono = telefono;
        this.TipoUsuario = "Empresa";
    }


    public Empresa() {
        this.TipoUsuario = "Empresa";
    }
}
