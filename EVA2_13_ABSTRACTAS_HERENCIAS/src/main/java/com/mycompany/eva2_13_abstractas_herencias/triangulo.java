/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_abstractas_herencias;

/**
 *
 * @author Alonso
 */
public class triangulo extends Figuras {
    private double base;
    private double altura;
    private double area;
    private double perimetro;
   
    public triangulo(){
        this.area = -1.0;
        this.perimetro = -1.0;
    }

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        
    }
        
    @Override
    public double calcularArea(){
        area=(base*altura)/2;
        return area;
        
    }
    @Override
    public double calcularPerimetro(){
        double hip = Math.sqrt(base*base)+(altura*altura);
        perimetro= base + altura + hip;
        return perimetro;
    }
    @Override
      public String toString(){
          area = calcularArea();
          perimetro = calcularPerimetro();
        String cade = "datos : \n" + 
                       "Area del triangulo:  " + area + "\n" + 
                       "Perimetro del triangulo:  " + perimetro;
        return cade;
    }
      
}
  