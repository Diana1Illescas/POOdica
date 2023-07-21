package Personal;

public class Tecnico extends Personal{
	//Atributos
		 private int pago;
		    //constructor

	public Tecnico(String nombre, String apellido, double fechaNacimiento, String direccion, double comision,
			int pago) {
		super(nombre, apellido, fechaNacimiento, direccion, comision);
		this.pago = pago;
	}
	//get t set
	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}


	   @Override //METODO
	    public double suelditoPersonal(int sueldo) {
	        double sueldoFinal = super.suelditoPersonal(sueldo);
	        
	        if (pago == 1) {
	            sueldoFinal *= 1000; // Aplicar comisoon del 20% 
	        } else if (pago == 2 || pago == 3) {
	            sueldoFinal *= 2000; // Aplicar descuento del 15% 
	        } else if (pago > 3) {
	            sueldoFinal *= 3000; // Aplicar descuento del 10% 
	        }
	        
	        return sueldoFinal;
	    }

 
}
