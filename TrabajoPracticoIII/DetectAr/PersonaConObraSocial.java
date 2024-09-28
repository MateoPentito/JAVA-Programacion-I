package DetectAr;

public class PersonaConObraSocial extends Persona{
	
	private String nombreObraSocial;
	private int numAfiliado;
	
	public PersonaConObraSocial(String dni, String nombre, String apellido, int edad, TipoMotivoTest motivo,
			String nombreObraSocial, int numAfiliado) {
		super(dni, nombre, apellido, edad, motivo);
		this.nombreObraSocial = nombreObraSocial;
		this.numAfiliado = numAfiliado;
	}
	
	

}
