/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.u2practica5illescas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class U2practica5Illescas {

 public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try (BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Desktop\\Diana5.txt"));
                BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Desktop\\Diana5.txt"));){
        
        bw.write("ESTO ES UNA PRUEBA USANDO BUFFERD");
         bw.newLine();
          bw.write("SEGUIMOS USANDO BUFFERD");
           bw.newLine();
            bw.write("HOLA A TODAS LAS CRIATURAS DEL MUNDO");
            bw.newLine();
             bw.write("PRACTICA");
            bw.newLine();
            bw.flush();
         String Linea=br.readLine();
         while (Linea != null){
             System.out.println(Linea);
             Linea=br.readLine();
         }
        
        } catch (IOException e){
            System.out.println("ERROR E/S: "+e);
        
        }
 }
}