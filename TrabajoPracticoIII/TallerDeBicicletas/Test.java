package TallerDeBicicletas;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//Se crea el taller 
		Taller taller = new Taller();
		//Se crea un arraylist de biciletas
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();
		
		//Se agregan bicicletas
		bicicletas.add(new Bicicleta("BMX","AABB",1500));
		bicicletas.add(new Bicicleta("BMX","ABB",1750));
		bicicletas.add(new Bicicleta("BMX","BB",1950));
		bicicletas.add(new Bicicleta("BMX","B",3200));
		bicicletas.add(new Bicicleta("BMX","BBCC",3000));
		bicicletas.add(new BicicletaElectrica("BMX","QQEE",3000,50));
		bicicletas.add(new BicicletaElectrica("BMX","IIOO",3000,150));
		bicicletas.add(new BicicletaElectrica("BMX","PPDD",3000,250));
		bicicletas.add(new BicicletaElectrica("BMX","WWQQ",3000,350));
		bicicletas.add(new BicicletaElectrica("BMX","PPOO",3000,1250));
		
		//Se muestra la cantidad y la lista de bicicletas con posibilidad de repararlas
		System.out.println(taller.cantServiciosPosibles(bicicletas)); 
		
		
	}

}
