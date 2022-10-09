package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.model.ExcepcionKublakan;
import co.edu.unbosque.model.ExcepcionOrtografia;
import co.edu.unbosque.view.View;

public class Controller {
	
	CynusX1 cy;
	View vi;
	
	public Controller() {
		
		cy = new CynusX1();
		vi = new View();
		funcionar();
		
	}

	private void funcionar(){
		
		String bucle = vi.recibirDatos("Te gustaria saber la informacion de kira, astar, sebastian, renk?"); 
		
		while(bucle.equalsIgnoreCase("si"))
		try {
			
			String men = "";
			String res = vi.recibirDatos("Ingrese el nombre de quien le gustaría saber la información");
			men = cy.buscarNombre(res);
			vi.mostrarMensaje(men, res);
			bucle = vi.recibirDatos("Otra vez?");
			
		} catch (ExcepcionKublakan | ExcepcionOrtografia e) {
			// TODO Auto-generated catch block
			vi.mostrarMensaje(e.getMessage(), "error");
			bucle = vi.recibirDatos("Otra vez?");
			
		}
		
	}
 
}
