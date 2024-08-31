package FigurasGeometricas;

public abstract class Figura {
	protected final double PI = 3.14;
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();


	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" - color=" + color +" - area: "+calcularArea()+" - perimetro: "+calcularPerimetro();
	}
	

}
