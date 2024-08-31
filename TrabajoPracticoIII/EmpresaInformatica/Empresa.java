package EmpresaInformatica;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Personal> personal;
	private String nombre;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.personal = new ArrayList<>();
	}
	
	
	//A) La explotación del método mostrarSalarios que imprima por consola el nombre completo de cada empleado junto a su salario.
	public void mostrarSalarios() {
		for(Personal personal : this.personal) {
			System.out.println(personal.toString()); 
		}
	}
	
	//B La explotación del método empleadoConMasClientes que devuelva al empleado con mayor  cantidad de clientes captados (se supone único).
		public PersonalAComision empleadoConMasClientes() {
			PersonalAComision comision = null;
			int clientes = -1;
			for(Personal personal : this.personal) {
				if(personal instanceof PersonalAComision) {
					if(((PersonalAComision) personal).getNumClientesCaptados() > clientes) {
						clientes = ((PersonalAComision) personal).getNumClientesCaptados();
						comision = ((PersonalAComision) personal);
					}
				}
			}
			return comision;
		}
	
	public void agregarPersonal(Personal personal) {
		this.personal.add(personal);
		
	}
	
	
}
