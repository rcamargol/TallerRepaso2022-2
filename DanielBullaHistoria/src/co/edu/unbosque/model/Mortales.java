package co.edu.unbosque.model;

public abstract class Mortales extends KublaKan {

	protected String religion;
	protected String mentira;
	
	public Mortales() {
		super.colorDeOjos = "violeta";
		this.religion = "";
		this.mentira = "";
	}
	
	@Override
	public String sentir() {
		
		return " pueden sentir a otros mortales" ;
	}
	
	@Override
	public String habitar() {
		
		return " viven al oeste de Cynus X1";
	}
	
	public abstract String adquirirConocimientos();
	public abstract String tenerUnaFamilia();
	public abstract String ejercerUnaProfesion();
	
}
