package Personal;

public class Docente extends Personal {
	//Atributos
		 private String materia;
		    //constructor
		
		    public Docente(String nombre, String apellido, double fechaNacimiento, String direccion, double comision,
					String materia) {
				super(nombre, apellido, fechaNacimiento, direccion, comision);
				this.materia = materia;
			}
			//get t set
		    
		    public String getMateria() {
		        return materia;
		    }
		    
		    public void setMateria(String materia) {
				this.materia = materia;
			}

		    
		    @Override //METODO para obtener el precio
		    public double suelditoPersonal(int sueldo) {
		        double sueldoFinal = super.suelditoPersonal(sueldo);
		        
		        if (sueldo >= 8000) {
		            sueldoFinal *= 800; // Aplicar comision  del 10% 
		        }
		        
		        return sueldoFinal;
		    }
		}

