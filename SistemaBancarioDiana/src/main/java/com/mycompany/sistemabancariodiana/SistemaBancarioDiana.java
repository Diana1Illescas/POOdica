/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemabancariodiana;
public class SistemaBancarioDiana {

    public static void main(String[] args) {
      Cuenta cuen1 = new Cuenta ("Dica", 1000);//se envia el dato
        cuen1.cuentita();
        
        Cuenta cuen2 = new Cuenta ("Dica", 1000);
        cuen2.cuentita("dinerito ");
        
    }
}
