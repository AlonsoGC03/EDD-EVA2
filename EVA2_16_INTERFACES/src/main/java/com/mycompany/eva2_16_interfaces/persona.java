/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_16_interfaces;

/**
 *
 * @author Alonso
 */
public class persona implements mostar_datos{
        private String nombre;
        private int edad;
        
        public persona(){
            this.nombre = "";
            this.edad = 0;
            
        }

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("nombre:  " + nombre);
        System.out.println("edad:  " + edad);
    }
        
}
