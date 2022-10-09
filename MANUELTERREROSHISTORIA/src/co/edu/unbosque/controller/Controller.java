package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private CynusX1 world;

	public Controller() {
		view = new View();
		world = new CynusX1();
		funcionar();
		
	}
	public void funcionar() {
		String lista = view.generarLista();
		if(lista == "Manuel") {
			view.mostrarResultados(world.getMa().brindarDatoMort());
		}
		else if(lista == "Renk"){
			view.mostrarResultados(world.getRnk().brindarDatoDeste());
		}
		else if(lista == "Kira"){
			view.mostrarResultados(world.getKir().brindarDatoKira());
		}
		else if(lista == "Astar") {
			view.mostrarResultados(world.getAst().brindarDatoAstar());
		}
		
	}


}
