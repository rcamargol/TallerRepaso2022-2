package co.edu.unbosque.Controller;

import co.edu.unbosque.Model.Cancionero;
import co.edu.unbosque.View.View;

public class Controller {
	
	private Cancionero ca;
	private View v;
	
	public Controller() {
		
		ca= new Cancionero();
		v= new View();
		funcionar();
		
	}
	public void funcionar() {
		String a=View.LeerNombre("Pon el nombre de la mejor canción del año");
	    ca.setNombre(a);
	    ca.nombre();
	    v.mostInfo(ca.getLet().getLetras());
	    ca.gestionarArchivo();	
	    v.mostInfo(ca.generarLetra());
	
	   
	    
	}

}
