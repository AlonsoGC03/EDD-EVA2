/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_herencia_constructores;

/**
 *
 * @author Alonso
 */
public class EVA2_6_HERENCIA_CONSTRUCTORES {

    public static void main(String[] args) {
        System.out.println("clase animal");
        ANIMAL ani = new ANIMAL();
        ani.comer();
        ani.respirar();
        System.out.println("clase mamifero");
        MAMIFERO mam = new MAMIFERO();
        mam.respirar();
        mam.comer();
        mam.pelo();
    }
}
