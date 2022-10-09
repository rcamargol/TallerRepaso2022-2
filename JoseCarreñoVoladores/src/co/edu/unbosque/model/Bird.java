package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "Yo debo despegar";
	}

	@Override
	public String land() {
		return "Yo puedo aterrizar sin matarme";	
	}

	@Override
	public String fly() {
		return "Yo puedo volar";
	}

	public String eat() {
		return "Yo debo comer";
	}
	
	public String walk() {
		return "Yo puedo caminar";
	}
	
	public String buildNeat() {
		return "Yo construyo nidos para mis webos";	
	}
	
	public String layEggs() {
		return "Yo pongo webos";	
	}
	
	public String teachFly() {
		return "Le puedo enseñar a mis hijos a volar";	
	}
	
	public String growingFeathers() {
		return "Me crecen plumas";	
	}


}
