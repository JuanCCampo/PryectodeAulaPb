/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import java.util.*;

/**
 *
 * @author Jesus Ramos
 */
public class Convocatoria {
    public String numero;
    public Date Fecha_Inicio;
    public Date Fecha_Fin;
    public String Vacante;
    public int Sueldo;
    public ArrayList <Object> Usuarios_Que_Aplicaron = new ArrayList<>();
    
      
    public Convocatoria(String numero, Date fecha_Inicio, Date fecha_Fin, String bacante, int sueldo) {
        this.numero = numero;
        Fecha_Inicio = fecha_Inicio;
        Fecha_Fin = fecha_Fin;
        Vacante = bacante;
        Sueldo = sueldo;
    }
    public Convocatoria() {}
}
