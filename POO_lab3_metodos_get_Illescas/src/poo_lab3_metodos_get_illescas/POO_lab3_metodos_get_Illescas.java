/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_lab3_metodos_get_illescas;

import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author ESPE
 */
public class POO_lab3_metodos_get_Illescas {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String nombre, apellido;
        int edad;
        System.out.println("Imgrese nombre");
        nombre=teclado.nextLine();
        
         System.out.println("Imgrese apellido");
        apellido=teclado.nextLine();
        
         System.out.println("Imgrese edad");
        edad=teclado.nextInt();
        
        // creando objeto
        Persona persona1=new Persona();
        //metodo
        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setEdad(edad);
        //mostar valores
        System.out.println("EL NOMBRE ES: " +persona1.getNombre());
        System.out.println("EL APELLIDO ES: " +persona1.getApellido());
        System.out.println("LA EDAD ES: " +persona1.getEdad());
        
    }
    
}
