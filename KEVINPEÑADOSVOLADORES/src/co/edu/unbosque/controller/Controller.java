package co.edu.unbosque.controller;

import co.edu.unbosque.model.LosReyesDelCielo;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View vista;
	private LosReyesDelCielo cielo;
	
	public Controller() {
		vista = new View();
		cielo = new LosReyesDelCielo();
		funcionar();
	}

	public void funcionar() {
		vista.mostrar("Aves: " + "\n" + cielo.recibirMsgAves(),"1");
		vista.mostrar("Helicoptero: " + "\n" + cielo.recibirMsgHelicoptero(),"2");
		vista.mostrar("Hidroavion: " + "\n" + cielo.recibirMsgHidroavion(),"3");
		vista.mostrar("Superman: " + "\n" + cielo.recibirMsgSuperman(),"4");
		
	}

}
