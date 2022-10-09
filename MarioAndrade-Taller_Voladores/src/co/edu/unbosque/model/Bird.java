package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	private String pico;
	
	public String despegue() {
		return " Las aves antes de volar se preparan para despegar, ";
	}
	public String aterrizar() {
		return " despues de volar por tanto timpo las aves aterizan para descansar, ";
	}
	public String volar() {
	return " estas son capases de recorrer distancias largas. ";
	}
	public String construirNido() {
		return " Cuando encuentran paraja comienzan hacer un nido donde van a criar sus crias ";
	}
	public String ponerHuevos() {
		return " y colocan huevos para reproducirse. ";
	}
	public String comer() {
	return "Esta aves cazan para poder comer y sobrevivir ante la descases de aliento .";
 }
}