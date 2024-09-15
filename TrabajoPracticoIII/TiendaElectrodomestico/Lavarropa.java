package TiendaElectrodomestico;

public class Lavarropa extends Electrodomestico{

	private double cargaMaxima;
	private boolean automatico;
	
	public Lavarropa(String marca, String modelo, String numSerie, int voltaje, boolean estado,double precio, double cargaMaxima,
			boolean automatico) {
		super(marca, modelo, numSerie, voltaje, estado,precio);
		this.cargaMaxima = cargaMaxima;
		this.automatico = automatico;
	}
	
	@Override
	public String datosProductos() {
		return lavarropaAutomatico()+"||| carga maxima: "+this.cargaMaxima+"kg.";
	}

	
	
	private String lavarropaAutomatico() {
		String msg = "";
		if(automatico) {
			msg = "automatico";
		}else {
			msg = "no automatico";
		}
		return msg;
	}
	
}
