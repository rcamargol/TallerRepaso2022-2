package co.edu.unbosque.controller;

import co.edu.unbosque.model.Aereos;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Aereos ae;
	private View v;

	public Controller() {
		ae = new Aereos ();
		v = new View ();
		funcionar ();
	}
	
	public void funcionar () {
		
	v.mostrarMensaje("Digite el numero del volador que desea conocer: " + "\n" + "1. Bird " + "\n" + "2. Helicopter" + "\n" + "3. SeaPlane" + "\n" + "4. Superman");	
    
		int op=v.pedirDatoEntero();
		switch (op) {
		
		case 1:
			v.mostrarMensaje(ae.getBr().textoBird());
			break;
			
		case 2:
			v.mostrarMensaje(ae.getHel().textoHelicopter());
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		
	}
  }
}

