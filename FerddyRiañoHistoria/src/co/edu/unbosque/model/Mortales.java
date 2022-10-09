package co.edu.unbosque.model;

public abstract class Mortales extends KublaKan {
	
	protected String envidia;
	protected String religion;
	
	public Mortales() {
		super.colordeojos = "Ojos violeta";
		this.envidia = "";
		this.religion = "";
	}
	
	@Override
	public String habitar() {
		
		return "Habitan en el este del planeta";
	}
	
	@Override
	public String sentir() {
		
		return "Sienten la presencia de otros mortales";
	}
	
	public abstract void adquirirConocimientos();
	public abstract void tenerFamilia();
	public abstract void ejercerProfesion();
	
}
