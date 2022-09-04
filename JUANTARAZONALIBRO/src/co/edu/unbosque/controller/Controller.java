package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private ClaseX x;
	
	public Controller() {
		
		gui = new View();
		x = new ClaseX();
		
		funcionar();		
	}
	
	public void funcionar() {
		
		gui.setChoices(x.getLv().getAbecedario());
		gui.setChoices2(x.getLv().getMes());
		gui.setChoices3(x.getLv().getNum());
		
		gui.mostrarDatos(gui.procesarDatos());
	}
	
	public View getGui() {
		return gui;
	}

	public void setGui(View gui) {
		this.gui = gui;
	}
	
	
}
