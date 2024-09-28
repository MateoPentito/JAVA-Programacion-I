package DetectAr;

import java.util.ArrayList;

public class Dia {

	private String fecha;
	private boolean esDiaHabil;
	private ArrayList<Persona> personas;

	public Dia(String fecha, boolean esDiaHabil) {
		this.fecha = fecha;
		this.esDiaHabil = esDiaHabil;
		this.personas = new ArrayList<>();
	}

	/*
	 * El método promedioEdadPersonasSinOS de la clase Dia que debe devolver el
	 * promedio de edad de las personas que no tengan obra social.
	 */

	public double promedioEdadPersonasSinOS() {
		return 0;
	}

	public void realizarTest() {
		for(Persona persona : this.personas) {
			persona.realizarTest();
		}
	}
}
