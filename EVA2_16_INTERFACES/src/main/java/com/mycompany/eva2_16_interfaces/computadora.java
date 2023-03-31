package com.mycompany.eva2_16_interfaces;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alonso
 */
public class computadora extends producto  implements mostar_datos {
   
    
    private String marca;
    private String modelo;

    public computadora(String marca, String modelo) {
        super ();
        this.marca = "";
        this.modelo = "";
    }

    public computadora(String marca, String modelo, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("nombre " + getNombre());
        System.out.println("precio " + getPrecio());
        System.out.println("marca " + getMarca());
        System.out.println("modelo " + getModelo());
    }
    
    
}
