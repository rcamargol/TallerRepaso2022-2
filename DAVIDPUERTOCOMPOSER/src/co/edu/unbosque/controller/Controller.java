package co.edu.unbosque.controller;

import co.edu.unbosque.model.Composer;
import co.edu.unbosque.view.View;

public class Controller {
	private View v;
	private Composer c;

	public Controller() {
		this.v = new View();
		this.c = new Composer();
		funcionar();
	}

	public void funcionar() {
		v.mostrarDato(c.gestionarArchivoCancion(v.guadarComo()));
		c.gestionarPropiedades();
	}
}
