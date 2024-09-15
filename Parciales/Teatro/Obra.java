package Teatro;

import java.util.ArrayList;

public abstract class Obra {

	private String nombre;
	private int duracion;
	private int numLocalidadesDisponibles;
	private ArrayList<Espectador> espectadores;

	public Obra(String nombre, int duracion, int numLocalidadesDisponibles) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.numLocalidadesDisponibles = numLocalidadesDisponibles;
		this.espectadores = new ArrayList<>();
	}

	public boolean localidadesDisponibles(Espectador espectador) {
		int butacaAdicional = 0;
		boolean disponible = false;

		if (espectador.isFueAcompaniado()) {
			butacaAdicional++;
			System.out.println("El espectador: DNI "+ espectador.getDni() + " fue acompañado y usa " + butacaAdicional
					+ " butaca adicional.");
		}

		if (this.numLocalidadesDisponibles >= (this.espectadores.size() + butacaAdicional)) {
			disponible = true;
		}

		return disponible;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getNumLocalidadesDisponibles() {
		return numLocalidadesDisponibles;
	}

	public ArrayList<Espectador> getEspectadores() {
		return espectadores;
	}

	public void agregarEspectador(Espectador espectador) {
		this.espectadores.add(espectador);
	}

	public int duracionAdicional() {
		return 0;
	}

}
