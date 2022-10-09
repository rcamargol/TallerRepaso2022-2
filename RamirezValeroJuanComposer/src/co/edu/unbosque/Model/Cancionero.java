package co.edu.unbosque.Model;
import co.edu.unbosque.Model.Persistence.Filefrases;
import co.edu.unbosque.Model.Persistence.Propiedades;

public class Cancionero {
	//Fachada
	
	private String nombre;
	private Letra let;
	
	public Cancionero() {
	
		let= new Letra();
	    nombre="";		
	}
	
	public void nombre() {
		let.setLetras(nombre+"\n"+let.getLetras());
		
	}
	public void gestionarArchivo() {
		Filefrases archivo = new Filefrases();
		archivo.LeerArchivo(getLet().getLetras());
	}
	
	public String generarParrafo() {
		return let.generarParrafo();
		
	}
	public String generarLetra() {
		return let.generarletra();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Letra getLet() {
		return let;
	}

	public void setLet(Letra let) {
		this.let = let;
	}

	
}
