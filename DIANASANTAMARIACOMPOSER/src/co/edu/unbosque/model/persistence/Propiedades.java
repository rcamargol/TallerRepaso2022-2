package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties propiedad = new Properties();
	private String archivoPropiedades = "C:\\data\\archivo.properties";

	public int asignarPropiedades() {
		try {
			propiedad.setProperty("nombreProyecto", "DIANASANTAMARIACOMPOSER");
			propiedad.setProperty("nombreArchivo", "archivo.properties");
			propiedad.setProperty("nombreCodigoFuente", "Propiedades.java");
			propiedad.setProperty("estrofasPorCancion", "3");
			propiedad.setProperty("versosPorEstrofa", "4");
			propiedad.store(new FileOutputStream(archivoPropiedades), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
}
