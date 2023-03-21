package com.mycompany.eva1_16_sobrecarga_2;

/**
 *
 * @author Alonso
 */
public class EVA1_16_SOBRECARGA_2 {

    public static void main(String[] args) {
        System.out.println("suma  :"   + suma(4,9));
        System.out.println("suma  :"   + suma(4.0,9.0));
        System.out.println("suma  :"   + suma("hola","mundo"));
        suma();
    }
    public static int suma(int val1,int val2){
        return val1+val2;
    }
    public static double suma(double val1,double val2){
        return val1+val2;
    }
    public static String suma(String val1,String val2){
        return val1+val2;
    }
    public static String suma(){
        System.out.println("Suma:  sin argumento");
        return null;
    }
}
