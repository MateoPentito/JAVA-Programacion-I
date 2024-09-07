package LicenciasDeConducir;

public class Circuito implements Evaluable{
	private final int MAX_FALTAS = 2;
	
	private int tiempo;
	private int numFaltas;
	
	public Circuito(int tiempo, int numFaltas) {
		super();
		this.tiempo = tiempo;
		this.numFaltas = numFaltas;
	}

	@Override
	public boolean aprobo() {
		return this.numFaltas <= MAX_FALTAS;
	}

	public int getTiempo() {
		return tiempo;
	}

	public int getNumFaltas() {
		return numFaltas;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" - tiempo=" + tiempo + " - numero de faltas=" + numFaltas;
	}
	
	
}
