package co.edu.unbosque.Model.Persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";
	

	public int escribirPropiedades() {
		try {
			prop.setProperty("Cantidadestrofacancion", "3");
			prop.setProperty("Cantidadfrasesestrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
}
	
	public String leerprop() {
		String linea = "";
		try {
		prop.load(new FileInputStream(archivoprop));
		
		linea += "Cantidad de estrofas por cada cancion"+ prop.getProperty("Cantidadestrofacancion")+"\n";
		linea += "Cantidad de frases por estrofa" + prop.getProperty("Cantidadfrasesestrofa")+"\n";
		} catch (IOException e) {
			return null;
		}
		return linea;
	}
}
