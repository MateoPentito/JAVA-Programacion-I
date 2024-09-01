package AutopistaPanamericana;

public class MedioDePago {
	private final int DEMORA_MENOR_5DIAS = 12;
	private final int DIAS_DEMORA = 5;
	private TipoDePago tipoDePago;
	private String descripcion;
	private int diasDemora;
	
	public MedioDePago(TipoDePago tipoDePago, String descripcion) {
		this.tipoDePago = tipoDePago;
		this.descripcion = descripcion;
	}
	
	public MedioDePago(TipoDePago tipoDePago, String descripcion, int diasDemora) {
		this.tipoDePago = tipoDePago;
		this.descripcion = descripcion;
		this.diasDemora = diasDemora;
	}
	
	public double aplicarDescuento() {
		double descuento=0;
		if(this.tipoDePago.equals(TipoDePago.SUBE)) {
			descuento = TipoDePago.SUBE.getDescuento();
		}else if(this.tipoDePago.equals(TipoDePago.PASE)) {
			descuento = TipoDePago.PASE.getDescuento();
			if(this.diasDemora < DIAS_DEMORA) {
				descuento = DEMORA_MENOR_5DIAS;
			}
		}else if(this.tipoDePago.equals(TipoDePago.EFECTIVO)) {
			descuento = TipoDePago.EFECTIVO.getDescuento();
		}
		return descuento / 100;
	}

	public TipoDePago getTipoDePago() {
		return tipoDePago;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+", tipoDePago=" + tipoDePago + ", descripcion=" + descripcion + ", diasDemora=" + diasDemora;
	}





	
	
	
	
	
	
	
	
	
}
