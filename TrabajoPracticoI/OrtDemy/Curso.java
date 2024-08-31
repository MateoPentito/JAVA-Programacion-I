package OrtDemy;

import java.util.ArrayList;

public class Curso {
	private final static int MAX_ALUMNOS_BECADOS = 5;
	private String id;
	private String titulo;
	private double precio;
	private int valoracion;
	private Usuario autor;
	private ArrayList<Leccion> lecciones;
	private ArrayList<Usuario> usuariosSuscriptos;

	public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.lecciones = new ArrayList<>();
		this.usuariosSuscriptos = new ArrayList<>();
	}

	public void agregarLecciones(Leccion leccion) {
		this.lecciones.add(leccion);
	}

	public void agregarUsuariosSuscriptos(Usuario usuario) {
		this.usuariosSuscriptos.add(usuario);
	}

	public boolean usuariosMaximosBecados() {
		int cantUsuarios = 0;
		int i = 0;
		while (i < this.usuariosSuscriptos.size() && cantUsuarios < MAX_ALUMNOS_BECADOS) {
			if (this.usuariosSuscriptos.get(i).isBecado()) {
				cantUsuarios++;
			}
			i++;
		}
		return cantUsuarios >= MAX_ALUMNOS_BECADOS;
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public int getValoracion() {
		return valoracion;
	}

	public Usuario getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", valoracion=" + valoracion
				+ ", autor=" + autor + ", lecciones=" + lecciones + ", usuariosSuscriptos=" + usuariosSuscriptos;
	}

}
