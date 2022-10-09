package co.edu.unbosque.model;

public abstract class Mortal extends KublaKan {

	abstract String adquirirConocimientos();

	abstract String tenerFamilia();

	abstract String ejercerPorfesion();

	@Override
	String habitarPlaneta() {
		return "Yo habito en el este del planeta";
	}

	@Override
	String sentir() {
		return "Soy capaz de sentir la presencia de otros mortales";
	}

}
