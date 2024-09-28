package Clase5;

public class EmpresaAutoparte {
	
	private Integer[][] stockPartes;
	
	
	
	public EmpresaAutoparte() {
		this.stockPartes = new Integer[TipoMarca.values().length][TipoParte.values().length];
		System.out.println("Stock basico creado");
	}

	public void agregarStockAutopartes(TipoMarca marca,TipoParte parte,int cantidad) {
		stockPartes[marca.ordinal()][parte.ordinal()] = cantidad;
	}
	
	public void imprimirCantidadPartesStockeadas() {
		int stockTotalPartes = 0;
		for(int fila = 0; fila < stockPartes.length;fila ++) {
			for(int columna = 0; columna < stockPartes[fila].length; columna++) {
				if(stockPartes[fila][columna] != null) {
					stockTotalPartes += stockPartes[fila][columna];					
				}
			}
		}
		System.out.println("Cantidad de partes : "+stockTotalPartes);
	}
}
