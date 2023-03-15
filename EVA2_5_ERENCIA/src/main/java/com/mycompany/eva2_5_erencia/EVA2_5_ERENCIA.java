package com.mycompany.eva2_5_erencia;

/**
 *
 * @author Alonso
 */
public class EVA2_5_ERENCIA {

    public static void main(String[] args) {
        subclase sun1 = new subclase();
        sun1.mensaje();
        sun1.mensaje1();
    }
}
class Superclase{
    public void mensaje (){
        System.out.println("hola");
    }
}
class subclase extends Superclase{
    public void mensaje1(){
        System.out.println("mundo");
    }
}
