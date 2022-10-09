package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.PropiedadesC;

public class GestorCanciones {
	
	private Archivo arch;
	private PropiedadesC prop;
	private Cancion can;
	
	public GestorCanciones() {
		
		arch = new Archivo();
		prop = new PropiedadesC();
		can = new Cancion();
		prop.escribirPropiedades();
		
	}
	
	public String crearCancion(String a) {
		
		String cancion = "";
		int frases = 0;
		int estrofas = 0;
		
		frases = Integer.parseInt(prop.leerPropiedades("frases"));
		estrofas = Integer.parseInt(prop.leerPropiedades("estrofas"));
		arch.escribirArchivo(can.crearLetra(estrofas, frases), a);
		cancion = arch.leerArchivo(a);
		
		return cancion;
		
	}

}
