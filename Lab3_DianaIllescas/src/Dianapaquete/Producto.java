package Dianapaquete;
//Prueba Diana Illescas
public class Producto {
	 //atributos
    private String nombre;
    private double precio;
    //constructores
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
  //getter y setter
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double obtenerPrecioPedido(int unidadesPedidas) {
        return unidadesPedidas * precio;
    }
}
