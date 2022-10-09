package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller {

	View view;
	Superman superman;
	Bird ave;

	public Controller() {
		view = new View();
		superman = new Superman();
		ave = new Bird();

	}

	public void funcionar() {
		superman.nombre = "Superman";
		superman.comida = "Manzanas";
		view.smd("Soy " + superman.nombre + "\nMi comida es: " + superman.eat() + "\nMi debilidad es: "
				+ superman.debilidad);

		ave.nombre = "Pingüino";
		ave.comida = "Pescado";
		ave.puedeVolar = false;
		view.smd("Soy un " + ave.nombre + "\nMi comida es: " + ave.eat() + "\nPuedo volar: " + ave.puedeVolar);
	}
}
