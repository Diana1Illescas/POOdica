/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tallerenclase_dianaillescas;

/**
 *
 * @author DIANITA CAROLINA
 */
public class Tallerenclase_DianaIllescas {

     public static void main(String[] args) {
        Auto auto = new Auto("PWX0478", "Toyota", 4, 0);
        auto.mostrarauto();
        auto.onofparabtisas();
        auto.addmulta();
        System.out.println("Multa: " + auto.getMulta());
        
        System.out.println("============================");

        Camion camion = new Camion("PWX0475", "Jac", 6, 0);
        camion.mostrarcamion();
        camion.onofparabtisas();
        camion.setColor("Blanco");
        camion.setCarga(400.0);
        System.out.println("Color: " + camion.getColor());
        System.out.println("Carga: " + camion.getCarga());
    }

        }
    

