package EmpresaCamiones;

public class Viaje {

	private int idCamion;
	private String idChofer;
	private double kmViaje;

	public Viaje(int idCamion, String idChofer, double kmViaje) throws Exception {
		setIdCamion(idCamion);
		this.idChofer=idChofer;
		this.kmViaje = kmViaje;
	}




	// Si el id del camion no es correcto, se arroja una exception
	public void setIdCamion(int idCamion) throws Exception {
		if (idCamion >= 0 && idCamion <= 9) {
			this.idCamion = idCamion;
		} else {
			throw new Exception("Error, el id debe ser mayor o igual a 0 y menor que 10");
		}
	}


	@Override
	public String toString() {
		return "Viaje [idCamion=" + idCamion + ", idChofer=" + idChofer + ", kmViaje=" + kmViaje + "]";
	}


	public int getIdCamion() {
		return idCamion;
	}


	public String getIdChofer() {
		return idChofer;
	}


	public double getKmViaje() {
		return kmViaje;
	}

	
	
}
