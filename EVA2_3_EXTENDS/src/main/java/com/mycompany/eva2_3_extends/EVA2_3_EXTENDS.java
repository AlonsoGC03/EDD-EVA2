/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_extends;

/**
 *
 * @author Alonso
 */
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        ESTUDIANTE estu =  new ESTUDIANTE();
        estu.setApellido("grajiola");
        estu.setNombre("alonso");
        estu.setEdad(99);
        estu.setNoControl("6548965489");
        
        System.out.println(estu.getApellido());
        System.out.println(estu.getNombre());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        
        DOCENTES DOSE =  new DOCENTES();
        DOSE.setNombre("miguel");
        DOSE.setApellido("herrera");
        DOSE.setEdad(500);
        DOSE.setPlaza("conserge");
        
        System.out.println("Nombre y apellido:  "+ DOSE.getNombre() + DOSE.getApellido());
        System.out.println("edad: " + DOSE.getEdad());
        System.out.println("plaza: " + DOSE.getPlaza());

    }
}
