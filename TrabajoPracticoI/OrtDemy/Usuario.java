package OrtDemy;

public class Usuario {

	private String id;
	private String nombre;
	private String mail;
	private boolean becado;
	
	public Usuario(String id, String nombre, String mail, boolean becado) {
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.becado = becado;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public boolean isBecado() {
		return becado;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", mail=" + mail + ", becado=" + becado + "]";
	}

	
}
