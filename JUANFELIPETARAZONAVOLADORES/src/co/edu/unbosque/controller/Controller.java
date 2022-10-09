package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX x;
	private View v;
	
	public Controller(){
		
		x = new ClaseX();
		v = new View();
		
		funcionar();
	}
	
	public void funcionar(){
		
		v.mostrarDatos(x.unir());
	}
}
