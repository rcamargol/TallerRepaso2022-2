package co.edu.unbosque.controller;

import co.edu.unbosque.model.Clasificaciones;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Clasificaciones clas;
	
	public Controller() {
		view = new View();
		clas = new Clasificaciones();
		funcionar();
	}
	public void funcionar() {
		String lista = view.generarLista();
		if(lista == "Superman") {
			view.mostrarDatos(clas.getSup().toString());
		}
		else if(lista == "Hidroavion"){
			view.mostrarDatos(clas.getHidro().toString());
		}
		else if(lista == "Helicoptero") {
			view.mostrarDatos(clas.getHeli().toString());
		}
		else if(lista == "Aves") {
			view.mostrarDatos(clas.getAves().toString());
		}
		
	}
	}

