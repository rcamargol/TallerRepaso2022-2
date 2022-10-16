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
			vista.mostrarInformacion(cynux.getKira().generarInformacionKira());
		}
		
		if(menu == "Astar (H�roe)") {
			vista.mostrarInformacion(cynux.getAstar().generarInformacionAstar());
		}
		
		if(menu == "Renk (Desterrado)") {
			vista.mostrarInformacion(cynux.getRenk().generarInformacionRenk());
		}
		
		if(menu == "David (Mortal)") {
			vista.mostrarInformacion(cynux.getDavid().generarInformacionDavid());
		}
		
		if (menu != null) {
			funcionar();
		}
		
	}
}
