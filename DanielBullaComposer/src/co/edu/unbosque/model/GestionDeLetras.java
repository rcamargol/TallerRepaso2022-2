package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EscribirLeerFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class GestionDeLetras {

	private String nombreDeCancion;
	private GenerarLetras gen;
	
	public GestionDeLetras() {
		gen = new GenerarLetras();
		this.nombreDeCancion = "";
	}
	
	public void nombrarCancion() {
		gen.setLetra(this.nombreDeCancion + "\n" + gen.getLetra());
	}
	
	public void gestionarArchivo() {
		EscribirLeerFile archivo = new EscribirLeerFile();
		archivo.escribirarchivo(getG().getLetra());
	}


	public String gestionarPropiedades() {
		Propiedades pro = new Propiedades();
		pro.escribirPropiedades();
		return "Las propiedades son: " + "\n" + pro.leerPropiedades();
	}
	
	public GenerarLetras getG() {
		return gen;
	}

	public void setG(GenerarLetras gen) {
		this.gen = gen;
	}

	public String getNombreCancion() {
		return nombreDeCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreDeCancion = nombreCancion;
	}

}
