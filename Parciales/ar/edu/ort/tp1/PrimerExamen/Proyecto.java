package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public abstract class Proyecto implements Gestionable {
	private Redondeo redondeo = Redondeo.DECIMAL;

	private int idProyecto;
	private double presupuesto;
	private ArrayList<Double> rubros;

	public Proyecto(int idProyecto, double presupuesto, ArrayList<Double> rubros) throws Exception {
		this.idProyecto = idProyecto;
		this.presupuesto = presupuesto;
		setRubros(rubros);
	}

	// Si el presupuesto calculado es mayor a todos los costros de los rubros, se
	// aprueba el presupuesto.
	public boolean presupuestoAprobado() {
		boolean aprobo = false;
		if (obtenerPresupuestoFinal() >= planEconomico()) {
			aprobo = true;
		}
		return aprobo;
	}

	//Devuelve el calculo de presupuesto de cada proyecto
	public double obtenerPresupuestoFinal() {
		return this.presupuesto;
	}
	//Devuelve todos los costos del arraylist de rubros
	private double planEconomico() {
		double monto = 0;
		for (Double rubro : this.rubros) {
			monto += rubro;
		}
		return monto;
	}
	//Devuelva la clase invocada + datos adicionales de cada proyecto.
	public String mostrarInformacionAdicional() {
		return this.getClass().getSimpleName();
	}

	// Metodo de interfaz, muestra todos los datos del proyecto.
	@Override
	public String obtenerDatos() {
		return "id=" + this.idProyecto + ", presupuesto=" + this.presupuesto + "-" + mostrarInformacionAdicional()
		+ ",Presupuesto Final=" + redondeo.redondear(obtenerPresupuestoFinal()) ;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setRubros(ArrayList<Double> rubros) throws Exception {
		if(rubros == null) {
			throw new Exception("Excepcion, el valor de un rubro no puede ser null.");
		}
		this.rubros = rubros;
	}





}
