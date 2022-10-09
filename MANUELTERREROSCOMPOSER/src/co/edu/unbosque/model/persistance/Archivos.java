package co.edu.unbosque.model.persistance;

import java.io.*;
public class Archivos {
	
		public int escribirArchivo(File file, String letra) {

			if (file != null) {
				try {
					File f = (file);
					FileWriter fw = new FileWriter(f);
					PrintWriter pw = new PrintWriter(fw);
					pw.println(letra);
					fw.close();
				
				} catch(IOException | NullPointerException e) {
					return Integer.parseInt("") ;
				}

			
		   }
			return 0;
		}
				
}
				

	


