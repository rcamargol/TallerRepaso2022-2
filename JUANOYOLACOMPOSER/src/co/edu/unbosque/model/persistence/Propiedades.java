package co.edu.unbosque.model.persistence;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Propiedades {
				
		private Properties prop = new Properties();
		private String rutaprop = "C:\\data\\archivo.properties";
		
		public int escribirPropiedades() {
			try {
				prop.setProperty("nestrofas", "3");
				prop.setProperty("nfrases","4");
				prop.store(new FileOutputStream(rutaprop),null);
			}catch(IOException e) {
				return -1;
			}
			return 0;		
		}	
		public String leerPropiedades() {
			String linea="";
			try {
				prop.load(new FileInputStream(rutaprop));
				
				prop.list(System.out);
				linea += "Número de estrofas por canción: " + prop.getProperty("nestrofas")+"\n";
				linea += "Número de frases por estrofa: " + prop.getProperty("nfrases")+"\n";
			}catch(IOException e) {
				return null;
			}
			return linea;
		}
}
