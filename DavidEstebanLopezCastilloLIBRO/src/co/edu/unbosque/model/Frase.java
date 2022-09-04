package co.edu.unbosque.model;

public class Frase {

	public String t[];
	
	public Frase() {
		t = new String[3];
	}
	
	
	public void incializarParte1(String h) {
		t[0]= h;
	}
	public void incializarParte2(String p) {
		t[1]= p;
	} 
	public void incializarParte3(String l) {
		t[2]= l;
	} 
	
	public String fraseCompleta () {
		String msj1 = "EL TITULO PERFECTO PARA USTED ES :"+"\n"+t[0]+" "+t[1]+" "+t[2];
		return msj1;
	}
}
