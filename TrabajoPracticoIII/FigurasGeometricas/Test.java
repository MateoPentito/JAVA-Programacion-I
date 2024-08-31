package FigurasGeometricas;

public class Test {

	public static void main(String[] args) {

		//Se crea un grupo de figuras
		GrupoDeFiguras grupoFiguras = new GrupoDeFiguras();
		//Se agregan las distintas figuras
		grupoFiguras.agregarFiguras(new Circunferencia("Amarillo",400));
		grupoFiguras.agregarFiguras(new Circunferencia("Azul",200));
		grupoFiguras.agregarFiguras(new Circunferencia("Marron",150));
		grupoFiguras.agregarFiguras(new Rectangulo("Rojo",100,50));
		grupoFiguras.agregarFiguras(new Rectangulo("Verde",200,100));
		grupoFiguras.agregarFiguras(new Rectangulo("Violeta",1000,500));
		grupoFiguras.agregarFiguras(new TrianguloEquilatero("Azul",420));
		grupoFiguras.agregarFiguras(new TrianguloEquilatero("Negro",840));
		grupoFiguras.agregarFiguras(new TrianguloEquilatero("Blanco",220));
		//Se muestra la informacion de las figuras
		System.out.println("**************Informacion de las figuras**************");
		grupoFiguras.mostrarInfoDeFiguras();
	}

}
