package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {
	
	private Propiedades prop;
	private Archivo archivo;
	private Palabras palabra;
	
	public Cancion() {
		
		prop = new Propiedades();
		archivo = new Archivo();
		palabra = new Palabras();
		
	}
	public void letra(String a, File archivoCancion) {
		archivo = new Archivo();
		archivo.escribirArchivo(a, archivoCancion);
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public Palabras getPalabra() {
		return palabra;
	}

	public void setPalabra(Palabras palabra) {
		this.palabra = palabra;
	}
	
	
	
}
