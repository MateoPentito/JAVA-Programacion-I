package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class InstitutoAudiovisual {

	private ArrayList<Proyecto> proyectos;
	private Redondeo redondeo = Redondeo.DECIMAL;

	public InstitutoAudiovisual() {
		this.proyectos = new ArrayList<>();
	}

	//Agrega proyectos al arraylist
	public void agregarProyecto(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}

	//Muestra todos los proyectos aprobados
	public void mostrarProyectos() {
		System.out.println("===Mostrando inversión final===");
		for(Proyecto proyecto : this.proyectos) {
			if(proyecto.presupuestoAprobado()) {
				System.out.println(proyecto.obtenerDatos());				
			}
		}
		System.out.println("\n===Mostrando inversión final===");
		System.out.println("Los proyectos aprobados requieren una inversión total de: "+inversionTotal());
	}

	//Elimina un proyecto enviando un id por paramentro
	public Proyecto eliminarProyecto(int numero) throws Exception {
		int i = 0;
		boolean encontro = false;
		Proyecto proyectoEncontrado = null;
		System.out.println("\n==Eliminando Proyectos==");
		System.out.println("Proyecto buscado: "+numero);
		
		while(i < this.proyectos.size() && !encontro) {
			if(this.proyectos.get(i).getIdProyecto() == numero) {
				proyectoEncontrado = this.proyectos.get(i);
				System.out.println("Se quitó el proyecto "+numero);
				System.out.println(proyectoEncontrado.obtenerDatos());
				this.proyectos.remove(i);
				encontro = true;

			}else {
				i++;
			}
		}
		if(!encontro) {
			System.out.println("Proyecto NO encontrado. Ingrese otro identificador");
		}
		
		if(proyectoEncontrado == null) {
			throw new Exception("Excepcion, el proyecto no debe ser null.");
		}
		
		return proyectoEncontrado;
	}
	
	private double inversionTotal() {
		double inversion = 0;
		for(Proyecto proyecto : this.proyectos ) {
			inversion += proyecto.obtenerPresupuestoFinal();
		}
		return redondeo.redondear(inversion);
	}
}
