package PuertoParana;

public abstract class Barco {
	
	private String matricula;
	private int eslora;
	private int anioFabricacion;
	private String dueño;
	
	public Barco(String matricula, int eslora, int anioFabricacion, String dueño) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.dueño = dueño;
	}
	
	
	
	public double calcularPrecioEslora() {
		return this.eslora;
	}
	
	public double calcularPrecioAdicional() {
		return 0;
	}
	
	
	
	
	
}
