package co.edu.unbosque.controller;

import java.io.File;

import co.edu.unbosque.model.Composer;
import co.edu.unbosque.view.View;

public class Controller {
	private Composer c;
	private View gui;
	
	public Controller() {
		c = new Composer();
		gui = new View();
		funcionar();
	}
	public void funcionar() {		
		File f = gui.capturarArchivo();
		String cancion = c.crearCancion();
		c.imprimirCancion(cancion, f);
		gui.mostrarMensaje(cancion);
		gui.mostrarMensaje(c.hacerPropiedades());
	}
}
