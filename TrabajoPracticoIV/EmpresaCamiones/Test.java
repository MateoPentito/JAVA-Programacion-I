package EmpresaCamiones;

public class Test {

	public static void main(String[] args) throws Exception {

		//Se crea la empresa
		Empresa empresa = new Empresa();
		

		System.out.println("**************Se realizan los siguiente viajes**************");
		validarViaje(empresa,new Viaje(5,"CH1",100));
		validarViaje(empresa,new Viaje(2,"CH1",300));
		validarViaje(empresa,new Viaje(1,"CH2",200));

		
		System.out.println("\n**************Costos de los viajes**************");
		System.out.println(empresa.obtenerCostosDeViajes());
		
		System.out.println("\n**************Cantidad de viajes de chofer con cada camion**************");
		System.out.println(empresa.obtenerViajesXChoferCamion()); 
		
	}
	
	
	
	private static void validarViaje(Empresa empresa,Viaje viaje) throws Exception {
		try {
			empresa.realizarViaje(viaje);		
			System.out.println("Se realizo: "+viaje.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	

}
