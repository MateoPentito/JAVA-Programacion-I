package TorneoDeFutbol;

public class Partido {

	private final int PARTIDO_GANADO = 3;
	private final int PARTIDO_EMPATADO = 1;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;

	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public Equipo mostrarJornadasActualizadas() {
		Equipo equipoGanador = null;
		if (golesLocal > golesVisitante) {
			equipoGanador = this.equipoLocal;
			this.equipoLocal.calcularPuntos(PARTIDO_GANADO);
		} else if (golesVisitante > golesLocal) {
			equipoGanador = this.equipoVisitante;
			this.equipoVisitante.calcularPuntos(PARTIDO_GANADO);
		} else if (golesVisitante == golesLocal) {
			this.equipoVisitante.calcularPuntos(PARTIDO_EMPATADO);
			this.equipoLocal.calcularPuntos(PARTIDO_EMPATADO);
			equipoGanador = null;
		}
		return equipoGanador;
	}
	
	
	public String jugarPartido() {
		return "Equipo local: "+this.equipoLocal.getNombre()+" | Equipo visitante: "+this.equipoVisitante.getNombre()+" | Goles Local: "+this.golesLocal+" | Goles Visitante: "+this.golesVisitante;
	}
	


}
