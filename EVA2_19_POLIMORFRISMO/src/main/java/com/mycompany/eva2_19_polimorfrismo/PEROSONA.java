/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfrismo;

/**
 *
 * @author Alonso
 */
public class PEROSONA {
    private String nombre;
    private String apellido;
    private int edad;
    public PEROSONA(){
        this.nombre = "--------";
        this.apellido = "--------";
        this.edad =-1;
        
    }
        public PEROSONA(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirdatos(){
        System.out.println("datos");
        System.out.println("nombre  :" + this.nombre);
        System.out.println("apellido  :" + this.apellido);
        System.out.println("edad  :" + this.edad);
            }


    
    
    
}


