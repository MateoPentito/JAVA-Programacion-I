package Archivos;

public abstract class Archivo {

	private int duracion;
	private boolean enReproduccion;

	public Archivo(int duracion, boolean enReproduccion) {
		this.duracion = duracion;
		this.enReproduccion = enReproduccion;
	}
	


	public void reproducirse() {
		this.enReproduccion = true;
	}

	public void pararse() {
		this.enReproduccion = false;
	}

	public int getDuracion() {
		return duracion;
	}

	public boolean isEnReproduccion() {
		return enReproduccion;
	}

	@Override
	public String toString() {
		return "duracion=" + duracion + ", enReproduccion=" + enReproduccion + " ,";
	}

}
