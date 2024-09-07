package PuertoParana;

public class Velero extends Barco{

	private int cantMastil;

	public Velero(String matricula, int eslora, int anioFabricacion, String dueño, int cantMastil) {
		super(matricula, eslora, anioFabricacion, dueño);
		this.cantMastil = cantMastil;
	}
	
	
	@Override
	public double calcularPrecioAdicional() {
		return this.cantMastil;
	}
	
	
	
	
	
}
