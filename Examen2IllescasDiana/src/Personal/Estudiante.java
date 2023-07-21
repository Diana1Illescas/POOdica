package Personal;

public class Estudiante extends Personal {
	 String carrera;

	 public Estudiante(String nombre, String carrera) {
	     super(nombre, "Estudiante");
	     this.carrera = carrera;
	 }
	}
