package Archivos;

public class ArchivoMultimedia extends Archivo{
	
	public ArchivoMultimedia(int duracion, boolean enReproduccion) {
			super(duracion, enReproduccion);
			// TODO Auto-generated constructor stub
		}


	@Override
	public void reproducirse() {
		super.reproducirse();
	}

	public int duracionPromedio() {
		return super.getDuracion();
	}
	

}
