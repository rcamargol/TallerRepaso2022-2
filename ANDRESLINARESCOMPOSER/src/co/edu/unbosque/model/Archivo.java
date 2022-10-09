package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EjFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Archivo {
	
	private String j;
	
	public String gestionarArchivo() {
		EjFile archivo = new EjFile();
		archivo.escribirArchivo(j);
		return "Esta es la cancion: "+"\n"+archivo.leerArchivo();
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		
		prop.escribirPropiedades();
		return"Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades(); 
	}
	
	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}
	
}
