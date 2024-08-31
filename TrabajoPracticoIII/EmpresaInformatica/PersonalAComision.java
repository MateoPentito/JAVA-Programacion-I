package EmpresaInformatica;

public class PersonalAComision extends Personal{
	
	public final int SALARIO_MINIMO = 20000;
	private int numClientesCaptados;
	private double montoACobrar;
	
	public PersonalAComision(int dni, String nombre, String apellido, int anioIngreso, int numClientesCaptados,
			double montoACobrar) {
		super(dni, nombre, apellido, anioIngreso);
		this.numClientesCaptados = numClientesCaptados;
		this.montoACobrar = montoACobrar;
	}
	
	
	@Override
	public double calcularSalario() {
		double salario = this.numClientesCaptados * this.montoACobrar;
		if(salario < SALARIO_MINIMO) {
			salario = SALARIO_MINIMO;
		}
		return salario;
	}


	public int getNumClientesCaptados() {
		return numClientesCaptados;
	}


	public void setNumClientesCaptados(int numClientesCaptados) {
		this.numClientesCaptados = numClientesCaptados;
	}
	
	
	
	
	
}
