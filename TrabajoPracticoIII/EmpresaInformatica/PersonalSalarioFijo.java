package EmpresaInformatica;

public class PersonalSalarioFijo extends Personal {

	private double sueldoFijo;
	private double porcentajeAdicional;

	public PersonalSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, double sueldoFijo) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoFijo = sueldoFijo;
		this.porcentajeAdicional = porcentajeAdicional;
	}

	@Override
	public double calcularSalario() {
		return sueldoFijo * calcularPorcentaje();
	}

	private double calcularPorcentaje() {
		if (super.getAnioIngreso() > 2 && super.getAnioIngreso() < 5) {
			porcentajeAdicional = 1.05;
		} else if (super.getAnioIngreso() > 6 && super.getAnioIngreso() < 10) {
			porcentajeAdicional =  1.10;
		} else if (super.getAnioIngreso() > 10) {
			porcentajeAdicional =  1.15;
		}
		return porcentajeAdicional;
	}
	
}
