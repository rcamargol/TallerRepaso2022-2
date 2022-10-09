package co.edu.unbosque.controller;

import co.edu.unbosque.model.AlturaException;
import co.edu.unbosque.model.Descendientes;
import co.edu.unbosque.model.EdadException;
import co.edu.unbosque.view.View;

public class Controller {

	private View vista;
	private Descendientes des;
	
	public Controller () {
		vista  =  new View();
		des = new Descendientes();
		funcionar();
	}
	
	public void funcionar() {
		
		try {
			des.probarExceptions();
		} catch(EdadException | AlturaException e) {
			vista.devolverInformacion(e.getMessage());
		}
		
		String menu = "Escoge el personaje del que quieres saber sus datos" + "\n" 
					 + "\t1 Kira" + "\n"   
					 + "\t2 Astar" + "\n" 
					 + "\t3 Juan" + "\n" 
					 + "\t4 Renk" + "\n" 
					 + "\t5 Salir";
		
 		int opcion = (int)vista.leerDato(menu);
 		
 		switch(opcion) {
 		case 1:
 			vista.devolverInformacion(des.getKir().toString());
 			break;
 		case 2:
 			vista.devolverInformacion(des.getAst().toString());
 			break;
 		case 3:
 			vista.devolverInformacion(des.getYo().toString());
 			break;
 		case 4:
 			vista.devolverInformacion(des.getRenk().toString());
 			break;
 		case 5:
 			vista.devolverInformacion("!Que la gloria y bendicion de KublaKan te resguarden siempre!");
 			break;
 		
 		}
 		
	}
}
