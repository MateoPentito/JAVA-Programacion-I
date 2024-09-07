package PuertoParana;

public class Yate extends Barco{

	private int cantCamarotes;

	public Yate(String matricula, int eslora, int anioFabricacion, String dueño, int cantCamarotes) {
		super(matricula, eslora, anioFabricacion, dueño);
		this.cantCamarotes = cantCamarotes;
	}
	
	@Override
	public double calcularPrecioAdicional() {
		return this.cantCamarotes;
	}
	
}
