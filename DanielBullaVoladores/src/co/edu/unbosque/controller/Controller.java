package co.edu.unbosque.controller;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;

public class Controller {

	private Voladores voladores;
	private View view;
	
	public Controller() {
		voladores = new Voladores();
		view = new View();
		funcionar();
	}

	private void funcionar() {
		String menu = "Digita cual volador quieres consultar: "
				+ "\n" + "\t1 Pajaro" + "\n"   
				 + "\t2 Helicoptero" + "\n" 
				 + "\t3 Hidroavion" + "\n" 
				 + "\t4 Superman" + "\n" 
				 + "\t5 Salir";
		
		int opcion = (int)view.leerDatoEntero(menu);
		
		switch(opcion) {
		case 1:
			view.mostrarInformacion(voladores.getBird().toString());
			break;
		case 2:
			view.mostrarInformacion(voladores.getHelicopter().toString());
			break;
		case 3:
			view.mostrarInformacion(voladores.getSeaPlane().toString());
			break;
		case 4:
			view.mostrarInformacion(voladores.getSuperman().toString());
			break;
		case 5:
			view.mostrarInformacion("Ten un líndo dia");
		}
		if(opcion != 5) {
			funcionar();
		}
		
	}
}
