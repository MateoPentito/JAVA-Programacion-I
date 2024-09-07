package PuertoParana;

public class DeportivoLujo extends Deportivo{

	private final int NUM_CALCULO = 2;
	public DeportivoLujo(String matricula, int eslora, int anioFabricacion, String dueño, double potencia,
			int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, dueño, potencia, factorAerodinamico);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public double calcularConsumo() {
		return NUM_CALCULO * super.getPotencia() * INDICE_CALCULO;
	}
	
	
	
	
	
	
}
