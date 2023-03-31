/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_polimorfrismo;

/**
 *
 * @author Alonso
 */
public class DOCENTES extends PEROSONA {
    private String plaza;

    public DOCENTES(String plaza) {
        super();
        this.plaza = plaza;
    }

    public DOCENTES(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("plaza:  " + plaza);
    }
    
}
