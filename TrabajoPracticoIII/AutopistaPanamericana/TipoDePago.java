package AutopistaPanamericana;

public enum TipoDePago {
	
	SUBE(10),PASE(15),EFECTIVO(0);
	private int descuento;

	TipoDePago(int descuento) {
		this.descuento=descuento;
	}

	public int getDescuento() {
		return descuento;
	}
	
}

