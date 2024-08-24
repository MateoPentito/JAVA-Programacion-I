package OrtParking;

public class Test {

	public static void main(String[] args) {	
		
		//Se crea la empresa//
		OrtParking ortParking = new OrtParking();
		
		//Se crea el tablero//
		Tablero tablero = new Tablero();
		
		//Se crea el garaje//
		Garaje garaje0 = new Garaje("GARAJE00",tablero);
		Garaje garaje1 = new Garaje("GARAJE01",tablero);

		//Se agregan las llaves al tablero//
		ortParking.agregarGaraje(garaje0);
		ortParking.agregarGaraje(garaje1);
		
		//Se agregan las llaves al tablero//
		tablero.agregarLlaves(new Llave("ABC123"));
		tablero.agregarLlaves(new Llave("DEF123"));
		
		//Se crean los vehiculos//
		Vehiculo vehiculo1 = new Vehiculo("ABC123");
		Vehiculo vehiculo2 = new Vehiculo("DEF123");
		
		//Se agregan personas a los vehiculos//
		vehiculo1.agregarPersonaAutorizada(new Persona("42565987","MateoPentito"));
		vehiculo2.agregarPersonaAutorizada(new Persona("40576987","MorenaPentito"));
		
		System.out.println("**********************EstacionarVehiculo()**********************");
		System.out.println(garaje0.estacionarVehiculo("ABC123")); 
		System.out.println(garaje0.estacionarVehiculo("DEF123")); 

		System.out.println("**********************adeudaMes()**********************");
		garaje0.adeudaMes("ABC123");
		garaje0.adeudaMes("DEF123");
		garaje0.adeudaMes("DEF123");		
		garaje0.adeudaMes("DEF123");
		garaje0.adeudaMes("DEF123");
		garaje0.vehiculosDeudores();
		System.out.println("");
		
		System.out.println(garaje0.estacionarVehiculo("DEF123")); 
		System.out.println("");

		System.out.println(garaje0.estacionarVehiculo("ABC123"));
		System.out.println(garaje0.estacionarVehiculo("AAABBB")); 




		System.out.println("");

		System.out.println("**********************obtenerInformeEstadoGarajes()**********************");
		System.out.println(ortParking.obtenerInformeEstadoGarajes()); 

		System.out.println("");		
		System.out.println("**********************mostrarVehiculosSinLlave()**********************");
		ortParking.mostrarVehiculosSinLlave();
		
		System.out.println("");		
		System.out.println("**********************esPersonaAutorizada()**********************");
		System.out.println(vehiculo1.esPersonaAutorizada("42565987")); 
		System.out.println(vehiculo1.esPersonaAutorizada("40576987")); 

		
		
		
		
		
		
		
		
		
	}

}
