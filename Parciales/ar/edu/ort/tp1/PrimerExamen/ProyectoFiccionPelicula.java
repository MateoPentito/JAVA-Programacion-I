package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoFiccionPelicula extends ProyectoFiccion {

	private final int DURACION_MAX = 120;
	private final double PORC_ADICIONAL = 1.50;

	private int duracion;

	public ProyectoFiccionPelicula(int idProyecto, double presupuesto, ArrayList<Double> rubros, String productora,
			int duracion) throws Exception {
		super(idProyecto, presupuesto, rubros, productora);
		this.duracion = duracion;
	}

//	Película: Debe tener la duración en minutos. En este caso 
//	si la película tiene una duración superior a 120 minutos, 
//	se adiciona el 5% del presupuesto parcial al presupuesto
//	 total.

	@Override
	public double obtenerPresupuestoFinal() {
		double presupuesto = super.obtenerPresupuestoFinal();
		if(this.duracion > DURACION_MAX) {
			presupuesto = presupuesto * PORC_ADICIONAL;
			}
		return presupuesto;
		
	}

}
