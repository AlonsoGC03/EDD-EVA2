/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_interfaces;

/**
 *
 * @author Alonso
 */
public class EVA2_16_INTERFACES {

    public static void main(String[] args) {
        //mostar_datos ob = new mostar_datos(); (no se puede instanciar una interfas)
        persona pe = new persona("pepe",5);
        pe.imprimirdatos();
        computadora co = new computadora ("daas","sdads",50.0,"ads");
        co.imprimirdatos();
    }
}
