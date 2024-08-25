package OrtDemy;

import java.util.ArrayList;

public class OrtDemy {

	private ArrayList<Usuario>usuarios;
	private ArrayList<Categoria>categorias;

	public OrtDemy() {
		this.usuarios = new ArrayList<>();
		this.categorias= new ArrayList<>();
		
	}
	
	
	public Resultado suscribirseACurso(String idCurso,String idUsuario) {
		Resultado resultado = null;
		for(Categoria categoria : this.categorias) {
			if(categoria.buscarCurso(idUsuario)== null) {
				System.out.println("CURSO_INEX");
				resultado = Resultado.CURSO_INEX;
			}
			if(categoria.buscarCurso(idUsuario).getId().equals(idCurso)) {
				System.out.println("CURSO_EXISTENTE");
				resultado = Resultado.CURSO_INEX;
			}
			System.out.println("CURSO_EXISTENTE");

		}
		return resultado;
	}
	
	
	public void agregarUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void agregarCategorias(Categoria categoria) {
		this.categorias.add(categoria);
	}
	
}
