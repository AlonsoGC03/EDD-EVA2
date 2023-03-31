/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimorfrismo_vehiculos;

/**
 *
 * @author Alonso
 */
public class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int ano;

    public Automovil() {
        super();
        this.modelo = "----";
        this.ano= 0;
    }

    public Automovil(String modelo, int ano, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void cambiarvelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >0)
        velocidad=vel;

    }
        @Override
    public void tablero() {
            System.out.println("automovil:  ");
            System.out.println("velocidad:  " + velocidad);
            System.out.println("combustiblo:   (pendientre)" );
            System.out.println("revoluciones:  " );
    }
    }


    

