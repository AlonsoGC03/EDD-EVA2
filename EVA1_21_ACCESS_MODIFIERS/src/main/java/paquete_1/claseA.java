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
//todos estas clases estan en paquete 1 
//solo se muestran public y default
public class claseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        claseB objB = new claseB();
        objB.publicB;
        objB.defaultB;
        
        Clase_C objC = new Clase_C();
        objC.publicC;
        objC.defaultC;
        
        ClaseD objD = new ClaseD();
        objD.publicD;
        objD.defaultD;
        
        //clases del paquete 2
        //todo lo que sea default es ahora invisible
        Clase_E objE = new Clase_E();
        objE.publicE;
        
        //Clase F es Default por lo tanto no es visible dese la clase A
        Clase_F objF = new Clase_F();
    }
}
class claseB{
    public int publicB;
    int defaultB;
    private int privateB;
    public void prueba(){
        claseB objB = new claseB();
        objB.publicB;
        objB.defaultB;
        
        Clase_C objC = new Clase_C();
        objC.publicC;
        objC.defaultC;
        
        ClaseD objD = new ClaseD();
        objD.publicD;
        objD.defaultD;
        
        //clases del paquete 2
        //todo lo que sea default es ahora invisible
        Clase_E objE = new Clase_E();
        objE.publicE;
        
        //Clase F es Default por lo tanto no es visible dese la clase A
        Clase_F objF = new Clase_F();
    }
}
}
