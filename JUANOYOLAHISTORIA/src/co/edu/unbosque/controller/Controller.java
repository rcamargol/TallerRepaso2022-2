package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.model.EdadDesterradoException;
import co.edu.unbosque.model.EstaturaHeroeException;
import co.edu.unbosque.view.View;

public class Controller {
	private CynusX1 c;
	private View gui;
	
	public Controller() {
		c = new CynusX1();
		gui = new View();
		funcionar();
		
	}
	public void funcionar()  {
		try {
			gui.mostrarMensaje(c.listarAstar()+c.listarKira()+c.listarJuan()+c.listarRenk());
		} catch (EstaturaHeroeException e) {
			gui.mostrarMensaje("Un heroe no puede tener una estatura diferente a 3 metros!");
		} catch (EdadDesterradoException e) {
			gui.mostrarMensaje("Un desterrado no puede vivir mas de 1500 años!");
		}
	}
	
}
