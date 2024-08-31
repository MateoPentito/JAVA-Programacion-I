package EmpresaInformatica;

public class Test {

	public static void main(String[] args) {
		
		//Se crea la empresa
		Empresa empresa = new Empresa("ORT");
		//Se agrega personl
		empresa.agregarPersonal(new PersonalSalarioFijo(42548784,"Mateo","Pentito",2017,15000));
		empresa.agregarPersonal(new PersonalSalarioFijo(40987654,"Morena","Pentito",2016,25000));
		empresa.agregarPersonal(new PersonalSalarioFijo(38456789,"Martina","Pentito",2014,35000));
		empresa.agregarPersonal(new PersonalAComision(42159357,"Santino","Pentito",2018,10,22500.00));
		empresa.agregarPersonal(new PersonalAComision(44741258,"Bautista","Pentito",2020,15,21500.00));
		empresa.agregarPersonal(new PersonalAComision(46987875,"Benjamin","Pentito",2022,21,500.00));
		
		//Se muestran los salarios calculados
		System.out.println("*******Salarios calculados*******");
		empresa.mostrarSalarios();
		System.out.println("");
		System.out.println("*******Personal con mayor cantidad de clientes captados*******");
		System.out.println(empresa.empleadoConMasClientes()); 

	}

}
