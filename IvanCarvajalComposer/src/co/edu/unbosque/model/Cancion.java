package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class Cancion {

	private Archivo ar;
	private Propiedades prop;
	private Estrofa linea1;
	private Estrofa linea2;
	private Estrofa linea3;
	
	public Cancion() {
		ar = new Archivo();
		prop = new Propiedades();
		linea1 = new Estrofa();
		linea2 = new Estrofa();
		linea3 = new Estrofa();
	}
	
	public void crearPropiedades() {
		
		prop.escribirPropiedades();
	}
	
	public void crearRaggaeton() {
		linea1.alterarEstrofa();
		linea2.alterarEstrofa();
		linea3.alterarEstrofa();
	}

	public Archivo getAr() {
		return ar;
	}

	public void setAr(Archivo ar) {
		this.ar = ar;
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Estrofa getLinea1() {
		return linea1;
	}

	public void setLinea1(Estrofa linea1) {
		this.linea1 = linea1;
	}

	public Estrofa getLinea2() {
		return linea2;
	}

	public void setLinea2(Estrofa linea2) {
		this.linea2 = linea2;
	}

	public Estrofa getLinea3() {
		return linea3;
	}

	public void setLinea3(Estrofa linea3) {
		this.linea3 = linea3;
	}
	
}
