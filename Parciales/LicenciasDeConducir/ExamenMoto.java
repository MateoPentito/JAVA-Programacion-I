package LicenciasDeConducir;

import java.util.ArrayList;

public class ExamenMoto extends Examen {

	private final int MAX_CILINDRADA = 150;
	private final int MAX_TIEMPO = 120;
	private ArrayList<Circuito> circuitos;
	private Moto moto;

	public ExamenMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.moto = moto;
		this.circuitos = new ArrayList<>();
	}

	@Override
	public boolean aprobo() {
		boolean aprobado = false;
		for (Circuito circuito : this.circuitos) {
			if (circuito.aprobo()) {
				if (cilindradaSuperios() || cilindradaInferiorIgual()) {
					aprobado = true;

				}
			}

			else {
				System.out.println("No aprobado, solo puede tener 2 faltas o menos.");
			}
		}
		return aprobado;
	}

	// -> Si la cilindrada de la moto es superior a 150cc, todos los circuitos deben
	// haber sido aprobados (sin importar el tiempo).
	private boolean cilindradaSuperios() {
		boolean aprobado = false;
		int contador = cantCircuitosAprobados();
		if (this.moto.getCilindrada() > MAX_CILINDRADA && this.circuitos.size() == contador) {
			aprobado = true;
		}
		return aprobado;
	}

	// -> Si la cilindrada de la moto es igual o inferior a 150cc, se puede tener
	// hasta un solo circuito desaprobado y el tiempo total entre todos no debe
	// superar los 2 minutos.
	private boolean cilindradaInferiorIgual() {
		boolean aprobado = false;
		int contadorTiempo = contadorTiempo();
		int circuitoAprobado = cantCircuitosAprobados();
		if (this.moto.getCilindrada() <= MAX_CILINDRADA) {
			if (circuitoAprobado >= this.circuitos.size() - 1 && contadorTiempo <= MAX_TIEMPO) {
				aprobado = true;

			}

		}
		return aprobado;
	}



	public void agregarCircuitos(Circuito circuito) {
		this.circuitos.add(circuito);
	}

	private int cantCircuitosAprobados() {
		int contador = 0;
		for (Circuito circuito : this.circuitos) {
			if (circuito.aprobo()) {
				contador++;
			}
		}
		return contador;
	}

	private int contadorTiempo() {
		int contador = 0;
		for (Circuito circuito : this.circuitos) {
			contador += circuito.getTiempo();
		}
		return contador;
	}

	@Override
	public String mostrarCirucitos() {
		return this.circuitos.toString();
	}

	@Override
	public String mostrarDatosVehiculos() {
		return this.moto.toString();
	}

}
