package OrtDemy;

public class Leccion {

	private String nombre;
	private int duracion;
	private TipoLeccion tipoLeccion;
	
	public Leccion(String nombre, int duracion, TipoLeccion tipoLeccion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.tipoLeccion = tipoLeccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public TipoLeccion getTipoLeccion() {
		return tipoLeccion;
	}

	@Override
	public String toString() {
		return "Leccion [nombre=" + nombre + ", duracion=" + duracion + ", tipoLeccion=" + tipoLeccion + "]";
	}
	
	
	
}
