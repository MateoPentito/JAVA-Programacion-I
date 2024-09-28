package PatioDeComidas;

import java.util.ArrayList;

public class Cajero {

	private int id;
	private String apellido;
	private int antiguedad;

	public Cajero(int id, String apellido, int antiguedad) {
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}



	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", apellido=" + apellido + ", antiguedad=" + antiguedad;
	}



	public String getApellido() {
		return apellido;
	}

}
