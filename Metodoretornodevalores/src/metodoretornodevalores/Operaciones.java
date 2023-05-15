/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoretornodevalores;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    public int sumar(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
    public int restar (int num1, int num2){
        int resta=num1-num2;
        return resta;
    }
     public int multiplicar (int num1, int num2){
        int multiplicacion=num1*num2;
        return multiplicacion;
    } 
     public float dividir (int num1, int num2){
         float division=num1/num2;
         return division;
     }
     public void resultado (int num1, int num2, int suma, int resta, int multiplicacion, float division){
         System.out.println(suma);
         System.out.println(resta);
         System.out.println(multiplicacion);
         if (num2!=0){
         System.out.println(division);
         } 
         else {
             System.out.println("no se puede dividir para cero");
       
     }
    
}}
