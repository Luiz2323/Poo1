/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author colom
 */
public class Persona {
    //se crean los atributos de la clase
    public String nombre;
    public String cedula;
    public int año_nacimiento;
    
    
    //se genera el contructor sin parametros

    public Persona() {
    }
    
    //se crea el constructor parametrizado

    public Persona(String nombre, String cedula, int año_nacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.año_nacimiento = año_nacimiento;
    }

  
    
    //se generan los metodos get

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    
    
    //se generan los metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

   
    
    
    
    
}
