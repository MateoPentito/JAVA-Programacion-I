package Archivos;

import java.util.ArrayList;

public class Computadora {

	private ArrayList<Archivo> archivos;

	public Computadora() {
		this.archivos = new ArrayList<>();
	}

	public void agregarArchivo(Archivo archivo) {
		this.archivos.add(archivo);
	}

	public void cerrarTodos() {
		for (int i = 0; i < this.archivos.size(); i++) {
			if (this.archivos.get(i).isEnReproduccion()) {
				this.archivos.get(i).pararse();
			}
		}

	}

	public int cantArchivosDeTexo() {
		int cant = 0;
		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoDeTexto) {
				cant++;
			}
		}
		return cant;
	}

	public void cifrarArchivos() {
		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoDeTexto) {
				if (((ArchivoDeTexto) archivo).getCodificacion().equals("UTF-8")) {
					((ArchivoDeTexto) archivo).cifrar();
					System.out.println("Se cifro el archivo: " + archivo.toString());
				}
			}
		}
	}

	public double duracionPromedio() {
		int cant = 0;
		int cantSegundos = 0;
		double promedio = 0;
		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoMultimedia) {
				cant++;
				cantSegundos += ((ArchivoMultimedia) archivo).duracionPromedio();
			}
		}
		promedio = cantSegundos / cant;
		return promedio;
	}

	public ArrayList<Archivo> videosFullHD() {
		ArrayList<Archivo> archivosDeVideoHD = new ArrayList<>();
		for (Archivo archivo : this.archivos) {
			if (archivo instanceof ArchivoDeVideo) {
				if (((ArchivoDeVideo) archivo).esHd()) {
					archivosDeVideoHD.add(archivo);
				}
			}
		}
		return archivosDeVideoHD;
	}

	public void cantArchivosAbiertos() {
		int cant = 0;
		for (Archivo archivo : this.archivos) {
			if (archivo.isEnReproduccion()) {
				cant++;
				System.out.println(archivo.toString());
			}
		}
		System.out.println("Cantidad total de archivos en reproduccion: " + cant);
	}
}
