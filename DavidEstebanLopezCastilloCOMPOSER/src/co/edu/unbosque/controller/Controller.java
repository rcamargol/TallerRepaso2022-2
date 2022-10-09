package co.edu.unbosque.controller;

import co.edu.unbosque.model.LetraInspiradora;

import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private LetraInspiradora letra;
	
	
	public Controller() {
		vista = new View();
		letra = new LetraInspiradora();
		funcionar();
	}
	
	public void funcionar() {
		
		letra.gestionarPropiedades();
		vista.mostrarInformacion(letra.getTab().generarLetra());
		letra.gestionarArchivoCadena(vista.mostrarDireccion());
	
	}
}
