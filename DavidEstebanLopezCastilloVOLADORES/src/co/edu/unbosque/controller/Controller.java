package co.edu.unbosque.controller;

import co.edu.unbosque.model.LosElevados;
import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private LosElevados elev;
	
	public Controller() {
		vista = new View();
		elev = new LosElevados();
		funcionar();
	}
	
	public void funcionar() {
		vista.mostrarInformacion(elev.unirTodaInformacion());
	}
}
