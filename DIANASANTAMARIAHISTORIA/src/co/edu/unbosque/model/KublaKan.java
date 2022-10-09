package co.edu.unbosque.model;

public abstract class KublaKan {

	protected int edad;
	protected int estatura;
	protected String colorDeOjos;
	protected boolean alma;

	public KublaKan() {
		this.edad = 0;
		this.estatura = 0;
		this.colorDeOjos = "";
		this.alma = true;
	}

	abstract String habitarPlaneta();

	abstract String sentir();
}
