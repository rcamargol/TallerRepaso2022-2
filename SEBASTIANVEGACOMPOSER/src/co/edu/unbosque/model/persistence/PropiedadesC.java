package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class PropiedadesC {
	
	private Properties prop = new Properties();
	private String ArchPro = "Pro.properties";
	
	public int escribirPropiedades(){
		
		try {
			
			prop.setProperty("estrofas", "3");
			prop.setProperty("frases", "4");
			prop.store(new FileOutputStream(ArchPro), null);
			
		}catch (IOException e) {return -1;}
		
		return 0;
		
	}
	
	public String leerPropiedades(String nombre) {
		
		String linea = "";
		
		try {
			
			prop.load(new FileInputStream(ArchPro));
			
			linea = prop.getProperty(nombre);
			
		}catch(IOException e) {return null;}
		
		return linea;
		
	}

}
