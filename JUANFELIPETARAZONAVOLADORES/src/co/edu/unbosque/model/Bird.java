package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	
	private String pico;
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "  Despegan desde arboles o sitios no tan altos, ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "aterrizan en arboles los cuales terminan siendo sus hogares, ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "vuelan gracias a sus alas, ";
	}
	
	public String eat() {
		return "comen semillas, plantas, carroña, nectar y frutas. ";
	}
	
	public String buildNest(){
		return "Los pajaros, construyen sus nidos, con ramas ";
	}
	
	public String layEggs(){
		return "las hembras ponen huevos, tienen que cuidar de ellos.";
	}
}
