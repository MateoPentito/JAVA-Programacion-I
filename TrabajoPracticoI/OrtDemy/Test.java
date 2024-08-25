package OrtDemy;

public class Test {

	public static void main(String[] args) {
		
		//Se crea la empresa
		OrtDemy ortDemy = new OrtDemy();
		//Se crean categorias
		Categoria categoria1 = new Categoria("ABC","Informacion");
		//Se crean usuarios
		Usuario user1 = new Usuario("U1","Mateo","mate@ort.com",true);
		Usuario user2 = new Usuario("U2","Morena","morena@ort.com",true);
		Usuario user3 = new Usuario("U3","Martina","martina@ort.com",true);
		Usuario user4 = new Usuario("U4","Santino","santino@ort.com",true);
		Usuario user5 = new Usuario("U5","Bautista","bautista@ort.com",true);
		Usuario user6 = new Usuario("U6","Benjamin","benjamin@ort.com",true);
		//Se crean cursos
		Curso curso1 = new Curso("ABC","Analisis de datos",85000,4,user1);
		//Se crean lecciones
		Leccion leccion1 = new Leccion("Lectura",60,TipoLeccion.TEXT);
		
		//Se agrega categoria
		ortDemy.agregarCategorias(categoria1);
		//Se agrega usuarios
		ortDemy.agregarUsuarios(user1);
		ortDemy.agregarUsuarios(user2);
		ortDemy.agregarUsuarios(user3);
		ortDemy.agregarUsuarios(user4);
		ortDemy.agregarUsuarios(user5);
		ortDemy.agregarUsuarios(user6);
		//Se agrega curso
		categoria1.agregarCurso(curso1);
		//Se agrega leccion
		curso1.agregarLecciones(leccion1);

		System.out.println("Test");
		//ortDemy.suscribirseACurso("ABC","U1");

	}

}
