package Teatro;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		//Se crea el teatro
		Teatro teatro = new Teatro("Colon","CABA");
		//Se crean obras
		Obra obra1 = new ObraMusicalInfantil("Opera",100,4,true,10);
		Obra obra2 = new ObraDramatica("Dramatica",120,10,true);
		Obra obra3 = new ObraMusicalPelicula("MusicalPelicula",120,10, true,"Mateo");
		//Se agregan la obras al teatro
		teatro.agregarObras(obra1);
		teatro.agregarObras(obra2);
		teatro.agregarObras(obra3);
		//Se crea un arraylist espectadores
		ArrayList<Espectador>espectadores = new ArrayList<>();
		espectadores.add(new Espectador("42576340","Opera",true));
		espectadores.add(new Espectador("36789456","Opera",true));
		espectadores.add(new CriticoTeatro("40568456","Opera",true,10));
		espectadores.add(new CriticoTeatro("38456789","Opera",true,15));
		//Se intenta agregar espectadores al teatro
		teatro.ingreso(espectadores);
	
		teatro.otorgarPremio(3);
	
	}

}
