package co.edu.unbosque.controller;

import co.edu.unbosque.model.Aereos;
import co.edu.unbosque.view.View;

public class Controller {
	private Aereos a;
	private View v;
	
	public Controller() {
		a = new Aereos();
		v = new View();
		funcionar();
	}
	public void funcionar() {
		String menu = "Escoge el aereo del que quieres saber sus datos" + "\n" 
				 + "\t1 Superman" + "\n"   
				 + "\t2 Pajaro " + "\n" 
				 + "\t3 Avion de mar" + "\n" 
				 + "\t4 Helicoptero" + "\n" 
				 + "\t5 Salir";
	
	int opcion = (int)View.leerDatoEntero(menu);
	
	switch(opcion) {
	case 1:
		View.mostrarInformacion(a.getSm().toString());
		break;
	case 2:
		View.mostrarInformacion(a.getB().toString());
		break;
	case 3:
		View.mostrarInformacion(a.getS().toString());
		break;
	case 4:
		View.mostrarInformacion(a.getH().toString());
		break;
	case 5:
		View.mostrarInformacion("Espero haberte informado , adios ");
		break;
	
	}
	if(opcion != 5) {
		funcionar();
	}
}

	}

