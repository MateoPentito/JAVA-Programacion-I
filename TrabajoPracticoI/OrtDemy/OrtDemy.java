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
			if(categoria.buscarCurso(idCurso) == null) {
				System.out.println("CURSO_INEXSTENTE");
				resultado = Resultado.CURSO_INEX;
			}else if(categoria.buscarCurso(idCurso).getId().equals(idCurso)) {
				resultado = Resultado.CURSO_INEX;
			}

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
