package com.mycompany.eva1_18_static;

/**
 *
 * @author Alonso
 */
public class EVA1_18_STATIC {

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeestatico();
        System.out.println("pi"+Math.PI);
        
    }
}
class Prueba{
public void mensaje(){//solo al crear objetos
    System.out.println("hola");

}
public static void mensajeestatico(){//se puede usar sin objetos
        System.out.println("aloha1");
}

}
