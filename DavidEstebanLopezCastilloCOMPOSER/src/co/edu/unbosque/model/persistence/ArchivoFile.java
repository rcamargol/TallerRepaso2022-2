package co.edu.unbosque.model.persistence;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ArchivoFile {
	
	
	public int escribirArchivo(String direccion, String texto) {
		File f = new File(direccion);
		try {
			FileWriter fw = new FileWriter(f); 
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(texto);
			
			fw.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
}
