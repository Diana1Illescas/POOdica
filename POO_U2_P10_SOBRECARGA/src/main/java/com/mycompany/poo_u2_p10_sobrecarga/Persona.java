/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_u2_p10_sobrecarga;

/**
 *
 * @author ESPE
 */
public class Persona {
    //atributos
    String nombre;
    int edad;
    int cedula;
//constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre; //el atributo absorve el dato del parametro
        this.edad = edad;
    }
    //sobrearga de constructores , sobrearga de metodos

    public Persona(int cedula) {
        this.cedula = cedula;
    }
    //metodo
    public void jugar (){
     System.out.println("Mi nombre es : " + nombre + " voy a jugar ");
}
    public void jugar (String juego){
     System.out.println("Voy a jugar: " + juego + " porque me gusta mucho ");
}
}
