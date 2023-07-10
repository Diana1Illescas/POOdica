/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2p16polimorfismo;

import java.util.Scanner;

public class Cuadrado extends Figura{
    private int largo;
    private int ancho;

    public Cuadrado(int largo, int ancho, String color) {
        super(color);
        this.largo=largo;
        this.ancho=ancho;
    }

    @Override
    public double superficie() {
        return largo * ancho;
    }
    
}
