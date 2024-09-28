package tp5EJ4;

import java.util.ArrayList;

public class CircuitoATP {
	private final int PEOR_RESULTADO = 5;
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}

	public void cargarData() {
		this.jugadores = new String[] { "Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis" };
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon", "Shangai" };
		this.resultados = new int[][] { { 1, 3, 4, 1, 3 }, { 3, 2, 3, 4, 1 }, { 2, 1, 5, 5, 2 }, { 4, 5, 1, 2, 5 },
				{ 5, 4, 2, 3, 4 } };

	}

	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> jugadors = new ArrayList<>();
		for (int i = 0; i < this.jugadores.length; i++) {
			Jugador jugador = new Jugador(this.jugadores[i]);
			for (int j = 0; j < this.resultados[i].length; j++) {
				jugador.procesarResultado(this.resultados[i][j]);
			}
			jugadors.add(jugador);
		}

		return jugadors;
	}

	public String procesarTorneosJugador(String jugador) {
		int posicionJugador = buscoJugador(jugador);
		String competencias = this.jugadores[posicionJugador]+": ";
		for(int i = 0;i < this.torneos.length;i++) {
			competencias = competencias + this.torneos[i]+" : "+ this.resultados[posicionJugador][i]+" ";
		}
		return competencias;
	}

	public String obtenerResultadoJugador(String jugador, String torneo) {
		return "Resultado de "+jugador+" en "+torneo+": "+this.resultados[buscoJugador(jugador)][buscoTorneo(torneo)];
	}

	private int buscoJugador(String jugador) {
		return buscarEnArray(this.jugadores,jugador);
	}

	private int buscoTorneo(String torneo) {
		return buscarEnArray(jugadores, torneo);
	}

	private int buscarEnArray(String[] array, String id) {
		int posicion = -1;
		int i = 0;
		while (posicion == -1 && i < array.length) {
			if (array[i].equals(id)) {
				posicion = i;
			} else {
				i++;
			}
		}
		return posicion;
	}

	public int procesarPeorPosTorneoJugador(String jugador) {
		int peorResultado = 0;
		int[] resultado = this.resultados[buscoJugador(jugador)];
		int i = 0;
		while(peorResultado != PEOR_RESULTADO && i < this.jugadores.length) {
			if(resultado[i] > peorResultado) {
				peorResultado = resultado[i];
			}else {
				i++;
			}
		}

		return peorResultado;
	}
}
