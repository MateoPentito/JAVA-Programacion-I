package OrtParking;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Llave> llaves;

	public Tablero() {
		this.llaves = new ArrayList<>();
	}

	/*
	 * Se devuelve la llave buscada por parametro, si no la encuentra devuelve null
	 */
	public Llave devolverLlave(String patente) {
		Llave llaveEncontrada = null;
		int i = 0;

		while (i < this.llaves.size() && llaveEncontrada == null) {
			if (this.llaves.get(i).getPatente().equals(patente)) {
				llaveEncontrada = this.llaves.get(i);
			} else {
				i++;
			}
		}
		return llaveEncontrada;
	}

	public void agregarLlaves(Llave llave) {
		this.llaves.add(llave);
	}

}
