package u2p16polimorfismo;

public class U2P16Polimorfismo {

    public static void main(String[] args) {
        
        mostrarDatosFiguras(new Triangulo(4, 5,"amarillo"));
        mostrarDatosFiguras(new Circulo(5,"verde"));
        mostrarDatosFiguras(new Cuadrado(5,5,"rojo"));
        
    }
    //APLICANDO POLIMORFISMO 
    //la gran ventaja del polimorfismo es la reutlizacion del codigo 
    //Al forzar a todas las clases a tener el mismo formato de metodo
    //esta expresion vale para cualquier subclase de figura
    //cuyos objtos vengan aqui como parametro
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("color :" + f.getColor());
        System.out.println("Superficie :" + f.superficie());
        
    }
}
