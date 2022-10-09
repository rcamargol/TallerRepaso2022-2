package co.edu.unbosque.controller;
import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {

	private View gui;
	private Cancion C;
	
	public Controller() {
		gui = new View();
		C = new Cancion();
		funcionar(); 
	}
      private void funcionar() {
	
	    C.crearRaggaeton();
	    gui.mostrarResultados(C.getLinea1().getEstrofa() +"\n"+ "\n"+
	                          C.getLinea2().getEstrofa() +"\n"+ "\n"+
	    		              C.getLinea3().getEstrofa());
	    
	    C.getAr().escribirArchivo(gui.generarCancion(),C.getLinea1().getEstrofa() +"\n"+ "\n"+
                                                       C.getLinea2().getEstrofa() +"\n"+ "\n"+
	                                                   C.getLinea3().getEstrofa());
	    C.getProp().escribirPropiedades();
      }
}
