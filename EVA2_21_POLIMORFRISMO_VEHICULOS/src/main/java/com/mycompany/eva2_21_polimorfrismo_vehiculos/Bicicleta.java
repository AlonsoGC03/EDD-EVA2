/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfrismo_vehiculos;

/**
 *
 * @author Alonso
 */
public class Bicicleta extends Vehiculo implements ControlarDatos {
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = tipo;
    }

    public Bicicleta(String tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >0)
        velocidad=vel;
    }

    @Override
    public void tablero() {
        System.out.println("bicicleta");
        System.out.println("velocidad:  " + velocidad);
    }
    
    
    
}
