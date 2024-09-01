package AutopistaPanamericana;

import java.util.ArrayList;
import java.util.Calendar;

public class Cabina {
	private final double HORA_PICO = 1.8;
	private String id;
	private MedioDePago medioDePago;
	private ArrayList<Vehiculo> vehiculos;

	public Cabina(String id, MedioDePago medioDePago) {
		this.id = id;
		this.medioDePago = medioDePago;
		this.vehiculos = new ArrayList<>();
	}

	// La explotación del método cobrar que reciba como parámetro un vehículo y
	// devuelva el importe final a cobrarle.
	public double cobrar(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
		double valorFinal = 0;
		double tarifaBase = vehiculo.cobrar(vehiculo);
		double descuento = medioDePago.aplicarDescuento();
		double horaActual = dameHoraActual();
		valorFinal = tarifaBase - (tarifaBase * descuento); 
		if(horaActual >= 6 && horaActual <=10 || horaActual >= 17 && horaActual <= 20) {
			valorFinal = (tarifaBase - (tarifaBase * descuento)) * HORA_PICO; 
		}			
		return valorFinal;
	}


	//Devuelve la hora actual
	public double dameHoraActual() {
		Calendar calendar = Calendar.getInstance();
	    int horas = calendar.get(Calendar.HOUR_OF_DAY);
	    int minutos = calendar.get(Calendar.MINUTE);
	    double horasTotales = horas + minutos / 60.0;
	    return (Math.round(horasTotales * 100.0) / 100.0);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" - id=" + id + " - medioDePago=" + medioDePago.getTipoDePago() ;
	}
	

	
	public boolean cabinaEfectivo() {
		boolean cabinaEfectivo = false;
		if(this.medioDePago.getTipoDePago().equals(TipoDePago.EFECTIVO)) {
			cabinaEfectivo = true;
		}
		return cabinaEfectivo ;
	}
	
}
