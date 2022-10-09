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
			prop.setProperty("nombreProyecto", "ArchivosTexto");
			prop.setProperty("nombreArchivo", "Archivos,properties");
			prop.setProperty("nombreCodigoFuente", "PRopiedades.Java");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	public String leerPropiedades() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			linea += "nombre del Proyecto :"+ prop.getProperty("nombreProyecto")+"\n";
			linea += "nombre del Archivo :"+ prop.getProperty("nombreArchivo")+"\n";
			linea += "nombre de la clase java :"+ prop.getProperty("nombreCodigoFuente")+"\n";
		}
		catch(IOException ex) {
			return null;
		}
		return linea;
	}
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}


}
