/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_figuras;

/**
 *
 * @author Alonso
 */
public class Circulo extends Figuras {
    private double radio;
    private double area;
    private double perimetro;
    
    public Circulo(){
        this.area = -1;
        this.perimetro = -1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        area = (Math.PI * radio)*(Math.PI * radio);
        return area;
    }
    @Override
    public double calcularPerimetro(){
        perimetro = (Math.PI)*(radio*2);
        return perimetro;
    }
    @Override
    public String toString(){
        area = calcularArea();
        perimetro = calcularPerimetro();
        String cade = "datos : \n" + 
                       "Area del circulo:  " + area + "\n" + 
                       "Perimetro del circulo:  " + perimetro;
        return cade;
    }
    
}
