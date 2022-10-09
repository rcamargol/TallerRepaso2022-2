package co.edu.unbosque.controller;

import co.edu.unbosque.model.World;
import co.edu.unbosque.view.View;

public class Controller {
	private World w;
	private View gui;
	public Controller() {
		w = new World();
		gui = new View();
		funcionar();
	}
	public void funcionar() {
		gui.showMessage(w.showMethods()+w.showObjects());
	}
	
}
