package co.edu.unbosque.controller;

import co.edu.unbosque.model.UnirClase;
import co.edu.unbosque.view.View;

public class Controller {
	
	private UnirClase ui;
	private View v;
	
	public Controller(){
		
		ui = new UnirClase();
		v = new View();
		
		funcionar();
	}
	
	public void funcionar(){
		v.guardarArchivo();
		v.mostrarDatos(ui.armarEstrofas());
		v.mostrarDatos(ui.gestionPropiedades());
		
	}
}
