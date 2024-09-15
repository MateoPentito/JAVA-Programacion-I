package TorneoDeFutbol;

import java.util.ArrayList;

public abstract class Torneo {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private int numero = 0;
	private int numeroFecha = 1;
	
	
	public Torneo(int numero) {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
		this.numero = numero;
	}

	public void inscribirEquipo(Equipo equipo) {
		if (equipo.getNumJugadores() == numero) {
			this.equipos.add(equipo);
		}
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}

	//Se muestran todos los partidos. (Deberia mostrar cada fecha).
	public void mostrarJornada() {
		System.out.println("----------------Fecha "+this.numeroFecha+"----------------");
		for (Jornada jornada : this.jornadas) {
			jornada.actualizarJornada();
		}
		this.numeroFecha++;
	}
	
	//Se muestra el equipo registrado en el torneo
	public void mostrarEquiposInscriptos() {
		for(Equipo equipo : this.equipos) {
			System.out.println(equipo.equipoRegistrado());
		}
	}

}
