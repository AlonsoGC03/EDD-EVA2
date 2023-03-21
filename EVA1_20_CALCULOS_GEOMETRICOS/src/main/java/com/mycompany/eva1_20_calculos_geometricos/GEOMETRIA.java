package com.mycompany.eva1_20_calculos_geometricos;

/**
 *
 * @author Alonso
 */
public class GEOMETRIA {
    public static final double Pi = 3.1416;
    public static double perimetrocirculo(double radio){
        return Pi * (radio*2);
    }
    public static double areacirculo(double radio){
        return Pi * (radio*radio);
        
    }
    public static double volumenesfera(double radio){
        return (4.0/3.5)*(Pi*(radio*radio*radio));
    }
}
