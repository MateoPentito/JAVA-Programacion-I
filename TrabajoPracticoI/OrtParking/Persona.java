package OrtParking;

public class Persona {

	private String dni;
	private String nombreCompleto;

	public Persona(String dni, String nombreCompleto) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}

}
