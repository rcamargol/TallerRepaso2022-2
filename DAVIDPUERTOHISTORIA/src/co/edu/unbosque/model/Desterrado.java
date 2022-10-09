package co.edu.unbosque.model;

public abstract class Desterrado extends KublaKan {

	abstract String arrastrarse();

	@Override
	String habitarPlaneta() {
		return "Yo habito el extremo sur del planeta";
	}

	@Override
	String sentir() {
		return "No siento a nadie más que a mí mismo";
	}

}
