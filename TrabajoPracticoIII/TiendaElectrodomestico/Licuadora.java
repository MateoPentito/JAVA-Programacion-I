package TiendaElectrodomestico;

public class Licuadora  extends Electrodomestico{

	private int potencia;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, String numSerie, int voltaje, boolean estado,double precio, int potencia,
			int cantVelocidades) {
		super(marca, modelo, numSerie, voltaje, estado,precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	
	@Override
	public String datosProductos() {
		return " potencia: "+this.potencia+" ||| cantidad de velocidades: "+this.cantVelocidades;
	}
	
	
	
}
