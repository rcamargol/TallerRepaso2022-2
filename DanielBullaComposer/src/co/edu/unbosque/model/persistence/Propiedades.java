package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("NumeroEstrofasCancion", "3");
			prop.setProperty("NumeroFrasesEstrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			linea += "El numero de estrofas por cancion son: " + prop.getProperty("NumeroEstrofasCancion") + "\n";
			linea += "El numero de frases por estrofa son: " + prop.getProperty("NumeroFrasesEstrofa") + "\n";
		}
		catch (IOException ex) {
			return null;
		}
		return linea;
	}
}
