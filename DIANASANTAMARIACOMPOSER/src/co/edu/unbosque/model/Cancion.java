package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoCancion;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {

	private Estrofa e;

	public Cancion() {
		this.e = new Estrofa();
	}

	public String juntarEstrofas() {
		String estrofa1 = e.generarEstrofa();
		String estrofa2 = e.generarEstrofa();
		String estrofa3 = e.generarEstrofa();
		String estrofas = estrofa1 + "\n" + "\n" + estrofa2 + "\n" + "\n" + estrofa3;
		return estrofas;
	}

	public void gestionarPropiedades() {
		Propiedades propiedades = new Propiedades();
		propiedades.asignarPropiedades();
	}

	public void gestionarArchivo(String direccion) {
		ArchivoCancion archivoCancion = new ArchivoCancion();
		archivoCancion.escribirArchivo(direccion, juntarEstrofas());
	}

}
