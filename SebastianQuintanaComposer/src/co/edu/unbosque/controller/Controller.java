package co.edu.unbosque.controller;

import co.edu.unbosque.model.OrganizacionMusical;
import co.edu.unbosque.view.View;

public class Controller {
	private OrganizacionMusical om;
	private View view;
	
	public Controller() {
		om = new OrganizacionMusical();
		view = new View();
		funcionar();
	}
	public void funcionar() {
		String aux = view.leerCaracteres("Ingresa el nombre que le deseas poner a la cancion.");
		om.setNombreCancion(aux);
		om.nombrarCancion();
		view.mostrarInformacion(om.getG().crearCancion());
		om.gestionarArchivo();
		view.mostrarInformacion(om.gestionarPropiedades());
	}
}

