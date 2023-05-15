/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Operaciones {
    int num1;
    int num2;
    int suma, resta, multiplicacion;
    double division;
    
    public void capturarnumeros (){
       num1=Integer.parseInt(JOptionPane.showInputDialog("deme su primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("deme su segundo numero"));
        
    }
    public void sumar (){
        suma=num1+num2;
    }
     public void restar (){
        resta=num1-num2;
    }
      public void dividir (){
          if(num2!=0){
        division=num1/num2;
    } else {System.out.println("no se puede dividir para 0");}
      }
      public void resultado(){
          System.out.println(suma);
          System.out.println(resta);
          System.out.println(multiplicacion);
          if (num2!=0){
              System.out.println(division);
          }
      }

    void multiplicacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
