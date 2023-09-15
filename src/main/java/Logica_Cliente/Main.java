/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author colom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crean las varibales
        
        String nombre;
        String cedula;
        int ano_de_nacimiento;
        int edad_actual;
        int edad;
        
        //se utiliza el objeto year para obtener el año actual
        Year date =Year.now();
        
        //añadimos el año actual en una varibale llamada año actual y almacenamos
        int año_actual = date.getValue();
        
        //se instancia el objeto persona
        Persona obj_persona = new Persona();
        
        //instanciamos el scanner para obtener la informacion de la persona
        Scanner scan = new Scanner(System.in);
        
        //preguntamos y almacenamos la informacion
        System.out.println("¿Cual es el nombre de la persona a registrar?:");
        nombre = scan.nextLine();
        
        //añadimos el nombre a nuestro objteto persona
        obj_persona.setNombre(nombre);
        System.out.println("¿Cual es el numero de cedula de la persona a registrar?:");
        cedula = scan.nextLine();
        obj_persona.setCedula(cedula);
        System.err.println("¿Cual es el año de nacimiento de "+nombre+"?:");
        ano_de_nacimiento = scan.nextInt();
        obj_persona.setAño_nacimiento(ano_de_nacimiento);
        
        int resultado= año_actual-obj_persona.getAño_nacimiento();
        
        //enviamos la edad al objeto
        
        System.out.println("Nombre de la persona es:"+obj_persona.getNombre()+"\n");
        System.out.println("La cedula es:"+obj_persona.getCedula()+"\n");
        System.out.println("La Edad actual es:"+resultado+"\n");
        

        

        

        
        
        
              
    }
    
}
