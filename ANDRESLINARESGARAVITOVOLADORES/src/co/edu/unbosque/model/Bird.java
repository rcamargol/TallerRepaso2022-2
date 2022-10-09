package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	public String buildNest() {
		return"Haciendo la camita para mis chamacos";
	}
	
	public String layEggs() {
		return"Los huevos es para hacer a mis hijos";
	}
	
	@Override
	public String takeOff() {
		return "Despegar para olvidarme de mis hijos";
	}

	@Override
	public String land() {
		return "La tierra solo para comer gusanos";
	}

	@Override
	public String fly() {
		return "Volar para respirando airecito limpio";
	}

	@Override
	public String eat() {
		return "Se como todo lo que se mueva";
	}

}
