package AutopistaPanamericana;
import java.util.ArrayList;
import java.util.Calendar;

public class Estacion {

	private ArrayList<Cabina> cabinas;
	private String id;
	private String descripcion;

	public Estacion(String id, String descripcion) {
		this.cabinas = new ArrayList<>();
		this.id = id;
		this.descripcion = descripcion;
	}	

	public void agregarCabinas(Cabina cabinas) {
		this.cabinas.add(cabinas);
	}

	@Override
	public String toString() {
		return "Estacion [cabinas=" + cabinas + ", id=" + id + ", descripcion=" + descripcion + "]";
	}

	
	public ArrayList<Cabina>cabinasConEfectivo(){
		ArrayList<Cabina>cabinasEfectivo = new ArrayList<>();
		for(Cabina cabina : this.cabinas) {
			if(cabina.cabinaEfectivo()) {
				cabinasEfectivo.add(cabina);
			}
		}
		return cabinasEfectivo;
	}
	
}
