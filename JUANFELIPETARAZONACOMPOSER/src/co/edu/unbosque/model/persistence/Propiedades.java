package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "/data/archivo.properties";
	
	public int escribirPropiedades(){
		try {
			prop.setProperty("NombreProyecto: ", " JUANFELIPETARAZONACOMPOSER");
			prop.setProperty("NombreArchivo: ", " archivo.properties");
			prop.setProperty("NombreCodigoFuente: ", " Propiedades.Java");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades(){
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			linea += "Nombre del Proyecto: "+prop.getProperty("NombreProyecto: ")+"\n";
			linea += "Nombre del Archivo: "+prop.getProperty("NombreArchivo: ")+"\n";
			linea += "Nombre de la Clase Java: "+prop.getProperty("NombreCodigoFuente: ")+"\n";
			
		} catch (IOException e) {
			return null;
		}
		return linea;
	}
}
