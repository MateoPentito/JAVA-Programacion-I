package TorneoDeFutbol;

public  class Equipo {
	
	private String nombre;
	private int numJugadores;
	private int puntos;
	
	
	public Equipo(String nombre, int numJugadores) {
		this.nombre = nombre;
		this.numJugadores = numJugadores;
		this.puntos = puntos;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" [nombre=" + nombre + ", numJugadores=" + numJugadores + ", puntos=" + puntos + "]";
	}

	public int getNumJugadores() {
		return numJugadores;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	public void calcularPuntos(int numero) {
		this.puntos += numero;
	}
	
	
	public String equipoRegistrado() {
		return this.getClass().getSimpleName()+"= "+nombre + " - cantidad de jugadores=" + numJugadores;
	}
	
	
	
}
