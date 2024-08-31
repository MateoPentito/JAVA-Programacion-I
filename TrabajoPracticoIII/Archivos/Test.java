package Archivos;

public class Test {

	public static void main(String[] args) {

		Computadora pc = new Computadora();

		Archivo archivoDeAudio = new ArchivoDeAudio(95, true, FormatoAudio.MP3, "GNR", "LIES");
		Archivo archivoDeVideo = new ArchivoDeVideo(30, true, FormatoVideo.MP4, 420, 840);
		Archivo archivoDeVideo1 = new ArchivoDeVideo(520, true, FormatoVideo.MP4, 1920, 1080);
		Archivo archivoDeVideo2 = new ArchivoDeVideo(330, true, FormatoVideo.MP4, 1920, 1080);
		Archivo archivoDeVideo3 = new ArchivoDeVideo(330, true, FormatoVideo.MP4, 1920, 1080);
		Archivo archivoDeVideo4 = new ArchivoDeVideo(330, true, FormatoVideo.MP4, 1920, 1080);

		Archivo archivoDeTexto = new ArchivoDeTexto(120, true, "UTF-8", true);
		Archivo archivoDeTexto1 = new ArchivoDeTexto(120, false, "UTF-8", true);
		Archivo archivoDeTexto2 = new ArchivoDeTexto(40, false, "UTF-8", true);
		Archivo archivoDeTexto3 = new ArchivoDeTexto(240, true, "UTF-8", true);

		pc.agregarArchivo(archivoDeAudio);
		pc.agregarArchivo(archivoDeVideo);
		pc.agregarArchivo(archivoDeVideo1);
		pc.agregarArchivo(archivoDeVideo2);
		pc.agregarArchivo(archivoDeVideo3);
		pc.agregarArchivo(archivoDeVideo4);
		pc.agregarArchivo(archivoDeTexto);
		pc.agregarArchivo(archivoDeTexto1);
		pc.agregarArchivo(archivoDeTexto2);
		pc.agregarArchivo(archivoDeTexto3);
		// Cantidad de archivos abiertos
		System.out.println("***********Cantidad de archivos abiertos***********");
		pc.cantArchivosAbiertos();
		System.out.println("");
		System.out.println("***********Se cierran los archivos abiertos***********");
		// Se cierran todos los archivos abiertos
		pc.cerrarTodos();
		System.out.println("");
		// Se confirma que se hayan cerrado los archivos
		System.out.println("***********Se confirma que se hayan cerrado los archivos***********");
		pc.cantArchivosAbiertos();
		System.out.println("");
		System.out.println("***********Archivos de texto***********");
		System.out.println("Cantidad de archivos de texto: " + pc.cantArchivosDeTexo());
		System.out.println("");
		pc.cifrarArchivos();
		System.out.println("***********Duracion promedio de archivos de audio y video***********");
		System.out.println(pc.duracionPromedio()); 
		System.out.println("***********Lista de archivos de video HD***********");
		System.out.println(pc.videosFullHD()); 
	}

}
