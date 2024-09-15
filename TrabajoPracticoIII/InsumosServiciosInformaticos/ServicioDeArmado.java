package InsumosServiciosInformaticos;

public class ServicioDeArmado extends Servicio{

	private final int VALOR_HORA = 250;	

	public ServicioDeArmado(int cantHora) {
		super(cantHora);
	
	}

	
	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}
	



}
