package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private String archivoprop = "c:\\data\\archivo.properties";
	private Properties prop = new Properties();
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("estrofa", "3");
			prop.setProperty("frase", "4");
			prop.store(new FileOutputStream(archivoprop),null);
			} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	public int[] leerPropiedades() {
		int frase = 0;
		int estrofa = 0;
		try {
			prop.load(new FileInputStream(archivoprop));
			frase = Integer.parseInt(prop.getProperty("frase"));
			estrofa = Integer.parseInt(prop.getProperty("estrofa"));
		} catch (IOException e) {
			return null;
		}
		int[] cancion = {frase,estrofa};
		return cancion;
	}
}
