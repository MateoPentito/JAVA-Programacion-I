package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstitutoAudiovisual instituto = new InstitutoAudiovisual();
		
		ArrayList<Double> rubros = new ArrayList<>();
		
		rubros.add(generarNumeroAleatorio(5000, 7000));
		rubros.add(generarNumeroAleatorio(3500, 8500));
		rubros.add(generarNumeroAleatorio(25000, 40000));
		
		
		validarRubrosProyectosDocumental(instituto, 110, 31000, rubros, TipoDocumental.CIENTÍFICO);
		validarRubrosProyectosDocumental(instituto,112,31000.00, null, TipoDocumental.CIENTÍFICO);
		validarRubrosProyectosDocumental(instituto,144,25000.60, rubros, TipoDocumental.HISTÓRICO);
		validarRubrosProyectosFiccionPelicula(instituto,117,32679.67, rubros, "FILMS S.A.",130);
		validarRubrosProyectosFiccionPelicula(instituto,120,23000.67, rubros, "NORTE Films",100);
		validarRubrosProyectosFiccionPelicula(instituto,122,3000000.00, rubros, "FILMS S.A.",126);
		validarRubrosProyectosFiccionPelicula(instituto,136, 27080.00, null, "Movies YA",92);
		validarRubrosProyectosFiccionPelicula(instituto,142, 50070.00, rubros, "IndieHome",90);
		
		validarRubrosProyectosFiccionSerie(instituto,130,9000.70, rubros, "ShowTime",14);
		validarRubrosProyectosFiccionSerie(instituto,131, 4150000.70, rubros, "Clementz Group",30);
		validarRubrosProyectosFiccionSerie(instituto,135, 22020.00, null, "CandyLook",10);
		validarRubrosProyectosFiccionSerie(instituto,140, 11500.70, rubros, "GroupScreen",20);
		validarRubrosProyectosFiccionSerie(instituto,141, 2800000.00, rubros, "Leopardy",12);


		instituto.mostrarProyectos();
		
		validarEliminacionProyecto(instituto,170);
		validarEliminacionProyecto(instituto,141);
		
	}
	
	//Se valida si un proyecto es null, se captura una excepcion.
	private static void validarEliminacionProyecto(InstitutoAudiovisual instituto,int numero) {
		try {
			instituto.eliminarProyecto(numero);			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Se valida si un proyecto documental tiene rubros null, se captura una excepcion.
	private static void validarRubrosProyectosFiccionPelicula(InstitutoAudiovisual instituto,int idProyecto,double presupuesto,ArrayList<Double> rubros,String productora,int duracion) {
		try {
			instituto.agregarProyecto(new ProyectoFiccionPelicula(idProyecto,presupuesto,rubros,productora,duracion));			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Se valida si un proyecto de peliculas de ficcion tiene rubros null, se captura una excepcion.
	private static void validarRubrosProyectosFiccionSerie(InstitutoAudiovisual instituto,int idProyecto,double presupuesto,ArrayList<Double> rubros,String productora,int cantEposidios) {
		try {
			instituto.agregarProyecto(new ProyectoFiccionSerie(idProyecto,presupuesto,rubros,productora,cantEposidios));			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Se valida si un proyecto de series de ficcion tiene rubros null, se captura una excepcion.
	private static void validarRubrosProyectosDocumental(InstitutoAudiovisual instituto,int idProyecto,double presupuesto,ArrayList<Double> rubros,TipoDocumental tipo) {
		try {
			instituto.agregarProyecto(new ProyectoDocumental(idProyecto,presupuesto,rubros,tipo));			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static double generarNumeroAleatorio(int min, int max) {
     
        return (double)(Math.random() * (max - min + 1)) + min;
    }

}
