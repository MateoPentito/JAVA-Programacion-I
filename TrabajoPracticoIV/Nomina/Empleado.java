package Nomina;

public class Empleado {

	private String dni;
	private String nombre;
	private double sueldo;
	
	public Empleado(String dni, String nombre, double sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
