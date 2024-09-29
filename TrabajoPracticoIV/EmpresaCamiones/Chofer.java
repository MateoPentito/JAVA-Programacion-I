package EmpresaCamiones;

public class Chofer {

	private String id;
	private String nombre;
	private double pagoViaje;
	
	public Chofer(String id, String nombre, double pagoViaje) {
		this.id = id;
		this.nombre = nombre;
		this.pagoViaje = pagoViaje;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPagoViaje() {
		return pagoViaje;
	}

	@Override
	public String toString() {
		return "Chofer [id=" + id + ", nombre=" + nombre + ", pagoViaje=" + pagoViaje + "]";
	}
	
	
	
}
