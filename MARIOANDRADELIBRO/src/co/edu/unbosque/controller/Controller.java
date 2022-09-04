package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.Consola;

public class Controller {
	
	private Consola gui;
	private Fachada f;
	
	public Controller() {
		
		gui = new Consola();
		f = new Fachada();
		funcionar();
	}
	public void funcionar(){
		gui.MostrarInfo(f.Unir(gui.pedirDatoABC(), gui.pedirDatoMes(),  gui.pedirDatoNum()));
	}
}
