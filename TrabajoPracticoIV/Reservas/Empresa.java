package Reservas;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Reserva> reservas;

	public Empresa() {
		this.reservas = new ArrayList<>();
	}

	/*
	 * La explotación del método cantVecesRecorrida que reciba una estación por
	 * parámetro y retorne cuántas personas pasarán por esa estación, de acuerdo a
	 * las reservas existentes.
	 */
	public int cantVecesRecorrida(Estacion estacion) {
		int cantPersonas = 0;
		for (int i = 0; i < this.reservas.size(); i++) {
			cantPersonas += this.reservas.get(i).cantidadDePersonasPorEstacion(estacion);
		}
		return cantPersonas;
	}

	/*
	 * La explotación del método recaudacionTotal que retorne el monto total
	 * recaudado según el precio de todas las reservas.
	 */

	public double recaudacionTotal() {
		double precio = 0;
		for (int i = 0; i < this.reservas.size(); i++) {
			precio += this.reservas.get(i).calcularPrecio();
		}
		return precio;
	}

	public void agregarReservas(Reserva reserva) {
		this.reservas.add(reserva);
	}
}
