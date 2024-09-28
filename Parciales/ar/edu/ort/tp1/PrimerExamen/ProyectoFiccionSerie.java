package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoFiccionSerie extends ProyectoFiccion{

	private final double PORC_ADICIONAL = 0.02;
	private int cantEposidios;

	public ProyectoFiccionSerie(int idProyecto, double presupuesto, ArrayList<Double> rubros, String productora,
			int cantEposidios) throws Exception {
		super(idProyecto, presupuesto, rubros, productora);
		this.cantEposidios = cantEposidios;
	}
	
	
//	Serie: Tiene la cantidad de episodios. Cada episodio tiene
//	 un costo de rodaje equivalente al  2% del presupuesto.
//	 Este valor debe agregarse al presupuesto parcial.
	
	
	@Override
	public double obtenerPresupuestoFinal() {
		double presupuesto = super.obtenerPresupuestoFinal();				
		double porcentajeEquivalente = super.obtenerPresupuestoFinal() * PORC_ADICIONAL;
		return porcentajeEquivalente + presupuesto;
	}
	
}
