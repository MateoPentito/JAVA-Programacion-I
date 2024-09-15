package Teatro;

public class ObraMusical extends Obra {
	private final int MIN_ADICIONAL = 5;
	private boolean tieneOrquesta;

	public ObraMusical(String nombre, int duracion, int numLocalidadesDisponibles, boolean tieneOrquesta) {
		super(nombre, duracion, numLocalidadesDisponibles);
		this.tieneOrquesta = tieneOrquesta;
	}

	// En el caso de las obras musicales, a la duración total de la obra hay que
	// sumarle 5 minutos adicionales de la obertura.


	@Override
	public int duracionAdicional() {
		return this.getDuracion() + MIN_ADICIONAL;
	}



}
