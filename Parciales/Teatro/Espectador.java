package Teatro;

import java.util.ArrayList;

public class Espectador {

	private String dni;
	private String nombreObraAAsistir;
	private boolean fueAcompaniado;

	public Espectador(String dni, String nombreObraAAsistir, boolean fueAcompaniado) {
		super();
		this.dni = dni;
		this.nombreObraAAsistir = nombreObraAAsistir;
		this.fueAcompaniado = fueAcompaniado;
	}

	public String getDni() {
		return dni;
	}

	public String getNombreObraAAsistir() {
		return nombreObraAAsistir;
	}

	public boolean isFueAcompaniado() {
		return fueAcompaniado;
	}


	
	public int getTiempoDisponible() {
		return 0;
	}
	
	

	
}
