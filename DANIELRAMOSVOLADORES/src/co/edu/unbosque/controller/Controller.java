package co.edu.unbosque.controller;

import co.edu.unbosque.model.MundoVolador;
import co.edu.unbosque.view.View;

public class Controller {
	
	private MundoVolador mv; 
	private View gui;
	
	public Controller() {
		mv = new MundoVolador();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		String opc = gui.pedirDatoMenu("Seleccione la opcion que desee");
		
		if (opc == "Vehiculo aereo") {
			generarDatosVehiculoAereo();
		}		
		
		if (opc == "Pajaro") {
			generarDatosPajaro();
		}
		
		if (opc == "Superman") {
			generarDatosSuperman();
		}
	}
	
	public void generarDatosVehiculoAereo() {
		
		String opc = gui.pedirDatoMenuVehiculoAereo("Seleccione la opcion que desee");
		
			if (opc == "Mostrar todos") {
				gui.mostrarMensaje(mv.getH().pasarMensaje());
				gui.mostrarMensaje(mv.getHeli().pasarMensaje());
			}
			
			if (opc == "Hidroavion") {
				gui.mostrarMensaje(mv.getH().pasarMensaje());
			}
			
			if (opc == "Helicoptero") {
				gui.mostrarMensaje(mv.getHeli().pasarMensaje());
			}
	}
	
	public void generarDatosPajaro() {
		
		gui.mostrarMensaje(mv.getP().pasarMensaje());
	}
	
	public void generarDatosSuperman() {
		
		gui.mostrarMensaje(mv.getS().pasarMensaje());
	}
}
