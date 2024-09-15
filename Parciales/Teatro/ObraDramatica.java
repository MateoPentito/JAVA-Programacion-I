package Teatro;

public class ObraDramatica extends Obra{
	private final int ENTRADAS_ADICIONALES = 2;
	private boolean obraLiteraria;

	public ObraDramatica(String nombre, int duracion, int numLocalidadesDisponibles, boolean obraLiteraria) {
		super(nombre, duracion, numLocalidadesDisponibles);
		this.obraLiteraria = obraLiteraria;
	}
	
	
	public int entradaAdicional() {
		return ENTRADAS_ADICIONALES;
	}
	
	
}
