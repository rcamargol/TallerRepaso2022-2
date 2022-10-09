package co.edu.unbosque.model;

public abstract class Mortal extends KublaKan {

	protected boolean cabello;
	protected boolean felicidad;

	public Mortal() {
		this.cabello = true;
		this.felicidad = true;
	}

	abstract String amar();

	abstract String jugar();

	abstract String adquirirConocimiento();

	abstract String tenerFamilia();

	abstract String ejercerProfesion();
}
