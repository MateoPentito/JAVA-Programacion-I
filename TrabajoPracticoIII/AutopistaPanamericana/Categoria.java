package AutopistaPanamericana;

public abstract class Categoria extends Vehiculo{

	private double tarifaBase;

	public Categoria(String patente, double tarifaBase) {
		super(patente);
		this.tarifaBase = tarifaBase;
	}

	public double getTarifaBase() {
		return tarifaBase;
	}

	
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" - tarifaBase= " + getTarifaBase();
	}





	
	
	
}
