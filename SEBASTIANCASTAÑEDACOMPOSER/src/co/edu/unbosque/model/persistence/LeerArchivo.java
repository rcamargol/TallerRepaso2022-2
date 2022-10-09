package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class LeerArchivo {
	private String archivodata = "./Data/datacancion.txt";
	
	public String leerArchivo(String file) {
		String linea = "";
		String cadena = "";
		File f = new File(file);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return "no está leyendolo";
		}
		return cadena;
	}
}
