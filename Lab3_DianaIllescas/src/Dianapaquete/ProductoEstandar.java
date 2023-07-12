package Dianapaquete;

public class ProductoEstandar extends Producto {
	//Atributos
	 private String sección;
	    //constructor
	    public ProductoEstandar(String nombre, double precio, String sección) {
	        super(nombre, precio);
	        this.sección = sección;
	    }
	    //get t set
	    public String getSección() {
	        return sección;
	    }
	    
	    public void setSección(String sección) {
	        this.sección = sección;
	    }
	    
	    @Override //METODO para obtener el precio
	    public double obtenerPrecioPedido(int unidadesPedidas) {
	        double precioFinal = super.obtenerPrecioPedido(unidadesPedidas);
	        
	        if (unidadesPedidas >= 5) {
	            precioFinal *= 0.9; // Aplicar descuento del 10% si hay 5 o más unidades
	        }
	        
	        return precioFinal;
	    }
	}