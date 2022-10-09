package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.model.EdadException;
import co.edu.unbosque.model.EstaturaException;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private CynusX1 cynus;
	
	public Controller() {
		view = new View();
		cynus = new CynusX1();
		funcionar();
	}

	private void funcionar() {
		
		try {
			cynus.probarExceptions();
		}catch(EdadException | EstaturaException e) {
			view.mostrarInformacion(e.getMessage());
		}
		
		String menu = "Digita cual personaje quieres conocer: "
				+ "\n" + "\t1 Kira" + "\n"   
				 + "\t2 Astar" + "\n" 
				 + "\t3 Daniel" + "\n" 
				 + "\t4 Renk" + "\n" 
				 + "\t5 Salir";
		
		int opcion = (int)view.leerDatoEntero(menu);
		
		switch(opcion) {
		case 1:
			view.mostrarInformacion(cynus.getKira().toString());
			break;
		case 2:
			view.mostrarInformacion(cynus.getAstar().toString());
			break;
		case 3:
			view.mostrarInformacion(cynus.getDaniel().toString());
			break;
		case 4:
			view.mostrarInformacion(cynus.getRenk().toString());
			break;
		case 5:
			view.mostrarInformacion("Ten un líndo dia");
		}
		if(opcion != 5) {
			funcionar();
		}
	}
}
