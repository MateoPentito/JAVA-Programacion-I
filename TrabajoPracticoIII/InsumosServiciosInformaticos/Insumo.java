package InsumosServiciosInformaticos;

public class Insumo implements Facturable{

	private String nombre;
	private double porcentajeGanancia;
	private double precioLista;
	private TipoInsumo tipoInsumo;
	
	public Insumo(String nombre, double porcentajeGanancia, double precioLista, TipoInsumo tipoInsumo) {
		this.nombre = nombre;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioLista = precioLista;
		this.tipoInsumo = tipoInsumo;
	}

	@Override
	public double facturar() {
		double valor =  porcentaje(precioLista);
		double valorIva = valor * (IVA / 100.00); 
		return valor + valorIva;
	}
	
	//Se obtiene el porcentaje de ganancia + el precio de lista
	private double porcentaje(double precioLista) {
		double valorPorcentaje = this.porcentajeGanancia / 100; 
		return (valorPorcentaje * precioLista) + precioLista;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
}
