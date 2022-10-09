package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.model.persistence.Propiedades;


public class LetraInspiradora {

	private TablaRegueton tab;
	private Propiedades prop;
	private ArchivoFile archivo;

	
	public LetraInspiradora() {
		archivo = new ArchivoFile();
		tab = new TablaRegueton();
		prop = new Propiedades();
		
	}
	 
	 public void gestionarArchivoCadena (String direccion) {
		archivo.escribirArchivo(direccion,tab.generarLetra());
	}
	 
	 public void gestionarPropiedades() {
			prop.escribirPropiedades();	
			prop.tomarValoresPropiedades();
			tab.setNumFrase(prop.getFrases());
			tab.setNumEstrofa(prop.getEstrofas());
		}

	public TablaRegueton getTab() {
		return tab;
	}

	public void setTab(TablaRegueton tab) {
		this.tab = tab;
	}

	
	 
	 
	
}
