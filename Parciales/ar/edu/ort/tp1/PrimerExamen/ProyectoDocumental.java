package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoDocumental extends Proyecto {

	private TipoDocumental tipo;

	public ProyectoDocumental(int idProyecto, double presupuesto, ArrayList<Double> rubros, TipoDocumental tipo) throws Exception {
		super(idProyecto, presupuesto, rubros);
		this.tipo = tipo;
	}

	@Override
	public double obtenerPresupuestoFinal() {
		double presupuesto = super.obtenerPresupuestoFinal();
		if (tipo.equals(TipoDocumental.CIENTÍFICO)) {
			presupuesto += presupuesto * tipo.getPorcentual();
		} else if (tipo.equals(TipoDocumental.CULTURAL)) {
			presupuesto += presupuesto * tipo.getPorcentual();
		} else if (tipo.equals(TipoDocumental.HISTÓRICO)) {
			presupuesto += presupuesto * tipo.getPorcentual();
		} else if (tipo.equals(TipoDocumental.SOCIAL)) {
			presupuesto += presupuesto * tipo.getPorcentual();
		}
		return presupuesto;
	}

	public TipoDocumental getTipo() {
		return tipo;
	}


}
