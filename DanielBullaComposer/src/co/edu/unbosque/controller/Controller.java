package co.edu.unbosque.controller;

import co.edu.unbosque.model.GestionDeLetras;
import co.edu.unbosque.view.View;

public class Controller {

	private GestionDeLetras gestionL;
	private View view;
	
	public Controller() {
		gestionL = new GestionDeLetras();
		view = new View();
		funcionar();
	}

	private void funcionar() {
		String aux = view.leerCaracteres("Digita el nombre que quieres ponerle a tu cancion: ");
		gestionL.setNombreCancion(aux);
		gestionL.nombrarCancion();
		view.mostrarInformacion(gestionL.getG().generarLetra());
		gestionL.gestionarArchivo();
		view.mostrarInformacion(gestionL.gestionarPropiedades());
	}
	
}
