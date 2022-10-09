package co.edu.unbosque.model;

public class Cancion {
	
	private Archivo ar;
	private Letra lt;

	public String guardarCancion(){
		lt = new Letra();
		ar = new Archivo();
		this.ar.setJ(lt.crearTodasEstrofas()+"\n");
		return "";
	}
	public String gestionDeArchivos(){
		String ga;
		ga = ar.gestionarArchivo();
		return ga;
	}

}
