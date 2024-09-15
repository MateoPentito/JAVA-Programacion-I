package Teatro;

public class ObraMusicalInfantil extends ObraMusical{
	private final int TIEMPO_CAMBIO = 10;
	private int cantPersonajes;
	
	public ObraMusicalInfantil(String nombre, int duracion, int numLocalidadesDisponibles, boolean tieneOrquesta,
			int cantPersonajes) {
		super(nombre, duracion, numLocalidadesDisponibles, tieneOrquesta);
		this.cantPersonajes = cantPersonajes;
	}
	
	
	
	//a la duración total de la obra hay que sumarle el tiempo de cambio de los personajes que representa
	//10 minutos por la cantidad de personajes que tenga la obra.
	
	@Override
	public int duracionAdicional() {
		return super.duracionAdicional() + (TIEMPO_CAMBIO * this.cantPersonajes);
	}
	
	
	
	
	
	
}
