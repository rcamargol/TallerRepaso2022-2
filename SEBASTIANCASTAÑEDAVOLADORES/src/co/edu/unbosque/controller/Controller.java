package co.edu.unbosque.controller;

import co.edu.unbosque.model.Conector;
import co.edu.unbosque.view.View;

public class Controller {
	private Conector fachada;
	private View vista;
	
	public Controller() {
		fachada = new Conector();
		vista = new View();
		funcionar();
	}

	private void funcionar() {
		vista.mostrarinformacion("Superman: \n" + fachada.getSuperman().unirMetodos()+fachada.getSuperman().toString());
		vista.mostrarinformacion("Un Helicoptero: \n" + fachada.getHelicopter().unirMetodos()+fachada.getHelicopter().toString());
		vista.mostrarinformacion("Un Pajaro: \n" + fachada.getBird().unirMetodos());
		vista.mostrarinformacion("Un Aeroplano: \n" + fachada.getSeaplane().unirMetodos()+fachada.getSeaplane().toString());
	}
}
