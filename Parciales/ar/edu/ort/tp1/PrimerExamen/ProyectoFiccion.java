package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public abstract class ProyectoFiccion extends Proyecto{

	private String productora;

	public ProyectoFiccion(int idProyecto, double presupuesto, ArrayList<Double> rubros, String productora) throws Exception {
		super(idProyecto, presupuesto, rubros);
		this.productora = productora;
	}
	
	
	@Override
	public String mostrarInformacionAdicional() {
		return super.mostrarInformacionAdicional()+" - "+this.productora;
	}


	
}
