/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author Alonso
 */
public abstract class Productos  {
    protected double precio;
    private String nombre;
    private String unidadventa;
    
    public Productos(){
        this.precio = -1;
        this.nombre = "";
        this.unidadventa="";
        
    }

    public Productos(double precio, String nombre, String unidadventa) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidadventa = unidadventa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadventa() {
        return unidadventa;
    }

    public void setUnidadventa(String unidadventa) {
        this.unidadventa = unidadventa;
    }
    public abstract double precioVenta (int cant);
    
}
