package Baraja;


public class Baraja {

	private final int CANTIDAD_CARTAS = 48;
	private final int CANTIDAD_CARTAS_X_PALOS = 12;
	private final int CANTIDAD_PALOS = Palo.values().length;

	private Carta[] carta;
	private Palo[] palo;

	public Baraja() {
		this.carta = new Carta[CANTIDAD_CARTAS];
		this.palo = new Palo[CANTIDAD_PALOS];
		instanciarBaraja();
	}

	/*
	 * desarrollar el método estaOrdenada en la clase Baraja que permita retornar si
	 * las cartas se encuentran ordenadas tal como se ilustra en la figura
	 */
	public boolean estaOrdenada() {
		boolean estaOrdenada = true;
		int idxPalo = 0;
		Palo[] palos;

		palos = Palo.values();
		while (idxPalo < palos.length && estaOrdenada) {
			estaOrdenada = estaOrdenada(palos[idxPalo]);
			idxPalo++;
		}
		return estaOrdenada;
	}

	private boolean estaOrdenada(Palo palo) {
		boolean estaOrdenada = true;
		int i = 0;
		Carta c;

		while (i < Carta.MAX_NUM && estaOrdenada) {
			c = this.carta[Carta.MAX_NUM * palo.ordinal() + i];
			estaOrdenada = c.getNumero() == (i + 1) && c.esDe(palo);
			i++;
		}
		return estaOrdenada;
	}

	// Se instancia la baraja
	private void instanciarBaraja() {
		int numero = 0;
		for (Palo palos : Palo.values()) {
			for (int j = 0; j < CANTIDAD_CARTAS_X_PALOS; j++) {
				carta[numero] = new Carta(j + 1, palos);
				numero++;
			}
		}

	}

	// Se muestran todas las cartas
	public void mostrarCartas() {
		for (int i = 0; i < this.carta.length; i++) {
			System.out.println(carta[i].toString());
		}
	}

}
