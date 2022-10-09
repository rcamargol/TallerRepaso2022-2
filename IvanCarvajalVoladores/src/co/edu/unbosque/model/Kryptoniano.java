package co.edu.unbosque.model;

public abstract class Kryptoniano extends Animal {

	protected String vulneravilidad; 
	
	public Kryptoniano(){
		vulneravilidad = "";
		super.camina = "";
		
	}
	
	public abstract String salvarVidas();
}
