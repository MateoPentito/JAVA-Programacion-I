package LicenciasDeConducir;

public class Auto extends Vehiculo{

	
	private int cantPuertas;

	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}

	@Override
	public String toString() {
		return super.toString()+" - cantPuertas=" + cantPuertas;
	}
	
	
	
}
