package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoCancion {

	public int escribirArchivo(String pTexto, String pDireccion) {
		File f = new File(pDireccion);

		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);

			pw.println(pTexto);
			fw.close();

		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo(String pDireccion) {
		String linea = "";
		String cadena = "";

		File file = new File(pDireccion);

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			linea = br.readLine();
			while (linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
	
	
}
