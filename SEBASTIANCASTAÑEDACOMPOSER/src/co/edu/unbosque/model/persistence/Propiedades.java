package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private String archivoprop = "c:\\data\\archivo.properties";
	private Properties prop = new Properties();
	
	public int escribirPropiedades() {
		int estrofa = 0;
		int frase = 0;
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
		int fraseaux = 0;
		int estrofaaux = 0;
		try {
			prop.load(new FileInputStream(archivoprop));
			fraseaux = Integer.parseInt(prop.getProperty("frase"));
			estrofaaux = Integer.parseInt(prop.getProperty("estrofa"));
		} catch (Exception e) {
			return null;
		}
		int[] cancion = {fraseaux,estrofaaux};
		return cancion;
	}
}

