/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author Alonso
 */
public class Persona {
    private Integer id;
    private String nombre;
    private int edad;
    
    public Persona(){
        id = 0;
        nombre = "";
        edad = 0;
        
    }
    public Integer getid(){
        return id;
    }
    public void setid(Integer valor){
        id = valor;
    }
    public String getnombre(){
        return nombre;
    }
     public void setnombre(String valor){
        nombre = valor;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int valor){
        edad = valor;
    }
    public void imprimirdatos(){
        System.out.println("nombre:  " + nombre);
        System.out.println("id:  " + id);
        System.out.println("edad:  " + edad);
    }
}
