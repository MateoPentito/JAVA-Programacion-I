package InsumosServiciosInformaticos;

public abstract class Servicio implements Facturable{

	private int cantHora;
	private int valorHora;
	
	
	public Servicio(int cantHora) {
		this.cantHora = cantHora;
	}	
	
	public double getValorHora() {
		return valorHora;
	}
	
	
	@Override
	public double facturar() {
		double valorCalculado = cantHora * getValorHora();
		double valorIva = IVA / 2.0;
		double adicional = valorCalculado * valorIva;
		valorCalculado = valorCalculado + adicional;		
		return valorCalculado;
	}
	
	


}
