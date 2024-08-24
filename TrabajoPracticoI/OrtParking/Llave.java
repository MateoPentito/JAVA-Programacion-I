package OrtParking;

public class Llave {

	private String patente;

	public Llave(String patente) {
		this.patente = patente;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	@Override
	public String toString() {
		return "Llave [patente=" + patente + "]";
	}

}
