/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_22_a;

/**
 *
 * @author Alonso
 */
public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    private direccion Direccion;//perona has-a (tiene una) direccion

    public persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.Direccion = null;//ladireccion aun no existe
    }

    public persona(String nombre, String apellido, int edad, direccion Direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Direccion = Direccion;
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

    public direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(direccion Direccion) {
        this.Direccion = Direccion;
    }

        

    public void imprimirDatos() {
        System.out.println("Persona");
        System.out.println("nombre"+ nombre);
        System.out.println("apellido"+ apellido);
        System.out.println("edaad"+ edad);
        if (Direccion == null)
            System.out.println("no hay direccion");
        else
        Direccion.imprimirDatos();
    }
}
