package Clase5;

public class Test {

	public static void main(String[] args) {

//		System.out.println(TipoParte.values().length);
//		System.out.println(TipoMarca.values().length);
//		System.out.println(TipoMarca.CHEVROLET.ordinal());
		
		EmpresaAutoparte empresa = new EmpresaAutoparte();
		
		empresa.agregarStockAutopartes(TipoMarca.CHEVROLET, TipoParte.BUTACA, 5);
		empresa.agregarStockAutopartes(TipoMarca.CHEVROLET, TipoParte.PARAGOLPE_DELANTERO, 4);
		empresa.agregarStockAutopartes(TipoMarca.CHEVROLET, TipoParte.RUEDA, 2);
		
		empresa.agregarStockAutopartes(TipoMarca.CITRONEN, TipoParte.BUTACA, 67);
		empresa.agregarStockAutopartes(TipoMarca.CITRONEN, TipoParte.PARAGOLPE_DELANTERO, 8);
		empresa.agregarStockAutopartes(TipoMarca.CITRONEN, TipoParte.RUEDA, 9);
		
		System.out.println("fin del programa");
		
		empresa.imprimirCantidadPartesStockeadas();
		
		
	}

}
