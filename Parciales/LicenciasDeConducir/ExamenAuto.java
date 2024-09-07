package LicenciasDeConducir;

public class ExamenAuto extends Examen {

	private final int MAX_TIEMPO = 90;
	private Circuito circuito;
	private Auto auto;

	public ExamenAuto(String fecha, Persona persona, Circuito circuito,Auto auto) {
		super(fecha, persona);
		this.auto=auto;
		this.circuito = circuito;
	}

	// -> Que su circuito se haya aprobado en un minuto y medio o menos.
	@Override
	public boolean aprobo() {
		return circuito.aprobo() && circuito.getTiempo() <= MAX_TIEMPO;
	}

	
	@Override
	public int cantAutos() {
		int contador = 0;
		if(aprobo()) {
			contador++;
		}
		return contador;
	}
	@Override
	public double tiempoExamenAuto() {
		double contador = 0;
		if(aprobo()) {
			contador = this.circuito.getTiempo();
		}		
		return contador;
	}
	
	@Override
	public int autoReprobado() {
		int cantidad = 0;
		if(!aprobo()) {
			cantidad ++;
		}
		return cantidad;
	}
	
	
	@Override
	public String mostrarCirucitos() {
		return this.circuito.toString();
	}
	@Override
	public String mostrarDatosVehiculos() {
		return auto.toString();
	}
	
}
