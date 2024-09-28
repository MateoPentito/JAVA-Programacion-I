package ar.edu.ort.tp1.PrimerExamen;

public enum TipoDocumental {
	SOCIAL(0.05), 
	CULTURAL (0.06),
	HISTÓRICO (0.07),
	CIENTÍFICO(0.09);

	private double d; 
	
	TipoDocumental(double d) {
		this.d = d;
	}
	
	public double getPorcentual() {
		return d; 
	}
}
