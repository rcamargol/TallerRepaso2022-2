package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties p = new Properties();
	private String urlProperties = "C:\\data\\propiedades.properties";

	public int crearPropiedades() {
		try {
			p.setProperty("nombreProyecto", "DAVIDPUERTOCOMPOSER");
			p.setProperty("nombreArchivo", "propiedades.properties");
			p.setProperty("nombreCodigoFuente", "Propiedades.java");
			p.setProperty("numeroEstrofas", "3");
			p.setProperty("versosPorEstrofa", "4");
			p.store(new FileOutputStream(urlProperties), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			p.load(new FileInputStream(urlProperties));

			p.list(System.out);

			linea += "Nombre del proyecto: " + p.getProperty("nombreProyecto") + "\n";
			linea += "Nombre del archivo: " + p.getProperty("nombreArchivo") + "\n";
			linea += "Nombre del clase java: " + p.getProperty("nombreCodigoFuente") + "\n";
		} catch (IOException ex) {
			return null;
		}
		return linea;
	}
}
