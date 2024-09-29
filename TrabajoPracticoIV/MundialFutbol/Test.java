package MundialFutbol;

public class Test {

	public static void main(String[] args) {

		//Se crea la seleecion
		Seleccion seleccion = new Seleccion();
		
		System.out.println("**********Se modifican las posiciones de los jugadores**********");
		//Se intenta realizar un cambio de posicion
		seleccion.cambio(1, 10);
		
		System.out.println("\n**********Se cambia un jugador lesionado**********");
		//Se intenta realizar un cambio por lesion
		seleccion.cambioPorLesion(8, "Pentito");
	
		System.out.println("\n**********Se muestran los jugadores de reserva**********");
		seleccion.obtenerReservas();
		
		System.out.println("\n**********Se muestra la cantidad de jugadores por posicion**********");
		seleccion.mostrarCantidadDePosiciones(); 
	
	}

}
