/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author Alonso
 */
public class informe extends Documento {
    public String editorial;
    public String industria;
    public String departamento;

    public informe() {
    }

    public informe(String editorial, String industria, String departamento) {
        this.editorial = editorial;
        this.industria = industria;
        this.departamento = departamento;
    }
    
    

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
