package co.edu.unbosque.controller;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Facade facade;
	private View view;
	
	public Controller() {
		facade = new Facade();
		view = new View();
		funcionar();
	}
	
	public void funcionar() {
		view.mostrarInformacion(""+facade.funcionar());
	}
	
}
