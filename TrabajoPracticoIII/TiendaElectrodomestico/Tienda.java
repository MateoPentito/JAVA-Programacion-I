package TiendaElectrodomestico;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	Scanner input = new Scanner(System.in);
	private String nombre;
	private ArrayList<Electrodomestico> electrodomesticos;
	private ArrayList<Electrodomestico> productosComprados ;
	public Tienda(String nombre) {
		this.nombre = nombre;
		this.electrodomesticos = new ArrayList<>();
		this.productosComprados =  new ArrayList<>();
	}

	public void agregarProducto(Electrodomestico electrodomestico) {
		this.electrodomesticos.add(electrodomestico);
	}

	// Detalle de los productos
//	public void ofrecerProductos() {
//		System.out.println("Ticket de venta");
//		System.out.println("Articulos:");
//		for(Electrodomestico electrodomestico : this.electrodomesticos) {
//			System.out.println(electrodomestico.mostrarDatos()); 	
//		}
//	}

	// Detalle de los productos
	public void ofrecerProductos() {
		System.out.println("\n*******************************************************************************************************************");
		System.out.println("--------------------------TICKET DE VENTA--------------------------");
		System.out.println("\nArticulos:");
		System.out.println("\n*******************************************************************************************************************");

		for (Electrodomestico electrodomestico : this.electrodomesticos) {
			System.out.println(electrodomestico.productosOfrecer());
		}
		System.out.println("\n*******************************************************************************************************************");

	}

	public void realizarCompra() {

		String modeloCompra = "";
		String opcion = "";
		int contador = 1;
		double precioAcumulado=0;

		do {

			
			ofrecerProductos();
			System.out.println("\n--------------------------------------------------------------------------");	
			System.out.println("-Ingrese el modelo que desee comprar.  |   -Presione 'fin' para salir.");
			System.out.println("--------------------------------------------------------------------------");
			modeloCompra = input.nextLine();
			for (int i = 0; i < this.electrodomesticos.size(); i++) {
		
				if (this.electrodomesticos.get(i).getModelo().toLowerCase().equals(modeloCompra.toLowerCase())) {
					System.out.println("\nElegiste el producto: ");
					System.out.println("\n"+contador+": "+electrodomesticos.get(i).mostrarDatos());
					System.out.println("\nCONFIRMACION DE LA COMPRA.  si / no ");
					opcion = input.nextLine();

					if (opcion.toLowerCase().equals("si".toLowerCase())) {
						contador++;
						productosComprados.add(this.electrodomesticos.get(i));
						precioAcumulado += this.electrodomesticos.get(i).getPrecio();
						mostrarProductosEnCarrito();
					}
					
					else if (opcion.toLowerCase().equals("no".toLowerCase())) {
						System.out.println("Desististe la compra.");
					}

				}

			}
		} while (!modeloCompra.equals("fin"));
		System.out.println("\n*******************************************************************************************************************");
		System.out.println("--------------------------TICKET DE COMPRA--------------------------");
			for(Electrodomestico productos : productosComprados) {
				System.out.println("Compraste: " + productos.mostrarDatos());				
			}
			System.out.println("Total: $"+precioAcumulado);
			System.out.println("\n*******************************************************************************************************************");

		
	}
	
	
	
	private void mostrarProductosEnCarrito() {
		double precioAcumulado=0;
		System.out.println("\n------------------------------------Productos acumulados en el carrito------------------------------------");
		for(Electrodomestico electrodomestico : this.productosComprados) {
			precioAcumulado+=electrodomestico.getPrecio();
			System.out.println(electrodomestico.mostrarDatos());
		}
		System.out.println("Precio acumulado hasta el momento: $"+precioAcumulado);
		System.out.println("------------------------------------------------------------------------------------------------------------");

	}
	
	
	
	
	
	
	

}















