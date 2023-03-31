/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_interfaces_2;

/**
 *
 * @author Alonso
 */
public class EVA2_17_INTERFACES_2 {
    
    public static void main(String[] args) {
        Circulo ci = new Circulo();
        ci.setRadio(50);
        ci.imprimirDatos();
        Triangulo ti = new Triangulo(20,20);
        ti.imprimirDatos();
    }
}
interface IntA{
    void A(); //EQUIBALE A PUBLIC ABSTRACT
}
interface IntB{
    public abstract void B();//equibale a void B();
}
interface IntC extends IntA, IntB{
    public abstract void C();
}
class Prueba implements IntC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}