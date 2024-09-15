package TorneoDeFutbol;

public class Test {

	public static void main(String[] args) {

		//Se crea torneo futbol 5
		TorneoFutbol5 torneoFutbol5 = new TorneoFutbol5(5);
		
		//Se crean las jornadas
		Jornada jornada1 = new Jornada();
		Jornada jornada2 = new Jornada();

		//Se crean los equipos
		Equipo equipo1 = new Equipo("River plate",5);
		Equipo equipo2 = new Equipo("Rosario Central",2);
		Equipo equipo3 = new Equipo("Independiente",5);
		Equipo equipo4 = new Equipo("Racing",2);
		Equipo equipo5 = new Equipo("Boca Juniors",5);
		Equipo equipo6 = new Equipo("San Lorenzo",2);
		
		//Se inscriben los equipos
		torneoFutbol5.inscribirEquipo(equipo1);
		torneoFutbol5.inscribirEquipo(equipo2);
		torneoFutbol5.inscribirEquipo(equipo3);
		torneoFutbol5.inscribirEquipo(equipo4);
		torneoFutbol5.inscribirEquipo(equipo5);
		torneoFutbol5.inscribirEquipo(equipo6);
		
		//Se juegan los partidos
		Partido partido1 = new Partido(equipo1,equipo2,5,4);
		Partido partido2 = new Partido(equipo3,equipo4,5,4);
		Partido partido3 = new Partido(equipo5,equipo6,5,4);

		//Se agregan los partidos a la jornada
		jornada1.jugarFecha(partido1);
		jornada1.jugarFecha(partido2);	
		jornada1.jugarFecha(partido3);
		jornada2.jugarFecha(partido3);
		jornada2.jugarFecha(partido2);
		jornada2.jugarFecha(partido1);
		
		//Se muestra la jornada
		jornada1.mostrarJornadaActual();
		jornada2.mostrarJornadaActual();
		
		//Se juegan los partidos de la fecha proxima
		Partido partido4 = new Partido(equipo2,equipo3,2,1);
		Partido partido5 = new Partido(equipo1,equipo6,2,2);
		Partido partido6 = new Partido(equipo4,equipo5,0,3);

		
		//Se agregan los partidos a la siguiente jornada
		jornada1.jugarFecha(partido4);
		jornada1.jugarFecha(partido5);	
		jornada1.jugarFecha(partido6);

		//Se muestra la jornada
		jornada1.mostrarJornadaActual();
		jornada2.mostrarJornadaActual();
		
		//se agregan jornadas al torneo
		torneoFutbol5.agregarJornada(jornada1);
		torneoFutbol5.agregarJornada(jornada2);
		
		//Se muestra la jornada
		torneoFutbol5.mostrarJornada();

	}

}
