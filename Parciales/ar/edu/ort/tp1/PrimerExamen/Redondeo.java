package ar.edu.ort.tp1.PrimerExamen;

public enum Redondeo {
	
	DECIMAL(2);
	
	private int decimales;

    Redondeo (int decimales) {
        this.decimales = decimales;
    }

    public double redondear(double numero) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor; 
    }
}
