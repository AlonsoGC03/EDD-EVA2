/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_override;

/**
 *
 * @author Alonso
 */
public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona per = new Persona ();
        Persona per2 = new Persona ("miguel",27);
        
        System.out.println(per);
        System.out.println(per2);
    }
}

class Persona{
    private String name;
    private int edad;
   
    public Persona(){
        this.name = "______";
        this.edad = -1;
        
    }

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String cade = "datos : \n" +
                       "nombre:  " + name + "\n" + 
                       "edad:  " + edad;
        return cade;
    }
}

