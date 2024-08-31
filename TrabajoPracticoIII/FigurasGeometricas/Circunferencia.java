package FigurasGeometricas;

public class Circunferencia extends Figura{
	private double radio;

	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	
	@Override
	public double calcularArea() {
		return PI * (radio*radio);
	}


	@Override
	public double calcularPerimetro() {
		return (2 * PI) * radio;
	}
	
	

}
