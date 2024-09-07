package LicenciasDeConducir;

public class SedeLicencia {

	
	private Informe informe;
	
	public SedeLicencia(Informe informe) {
		this.informe = informe;
	}
	

	
//	B) El metodo obtenerInforme() que debe devolver (no mostrar por consola) los siguientes datos:
//		- Porcentaje de examenes reprobados.
//		- Promedio de tiempo de los examenes de auto aprobados.

		public void obtenerInforme() {
		System.out.println("Porcentaje de examenes reprobados: %"+this.informe.porcExamenesReprobados());
		System.out.println("Promedio de tiempo de examenes aprobados de autos: %"+this.informe.promedioTiempoExamenesAutosAprobados());
		}

		
}
