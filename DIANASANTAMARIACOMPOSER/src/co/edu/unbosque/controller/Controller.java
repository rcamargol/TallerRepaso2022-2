package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {

	private Cancion c;
	private View v;

	public Controller() {
		c = new Cancion();
		v = new View();
		iniciar();
	}

	public void iniciar() {
		v.mostrarCancion(c.juntarEstrofas());
		c.gestionarArchivo(v.guardarArchivo(c.juntarEstrofas()) + ".txt");
		c.gestionarPropiedades();
	}
}
