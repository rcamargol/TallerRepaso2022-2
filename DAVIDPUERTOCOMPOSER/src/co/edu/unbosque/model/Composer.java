package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoCancion;
import co.edu.unbosque.model.persistence.Propiedades;

public class Composer {
	private Cancion c;

	public Composer() {
		this.c = new Cancion();
	}

	public String gestionarArchivoCancion(String pDireccion) {
		ArchivoCancion ac = new ArchivoCancion();
		ac.escribirArchivo(escribirCancion(), pDireccion);
		return "Lei este archivo: " + "\n" + ac.leerArchivo(pDireccion);
	}
	
	public String gestionarPropiedades() {
		Propiedades propiedades = new Propiedades();
		propiedades.crearPropiedades();
		if (propiedades.crearPropiedades() == -1) {
			return "No se encontraron propiedades";
		}
		return "Se leyeron las siguientes propiedades: " + "\n" + propiedades.leerPropiedades();
	}

	public String escribirCancion() {
		String estrofa1 = c.crearEstrofa();
		String estrofa2 = c.crearEstrofa();
		String estrofa3 = c.crearEstrofa();
		String estrofa4 = c.crearEstrofa();

		String cancion = estrofa1 + "\n" + "\n" + estrofa2 + "\n" + "\n" + estrofa3 + "\n" + "\n" + estrofa4;
		return cancion;
	}

	public Cancion getC() {
		return c;
	}

	public void setC(Cancion c) {
		this.c = c;
	}
}
