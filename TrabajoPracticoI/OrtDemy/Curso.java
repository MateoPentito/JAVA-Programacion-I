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
		int cantUsuarios = 0;
		if(cantUsuarios <= MAX_ALUMNOS_BECADOS) {
			this.usuariosSuscriptos.add(usuario);			
			cantUsuarios++;
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
}
