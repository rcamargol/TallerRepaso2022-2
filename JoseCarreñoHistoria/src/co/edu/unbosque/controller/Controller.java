package co.edu.unbosque.controller;

import co.edu.unbosque.model.Historia;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Historia historia;
	private View vista;
	
	public Controller() {
		historia = new Historia();
		vista = new View();
		funcionar();
	}
	
	public void funcionar() {
		String textoK = ""+historia.mostrarKira()+"\n"+historia.caractKira();
		vista.mostrarInformacion(textoK);
		String textoA = ""+historia.mostrarAstar()+"\n"+historia.caractAstar();
		vista.mostrarInformacion(textoA);
		String textoAn = ""+historia.mostrarAndres()+"\n"+historia.caractAndres();
		vista.mostrarInformacion(textoAn);
		String textoR = ""+historia.mostrarRenk()+"\n"+historia.caractRenk();
		vista.mostrarInformacion(textoR);
	}
	
}
