package Personal;

public class Personal {
	 //atributos
    private String nombre;
    private String apellido;
    private double fechaNacimiento;
    private String direccion;
    private double comision;
    //constructores
    public Personal(String nombre, String apellido, double fechaNacimiento, String direccion, double comision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento= fechaNacimiento;
        this.direccion= direccion;
        this.comision=comision;
    }
  //getter y setter
   
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(double fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	public double suelditoPersonal(int sueldo) {
        return sueldo * comision;
    }

}

