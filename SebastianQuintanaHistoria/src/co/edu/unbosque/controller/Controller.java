package co.edu.unbosque.controller;

import co.edu.umbosque.view.View;
import co.edu.unbosque.model.Decendientes;
import co.edu.unbosque.model.EstaturaException;
import co.edu.unbosque.model.EdadException;
public class Controller {
	private View vista;
	private Decendientes des;
	
	public Controller () {
		vista  =  new View();
		des = new Decendientes();
		funcionar();
	}
	
	public void funcionar() {
		
		try {
			des.probarExceptions();
		} catch(EdadException | EstaturaException e) {
			vista.mostrarInformacion(e.getMessage());
		}
		
		String menu = "Escoge el personaje del que quieres saber sus datos" + "\n" 
					 + "\t1 Kira" + "\n"   
					 + "\t2 Astar" + "\n" 
					 + "\t3 Sebastian" + "\n" 
					 + "\t4 Renk" + "\n" 
					 + "\t5 Salir";
		
 		int opcion = (int)vista.leerDatoEntero(menu);
 		
 		switch(opcion) {
 		case 1:
 			vista.mostrarInformacion(des.getK().toString());
 			break;
 		case 2:
 			vista.mostrarInformacion(des.getA().toString());
 			break;
 		case 3:
 			vista.mostrarInformacion(des.getS().toString());
 			break;
 		case 4:
 			vista.mostrarInformacion(des.getR().toString());
 			break;
 		case 5:
 			vista.mostrarInformacion("!recuerda servirle a KublaKan hoy y siempre, salve KublaKan!");
 			break;
 		
 		}
 		
	}
}

