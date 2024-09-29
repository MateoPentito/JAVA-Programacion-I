package EmpresaCamiones;

import java.util.ArrayList;

public class Empresa {

	private final int CANTIDAD_CAMIONES = 10;
	private final int CANTIDAD_CHOFERES = 20;

	private ArrayList<Viaje> viajes;
	private Camion[] camiones;
	private Chofer[] choferes;

	public Empresa() throws Exception {
		this.viajes = new ArrayList<>();
		this.camiones = new Camion[CANTIDAD_CAMIONES];
		this.choferes = new Chofer[CANTIDAD_CHOFERES];
		inicializarCamion();
		inicializarChofer();
	}
	
	
	
	/*
	 *  La explotación del método obtenerViajesXChoferCamion que devuelva (no muestre por 
		consola) la cantidad de viajes que realizó cada chofer con cada camión.
	 */
	public int[] obtenerViajesXChoferCamion() {
		int[] cantViajes = new int[this.viajes.size()];
		int contadorViajes = 0;
		Chofer chofer =null;
		
		for(Viaje viaje : this.viajes) {
			//chofer = buscarChofer(viaje.getIdChofer());
			contadorViajes += viajoChofer(viaje.getIdChofer());
			
		}
		
		System.out.println("Cofer: "+chofer.toString()+" realizo "+contadorViajes+" viajes con los camiones: ");
		
		
		return cantViajes;
	}
	
	
	public int viajoChofer(String idChofer) {
		int numero = 0;
		int i = 0;
		boolean encontro=false;
		while(i < this.viajes.size() && !encontro){
			if(viajes.get(i).getIdChofer().equals(idChofer)) {
				numero++;			
				encontro=true;
			}						
		}
		return numero;
	}
	

	/*
	 * La explotación del método obtenerCostosDeViajes que devuelva (no muestre por
	 * consola) el costo aproximado de cada viaje (honorarios + consumo).
	 */
	// Pago por viaje (double) * Kms del viaje (double)

	public double obtenerCostosDeViajes() {
		double monto = 0;
		for (Viaje viaje : this.viajes) {
			Camion camion = buscarCamion(viaje.getIdCamion());
			monto += viaje.getKmViaje() * camion.getCostoKm();
		}
		return monto;
	}

	// Se agrega un viaje.
	public void realizarViaje(Viaje viaje) {
		this.viajes.add(viaje);
	}

	//Devuelve un camion buscado por id.
	private Camion buscarCamion(int idCamion) {
		Camion camionBuscado = null;
		boolean encontro = false;
		int i = 0;
		while (i < this.camiones.length && !encontro) {

			if (this.camiones[i].getId() == idCamion) {
				camionBuscado = this.camiones[i];
				encontro = true;
			}

			i++;
		}

		return camionBuscado;
	}

	// Se inicializan los camiones
	private void inicializarCamion() throws Exception {
		this.camiones[0] = new Camion(1, 10);
		this.camiones[1] = new Camion(2, 20);
		this.camiones[2] = new Camion(3, 30);
		this.camiones[3] = new Camion(4, 40);
		this.camiones[4] = new Camion(5, 50);
		this.camiones[5] = new Camion(6, 60);
		this.camiones[6] = new Camion(7, 70);
		this.camiones[7] = new Camion(8, 80);
		this.camiones[8] = new Camion(9, 90);
		this.camiones[9] = new Camion(10, 100);
	}

	// Se inicializan los choferes
	private void inicializarChofer() {
		this.choferes[0] = new Chofer("CH1", "Mateo", 15000);
		this.choferes[1] = new Chofer("CH2", "Santino", 25000);
		this.choferes[2] = new Chofer("CH3", "Caludia", 35000);
		this.choferes[3] = new Chofer("CH4", "Martina", 45000);
		this.choferes[4] = new Chofer("CH5", "Morena", 55000);
		this.choferes[5] = new Chofer("CH6", "Alejandra", 65000);
		this.choferes[6] = new Chofer("CH7", "Alicia", 75000);
		this.choferes[7] = new Chofer("CH8", "Jose", 85000);
		this.choferes[8] = new Chofer("CH9", "Javier", 95000);
		this.choferes[9] = new Chofer("CH10", "Benjamin", 105000);
		this.choferes[10] = new Chofer("CH11", "Bautista", 1115000);
		this.choferes[11] = new Chofer("CH12", "Elsa", 1125000);
		this.choferes[12] = new Chofer("CH13", "Marcelo", 113000);
		this.choferes[13] = new Chofer("CH14", "Carla", 145000);
		this.choferes[14] = new Chofer("CH15", "Jorge", 155000);
		this.choferes[15] = new Chofer("CH16", "Norma", 165000);
		this.choferes[16] = new Chofer("CH17", "Marcela", 175000);
		this.choferes[17] = new Chofer("CH18", "Diego", 185000);
		this.choferes[18] = new Chofer("CH19", "Tomy", 195000);
		this.choferes[19] = new Chofer("CH20", "Vicky", 205000);

	}

}
