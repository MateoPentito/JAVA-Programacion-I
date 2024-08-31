package TallerDeBicicletas;

public class BicicletaElectrica extends Bicicleta{
	private final int CANT_MAX_POTENCIA = 250;
	private int potencia;

	public BicicletaElectrica(String marca, String modelo, int cantKm, int potencia) {
		super(marca, modelo, cantKm);
		this.potencia = potencia;
	}

	@Override
	public boolean sePuedeReparar() {
		return super.sePuedeReparar() && this.potencia <= CANT_MAX_POTENCIA;
	}
	
	public int getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return super.toString()+", potencia=" + potencia;
	}
	
	
}
