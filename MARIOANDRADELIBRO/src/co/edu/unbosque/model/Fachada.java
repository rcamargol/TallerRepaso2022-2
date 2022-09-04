package co.edu.unbosque.model;

public class Fachada {
	
	private Libro_de_tu_Vida lv;
	
	public Fachada(){
		lv = new Libro_de_tu_Vida();
	}
	public String Unir(String m,String n, int a) {
		return lv.ABC(m)+lv.Mes(n)+lv.Num(a, m);
	}

	public Libro_de_tu_Vida getLv() {
		return lv;
	}

	public void setLv(Libro_de_tu_Vida lv) {
		this.lv = lv;
	}
	
	
}
