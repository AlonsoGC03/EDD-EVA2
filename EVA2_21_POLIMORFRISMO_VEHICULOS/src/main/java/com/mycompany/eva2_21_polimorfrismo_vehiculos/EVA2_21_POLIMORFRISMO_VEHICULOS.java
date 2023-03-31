/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_polimorfrismo_vehiculos;

/**
 *
 * @author Alonso
 */
public class EVA2_21_POLIMORFRISMO_VEHICULOS {

    public static void main(String[] args) {
        Automovil auto = new Automovil ("chevy",2009,"ford",200 );
        modificarvel (auto,50);
        Bicicleta bici = new Bicicleta ("bmx","terreneitor",20);
        modificarvel (bici, 30);
    }
    public static void modificarvel(ControlarDatos datos,int vel){
        datos.cambiarvelocidad(vel);
        datos.tablero();
    }
}
