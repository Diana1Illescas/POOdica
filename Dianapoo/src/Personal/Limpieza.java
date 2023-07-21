package Personal;

public class Limpieza extends Personal {
	//Atributos
	 private String area;
	    //constructor
	 
		public Limpieza(String nombre, String apellido, double fechaNacimiento, String direccion, double comision,
				String area) {
			super(nombre, apellido, fechaNacimiento, direccion, comision);
			this.area = area;
		}
		//get t set

		public String getArea() {
			return area;
		}


		public void setArea(String area) {
			this.area = area;
		}
	  
	    @Override //METODO para obtener el sueldo
	    public double suelditoPersonal(int sueldo) {
	        double sueldoFinal = super.suelditoPersonal(sueldo);
	        
	        if (sueldo >= 400) {
	            sueldoFinal *= 400; // Aplicar comision  del 10% 
	        }
	        
	        return sueldoFinal;
	    }


	}

