package Personal;

public class Administrativo extends Personal {
	//Atributos
	 private String Administrativo;
	    //constructor

	public Administrativo(String nombre, String apellido, double fechaNacimiento, String direccion, double comision,
			String administrativo) {
		super(nombre, apellido, fechaNacimiento, direccion, comision);
		Administrativo = administrativo;
	}
	//get t set

	public String getAdministrativo() {
		return Administrativo;
	}

	public void setAdministrativo(String administrativo) {
		Administrativo = administrativo;
	}
	@Override //METODO para obtener el precio
    public double suelditoPersonal(int sueldo) {
        double sueldoFinal = super.suelditoPersonal(sueldo);
        
        if (sueldo >= 1000) {
            sueldoFinal *= 1000; // Aplicar comision  del 10% 
        }
        
        return sueldoFinal;
    }

	 
}
