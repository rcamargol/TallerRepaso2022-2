package co.edu.unbosque.model.persistence;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("Nestrofas", "3");
			prop.setProperty("Nfrases", "12");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {

			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			linea += "Numero de estrofas: " + prop.getProperty("Nestrofas") + "\n";
			linea += "Numero de frases : " + prop.getProperty("Nfrases") + "\n";

		} catch (IOException ex) {
			return null;
		}
		return linea;
	}

}
