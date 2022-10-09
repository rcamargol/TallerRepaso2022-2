package co.edu.unbosque.controller;

import java.io.File;

import co.edu.unbosque.model.Canciones;
import co.edu.unbosque.model.persistence.ArchivoCanciones;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Canciones c;
	private View v;
	
	public Controller() {
		c= new Canciones();
		v= new View();
		iniciar();
	}
	public void iniciar() {
		
		String res=c.leerfrases()+"\n";
			res+=c.leerfrases()+"\n";
			res+=c.leerfrases();
			v.MostrarInfo(res);
	        File a = v.cancion();
	        c.insertarCancion(res, a);
	        v.MostrarInfo(c.gestionarPropiedades());
	        		
	}
}
