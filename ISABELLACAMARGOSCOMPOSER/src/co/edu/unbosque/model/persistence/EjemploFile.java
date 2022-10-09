package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class EjemploFile {
	
	public int escribirArchivo(String dato) {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
			
		} catch (IOException e) {
			return -1;
		}
		return 0;
		
	}

}
