package LicenciasDeConducir;

import java.util.ArrayList;

public class Informe {

	private ArrayList<Examen> examenes = new ArrayList<>();

	public void agregarExamenes(Examen examen) {
		this.examenes.add(examen);
	}

//	- Porcentaje de examenes reprobados.

	public double porcExamenesReprobados() {
		int cantAutosReprobados = 0;
		for (Examen examen : this.examenes) {
			cantAutosReprobados += examen.autoReprobado();
		}
		return calcularPromedio(cantAutosReprobados,100);
	}

	// - Promedio de tiempo de los examenes de auto aprobados.
	// public double promedioTiempoAutosAprobados()

	public double promedioTiempoExamenesAutosAprobados() {
		double tiempoTotal = 0;
		int cantidadAutosAprobados = 0;
		for (Examen examen : this.examenes) {
			cantidadAutosAprobados += examen.cantAutos();
			tiempoTotal += examen.tiempoExamenAuto();
		}
		return calcularPromedio(cantidadAutosAprobados, tiempoTotal);
	}

	private double calcularPromedio(int cantidadAutos, double tiempoTotal) {
		return tiempoTotal / cantidadAutos;

	}

	public double cantExamenesReprobados() {
		int contador = 0;
		for (Examen examen : this.examenes) {
			contador += examen.cantExamenesReprobados();
		}
		return contador;
	}

	public double cantExamenesAprobados() {
		int contador = 0;
		for (Examen examen : this.examenes) {
			contador += examen.cantExamenesAprobados();
		}
		return contador;
	}

	public void mostrarExamenesRealizados() {
		for (Examen examen : this.examenes) {
			System.out.println(examen.toString());
		}

	}

	public void mostrarExamenesAprobados() {
		for (Examen examen : this.examenes) {
			if (examen.aprobo()) {
				System.out.println(examen.toString());
			}
		}

	}

	public void mostrarExamenesReprobados() {
		for (Examen examen : this.examenes) {
			if (!examen.aprobo()) {
				System.out.println(examen.toString());
			}
		}
	}

}
