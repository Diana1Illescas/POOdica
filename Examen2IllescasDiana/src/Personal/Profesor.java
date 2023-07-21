package Personal;


public class Profesor  extends Personal {
	 String especialidad;

	 public Profesor(String nombre, String especialidad) {
	     super(nombre, "Profesor");
	     this.especialidad = especialidad;
	 }
	}