package co.edu.unosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Bird;
import co.edu.unbosque.model.Helicopter;
import co.edu.unbosque.model.SeaPlane;
import co.edu.unbosque.model.Superman;
import co.edu.unbosque.view.View;

public class Controller {
 View gui;
 Superman sup;
 Bird bi;
Helicopter he;
 SeaPlane sea;
	public Controller () {
		funcionar();
	}
	public void funcionar() {
		gui= new View();
		sup=new Superman();
		bi= new Bird();
		he= new Helicopter();
		sea= new SeaPlane();
		gui.mostrar("hello welcome");
		
		menu();
	}
	public void menu() {
		
		String men="ingrese el numero adecuado \n"
				+ "1.Superman  \n"
				+ "2.Bird  \n"
				+ "3.SeaPlane  \n"
				+ "4.helicopter  \n"
				+"5.Salir";

		
		
			int opc ;
			
			opc = Integer.parseInt(gui.pedir(men));
			while(opc<6) {
				
			
		switch (opc) {
		case 1 : gui.mostrar(sup.toString());
		opc = Integer.parseInt(gui.pedir(men));
		break;
		
		case 2: gui.mostrar(bi.toString());
		opc = Integer.parseInt(gui.pedir(men));
		break;
		
		case 3 : gui.mostrar(sea.toString());
		opc = Integer.parseInt(gui.pedir(men));
		break;
		
		case 4 : gui.mostrar(he.toString());
		opc = Integer.parseInt(gui.pedir(men));
		break;
		
		case 5 :
			System.exit(0);
		
		break;
		
		}
			}
		
		
	}
	
}
