package Nomina;

public class Test {

	public static void main(String[] args) {


		//Se crea una nomina 
		Nomina nomina = new Nomina();
		
		//Se crean empleados
		Empleado empleado1 = new Empleado("42576340","Pentito",500);
		Empleado empleado2 = new Empleado("40576340","De parasis",1500);
		Empleado empleado3 = new Empleado("38576340","Isopi",2500);
		Empleado empleado4 = new Empleado("78945612","Di lello",500);
		Empleado empleado5 = new Empleado("98765421","Saini",1500);
		Empleado empleado6 = new Empleado("12345678","schenzle",2500);
		
		//Se crea la pyme
		Pyme pyme = new Pyme(nomina);

		//Se agregan empleados a la nomina
		System.out.println("Se agregan empleados:");
		nomina.altaEmpleado(empleado1);
		nomina.altaEmpleado(empleado2);
		nomina.altaEmpleado(empleado3);
		nomina.altaEmpleado(empleado4);
		nomina.altaEmpleado(empleado5);
		nomina.altaEmpleado(empleado6);

		//Se busca un empleado y se devuelve
		System.out.println("\nSe busco el empleado:");
		System.out.println(nomina.buscarEmpleado("38576340").toString()); 
		
		//Se da de baja un empleado
		System.out.println("\nSe dan de baja los empleados:");
		nomina.bajaDeEmpleado("40576340");
		nomina.bajaDeEmpleado("42576340");
		nomina.bajaDeEmpleado("38576340");

		//Devuelve la cantidad de vacantes libres en la nomina
		System.out.println("\nCantidad de vacantes disponibles:");
		System.out.println(nomina.cantVacantes()); 
		
		//Devuelve el sueldo total de los empleados
		System.out.println("\nSueldo total de los empleados:");
		System.out.println(nomina.sueldoTotal()); 
		
		
		
		
		
		
		
	}

}
