package CircuitoTenis;

public class Test {

	public static void main(String[] args) {


		//Se crea el circuito
		CircuitoATP atp = new CircuitoATP();
				

		System.out.println("\n********Resultado final campeonato********");
		System.out.println(atp.procesarInfo()); 
 
		System.out.println("\n********TORNEO DEL JUGADOR********");
		System.out.println(atp.procesarTorneosJugador("Delbonis")); 
	
		System.out.println("\n********RESULTADO DEL JUGADOR EN EL TORNEO********");
		System.out.println(atp.obtenerResultadoJugador("Schwartzman", "RolandGarros")); 
	
		System.out.println("\n********PEOR RESULTADO DEL JUGADOR EN EL TORNEO********");
		System.out.println(atp.procesarPeorPosTorneoJugador("Pella")); 
	
	}

}
