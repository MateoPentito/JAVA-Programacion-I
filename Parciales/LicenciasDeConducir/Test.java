package LicenciasDeConducir;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se crea un Informe
		Informe informe = new Informe();
		//Se crea una Sede de licencias
		SedeLicencia sede = new SedeLicencia(informe);
		//Se realizan los examenes
		//AUTOS
		ExamenAuto examen1 = new ExamenAuto("06/09/2024",new Persona("42569875","Mateo","Pentito"),new Circuito(100,1),new Auto("CBA9874","Nissan",120,5));
		ExamenAuto examen2 = new ExamenAuto("09/09/2024",new Persona("38789456","Martina","Pentito"),new Circuito(200,2),new Auto("PER1234","Toyota",240,2));
		ExamenAuto examen5 = new ExamenAuto("09/09/2024",new Persona("44782456","Benjamin","Pentito"),new Circuito(80,2),new Auto("POI123","Toyota",240,2));
		ExamenAuto examen6 = new ExamenAuto("09/09/2024",new Persona("36789123","Claudia","Pentito"),new Circuito(200,2),new Auto("WNH789","Toyota",240,2));
		ExamenAuto examen7 = new ExamenAuto("09/09/2024",new Persona("34798756","Alejandra","Pentito"),new Circuito(200,2),new Auto("PPO987","Toyota",240,2));


		//MOTOS
		ExamenMoto examen3 = new ExamenMoto("07/09/2024",new Persona("40874654","Morena","Pentito"),new Moto("ABC","Honda",125,true));
		examen3.agregarCircuitos(new Circuito(10,1));
		examen3.agregarCircuitos(new Circuito(10,1));
		examen3.agregarCircuitos(new Circuito(10,2));
		ExamenMoto examen4 = new ExamenMoto("10/09/2024",new Persona("42587456","Santino","Pentito"),new Moto("LIU","Yamaha",125,true));
		examen4.agregarCircuitos(new Circuito(10,1));
		examen4.agregarCircuitos(new Circuito(10,1));
		examen4.agregarCircuitos(new Circuito(10,2));
		//Se agregan los examenes al informe		
		informe.agregarExamenes(examen1);
		informe.agregarExamenes(examen2);		
		informe.agregarExamenes(examen3);	
		informe.agregarExamenes(examen4);	
		informe.agregarExamenes(examen5);	
		informe.agregarExamenes(examen6);	
		informe.agregarExamenes(examen7);	


		System.out.println("\n*************EXAMENES TOMADOS*************");
		informe.mostrarExamenesRealizados();
		System.out.println("\n*************Cantidad de examenes REPROBADOS*************");
		System.out.println( informe.cantExamenesReprobados());
		System.out.println("\n*************Cantidad de examenes APROBADOS*************");
		System.out.println( informe.cantExamenesAprobados());		
		System.out.println("\n*************Examenes  APROBADOS*************");
		informe.mostrarExamenesAprobados();
		System.out.println("\n*************Examenes REPROBADOS*************");
		informe.mostrarExamenesReprobados();		
		System.out.println("\n*************SEDE*************");
		sede.obtenerInforme();
		
		
	}

}
