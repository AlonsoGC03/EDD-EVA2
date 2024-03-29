/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author Alonso
 */
public abstract class Ropa extends Productos {
    private String talla;
    private String marca;
    private String color;

    public Ropa() {
        super ();
        this.talla = "";
        this.marca = "";
        this.color = "";
    }

    public Ropa(String talla, String marca, String color, double precio, String nombre, String unidadventa) {
        super(precio, nombre, unidadventa);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
