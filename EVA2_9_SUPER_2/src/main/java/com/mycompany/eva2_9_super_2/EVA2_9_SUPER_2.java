/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_super_2;

/**
 *
 * @author Alonso
 */
public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        ESTUDIANTE est = new ESTUDIANTE ("alonso","grajiola",20,"8465889");
        est.imprimirdatos();
        System.out.println("NUMERO DE CONTROL  :" + est.noControl);

        DOCENTES dos = new DOCENTES ("alonso","grajiola",20,"simon");
        dos.imprimirdatos();
    }
}
