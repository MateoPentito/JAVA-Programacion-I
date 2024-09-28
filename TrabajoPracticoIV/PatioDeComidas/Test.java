package PatioDeComidas;

public class Test {

	public static void main(String[] args) {

		// Se crea el patio de comidas
		PatioDeComida patioComidas = new PatioDeComida();

		// Se crean pedidos
		Pedido pedido1 = new Pedido("Mateo", 1, "A1", 18000.50);
		Pedido pedido2 = new Pedido("Morena", 2, "A2", 20000);
		Pedido pedido3 = new Pedido("Santino", 3, "A3", 15000);
		Pedido pedido4 = new Pedido("Martina", 4, "A4", 25000.50);
		Pedido pedido5= new Pedido("Bautista", 5, "A5", 8500.99);

		patioComidas.agregarPedidoCajero(1, pedido1);
		patioComidas.agregarPedidoCajero(2, pedido2);
		patioComidas.agregarPedidoCajero(3, pedido3);
		patioComidas.agregarPedidoCajero(4, pedido4);
		patioComidas.agregarPedidoCajero(5, pedido5);
		

		System.out.println("***********Monto de los pedidos***********");
		// Se muestra el monto de pedido de todos los cajeros.
		System.out.println("Total monto pedidos de los cajeros: $ "+patioComidas.montosPorCajero());
		
		//Se muestra el informe de pedidos.
		System.out.println("\n***********Informe de pedidos***********");
		patioComidas.mostrarInforme();
		
		//Se muestra pedidos criticos.
		System.out.println("\n***********Pedidos con riesgo de no ser entregados***********");		
		patioComidas.mostrarPedidosConMasRiesgo();
		
	}

}
