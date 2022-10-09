package co.edu.unbosque.model.persistance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivopro = "C:\\data\\archivito.properties";
	
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreDelProyecto", "ManuelTerrerosComposer");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.Java");
			prop.setProperty("frasesPorEstrofa", "4");
			prop.setProperty("esrofasPorCancion", "3");
			prop.store(new FileOutputStream(archivopro), null);

		}
		catch(IOException IO){
			return -1;
		}
		
		return 0;
		
	}

}
 
