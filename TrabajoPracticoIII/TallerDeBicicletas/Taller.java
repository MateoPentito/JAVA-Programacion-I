package TallerDeBicicletas;

import java.util.ArrayList;

public class Taller {

	
	public ArrayList<Bicicleta> cantServiciosPosibles(ArrayList<Bicicleta>bicicletas) {
		int cantBicicletas = 0;
		ArrayList<Bicicleta> bicicletasEnCondiciones = new ArrayList<>();
		for(Bicicleta bicicleta : bicicletas) {
			if(bicicleta.sePuedeReparar()) {
				bicicletasEnCondiciones.add(bicicleta);
				cantBicicletas++;
				}
			}
		System.out.println("Cantidad de bicicletas con servicios posibles: "+cantBicicletas);
		return bicicletasEnCondiciones;
	}
	
	
	
	
	
	
	
	
}
