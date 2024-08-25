package OrtDemy;

import java.util.ArrayList;

public class Curso {
	private final static int MAX_ALUMNOS_BECADOS = 5;
	private String id;
	private String titulo;
	private double precio;
	private int valoracion;
	private Usuario autor;
	private ArrayList<Leccion>lecciones;
	private ArrayList<Usuario>usuariosSuscriptos;
	private int cantUsuarios = 0;

	
	public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.lecciones = new ArrayList<>();
		this.usuariosSuscriptos = new ArrayList<>();
		this.cantUsuarios = cantUsuarios;
	}

	
	public void agregarLecciones(Leccion leccion) {
		this.lecciones.add(leccion);
	}

	public void agregarUsuariosSuscriptos(Usuario usuario) {
		int i = 0;
		boolean cantidadMax = false;
		
		this.usuariosSuscriptos.add(usuario);
		if(usuario.isBecado() && cantUsuarios <= MAX_ALUMNOS_BECADOS) {
			cantUsuarios++;
		}

		

	}


	public static int getMaxAlumnosBecados() {
		return MAX_ALUMNOS_BECADOS;
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


	public ArrayList<Leccion> getLecciones() {
		return lecciones;
	}


	public ArrayList<Usuario> getUsuariosSuscriptos() {
		return usuariosSuscriptos;
	}


	public int getCantUsuarios() {
		return cantUsuarios;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", valoracion=" + valoracion
				+ ", autor=" + autor + ", lecciones=" + lecciones + ", usuariosSuscriptos=" + usuariosSuscriptos
				+ ", cantUsuarios=" + cantUsuarios + "]";
	} 
	
	
	
	
	
	
	
	
	
	
	
}
