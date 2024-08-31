package EmpresaInformatica;

import java.util.Calendar;

public abstract class Personal {

	private int dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;

	public Personal(int dni, String nombre, String apellido, int anioIngreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}


	
	public abstract double calcularSalario();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" - "+nombreCompleto()+" - "+calcularSalario();
	}
	
	public int calcularAnios() {
		Calendar cal= Calendar.getInstance();
		int year= cal.get(Calendar.YEAR);
		return this.anioIngreso  - year;
	}
	
	private String nombreCompleto() {
		return nombre +" "+ apellido;
	}
	
	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}
	
	
	
}
