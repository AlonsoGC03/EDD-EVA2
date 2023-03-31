/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_polimorfrismo;

/**
 *
 * @author Alonso
 */
public class EVA2_19_POLIMORFRISMO {

    public static void main(String[] args) {
        DOCENTES doc = new DOCENTES ("Miguel","Herrera",50,"tiempo completo");
        
        ESTUDIANTE es = new ESTUDIANTE ("Miguel","Herrera",20,"123231");
        
        
        //EN RESUMEN POLIMORFRIMOS ES 
        PEROSONA persona = doc;
        persona.imprimirdatos();
        PEROSONA persona2 = es;
        persona2.imprimirdatos();
        
        //no se puede hacer la convercion de super clase a sub clase
        //EN ESTE CASO NO EXISTE LA PLAZA
        PEROSONA per = new PEROSONA();
        DOCENTES doc = per;
        
    }
}

