package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.LeerArchivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class Conector {
	private LeerArchivo leer;
	private Textos texto;
	private Propiedades prop;
	public Conector() {
		leer = new LeerArchivo();
		texto = new Textos();
		prop = new Propiedades();
	}
	public LeerArchivo getLeer() {
		return leer;
	}
	public void setLeer(LeerArchivo leer) {
		this.leer = leer;
	}
	public Textos getTexto() {
		return texto;
	}
	public void setTexto(Textos texto) {
		this.texto = texto;
	}
	public Propiedades getProp() {
		return prop;
	}
	public void setProp(Propiedades prop) {
		this.prop = prop;
	}
	
	
}
