/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author Alonso
 */
public class jeans extends Ropa{
    private String estilo;
    private String material;

    public jeans() {
        super ();
        this.estilo = "";
        this.material = "";
    }

    public jeans(String estilo, String material, String talla, String marca, String color, double precio, String nombre, String unidadventa) {
        super(talla, marca, color, precio, nombre, unidadventa);
        this.estilo = estilo;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

    @Override
    public double precioVenta(int cant) {
         if (cant<= 10){
            return getPrecio() * cant;
        }else{
            return (getPrecio()*0.7) * cant;
        }
    }
    
    
}
