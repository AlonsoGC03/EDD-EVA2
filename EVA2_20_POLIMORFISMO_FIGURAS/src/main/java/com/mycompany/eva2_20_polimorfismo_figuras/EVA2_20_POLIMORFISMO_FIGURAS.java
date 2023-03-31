/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        /*Circulo cir = new Circulo(5);
        cir.imprimirDatos();
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIANTE FIGURAS
        Figuras fig = cir ;
        System.out.println("USANDO FIGURAS");
        System.out.println("area:  " + fig.calcularArea());
        System.out.println("perimetro:  " + fig.calcularPerimetro());
       */
       /*int [] arreglo = new int[10];//arreglo que guarda 10 enteros
       //primer pocision:0 
       //ultima pocicion:N-1, n = cantidad de elementos del arreglo
       arreglo[10]=100;
        System.out.println(arreglo[0]);
        */
        System.out.println("Cuantas figuras nececitas");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] figuras = new Figuras[cant];
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("que tipo de figura necesitas : 1=circulo 2= triangulo");
            int tipo = input.nextInt();
            if (tipo==1){//circulo
                Circulo cir = new Circulo();
                System.out.println("cual es el radio del circulo?");
                cir.setRadio(input.nextDouble());//captura los datos del usuario
                figuras[i] = cir;
            }else{//triangulo
                Triangulo tri = new Triangulo();
                System.out.println("introduce la base");
                tri.setBase(input.nextDouble());
                System.out.println("introduce la altura");
                tri.setAltura(input.nextDouble());
                figuras[i] = tri;
            }
        }
        //imprimir los resultados
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo){
                System.out.println("circulo" + i);
                //casting -->convercion
                //ejemplo
                //int val = (int =)(Math.random()*100);
                Circulo cir = (Circulo)figuras[i];
                cir.imprimirDatos();
            } else{
                System.out.println("triangulo" + i);
                Triangulo tri = (Triangulo)figuras[i];
                    tri.imprimirDatos();
            }
            
            System.out.println("area: " + figuras[i].calcularArea());
            System.out.println("perimetro: " + figuras[i].calcularPerimetro());
        }
        /*Circulo[] circulos = new Circulo[cant];
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprimirDatos();
        }
*/
    }
}
