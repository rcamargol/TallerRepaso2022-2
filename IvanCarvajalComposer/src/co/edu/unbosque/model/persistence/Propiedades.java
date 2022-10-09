package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivoprop = "c:\\Data\\Archioprop.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "IvanCarvajalComposer");
			prop.setProperty("nombreArchivo", "Archivoprop.properties");
			prop.setProperty("nombreCodigoFuente", "Properties.java");
			prop.setProperty("Cantidad de estrofas por cancion", "3");
			prop.setProperty("Cantidad de frases por estrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}
}
