package Teatro;

import java.util.ArrayList;

public class Teatro {

	private ArrayList<Obra> obras;
	private ArrayList<Espectador> espectadores;
	private String nombre;
	private String direccion;

	public Teatro(String nombre, String direccion) {
		this.obras = new ArrayList<>();
		this.espectadores = new ArrayList<>();
		this.nombre = nombre;
		this.direccion = direccion;
	}

//	El método otorgarPremio(...), en la clase Teatro, que recibe por parámetro una cantidad de entradas a regalar a todos los espectadores que
//	 ingresaron a una obra dramática o basada en películas. Este método deberá imprimir por cada espectador un mensaje del estilo: “El espectador
//	 con DNI <dni> recibe <cantidad> de entradas”
	public void otorgarPremio(int cantEntradas) {
		for(Obra obra : this.obras) {
			if(obra instanceof ObraMusicalPelicula || obra instanceof ObraDramatica) {
				System.out.println("OBRA: "+obra.getClass().getSimpleName());				
			}
			for(Espectador espectador : this.espectadores) {
				int entradas = cantEntradas;
				if(obra instanceof ObraMusicalPelicula) {
					System.out.println("El espectador con DNI "+espectador.getDni()+" recibe "+entradas+"de entradas");					
				}else if(obra instanceof ObraDramatica) {
					entradas += ((ObraDramatica) obra).entradaAdicional();
					System.out.println("El espectador con DNI "+espectador.getDni()+" recibe "+entradas+"de entradas");					
				}
			}			
		}
	}
	
	
//	Un espectador podrá ingresar a la obra si hay localidades disponibles en la misma y, en el caso de los críticos, si además el tiempo que tienen disponible
//	es menor o igual a la duración de la obra

	public void ingreso(ArrayList<Espectador> espectadoresObra) {
		boolean ingreso = false;
		int duracionObra = 0;
		agregarEspectadores(espectadoresObra);
		
		
		for(Espectador espectador : this.espectadores) {
			for (Obra obra : this.obras) {
					if (obra.getNombre().equals(espectador.getNombreObraAAsistir())) {
						duracionObra = obra.getDuracion();
						duracionObra += obra.duracionAdicional();
						if (obra.localidadesDisponibles(espectador)) {
							ingreso = true;
							obra.agregarEspectador(espectador);
							
						}else if(espectador instanceof CriticoTeatro){
							if(obra.localidadesDisponibles(espectador)&& espectador.getTiempoDisponible() <= duracionObra) {
								ingreso = true;									
							}
						}
					}			
			}
			if(!ingreso) {
				System.out.println("El "+espectador.getClass().getSimpleName()+" "+espectador.getDni()+" no puede ingresar");
			}
			
		}
	}
	
	//Se agregan obras
	public void agregarObras(Obra obra) {
		this.obras.add(obra);
	}

	//Se agregan espectadores
		public void agregarEspectadores(ArrayList<Espectador> espectadoresObra) {
			for(int i = 0 ; i < espectadoresObra.size();i++) {
				this.espectadores.add(espectadoresObra.get(i));
			}
		}
}
