package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties pro = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			pro.setProperty("NumeroEstrofasCancion", "3");
			pro.setProperty("NumeroFrasesEstrofa", "4");
			pro.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			pro.load(new FileInputStream(archivoprop));
			
			linea += "Numero de Estrofas por Cancion: " + pro.getProperty("NumeroEstrofasCancion") + "\n";
			linea += "Numero de Frases por Estrofa: " + pro.getProperty("NumeroFrasesEstrofa") + "\n";
		}
		catch (IOException ex) {
			return null;
		}
		return linea;
	}

}

