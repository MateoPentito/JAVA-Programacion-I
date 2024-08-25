package OrtDemy;

import java.util.ArrayList;

public class Categoria {

	private String id;
	private String nombre;
	private ArrayList<Curso> cursos;
	
	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}
	
	public void agregarCurso(Curso curso) {
		this.cursos.add(curso);
	}
	
	public void cursoInexistente() {
		int i = 0;
		Curso cursoEncontrado = null;
		while(i < this.cursos.size() && cursoEncontrado == null) {
			
		}
	}
	
}
