package co.edu.unbosque.controller;

import co.edu.unbosque.model.CancionReggaeton;
import co.edu.unbosque.model.persistance.Archivos;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private CancionReggaeton canci;
	
	public Controller() {
		view = new View();
		canci = new CancionReggaeton();
		funcionar();
	}
	public void funcionar() {
		String a;
		a = canci.enviarCancion();
		view.mostrarResultados(a);
		canci.getArch().escribirArchivo(view.lanzarFilechooser(), a);
	}


}
