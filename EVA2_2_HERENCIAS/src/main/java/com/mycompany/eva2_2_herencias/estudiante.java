/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencias;

/**
 *
 * @author Alonso
 */
public class estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String ncontrol;
    public estudiante(){
        
    }

    public estudiante(String nombre, String apellido, int edad, String ncontrol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ncontrol = ncontrol;
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

    public String getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(String ncontrol) {
        this.ncontrol = ncontrol;
    }
    
}
