/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapoovariablesdica;

/**
 *
 * @author ESPE
 */
public class horasdeldia {
    public static void main(String[] args) {
        //sentencia
        int hora= -5;
        if (hora > 00 && hora <=12) {
            System.out.println("buenos dias");
        }else if (hora > 12 && hora <=18) {
            System.out.println("buenas tardes");
        }else {
            System.out.println("buenas noches");
        }
    }
}
