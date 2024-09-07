package PuertoParana;

public class Test {

	public static void main(String[] args) {

		//Se crea el puerto
		Puerto puerto = new Puerto();
		//Se crean amarras
		Amarra amarra1 = new Amarra(1,"BSAS - TRP",true);
		Amarra amarra2 = new Amarra(1,"BSAS - TP",true);
		//Se crean barcos
		Barco barco1 = new Velero("ABC",2,2020,"Mateo",2);
		Barco barco2 = new Yate("QWE",2,2020,"Morena",3);
		Barco barco3 = new Deportivo("POI",2,2018,"Martina",250,5);
		Barco barco4 = new DeportivoLujo("JKL",2,2024,"Santino",310,10);
		//Se agregan amarras
		puerto.agregarAmarras(amarra1);
		puerto.agregarAmarras(amarra2);

		//Se agregan barcos
		puerto.agregarBarcos(barco1);
		puerto.agregarBarcos(barco2);
		puerto.agregarBarcos(barco3);
		puerto.agregarBarcos(barco4);
	
	
		//Se alquila una amarra
		puerto.alquilarAmarra(250,10,barco1);
	
	
	
	
	
	
	
	}

}
