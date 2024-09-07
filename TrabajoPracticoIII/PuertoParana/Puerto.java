package PuertoParana;

import java.util.ArrayList;

public class Puerto {

	private ArrayList<Amarra> amarras;
	private ArrayList<Barco> barcos;
	private double valorBase;
	private double valorAdicional;

	public Puerto() {
		this.barcos = new ArrayList<>();
		this.amarras = new ArrayList<>();
		this.valorBase = valorBase;
		this.valorAdicional = valorAdicional;
	}

//	B) El método barcosConAlquilerMayorA de la clase Puerto que reciba como parámetro un 
//	importe y devuelva la cantidad de barcos que abonan un importe mayor al indicado en 
//	concepto de alquiler de su amarra.

//	C) El método barcoConMayorConsumo de la clase Puerto que debe devolver el barco deportivo 
//	(de lujo o no) de mayor consumo en todo el puerto.

	public double alquilarAmarra(double valorBase, double valorAdicional,Barco barco) {
		double valor = 0;
		for (Amarra amarra : this.amarras) {
			if (amarra.isEstaDisponible()) {
				valor = calcularPrecioBase(valorBase, barco) + calcularAdicional(valorAdicional, barco);
			}
		}
		System.out.println("Precio base= "+calcularPrecioBase(valorBase, barco));
		System.out.println("Precio adicional= "+calcularAdicional(valorAdicional, barco));
		System.out.println("Precio total= "+valor);
		return valor;
	}

	// Se calcula el precio base del alquiler
	public double calcularPrecioBase(double valorBase, Barco barco) {
		return valorBase * barco.calcularPrecioEslora();
	}

	// Se calcula el precio adicional del alquiler
	public double calcularAdicional(double valorAdicional, Barco barco) {
		return valorAdicional * barco.calcularPrecioAdicional();
	}

	// Metodos para agregar barcos y las amarras
	public void agregarBarcos(Barco barco) {
		this.barcos.add(barco);
	}

	public void agregarAmarras(Amarra amarra) {
		this.amarras.add(amarra);
	}

}
