
package javaapplication1;
public class Personas {
    private String[] nombres;

    public Personas(String[] nombres) {
        this.nombres = nombres;
    }

    public void mostrarPersonas() {
        System.out.println("Nombres de las personas ingresadas:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}