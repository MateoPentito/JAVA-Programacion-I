package Nomina;

public class Nomina {
	private final int CANT_EMPLEADOS = 665;
	Empleado[] empleados;

	public Nomina() {
		this.empleados = new Empleado[CANT_EMPLEADOS];
	}
	
	
	public double sueldoTotal() {
		double sueldo = 0;
		for(int i = 0; i < this.empleados.length; i++) {
			if(this.empleados[i] != null) {
				sueldo += this.empleados[i].getSueldo();				
			}
		}
		return sueldo;
	}
	
	
	//Devuelve cantidad de vacantes disponibles
	public int cantVacantes() {
		int numeroVacante = 0;
		for(int i = 0; i < this.empleados.length;i++) {
			if(this.empleados[i] == null) {
				numeroVacante++;
			}
		}
		return numeroVacante;
	}

	// Devuelve el numero de la posicion del empleado agregado.
	public int altaEmpleado(Empleado empleado) {
		boolean encontro = false;
		int i = 0;
		int resultado = -1;
		while (i < empleados.length && !encontro) {
			if (empleados[i] == null) {
				empleados[i] = empleado;
				encontro = true;
				resultado = i;
			}
			i++;
		}
		if (i == empleados.length) {
			resultado = -1;
			System.out.println("Devuelve -1 porque no hay mas espacio");
		} else {
			System.out.println(
					"Se agrego en la posicion: " + resultado + ". 		 El empleado nombre: " + empleado.getNombre());
		}
		return resultado;
	}

	public void agregarANomina(int posicion, Empleado empleado) {
		empleados[posicion] = empleado;
	}

	public Empleado bajaDeEmpleado(String dni) {
		Empleado empleadoBaja = null;
		int i = 0;
		while (i < this.empleados.length && empleadoBaja == null) {
			if (empleadoEncontrado(dni)) {
				empleadoBaja = buscarEmpleado(dni); 
//				this.empleados[i] = null;
			}
			i++;
		}

		System.out.println("Se dio de baja el empleado: " + empleadoBaja);
		return empleadoBaja;
	}

	private boolean empleadoEncontrado(String dni) {
		boolean encontro = false;
		int i = 0;
		while (i < this.empleados.length && !encontro) {
			if (this.empleados[i].getDni().equals(dni)) {
				encontro = true;
			}
			i++;

		}
		return encontro;

	}

	public Empleado buscarEmpleado(String dni) {
		Empleado empleadoEncontrado = null;
		boolean encontro = false;
		int i = 0;

		while (i < this.empleados.length && !encontro) {
			if (this.empleados[i].getDni().equals(dni)) {
				empleadoEncontrado = this.empleados[i];
				encontro = true;
			}
			i++;
		}
		return empleadoEncontrado;
	}

}
