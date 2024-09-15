package TiendaElectrodomestico;

public abstract class Electrodomestico {

	private String marca;
	private String modelo;
	private String numSerie;
	private int voltaje;
	private boolean estado;
	private double precio;

	public Electrodomestico(String marca, String modelo, String numSerie, int voltaje, boolean estado,double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio=precio;
	}
	
	
	
	public String mostrarDatos() {
		return this.getClass().getSimpleName()+" ||| marca:"+this.marca+" ||| modelo:"+this.modelo+" ||| "+datosProductos();
	}
	
	
	public  abstract String datosProductos();
	
	

	public void mostrarElectrodomesticos() {
		datosProductos();
	}

	
	public String productosOfrecer() {
		return this.getClass().getSimpleName()+": 		||| 	marca:"+this.marca+" 		||| 	modelo:"+this.modelo+" 		||| 		precio: $"+this.precio;
	}



	public String getModelo() {
		return modelo;
	}



	public double getPrecio() {
		return precio;
	}
	
	
}
