package AutopistaPanamericana;

public class Test {

	public static void main(String[] args) {
		//Se crea la estacion
		Estacion estacion = new Estacion("AABB","Estacion Vicente lopez");
		//Se crean las cabinas
		Cabina cabina1 = new Cabina("AAA001",new MedioDePago(TipoDePago.SUBE,"Tarjeta SUBE",1));
		Cabina cabina2 = new Cabina("AAA002",new MedioDePago(TipoDePago.PASE,"Tarjeta SUBE",1));
		Cabina cabina3 = new Cabina("AAA003",new MedioDePago(TipoDePago.EFECTIVO,"EFECTIVO"));
		Cabina cabina4 = new Cabina("AAA004",new MedioDePago(TipoDePago.SUBE,"Tarjeta PASE",1));
		Cabina cabina5 = new Cabina("AAA005",new MedioDePago(TipoDePago.PASE,"Tarjeta PASE",1));
		Cabina cabina6 = new Cabina("AAA006",new MedioDePago(TipoDePago.EFECTIVO,"EFECTIVO"));
		//Muestra la hora actual
		System.out.println("Hora actual: "+cabina1.dameHoraActual()); 
		//Se agregan las cabinas
		estacion.agregarCabinas(cabina1);
		estacion.agregarCabinas(cabina2);
		estacion.agregarCabinas(cabina3);
		estacion.agregarCabinas(cabina4);
		estacion.agregarCabinas(cabina5);
		estacion.agregarCabinas(cabina6);
		//Se cobra a vehiculos
		cabina1.cobrar(new Auto("ABC123",450));	
		cabina1.cobrar(new Moto("ABC456",250));
		cabina1.cobrar(new Camion("ABC789",1050));
		cabina2.cobrar(new Auto("ABC123",450));
		//Se muestran las cabinas con efectivo
		System.out.println(estacion.cabinasConEfectivo()); 

	
	
	
	
	
	
	
	
	
	}

}
