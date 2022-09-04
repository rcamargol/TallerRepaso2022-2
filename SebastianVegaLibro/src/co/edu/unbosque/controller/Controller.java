package co.edu.unbosque.controller;

import co.edu.unbosque.model.Libro;
import co.edu.unbosque.view.Vista;


public class Controller {

	Vista vi;
	Libro lib;
	
	public Controller() {
		
		vi = new Vista();
		lib = new Libro();
		NombreLibro();
		
	}
	
	public void NombreLibro() {
		
		String l, m, n;
		int d = -1, r = 0, i;
		
		i = vi.Mostrarmensaje("¿Quieres saber como se llamaría el libro de tu vida?", "El libro de tu vida");
		
		while(i != 1 && r != 1 && i != -1 && r != -1){
			
		l = vi.Recibirdatos("Por favor ingrese la primera letra de su primer apellido");
		m = vi.Recibirdatos("Por favor ingrese su mes de nacimiento");
		n = vi.Recibirdatos("Por favor ingrese el ultimo digito de su numero de telefono");
		
		try {
		
		if (l != null && m != null && n != null) {
			
		d = Integer.parseInt(n);
		l = lib.NombreL(l, m, d);
		
		}
		else {
			
		l = "Uno o varios datos no han sido llenados";
		d = 10;
		
		}
		
		vi.Mostrarmensaje(l, "El libro de tu vida");
		
		}catch(IllegalArgumentException e1){}
		
		r = vi.Mostrarmensaje("¿Otra vez?", "El libro de tu vida");
		
		}
		
	}

}
