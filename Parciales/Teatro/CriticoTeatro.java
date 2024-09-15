package Teatro;

public class CriticoTeatro extends Espectador{
	
	private int tiempoDisponible;


	public CriticoTeatro(String dni, String nombreObraAAsistir, boolean fueAcompaniado, int tiempoDisponible) {
		super(dni, nombreObraAAsistir, fueAcompaniado);
		this.tiempoDisponible = tiempoDisponible;
	}


	
	@Override
	public int getTiempoDisponible() {
		return super.getTiempoDisponible();
	}
	
	

}
