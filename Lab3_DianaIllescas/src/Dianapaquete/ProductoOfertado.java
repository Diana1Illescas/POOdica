package Dianapaquete;

public class ProductoOfertado extends Producto {
	//Atributo
    private int dias;
    //Constructor
    public ProductoOfertado(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
    //GET Y SET
    public int getDias() {
        return dias;
    }
    
    public void setDias(int dias) {
        this.dias = dias;
    }
    
    @Override //METODO
    public double obtenerPrecioPedido(int unidadesPedidas) {
        double precioFinal = super.obtenerPrecioPedido(unidadesPedidas);
        
        if (dias == 1) {
            precioFinal *= 0.8; // Aplicar descuento del 20% si queda 1 día
        } else if (dias == 2 || dias == 3) {
            precioFinal *= 0.85; // Aplicar descuento del 15% si quedan 2 o 3 días
        } else if (dias > 3) {
            precioFinal *= 0.9; // Aplicar descuento del 10% si quedan más de 3 días
        }
        
        return precioFinal;
    }
}