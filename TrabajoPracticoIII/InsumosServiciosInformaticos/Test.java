package InsumosServiciosInformaticos;

public class Test {

	public static void main(String[] args) {

		//Se crea un comercio
		Comercio comercio = new Comercio("ORT - BELGRANO");
		
		//Se crean Servicios e Insumos
		Servicio servicio1 = new ServicioDeArmado(3);
		Servicio servicio2 = new ServicioDeReparacion(4,3);
		Servicio servicio3 = new ServicioDeReparacion(8,1);
		Insumo insumo1 = new Insumo("Monitor",20,400000,TipoInsumo.HARDWARE);
		Insumo insumo2 = new Insumo("Auricular",10,85000,TipoInsumo.PERIFERICO);
		
		//Se facturan Servicios e Insumos al comercio
		System.out.println("----------Se facturan los siguientes Servicios/Insumos----------");
		comercio.facturarServicios(servicio1);
		comercio.facturarServicios(servicio2);
		comercio.facturarServicios(servicio3);
		comercio.facturarInsumos(insumo1);
		comercio.facturarInsumos(insumo2);

		//Se muestra el monto total facturado de Servicios e Insumos
		System.out.println("\n----------Monto total facturado----------");
		System.out.println(comercio.montoTotalFacturado());
		//Se muestra la cantidad de servicios de reparacion simple
		System.out.println("\n----------Cantidad de servicios de reparacion simple----------");
		System.out.println(comercio.cantServiciosSimples()); 
		
		
		
		
		
		
		
		
		
		
	}

}
