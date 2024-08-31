package Archivos;

public class ArchivoDeTexto extends Archivo{

	private String codificacion;
	private boolean capacidadDeCifrar;
	
	public ArchivoDeTexto(int duracion, boolean enReproduccion, String codificacion, boolean capacidadDeCifrar) {
		super(duracion, enReproduccion);
		this.codificacion = codificacion;
		this.capacidadDeCifrar = capacidadDeCifrar;
	}
	
	@Override
	public boolean isEnReproduccion() {
		// TODO Auto-generated method stub
		return super.isEnReproduccion();
	}
	
	@Override
	public void pararse() {
		// TODO Auto-generated method stub
		super.pararse();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "+super.toString()+" [codificacion=" + codificacion + ", capacidadDeCifrar=" + capacidadDeCifrar + "]\n";
	}

	public String getCodificacion() {
		return codificacion;
	}

	public boolean isCapacidadDeCifrar() {
		return capacidadDeCifrar;
	}
	
	public void cifrar() {
		this.capacidadDeCifrar = true;
	}
	
	
}
