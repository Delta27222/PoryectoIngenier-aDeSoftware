package modelo;


public class Persona {
	public int cedula; 
	public String nombre; 
	public String apellido; 
	public String fechaDeNacimiento;
	
	public Persona() {
		this.cedula = 0;
		this.nombre = "";
		this.apellido = "";
		this.fechaDeNacimiento = "";
	}
	
	public Persona(int cedula, String nombre, String apellido, String fechaDeNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

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

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	} 
	
	
	
	
	
	
	
}
