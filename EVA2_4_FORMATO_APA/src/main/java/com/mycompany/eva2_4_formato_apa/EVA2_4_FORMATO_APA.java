/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author Alonso
 */
public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        informe inf1 = new informe();
            inf1.setAutor("diosito");
            inf1.setAno(0);
            inf1.setMes("diciembre");
            inf1.setDia(25);
            inf1.setCiudad("belen");
            inf1.setTitulo("biblia");
            inf1.setEditorial("carpinteria jose corporation");
            inf1.setIndustria("igesia");
            inf1.setDepartamento("catolisismo");
            
            System.out.println("titulo:  " + inf1.getTitulo());
            System.out.println("autor:  " + inf1.getAutor());
            System.out.println("fecha de lansamiento:  " + inf1.getAno() + inf1.getMes() + inf1.getDia());
            System.out.println("ciudad:  " + inf1.getCiudad());
            System.out.println("editorial : " + inf1.getEditorial());
            System.out.println("industria:  " + inf1.getIndustria());
            System.out.println("departamento: " + inf1.getDepartamento());
        
    }
}
