package co.edu.unbosque.model;

public abstract class Heroe extends KublaKan {
	abstract String volar();

	abstract String crearFuego();

	abstract String detenerTiempo();

	@Override
	String habitarPlaneta() {
		return "Yo habito en el norte";
	}

	@Override
	String sentir() {
		return "Me siento a mí mismo y a seres de otros mundos";
	}

}
