package co.edu.unbosque.controller;

import co.edu.unbosque.model.GestorCanciones;
import co.edu.unbosque.view.View;

public class Controller {
	
	GestorCanciones can;
	View vi;
	
	public Controller() {
		
		can = new GestorCanciones();
		vi = new View();
		funcionar();
		
	}

	private void funcionar() {
		
		vi.mostrarMensaje("Por favor en la siguiente ventana guarde la cancion que le gustaria crear como un archivo", "Canción");
		String a = vi.guardarArchivo();
		String b = can.crearCancion(a);
		vi.mostrarMensaje(b, a);
		
	}

}
