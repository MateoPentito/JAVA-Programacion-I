package CircuitoTenis;

import java.util.ArrayList;

public class CircuitoATP {

	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}

	// Se cargan los jugadores / torneos / resultados
	private void cargarData() {
		this.jugadores = new String[] { "Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis" };
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon", "Shangai" };
		this.resultados = new int[][] { { 1, 3, 4, 1, 3 }, { 3, 2, 3, 4, 1 }, { 2, 1, 5, 5, 2 }, { 4, 5, 1, 2, 5 },
				{ 5, 4, 2, 3, 4 } };

	}

	/*
	 * A) public ArrayList<Jugador> procesarInfo() Tal que procese la matriz, cree
	 * las instancias de jugadores, procese los resultados de cada uno y retorne la
	 * lista de jugadores
	 */

	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> jugadoresProcesados = new ArrayList<>();
		for (int i = 0; i < this.jugadores.length; i++) {
			Jugador jugador = new Jugador(this.jugadores[i]);
			for (int j = 0; j < this.resultados[i].length; j++) {
				jugador.procesarResultado(this.resultados[i][j]);
			}
			jugadoresProcesados.add(jugador);
		}
		return jugadoresProcesados;
	}

	/*
	 * B) private int buscoJugador(String jugador) el cual recibe el nombre de un
	 * jugador y devuelve la posición del mismo dentro del array de jugadores. En
	 * caso de que no exista, devolver -1.
	 */

	private int buscoJugador(String jugador) {
		int posicion = -1;
		boolean encontro = false;
		int i = 0;
		while (i < this.jugadores.length && !encontro) {
			if (this.jugadores[i].equals(jugador)) {
				posicion = i;
				encontro = true;
			} else {
				i++;
			}
		}
		return posicion;
	}

	/*
	 * C) private int buscoTorneo(String torneo) tal que reciba el nombre de un
	 * torneo y devuelva la posición correspondiente del mismo en el array de
	 * torneos. En caso de que no exista, devolver -1.
	 */

	private int buscoTorneo(String torneo) {
		int posicion = -1;
		int i = 0;
		boolean encontro = false;
		while (i < this.torneos.length && !encontro) {
			if (this.torneos[i].equals(torneo)) {
				posicion = i;
				encontro = true;
			} else {
				i++;
			}
		}
		return posicion;
	}

	/*
	 * D) public String procesarTorneosJugador(String Jugador); tal que retorne,
	 * para el jugador enviado por parámetro, el resultado de todos los torneos en
	 * un string con el nombre del torneo y su puesto en el mismo. Por ejemplo: Del
	 * Potro: Australia:3 USOpen:2 RolandGarros:3 Wimbledon:4 Shangai:1
	 */

	public String procesarTorneosJugador(String jugador) {
		int posicionJugador = buscoJugador(jugador);
		String competencia = this.jugadores[posicionJugador];
		for (int i = 0; i < this.torneos.length; i++) {
			competencia = competencia + ": " + this.torneos[i] + ": " + this.resultados[posicionJugador][i];
		}
		return competencia;
	}

	/*
	 * E) public String obtenerResultadoJugador(String jugador, String torneo) tal
	 * que devuelva el puesto en que finalizó un jugador (enviado por parámetro) en
	 * un torneo (enviado por parámetro) y lo devuelva en un string. Ejemplo:
	 * Resultado de Schwartzman en RolandGarros:5
	 */

	public String obtenerResultadoJugador(String jugador, String torneo) {
		int posicionJugador = buscoJugador(jugador);
		int posicionTorneo = buscoTorneo(torneo);
		return "Resultado de " + this.jugadores[posicionJugador] + " en " + this.torneos[posicionTorneo] + ": "
				+ this.resultados[posicionJugador][posicionTorneo];
	}

	/*
	 * F) public int procesarPeorPosTorneoJugador(String jugador) tal que devuelva
	 * la peor posición en un torneo del jugador enviado por parámetro. Ejemplo:
	 * Peor Resultado de Pella en el año: 4
	 * 
	 */

	public int procesarPeorPosTorneoJugador(String jugador) {
		int peorPosicion = 0;
		int posicionJugador = buscoJugador(jugador);
		for (int i = 0; i < this.resultados.length; i++) {
			for (int j = 0; j < this.resultados[i].length; j++) {
				if (this.resultados[posicionJugador][j] > peorPosicion) {
					peorPosicion = this.resultados[posicionJugador][j];
				}
			}
		}
		return peorPosicion;
	}

}
