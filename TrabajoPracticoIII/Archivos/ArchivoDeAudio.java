package Archivos;

public class ArchivoDeAudio extends ArchivoMultimedia{

	private FormatoAudio formato;
	private String artista;
	private String album;

	public ArchivoDeAudio(int duracion, boolean enReproduccion, FormatoAudio formato, String artista, String album) {
		super(duracion, enReproduccion);
		this.formato = formato;
		this.artista = artista;
		this.album = album;
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
		return this.getClass().getSimpleName()+" "+super.toString()+" [formato=" + formato + ", artista=" + artista + ", album=" + album + "]\n";
	}

	
}
