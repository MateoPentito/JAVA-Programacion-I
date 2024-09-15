package InsumosServiciosInformaticos;

public class ServicioDeReparacion extends Servicio{

	private final int VALOR_HORA = 180;
	private final double INCREMENTO_ADICIONAL= 1.25;	
	private final int DIFICULTAD_MAYOR = 3;
	private int dificultad;
	
	public ServicioDeReparacion(int cantHora, int dificultad) {
		super(cantHora);
		this.dificultad = dificultad;
	}
	
	
	@Override
	public double getValorHora() {
		double valor=0;
		if(dificultad > DIFICULTAD_MAYOR) {
			valor = VALOR_HORA * INCREMENTO_ADICIONAL;
		}else {
			valor = VALOR_HORA;
		}
		return valor;
	}


	public int getDificultad() {
		return dificultad;
	}
	
	public boolean dificultadMayorA2() {
		boolean dificil = false;
		if(this.dificultad < 2) {
			dificil = true;
		}
		return dificil;
	}
	
	
}
