package TiendaElectrodomestico;

public class Test {

	public static void main(String[] args) {

		//Se crea la tienda
		Tienda tienda = new Tienda("Fravega");
		//Se crean y agregan productos
		tienda.agregarProducto(new Televisor("Samsung","ABC123","QWE123E",220,true,155000,52,true));
		tienda.agregarProducto(new Televisor("Samsung","BCD987","III874F",220,true,435000,52,true));
		tienda.agregarProducto(new Lavarropa("Dream","OOO789","MVMVMV45",220,true,595000,52,true));
		tienda.agregarProducto(new Lavarropa("Samsung","TETE456","GFGFD123",220,true,810230,52,true));
		tienda.agregarProducto(new Heladera("LG","OODDPD5","654654",220,true,1050000,52,true));
		tienda.agregarProducto(new Heladera("Samsung","WWWQ2343","QWE123E",220,true,1250321,52,true));
		tienda.agregarProducto(new Licuadora("LG","12FEFEF","787PKI",220,true,45000,120,6));
		tienda.agregarProducto(new Licuadora("LG","122657","111PKI",220,true,88500,120,3));
	
		
		
		//Se muestran productos
		tienda.realizarCompra();;


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
