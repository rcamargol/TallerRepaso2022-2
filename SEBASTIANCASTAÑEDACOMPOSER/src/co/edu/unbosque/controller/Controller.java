package co.edu.unbosque.controller;

import co.edu.unbosque.model.Conector;
import co.edu.unbosque.model.Textos;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.View;

public class Controller {
	private Conector fachada;
	private View vista;

	public Controller() {
		fachada = new Conector();
		vista = new View();
		funcionar();
	}

	public void funcionar() {
		fachada.getProp().escribirPropiedades();
		String a = vista.escribirArchivo(fachada.getTexto().generarCancion());
		vista.mostrarInformacion(fachada.getLeer().leerArchivo(a));
	}
}
