package PatioDeComidas;

public class Pedido {

	private String nombreCliente;
	private int idCajero;
	private String idRobot;
	private double montoAAbonar;
	
	public Pedido(String nombreCliente, int idCajero, String idRobot, double montoAAbonar) {
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.idRobot = idRobot;
		this.montoAAbonar = montoAAbonar;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public int getIdCajero() {
		return idCajero;
	}


	public String getIdRobot() {
		return idRobot;
	}


	public double getMontoAAbonar() {
		return montoAAbonar;
	}


	@Override
	public String toString() {
		return "Pedido [nombreCliente=" + nombreCliente + ", idCajero=" + idCajero + ", idRobot=" + idRobot
				+ ", monto a abonar=" + montoAAbonar + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
