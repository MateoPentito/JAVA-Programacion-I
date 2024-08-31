package Archivos;

public class ArchivoDeVideo extends ArchivoMultimedia{

	private final int ALTO_FULL_HD = 1920;
	private final int ANCHO_FULL_HD = 1080;
	private FormatoVideo formato;
	private int alto;
	private int ancho;

	public ArchivoDeVideo(int duracion, boolean enReproduccion, FormatoVideo formato, int alto, int ancho) {
		super(duracion, enReproduccion);
		this.formato = formato;
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public boolean esHd() {
		return this.alto == ALTO_FULL_HD && this.ancho == ANCHO_FULL_HD;
	}

	@Override
	public boolean isEnReproduccion() {
		// TODO Auto-generated method stub
		return super.isEnReproduccion();
	}
	
	@Override
	public void pararse() {
		// TODO Auto-generated method stub
		super.pararse();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "+super.toString()+"formato=" + formato + ", alto=" + alto + ", ancho=" + ancho + "]\n";
	}


}
