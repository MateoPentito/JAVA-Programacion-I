package TorneoDeFutbol;

import java.util.ArrayList;

public class Jornada {

	private ArrayList<Partido> partidos;
	//private int numeroFecha = 1;
	
	
	public Jornada() {
		this.partidos = new ArrayList<>();
	//	this.numeroFecha = numeroFecha;
	}
	
	// Al cabo de finalizar la Jornada, se deberá actualizar los puntos de cada
	// equipo. Tambien se deberá mostrar la
	// tabla de posiciones indicando cada equipo y su puntaje
	public void actualizarJornada() {
		System.out.println("**********************Se actualiza la jornada**********************");
		for (Partido partido : this.partidos) {
			System.out.println(partido.mostrarJornadasActualizadas());
		}
	}

	public void mostrarJornadaActual() {
		System.out.println("*****************************************************************************************************************");
		for (Partido partido : this.partidos) {
			System.out.println(partido.jugarPartido());
		}
		System.out.println("******************************************************************************************************************");

	}

	
	
	
	
	public void jugarFecha(Partido partido) {
		this.partidos.add(partido);

	}

}
