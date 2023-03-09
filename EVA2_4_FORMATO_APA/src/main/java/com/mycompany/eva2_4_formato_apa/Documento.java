/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author Alonso
 */
public class Documento {
    private String autor;
    private String titulo;
    private int ano;
    private String mes;
    private int dia;
    private String ciudad;

    public Documento() {

    }

    public Documento(String autor, String titulo, int ano, String mes, int dia, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.ciudad = ciudad;
    }
    
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
