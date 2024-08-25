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
		
		return resultado;
	}
	
	
	public void agregarUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void agregarCategorias(Categoria categoria) {
		this.categorias.add(categoria);
	}
	
}
