package Nomina;

public class Pyme {
	private Nomina nomina;
	
	public Pyme(Nomina nomina) {
		this.nomina=nomina;
	}
	
	
	public void altaDeEmpleado(String dni,String apellido,double sueldo) {
		Empleado empleado = new Empleado(dni,apellido,sueldo);
		this.nomina.altaEmpleado(empleado);
		int posLibre = this.nomina.altaEmpleado(empleado);
		System.out.println(posLibre);
	}
	
	
	
	
	
	
}
