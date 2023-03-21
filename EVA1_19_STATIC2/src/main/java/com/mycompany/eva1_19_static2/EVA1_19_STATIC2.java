package com.mycompany.eva1_19_static2;

/**
 *
 * @author Alonso
 */
public class EVA1_19_STATIC2 {
int x = 100;
    public static void main(String[] args) {
        EVA1_19_STATIC2 obj = new EVA1_19_STATIC2();
        System.out.println(obj.x);
        obj.mensajenoestatico();
        
    }
    public void mensajenoestatico(){//no existe
        System.out.println("Mensaje no estatico");
}
}    
