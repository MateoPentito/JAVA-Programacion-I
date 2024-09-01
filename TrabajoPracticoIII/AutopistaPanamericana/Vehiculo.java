package AutopistaPanamericana;

public abstract class Vehiculo {

	private String patente;
	private double tarifaBase;

	public Vehiculo(String patente, double tarifaBase) {
		this.patente = patente;
		this.tarifaBase = tarifaBase;
	}

	public double cobrar(Vehiculo vehiculo) {
		return vehiculo.getTarifaBase();
	}

	@Override
	public String toString() {
		return  "Patente=" + patente + " - Categoria=" + this.getClass().getSimpleName()+" - Tarifa base="+getTarifaBase();
	}

	public String getPatente() {
		return patente;
	}

	public double getTarifaBase() {
		return tarifaBase;
	}

}
