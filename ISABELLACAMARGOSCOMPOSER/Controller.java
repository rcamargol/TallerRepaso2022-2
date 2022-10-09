package co.edu.unbosque.controller;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;


public class Controller {
	
	Letra letra;
	View view;
	
	public Controller() {
		letra = new Letra ();
		view = new View ();
		funcionar();
	}
	
	public void funcionar() {
		letra.generarRegueton();
		view.msd(letra.getE1().getEst() + "\n" + "\n" + letra.getE2().getEst() + "\n" + "\n" + letra.getE3().getEst());
		letra.getEf().escribirArchivo(view.directorio(), letra.getE1().getEst() + "\n" + "\n" + letra.getE2().getEst() + "\n" + "\n" + letra.getE3().getEst());
		letra.getPr().escribirPropiedades();
	}
	
	
	

}
