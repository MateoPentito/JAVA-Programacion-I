package TiendaElectrodomestico;

public class Heladera extends Electrodomestico{

	private int capacidad;
	private boolean esFrost;

	public Heladera(String marca, String modelo, String numSerie, int voltaje, boolean estado,double precio, int capacidad,
			boolean esFrost) {
		super(marca, modelo, numSerie, voltaje, estado,precio);
		this.capacidad = capacidad;
		this.esFrost = esFrost;
	}
	
	
	@Override
	public String datosProductos() {
		return heladeraFrost()+" ||| capacidad: "+this.capacidad+" litros";
	}
	
	
	
	private String heladeraFrost() {
		String msg = "";
		if(esFrost) {
			msg = "es frost";
		}else {
			msg = "no es frost";
		}
		return msg;
	}
}
