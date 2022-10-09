package co.edu.unbosque.controller;

import co.edu.unbosque.model.Uniondecosas;
import co.edu.unbosque.view.View;

public class Controller {

	private Uniondecosas Uni;
	private View gui;
	
	public Controller() {
		Uni = new Uniondecosas();
		gui = new View();
		funcionar();
	}

	private void funcionar() {
		String Menu = gui.SeleccionarMenu("Seleccione al objeto");
		
		if (Menu == "Superman") {
			gui.mostrarResultados(Uni.mostrarSuperman(null));
		}
		if (Menu == "Helicoptero") {
			gui.mostrarResultados(Uni.mostrarHelicoptero(null));
		}
		if (Menu == "Pajaro") {
			gui.mostrarResultados(Uni.mostrarPajaro(null));
		}
		if (Menu == "Hidroavion") {
			gui.mostrarResultados(Uni.mostrarHidroavion(null));
		}
	}
}
