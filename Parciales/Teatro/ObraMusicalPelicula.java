package Teatro;

public class ObraMusicalPelicula extends ObraMusical{

	private String nombreDirector;

	public ObraMusicalPelicula(String nombre, int duracion, int numLocalidadesDisponibles, boolean tieneOrquesta,
			String nombreDirector) {
		super(nombre, duracion, numLocalidadesDisponibles, tieneOrquesta);
		this.nombreDirector = nombreDirector;
	}
	


}
