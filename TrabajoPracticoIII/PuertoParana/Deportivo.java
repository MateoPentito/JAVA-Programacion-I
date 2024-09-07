package PuertoParana;

public class Deportivo extends Barco{

	private final double PORCENTAJE_POTENCIA = 0.50;
	protected final double INDICE_CALCULO = 0.35;
	
	private double potencia;
	private int factorAerodinamico;
	
	public Deportivo(String matricula, int eslora, int anioFabricacion, String dueño, double potencia,
			int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, dueño);
		this.potencia = potencia;
		this.factorAerodinamico = factorAerodinamico;
	}
	
	@Override
	public double calcularPrecioAdicional() {
		return potencia * PORCENTAJE_POTENCIA ;
	}
	
	
	public double calcularConsumo() {
		return this.potencia / this.factorAerodinamico * INDICE_CALCULO;
	}

	public double getPotencia() {
		return potencia;
	}
	
}
