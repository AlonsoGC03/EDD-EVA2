/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfrismo;

/**
 *
 * @author Alonso
 */
        //clase derivada extends clase base
        //clase hijo extends clase padre
        //subclase extends superclase
public class ESTUDIANTE extends PEROSONA {
    public String noControl;
    
    public ESTUDIANTE(){
      super(); //invoca el constructor de la super clase
      this.noControl = "---------";
    }

    public ESTUDIANTE( String nombre, String apellido, int edad,String noControl) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    


    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //REMPLAZAR EL METODO imprimirdatos DE LA SUPERCLASE
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("no de control:   " + noControl);
    }
}
