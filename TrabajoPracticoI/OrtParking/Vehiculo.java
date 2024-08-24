package OrtParking;

import java.util.ArrayList;

public class Vehiculo {

	private String patente;
	private int mesesAdeudados;
	private ArrayList<Persona> personasAutorizadas;

	public Vehiculo(String patente) {
		this.patente = patente;
		this.mesesAdeudados = mesesAdeudados;
		this.personasAutorizadas = new ArrayList<>();
	}

	public boolean esPersonaAutorizada(String dni) {
		boolean autorizada = false;
		int i = 0;
		while (i < this.personasAutorizadas.size() && !autorizada) {
			if (this.personasAutorizadas.get(i).getDni().equals(dni)) {
				System.out.println(this.personasAutorizadas.get(i).toString());
				autorizada = true;
			} else {
				i++;
			}
		}
		return autorizada;
	}

	public void agregarPersonaAutorizada(Persona persona) {
		this.personasAutorizadas.add(persona);
	}

	public String getPatente() {
		return patente;
	}

	public int getMesesAdeudados() {
		return mesesAdeudados++;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", mesesAdeudados=" + mesesAdeudados + "]";
	}

}
