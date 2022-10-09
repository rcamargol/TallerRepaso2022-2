package co.edu.unbosque.controller;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;


public class Controller {
	
	private Voladores vl;
	private View v;
	
	public Controller() {
		vl = new Voladores();
		v = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		String menu = ".: Seleccion de Volador :." + "\n"
					+ "\t1. Pajaro" + "\n" + "\t2. Helicoptero" + "\n" + "\t3. Hidroavion" + "\n" + "\t4. Superman" + "\n" + "\t5. Salir" + "\n"
					+ "Digita la opcion correspondiante al volador del que quieres ver la descripcion.";
		
		int opcion = (int) v.leerDatoEntero(menu);
		
		switch (opcion) {
		case 1:
			v.mostrarInformacion(vl.getB().toString());
			break;
		case 2:
			v.mostrarInformacion(vl.getH().toString());
			break;
		case 3:
			v.mostrarInformacion(vl.getS().toString());
			break;
		case 4:
			v.mostrarInformacion(vl.getSp().toString());
			break;
		case 5:
			v.mostrarInformacion("Que tengas un buen dia.");
			break;
		}
		if(opcion != 5) {
			funcionar();
		}
	}
		
		
}


