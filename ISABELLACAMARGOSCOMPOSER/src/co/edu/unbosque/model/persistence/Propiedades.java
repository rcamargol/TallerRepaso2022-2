package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties ();
	private String archivoprop = "C:\\Data\\Soy la composer";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "ISABELLACAMARGOSCOMPOSER");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.java");
			prop.setProperty("estrofasPorCancion", "3");
			prop.setProperty("numeroDeFrasesPorEstrofa", "4");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	}

