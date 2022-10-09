package co.edu.unbosque.controller;

import co.edu.unbosque.model.Letra;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Letra letra;
	private Archivo archivo;

	public Controller() {
		letra = new Letra();
		view = new View();
		archivo = new Archivo();
		funcionar();
	}

	public void funcionar() {
		
		String aux = archivo.escribirArchivo(letra.generarCancion());
		view.mostrarInformacion(aux);
		view.mostrarInformacion(archivo.leerArchivo());
	}

}
