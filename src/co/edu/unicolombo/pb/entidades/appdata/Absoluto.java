/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.entidades.appdata;

import co.edu.unicolombo.pb.entidades.BuscaEmpleo;
import co.edu.unicolombo.pb.entidades.Empresa;
import java.util.ArrayList;

/**
 *
 * @author Jesus Ramos
 */
public class Absoluto {
     //XXXXXXXXXXXXXXXXXXXX Empresa XXXXXXXXXXXXXXXXXXXX
    public static ArrayList <Empresa> Lista_empresas = new ArrayList<>(); //la convocatoria es una propiedad de la empresa
    // Otros elementos
    public static Empresa Empresa_Satita_Element;
    public static ArrayList<Runnable> Lista_Editar_Empresas = new ArrayList<>();
    

    
    // XXXXXXXXXXXXXXXXXXXX Egresado XXXXXXXXXXXXXXXXXXXX
    public static ArrayList <BuscaEmpleo> Lista_buscaEmpleos = new ArrayList<>();
    // Otros elementos
    public static ArrayList<Runnable> Lista_Editar_buscaEmpleo = new ArrayList<>();
    public static BuscaEmpleo buscaEmpleos_Statica_Element;
    

    // XXXXXXXXXXXXXXXXXXXX programa XXXXXXXXXXXXXXXXXXXX
    // Session del usuario
    public static Object User_Session = null; // guarda el suaurio que se va a logear

}
