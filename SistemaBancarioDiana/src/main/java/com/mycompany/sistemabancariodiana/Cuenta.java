/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancariodiana;

/**
 *
 * @author ESPE
 */
public class Cuenta {
        //atributos
    String nombre;
   private int saldo;
   private int cedula;
   private int contraseña;
//constructor
    public Cuenta(String dica, int saldo) {
        this.nombre = nombre; //el atributo absorve el dato del parametro
        this.saldo = saldo;
    }
    //sobrearga de constructores , sobrearga de metodos

    public Cuenta(int cedula, int contraseña) {
        this.cedula = cedula;
        this.contraseña= contraseña;
    }
    
    //metodo
    public void cuentita (){
     System.out.println("Mi nombre es : " + nombre + " y soy millonaria ");
}
    public void cuentita (String cuentita){
     System.out.println("Voy a depositar: " + cuentita + " porque quiero comprar un carro ");
}
}

    

