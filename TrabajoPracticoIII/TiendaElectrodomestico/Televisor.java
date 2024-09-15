package TiendaElectrodomestico;

public class Televisor extends Electrodomestico{

	private int dimension;
	private boolean esSmart;

	public Televisor(String marca, String modelo, String numSerie, int voltaje, boolean estado,double precio, int dimension,
			boolean esSmart) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.dimension = dimension;
		this.esSmart = esSmart;
	}
	
	@Override
	public String datosProductos() {
		return televisorSmart()+"||| pulgadas: "+this.dimension;
	}
	
	
	
	
	
	private String televisorSmart() {
		String msg="";
		if(esSmart){
			msg = "es smart";
		}else {
			msg = "no es smart";
		}
		return msg;
	}
	
	
	
	
	
}
