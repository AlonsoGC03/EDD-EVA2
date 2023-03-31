/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author Alonso
 */
public final class Computadora extends Electronica {
    private int memoria;
    private double tamanoPantalla;
    private double discoDuro;
    private String procesador;

    public Computadora() {
        super ();
        this.memoria = 0;
        this.tamanoPantalla = 0;
        this.discoDuro = 0;
        this.procesador = "";
    }

    public Computadora(int memoria, double tamanoPantalla, double discoDuro, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadventa) {
        super(fabricante, modelo, garantia, precio, nombre, unidadventa);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public double precioVenta(int cant) {
        //antes de cierta cantidad manejamos cierta cantidad
        //despues de cierta cantidad hay un descuento
        if (cant<= 10){
            return precio * cant;
        }else{
            return precio *(0.8) * cant;
        }
    }
    @Override
     public String toString(){
        String cade = "datos : " + "\n" +
                      "Memoria de:  " + memoria + "\n" + 
                       "tamano de la pantalla :  " + tamanoPantalla + "\n"+
                       "disco duro: "+ discoDuro + "\n"+
                       "procesador: " + procesador + "\n"+
                       "precio:   " + precio;
        return cade;
                      
    }
}
//final --> no se puede heredar de una clase con final
//class laptop extends Computadora{
    

//protected ---> permite la visiblidad de atributos y metodos entre clases relacionadas por herencia
//y se comporta como default : acceso a nivel de paquete

//final---> solo puedes declarar el valor una vez
//limita la herencia