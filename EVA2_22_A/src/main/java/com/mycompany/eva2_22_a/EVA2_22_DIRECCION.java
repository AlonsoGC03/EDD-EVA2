/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_22_a;

/**
 *
 * @author Alonso
 */
public class EVA2_22_DIRECCION {

    public static void main(String[] args) {
        persona per = new persona();
            per.setNombre("alonso");
            per.setApellido("grajiola");
            per.setEdad(20);
            direccion dir = new direccion ();
            dir.setCalle("Av. industrial");
            dir.setNumero(11101);
            dir.setColonia("complejo industrial chihuahua");
            dir.setCp("31305");
            dir.setCiudad("chihuahua");
            dir.setEstado("chihuahua");
            per.setDireccion(dir);
            per.imprimirDatos();
            
        
    }
}
