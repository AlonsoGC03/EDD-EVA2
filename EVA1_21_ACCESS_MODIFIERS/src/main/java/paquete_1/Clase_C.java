/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_1;

import paquete_2.Clase_E;

/**
 *
 * @author Alonso
 */
public class Clase_C {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        claseB objB = new claseB();
        objB.publicB;
        objB.defaultB;
        
        //clase del paquete2
        Clase_E objE = new Clase_E();
        objE.publicE;
        
        //CLASE F ESTA EN OTRO PAQUETE Y ES DEFAULT
        Clase_F objF = new Clase_F();
        
    }
    
    
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
    
}