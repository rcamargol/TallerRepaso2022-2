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
		
	
		String menu = vista.seleccionarPersonaje("Selección");
		
		if(menu == "Kira (Héroe)") {
			vista.mostrarInformación(cynux.getKira().generarInformacionKira());
		}
		
		if(menu == "Astar (Héroe)") {
			vista.mostrarInformación(cynux.getAstar().generarInformacionAstar());
		}
		
		if(menu == "Renk (Desterrado)") {
			vista.mostrarInformación(cynux.getRenk().generarInformacionRenk());
		}
		
		if(menu == "David (Mortal)") {
			vista.mostrarInformación(cynux.getDavid().generarInformacionDavid());
		}
		
		if (menu != null) {
			funcionar();
		}
		
	}
}
