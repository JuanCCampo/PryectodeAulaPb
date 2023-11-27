/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Jesus Ramos
 */
public class Convocatoria implements Serializable{
    public static HashMap<Integer, Convocatoria> convocatorias = new HashMap<>();
    public int numero;
    public Date Fecha_Inicio;
    public Date Fecha_Fin;
    public String Vacante;
    public String Sueldo;
    public ArrayList <UsuarioC> Usuarios_Que_Aplicaron = new ArrayList<>();
    public Empresa empresa;

    public Convocatoria(int numero, Date Fecha_Inicio, Date Fecha_Fin, String Vacante, String Sueldo) {
        this.numero = numero;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.Vacante = Vacante;
        this.Sueldo = Sueldo;
    }


    public static HashMap<Integer, Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    public static void setConvocatorias(HashMap<Integer, Convocatoria> convocatorias) {
        Convocatoria.convocatorias = convocatorias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(Date Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public String getVacante() {
        return Vacante;
    }

    public void setVacante(String Vacante) {
        this.Vacante = Vacante;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
     public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return "Número de Convocatoria: " + numero +
               "\nFecha de Inicio: " + formatoFecha.format(Fecha_Inicio) +
               "\nFecha de Fin: " + formatoFecha.format(Fecha_Fin) +
               "\nVacante: " + Vacante +
               "\nSueldo: " + Sueldo;
    }
      
  
}
