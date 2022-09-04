package controller;

import javax.swing.JOptionPane;

import model.programa;
import model.usuario;

public class Controller {
	programa pro;
	 String letr; 
	public Controller() {
		pro = new programa();
		
		funcionar ();
}
	void funcionar(){
		pro.trascripcion();
	
	}

	
}
