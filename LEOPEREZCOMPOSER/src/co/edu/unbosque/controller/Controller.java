package co.edu.unbosque.controller;

import java.io.File;

import co.edu.unbosque.model.Compositor;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private Compositor co;
	
	public Controller() {
		gui = new View();
		co = new Compositor();
		funcionar();
	
	}

	private void funcionar() {
		File f = gui.capturarArchivo();
		String estrofa1 = co.hacerEstrofa1(4);
		String estrofa2 = co.hacerEstrofa2(4);
		String estrofa3 = co.hacerEstrofa3(4);
		co.escribirEstrofa1(estrofa1+"\n"+estrofa2 +"\n"+estrofa3,f);
		gui.mostrar(estrofa1+"\n"+estrofa2+"\n"+estrofa3);
		gui.mostrar(co.gestionarPropiedades());
	}
	
	

	}
	
	
	
	

