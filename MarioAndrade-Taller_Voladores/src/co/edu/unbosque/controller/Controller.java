package co.edu.unbosque.controller;

import co.edu.unbosque.model.Motos;
import co.edu.unbosque.view.View;

public class Controller {
		Motos d;
		View v;
		public Controller() {
			d= new Motos();
			v= new View();
			init();
		}
		public void init(){
			
			v.MostrarInfo(d.mostrarClases());
			
		}
	}

