 	package co.edu.unbosque.model.persistence;

import java.io.*;

public class ArchivoCancion {
	
	
	public int escribirArchivo(String dato, File archivo) {
		try {
			FileWriter fw = new FileWriter(archivo);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo(File archivo) {
		
		String linea = "";
		String cadena = "";
		
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(cadena!=null) {
				cadena += linea;
				linea = br.readLine();
			}
			fr.close();
		}
		catch (IOException e) {
			return null;
		}
		return cadena;
	}
}
