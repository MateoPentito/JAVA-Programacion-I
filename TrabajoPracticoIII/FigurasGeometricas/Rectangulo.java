package FigurasGeometricas;

public class Rectangulo extends Figura{
	
	private double longitud;
	private double ancho;
	
	public Rectangulo(String color, double longitud, double ancho) {
		super(color);
		this.longitud = longitud;
		this.ancho = ancho;
	}

	
	@Override
	public double calcularArea() {
		return this.longitud *  this.ancho;
	}
	
	@Override
	public double calcularPerimetro() {
		return (2 * this.longitud) + (2 * this.ancho);
	}
	
	
	
}
