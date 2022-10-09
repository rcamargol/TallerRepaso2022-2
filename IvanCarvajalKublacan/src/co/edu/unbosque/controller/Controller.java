package co.edu.unbosque.controller;
import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
	private CynusX1 Cy;
	private View gui;
	
	
	public Controller() {
		Cy = new CynusX1();
		gui = new View();
		funcionar();
	}

	private void funcionar() {
		String Menu = gui.SeleccionarMenu("Seleccione al personaje que quiere conocer la informacion");
		
		if (Menu == "Heroe: Kira") {
			gui.mostrarResultados(Cy.mostrarHeroe1(null));
			try {
				Cy.getK().confirmarAlma();
			} catch (Exception e) {
	        gui.mostrarResultados(e.getMessage());
			}
			try {
				Cy.getK().confirmarEdad();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
		}
		
		if (Menu == "Desterrado: Renk") {
			gui.mostrarResultados(Cy.mostrarDesterrado(null));
			
			try {
				Cy.getR().confirmarAlma();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
			try {
				Cy.getR().confirmarEdad();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
		}
		
		if (Menu == "Heroe: Astar") {
			gui.mostrarResultados(Cy.mostrarHeroe2(null));
			
			try {
				Cy.getAs().confirmarAlma();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
			try {
				Cy.getAs().confirmarEdad();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
		}
		
		if (Menu == "Mortal: Ivancarvajal") {
			gui.mostrarResultados(null);
			
			try {
				Cy.getIvan().confirmarAlma();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
			try {
				Cy.getIvan().confirmarEdad();
			} catch (Exception e) {
				gui.mostrarResultados(e.getMessage());
			}
		}
	}
}
