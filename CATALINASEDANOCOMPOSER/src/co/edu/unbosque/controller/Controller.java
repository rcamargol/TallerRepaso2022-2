package co.edu.unbosque.controller;

import java.io.File;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Cancion c;
	private View v;
	
	public Controller() {
		
		c = new Cancion();
		v = new View ();
		funcionar ();
		
	}
	
	public void funcionar ( ) {
		
		c.getProp().escribirPropiedades();
		v.mostrarInformacion(c.getPalabra().generarCancion());
		File archivo= v.cancion();
		c.letra(c.getPalabra().generarCancion(), archivo);
		v.mostrarInformacion("Se ha guardado la cancion con exito!");
		
		}
	}
	

