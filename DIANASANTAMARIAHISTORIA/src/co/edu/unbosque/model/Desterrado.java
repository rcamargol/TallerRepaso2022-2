package co.edu.unbosque.model;

public abstract class Desterrado extends KublaKan {

	protected String nivelDeTristeza;
	protected String nivelDeSoledad ;

	public Desterrado() {
		this.nivelDeTristeza = "";
		this.nivelDeSoledad = "";
	}

	abstract String odiar();

	abstract String llorar();

	abstract String arrastrar();
}
