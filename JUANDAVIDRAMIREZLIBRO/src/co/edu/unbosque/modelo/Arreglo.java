package co.edu.unbosque.modelo;
public class Arreglo {
	private Libro lib;
	public Arreglo(){
		lib = new Libro();
	}
	public String todo(String f,String n, int a) {
	return lib.abecedario(f)+lib.meses(n)+lib.telefono(a,f);
	}
	public Libro getlib() {
	return lib;
	}
	public void setLib(Libro lib) {
		this.lib = lib;
	}
}
