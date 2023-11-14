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
public class BuscaEmpleo extends Usuario implements Serializable{
    public static HashMap<String, BuscaEmpleo> buscaEmpleo = new HashMap<>();
    public String cedula;
    public String profesion;
    public String experiencia_laboral;
    
       public BuscaEmpleo(String cedula, String profesion, String experiencia_laboral) {
        this.cedula = cedula;
        this.profesion = profesion;
        this.TipoUsuario = "BuscaEmpleo";
    }

    public BuscaEmpleo() {
        this.TipoUsuario = "BuscaEmpleo";
    }
}
