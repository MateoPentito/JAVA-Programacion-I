package Reservas;

public class Recorrido {
	
	private Estacion estacionOrigen;
	private Estacion estacionDestino;
	
	public Recorrido(Estacion estacionOrigen, Estacion estacionDestino) {
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
	}
	
	
	public int estacionesRecorridas() {
		int cantidad = this.estacionOrigen.ordinal() - this.estacionDestino.ordinal();
		if(this.estacionDestino.ordinal() > this.estacionOrigen.ordinal()) {
			cantidad = this.estacionDestino.ordinal() - this.estacionOrigen.ordinal();
		}
		return cantidad;
	}
	

	
	public boolean esViajeCabecera() {
		boolean esCabecera = false;
		if(this.estacionOrigen.ordinal()==0 && this.estacionDestino.ordinal() == this.estacionDestino.values().length-1 ||
				this.estacionDestino.ordinal()==0 && this.estacionOrigen.ordinal() == this.estacionOrigen.values().length-1) {
			esCabecera = true;
		}
		return esCabecera;
	}
	
	
	public boolean pasaPorEstacion(Estacion estacion) {
		return this.estacionOrigen.equals(estacion) || this.estacionDestino.equals(estacion);
	}
	
	
	
	
}
