/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_u2_p10_sobrecarga;

/**
 *
 * @author ESPE
 */
public class POO_U2_P10_SOBRECARGA {

    public static void main(String[] args) {
        Persona person1 = new Persona ("Diana ", 28); //se envia el dato
        person1.jugar();
        
        Persona person2 = new Persona (230027);
        person2.jugar("Futbol ");
    }
}
