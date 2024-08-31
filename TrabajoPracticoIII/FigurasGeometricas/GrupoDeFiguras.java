package FigurasGeometricas;

import java.util.ArrayList;

public class GrupoDeFiguras {

	private ArrayList<Figura> figuras;

	public GrupoDeFiguras() {
		this.figuras = new ArrayList<>();
	}
	
	public void mostrarInfoDeFiguras() {
		for(Figura figura : this.figuras) {
			System.out.println(figura.toString()); 
		}
	}
	
	public void agregarFiguras(Figura figuras) {
		this.figuras.add(figuras);
	}
}
