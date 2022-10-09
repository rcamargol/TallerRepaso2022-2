package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	private CynusX1 cynus;
	private View vista;
	
	
	public Controller() {
		cynus = new CynusX1();
		vista = new View();
		funcionar();
	}

	public void funcionar() {
		int x;
		do {
			String opc = vista.seleccionar("Seleccione una opcion:");
			switch (opc) {
			case "Ver todo":
				vista.mostrarTodos("|-----------------Heroes-----------------|" + "\n" + cynus.getKira().heroes() + "\n" + "|-----------------Kira-----------------|" + 
								   "\n" + "\n" + cynus.getKira().kira());
				vista.mostrarTodos("|-----------------Astar-----------------|" + "\n" + cynus.getAstar().Astar());
				
				vista.mostrarTodos("|-----------------Mortales-----------------|" + "\n" + cynus.getKevin().mortales() + "\n" + "|-----------------Kevin-----------------|"
								  +"\n" + cynus.getKevin().kevin());
				
				vista.mostrarTodos("|-----------------Desterrados-----------------|" + "\n" + cynus.getRenk().desterrados() + "\n" + "|-----------------Renk-----------------|"
								  +"\n" + cynus.getRenk().Renk());
				break;
			case "Ver Heroes":
				vista.mostrarHeroes(cynus.getKira().heroes());
						break;
			case "Ver Mortales":
				vista.mostrarMortales(cynus.getKevin().mortales());
					
				break;
			case "Ver Desterrados":
				vista.mostrarDesterrados(cynus.getRenk().desterrados());
				break;
			case "Ver Kira":
				vista.mostrarKira(cynus.getKira().kira());
				break;
			case "Ver Astar":
				vista.mostrarAstar(cynus.getAstar().Astar());
				break;
			case "Ver Renk":
				vista.mostrarRenk(cynus.getRenk().Renk());
				break;
			case "Ver Kevin":
				vista.mostrarKevin(cynus.getKevin().kevin());
				break;
			default:
				break;
			}	
			 x = vista.volverAElegir("Desea elegir una nueva opcion");
	    }while(x == 0);

	}
	

}
