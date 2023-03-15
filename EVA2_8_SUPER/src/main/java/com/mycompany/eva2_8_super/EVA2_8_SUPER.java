/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_super;

/**
 *
 * @author Alonso
 */
public class EVA2_8_SUPER {

    public static void main(String[] args) {
        animal ani = new animal(200);
        
        mamifero mam = new mamifero("negro",2005);
        perros pe = new perros();
        
    }
}
class animal{
    private int peso;

    public animal(int peso) {
        this.peso = peso;
         System.out.println("Animal: its alive constructor dos");
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public animal(){
        System.out.println("Animal: its alive");
    }
    public void respirar(){
        System.out.println("estoy respirando");
    }
    public void comer(){
        System.out.println("puedo comer");
    }
}
class mamifero extends animal{
    private String colorpelo;
    public mamifero(){
        super();//llamada al constructor de la super clase
                //en nuestro caso esta llamando a animal
                //simpre deba llamar primero al constructor de la superclase
        System.out.println("soy mamifero");
    }

    public mamifero(String colorpelo, int peso) {
        super(peso);//siempre llama al constructor de la superclase
        this.colorpelo = colorpelo;
        System.out.println("soy mamifero constructor 2");
    }
    
    

    public mamifero(int peso) {
        super(peso);
    }

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }
    
}

class perros extends mamifero{
    public perros(){
        super();
        System.out.println("soy fido y soy un perro");
    }
    
}