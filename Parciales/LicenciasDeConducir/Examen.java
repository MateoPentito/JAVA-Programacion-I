package LicenciasDeConducir;

public abstract class Examen implements Evaluable {

	private String fecha;
	private Persona persona;

	public Examen(String fecha, Persona persona) {
		this.fecha = fecha;
		this.persona = persona;
	}

	public int cantAutos() {
		return 0;
	}

	public double tiempoExamenAuto() {
		return 0;
	}
	
	public int autoReprobado() {
		return 0;
	}

	public int cantExamenesReprobados() {
		int cantReprobados = 0;
		if (!aprobo()) {
			cantReprobados++;
		}
		return cantReprobados;
	}

	public int cantExamenesAprobados() {
		int cantReprobados = 0;
		if (aprobo()) {
			cantReprobados++;
		}
		return cantReprobados;

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - fecha=" + fecha + " - persona=" + persona + " - "
				+ mostrarCirucitos() + " - " + mostrarDatosVehiculos();
	}

	public abstract String mostrarCirucitos();

	public abstract String mostrarDatosVehiculos();

}
