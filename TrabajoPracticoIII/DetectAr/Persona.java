package DetectAr;

public class Persona implements Priorizable, Notificable {
	private final int MAYOR_EDAD = 60;
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private TipoMotivoTest motivo;

	public Persona(String dni, String nombre, String apellido, int edad, TipoMotivoTest motivo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.motivo = motivo;
	}

	/*
	 * Debe devolver un valor entero 1 indicando si tiene prioridad o 2 si no tiene.
	 * Una persona tendrá prioridad (devolverá 1) si cumple con alguna de las
	 * siguientes reglas: o No tiene obra social. o Su edad es mayor o igual a 60 o
	 * Tuvo contacto estrecho.
	 */

	@Override
	public int prioridad() {
		int numPrioridad = 2;
		if (!tieneObraSocial() || this.edad >= MAYOR_EDAD || this.motivo.equals(TipoMotivoTest.CONTACTO_ESTRECHO)) {
			numPrioridad = 1;
		}
		return numPrioridad;
	}

	private boolean tieneObraSocial() {
		boolean obraSocial = false;
		Persona persona = null;
		if (persona instanceof PersonaConObraSocial) {
			obraSocial = true;
		}
		return obraSocial;
	}

	/*
	 * Como cada centro tiene una capacidad limitada, se dispone limitar la cantidad
	 * hasta 50 test diarios. Las personas que queden afuera, serán notificadas de
	 * ello con el mensaje "No hay cupos para hoy".
	 */
	@Override
	public void notificar() {
		System.out.println("No hay cupos para hoy");
	}
	
	public int realizarTest() {
		int cantTest=0;
		cantTest++;
		return cantTest;
	}

}
