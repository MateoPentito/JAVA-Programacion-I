package EmpresaCamiones;

public class Camion {
	
	private int id;
	private double costoKm;
	
	public Camion(int id, double costoKm)throws Exception {
		setId(id);
		this.costoKm = costoKm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws Exception{
		if(this.id >= 0 && this.id <= 9) {
			this.id = id;			
		}else {
			throw new Exception("Error, el id debe ser mayor o igual a 0 y menor que 10");
		}
	}

	public double getCostoKm() {
		return costoKm;
	}
	
	
	
	

}
