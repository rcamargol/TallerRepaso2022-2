package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CancionArchivo;
import co.edu.unbosque.model.persistence.Propiedades;

public class UnirClase {
	
	private Frases f;
	
	public UnirClase(){
		
		f = new Frases();
	
	}
	
	public String armarEstrofas(){
		String m = "";
		
		m =    f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+"\n"+
		       
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+"\n"+
		       
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+
		       f.organizarFrases()+"\n"+"\n";
	
		CancionArchivo ca = new CancionArchivo();
		ca.escribirArchivo(m);
		
		return m;
	}
	
	public String gestionPropiedades(){
		
		Propiedades p = new Propiedades();
		p.escribirPropiedades();
		
		return "Se leyeron las siguientes propiedades: "+"\n"+p.leerPropiedades();
	}
	
}
