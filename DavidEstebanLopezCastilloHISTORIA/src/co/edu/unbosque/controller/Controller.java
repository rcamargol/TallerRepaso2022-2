package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private CynusX1 cynux;
	
	public Controller() {
		vista = new View();
		cynux = new CynusX1();
		funcionar();
	}
	
	public void funcionar(){
		
	
		String menu = vista.seleccionarPersonaje("Selecci�n");
		
		if(menu == "Kira (H�roe)") {
			vista.mostrarInformaci�n(cynux.getKira().generarInformacionKira());
		}
		
		if(menu == "Astar (H�roe)") {
			vista.mostrarInformaci�n(cynux.getAstar().generarInformacionAstar());
		}
		
		if(menu == "Renk (Desterrado)") {
			vista.mostrarInformaci�n(cynux.getRenk().generarInformacionRenk());
		}
		
		if(menu == "David (Mortal)") {
			vista.mostrarInformaci�n(cynux.getDavid().generarInformacionDavid());
		}
		
		if (menu != null) {
			funcionar();
		}
		
	}
}
