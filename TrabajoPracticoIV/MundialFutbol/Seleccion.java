package MundialFutbol;



public class Seleccion {

	private final int CANTIDAD_JUGADORES = 23;
	private Jugador[] jugadores;

	public Seleccion() {
		this.jugadores = new Jugador[CANTIDAD_JUGADORES];
		instanciarJugadores();
	}

	
	//Se muestran las cantidades de jugadores por posicione
	
	public void mostrarCantidadDePosiciones() {
		int[] cantJugadoresPorPosicion = cantJugadoresPorPosicion();
		for(int i = 0; i < cantJugadoresPorPosicion.length;i++) {
			System.out.println(Posicion.values()[i] + ": \t" + cantJugadoresPorPosicion[i]);
		}
		
	}
	
	/*
	 * La explotación del método cantJugadoresPorPosicion que devuelva (no muestre por 
	consola) la cantidad de jugadores que hay por cada una de las posiciones en la cancha
	 */
	public int[] cantJugadoresPorPosicion() {
		int[] cantPosiciones = new int[Posicion.values().length];
		
		for(int i =0; i < this.jugadores.length;i++) {
			Posicion posicion = this.jugadores[i].getPosicion();
			cantPosiciones[posicion.ordinal()]++;
		}
		return cantPosiciones;
	}
	
	/*
	 * La explotación del método obtenerReservas que devuelva (no muestre por
	 * consola) a todos los jugadores de reserva de la selección
	 */
	public void obtenerReservas() {
		for(int i = 18; i < this.jugadores.length;i++) {
			System.out.println(this.jugadores[i].getApellido());
		}
	}

	/*
	 * La explotación del método cambioPorLesion que recibe el número de camiseta de
	 * un jugador lesionado y el apellido de su reemplazante. Reemplaza al lesionado
	 * por un nuevo jugador con el apellido recibido, con la misma posición y número
	 * que el que sale por lesión.
	 */

	public boolean cambioPorLesion(int numeroCamiseta, String apellido) {
		boolean reemplazado = false;
		Jugador jugadorLesionado = buscarJugador(numeroCamiseta);
		System.out.println("Sale jugador lesionado: " + jugadorLesionado.toString());
		if (jugadorLesionado.reemplazarJugador(apellido)) {
			System.out.println("Ingresa el jugador: " + jugadorLesionado.toString());
			reemplazado = true;
		}
		return reemplazado;
	}

	/*
	 * La explotación del método cambio que recibe dos números de camiseta. Si no
	 * son iguales, se realiza el cambio de ubicación de los jugadores en el
	 * plantel.
	 */

	public boolean cambio(int num1, int num2) {
		boolean cambioRealizado = false;
		Jugador jug1 = buscarJugador(num1);
		Jugador jug2 = buscarJugador(num2);
		Posicion posicionJug1 = jug1.getPosicion();
		Posicion posicionJug2 = jug2.getPosicion();

		if (num1 != num2 || num2 != num1) {
			jug1.cambiarPosicion(posicionJug2);
			jug2.cambiarPosicion(posicionJug1);
			cambioRealizado = true;
		}
		if (cambioRealizado) {
			System.out.println("Cambio de posisiciones:");
			System.out.println(jug1.toString());
			System.out.println(jug2.toString());
		}

		return cambioRealizado;
	}

	// Se buscar un jugador por numero de camiseta
	private Jugador buscarJugador(int numeroCamiseta) {
		int i = 0;
		Jugador jugadorEncontrado = null;
		while (i < this.jugadores.length && jugadorEncontrado == null) {
			if (this.jugadores[i].getNumeroCamiseta() == numeroCamiseta) {
				jugadorEncontrado = this.jugadores[i];
			} else {
				i++;
			}
		}
		return jugadorEncontrado;
	}

	// Se instancian los jugadores
	private void instanciarJugadores() {
		// Titulares
		this.jugadores[0] = new Jugador("Guzman", 1, Posicion.ARQUERO);
		this.jugadores[1] = new Jugador("Mercado", 2, Posicion.DEFENSOR);
		this.jugadores[2] = new Jugador("Tagliafico", 3, Posicion.DEFENSOR);
		this.jugadores[3] = new Jugador("Ansaldi", 4, Posicion.DEFENSOR);
		this.jugadores[4] = new Jugador("Biglia", 5, Posicion.MEDIOCAMPISTA);
		this.jugadores[5] = new Jugador("Fazio", 6, Posicion.DEFENSOR);
		this.jugadores[6] = new Jugador("Banega", 7, Posicion.MEDIOCAMPISTA);
		this.jugadores[7] = new Jugador("Acuna", 8, Posicion.DEFENSOR);
		this.jugadores[8] = new Jugador("Higuain", 9, Posicion.DELANTERO);
		this.jugadores[9] = new Jugador("Messi", 10, Posicion.DELANTERO);
		this.jugadores[10] = new Jugador("Di Maria", 11, Posicion.MEDIOCAMPISTA);

		// Suplentes
		this.jugadores[11] = new Jugador("Armani", 12, Posicion.ARQUERO);
		this.jugadores[12] = new Jugador("Meza", 13, Posicion.MEDIOCAMPISTA);
		this.jugadores[13] = new Jugador("Mascherano", 14, Posicion.MEDIOCAMPISTA);
		this.jugadores[14] = new Jugador("Perez", 15, Posicion.MEDIOCAMPISTA);
		this.jugadores[15] = new Jugador("Rojo", 16, Posicion.DEFENSOR);
		this.jugadores[16] = new Jugador("Otamendi", 17, Posicion.DEFENSOR);
		this.jugadores[17] = new Jugador("Salvio", 18, Posicion.DEFENSOR);

		// Reserva
		this.jugadores[18] = new Jugador("Aguero", 19, Posicion.DELANTERO);
		this.jugadores[19] = new Jugador("Lo Celso", 20, Posicion.MEDIOCAMPISTA);
		this.jugadores[20] = new Jugador("Dybala", 21, Posicion.DELANTERO);
		this.jugadores[21] = new Jugador("Pavon", 22, Posicion.MEDIOCAMPISTA);
		this.jugadores[22] = new Jugador("Caballero", 23, Posicion.ARQUERO);
	}

}
