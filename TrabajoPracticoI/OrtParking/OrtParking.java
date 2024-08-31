package OrtParking;

import java.util.ArrayList;

public class OrtParking {

	private ArrayList<Garaje> garajes;

	public OrtParking() {
		this.garajes = new ArrayList<>();
	}

	public void mostrarVehiculosSinLlave() {
		for(Garaje garaje : this.garajes) {
			garaje.vehiculosSinLlave();
		}
	}
	
	public void obtenerInformeEstadoGarajes() {
		for(Garaje garaje : this.garajes) {
			garaje.datosGaraje();
		}				
	}
	
	public void agregarGaraje(Garaje garaje) {
		this.garajes.add(garaje);
	}
	
}
