package PatioDeComidas;

public class InformePedidos {

	private double montoPedido;
	private String apellidoCajero;
	private double nivelBateria;
	
	public InformePedidos(double montoPedido, String apellidoCajero, double nivelBateria) {
		this.montoPedido = montoPedido;
		this.apellidoCajero = apellidoCajero;
		this.nivelBateria = nivelBateria;
	}

	
	
	
	@Override
	public String toString() {
		return "InformePedidos [montoPedido=" + montoPedido + ", apellidoCajero=" + apellidoCajero + ", nivelBateria="
				+ nivelBateria + "]";
	}
	
	
	
	
	
}
