package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EscribirLeerFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class OrganizacionMusical {
	private String nombreCancion;
	private CreadorCanciones cr;
	
		public OrganizacionMusical() {
			cr = new CreadorCanciones();
			this.nombreCancion = "";
		}

		public void nombrarCancion() {
			cr.setCancion(this.nombreCancion + "\n" + cr.getCancion());
		}
		
		public void gestionarArchivo() {
			EscribirLeerFile archivo = new EscribirLeerFile();
			archivo.escribirArchivo(getG().getCancion());
		}
		
		public String gestionarPropiedades() {
			Propiedades prop = new Propiedades();
			prop.escribirPropiedades();
			return "Las propiedades son: " + "\n" + prop.leerPropiedades();
		}

		public String getNombreCancion() {
			return nombreCancion;
		}

		public void setNombreCancion(String nombreCancion) {
			this.nombreCancion = nombreCancion;
		}

		public CreadorCanciones getG() {
			return cr;
		}

		public void setG(CreadorCanciones cr) {
			this.cr = cr;
		}
		
}

