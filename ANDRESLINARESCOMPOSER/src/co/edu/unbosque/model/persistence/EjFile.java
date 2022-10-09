package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class EjFile {

	private String nombrearchivo;
	
	public int escribirArchivo(String dato) {
		File ruta = new File("c://Data");
		try {
			JFileChooser j = new JFileChooser(ruta);
			j.showSaveDialog(j);
			File f = j.getSelectedFile();
			
			FileWriter fw = new FileWriter(f+".txt");
			PrintWriter pw = new PrintWriter(fw);
			
			nombrearchivo = (f+".txt");
			
			pw.println(dato);

			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerArchivo() {
		String linea = "";
		String cadena = "";

		File f = new File(nombrearchivo);

		try {
			FileReader fr = new FileReader(f); 
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine(); 
			while (linea != null) { 
				cadena +=linea+"\n"; 
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}

	
}
