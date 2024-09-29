package MundialFutbol;

public class Jugador {

	private Posicion posicion;
	private String apellido;
	private int numeroCamiseta;
	
	public Jugador(String apellido, int numeroCamiseta,Posicion posicion) {
		this.posicion = posicion;
		this.apellido = apellido;
		this.numeroCamiseta = numeroCamiseta;
	}

	
	//Se reemplaza el apellido del jugador
	public boolean reemplazarJugador(String apellido) {
		boolean reemplazo = false;
		if(apellido != null) {
			this.apellido = apellido;
			reemplazo = true;
		}
		return reemplazo;
	}
	
	
	//Se modifica la posicion del jugador
	public void cambiarPosicion(Posicion posicionn) {
		this.posicion = posicionn;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	@Override
	public String toString() {
		return "Jugador [posicion=" + posicion + ", apellido=" + apellido + ", numeroCamiseta=" + numeroCamiseta + "]";
	}
	
	
	
	
	
}
