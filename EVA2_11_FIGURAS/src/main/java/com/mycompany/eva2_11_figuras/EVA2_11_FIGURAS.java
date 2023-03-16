/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_figuras;

/**
 *
 * @author Alonso
 */
public class EVA2_11_FIGURAS {

    public static void main(String[] args) {
        Circulo cir = new Circulo (50.00);
        Triangulo tri = new Triangulo(50.00,60.00);
        System.out.println(cir);
        System.out.println(tri);
        
        Figuras fig = new Figuras ();
        System.out.println(fig.calcularArea());
        System.out.println(fig.calcularPerimetro());
        
    }
}
