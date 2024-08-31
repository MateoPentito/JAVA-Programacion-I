package TallerDeBicicletas;

public class Bicicleta {
	private final int CANT_MAX_KM = 2000;
	private String marca;
	private String modelo;
	private int cantKm;
	
	public Bicicleta(String marca, String modelo, int cantKm) {
		this.marca = marca;
		this.modelo = modelo;
		this.cantKm = cantKm;
	}
	
	public boolean sePuedeReparar() {
		return this.cantKm < CANT_MAX_KM;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCantKm() {
		return cantKm;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+", marca=" + marca + ", modelo=" + modelo + ", cantKm="+ cantKm;
	}
	
	
	
}
