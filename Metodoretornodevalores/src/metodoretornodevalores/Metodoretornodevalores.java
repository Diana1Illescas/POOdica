/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoretornodevalores;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Metodoretornodevalores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Operaciones operacion1=new Operaciones();
     int num1=Integer.parseInt(JOptionPane.showInputDialog("deme su primer numero"));
     int num2=Integer.parseInt(JOptionPane.showInputDialog("deme su segundo numero"));
        int suma=operacion1.sumar(num1, num2);
        int resta=operacion1.restar(num1, num2);
        int multiplica=operacion1.multiplicar(num1, num2);
        float divide=operacion1.dividir(num1, num2);
        operacion1.resultado(num1, num2, suma, resta, multiplica, divide);
    
      
    }
    
}
