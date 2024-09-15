package InsumosServiciosInformaticos;

import java.util.ArrayList;

public class Comercio {

	private String nombre;
	private ArrayList<Facturable> facturas;
	
	public Comercio(String nombre) {
		this.nombre = nombre;
		this.facturas = new ArrayList<>();
	}
	
	//Devuelve la cantidad de servicios simples(dificultad menor a 2)
	public int cantServiciosSimples() {
		int cantidad = 0;
		for(Facturable factura : this.facturas) {
			if(factura instanceof ServicioDeReparacion) {
				if(((ServicioDeReparacion) factura).dificultadMayorA2()) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}
	
	public double montoTotalFacturado() {
		double montoTotal = 0;
		for(Facturable facturar : this.facturas) {
			montoTotal += facturar.facturar();
		}
		return montoTotal;
	}
	
	public void facturarServicios(Servicio servicio) {
		this.facturas.add(servicio);
		System.out.println("Se facturo: "+servicio.getClass().getSimpleName().toUpperCase()+": 			$"+servicio.facturar());			
	}
	
	public void facturarInsumos(Insumo insumo) {
		this.facturas.add(insumo);
		System.out.println("Se facturo: "+insumo.getClass().getSimpleName().toUpperCase()+": "+insumo.getNombre()+" 		$"+insumo.facturar());			
	}
	
}
