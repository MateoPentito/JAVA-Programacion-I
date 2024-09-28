package Reservas;

public class Reserva {
	
	private final double DESCUENTO = 0.20;
	private final int PRECIO = 50;

	private String codigo;
	private Recorrido recorrido;
	private int cantPersonas;
	
	public Reserva(String codigo, Recorrido recorrido, int cantPersonas) {
		this.codigo = codigo;
		this.recorrido = recorrido;
		this.cantPersonas = cantPersonas;
	}
	
	
	public double calcularPrecio() {
		return this.recorrido.estacionesRecorridas() * getPrecio();
	}

	
	public double getPrecio() {
		double precio = this.cantPersonas * PRECIO;
		if(this.recorrido.esViajeCabecera()) {
			precio = precio - (precio * DESCUENTO);
		}
		return precio;
	}
	

	public int cantidadDePersonasPorEstacion(Estacion estacion) {
		int cantidadPersonas = 0;
		if(this.recorrido.pasaPorEstacion(estacion)) {
			cantidadPersonas += this.cantPersonas;
		}
		return cantidadPersonas;
	}
	
}
