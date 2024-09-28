package Reservas;

public class Test {

	public static void main(String[] args) {


		//Se crea una empresa
		Empresa empresa = new Empresa();
		//Se crean recorridos		
		Recorrido recorrido1 = new Recorrido(Estacion.LUJAN,Estacion.BUENOS_AIRES);
		Recorrido recorrido2 = new Recorrido(Estacion.SUIPACHA,Estacion.BUENOS_AIRES);
		Recorrido recorrido3 = new Recorrido(Estacion.BUENOS_AIRES,Estacion.MERCEDES);
		Recorrido recorrido4 = new Recorrido(Estacion.LUJAN,Estacion.CHIVILICOY);
		//Se crean reservas
		Reserva reserva1 = new Reserva("ABC123",recorrido1,2);
		Reserva reserva2 = new Reserva("DFG321",recorrido2,4);
		Reserva reserva3 = new Reserva("POI789",recorrido3,3);
		Reserva reserva4 = new Reserva("WRE915",recorrido4,7);
		//Se agregan las reservas a la empresa
		empresa.agregarReservas(reserva1);
		empresa.agregarReservas(reserva2);
		empresa.agregarReservas(reserva3);
		empresa.agregarReservas(reserva4);


		System.out.println("La recaudacion total de las reservas fue de: $"+empresa.recaudacionTotal());
		System.out.println("");
		System.out.println("Cantidad de personas que pasan por estacion: "+empresa.cantVecesRecorrida(Estacion.BUENOS_AIRES));

		

	}

}
