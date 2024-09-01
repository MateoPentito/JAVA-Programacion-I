package AutopistaPanamericana;

import java.util.ArrayList;

public class Autopista {

	private ArrayList<Estacion> estaciones;

	public Autopista() {
		this.estaciones = new ArrayList<>();
	}
	
	
	public void agregarEstacion(Estacion estacion) {
		this.estaciones.add(estacion);
	}
	
}
