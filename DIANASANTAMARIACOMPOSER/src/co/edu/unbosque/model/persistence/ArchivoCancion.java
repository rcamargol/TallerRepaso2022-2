package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoCancion {

	public int escribirArchivo(String direccionArchivo, String cancion) {
		File archivoCancion = new File(direccionArchivo);
		try {
			FileWriter fwriter = new FileWriter(archivoCancion);
			PrintWriter pwriter = new PrintWriter(fwriter);

			pwriter.println(cancion);
			fwriter.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
}
