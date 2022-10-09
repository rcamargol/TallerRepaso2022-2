package co.edu.unbosque.model;

public class NoPuedeVolar extends Exception{

	public NoPuedeVolar(String msg) {
		msg = "No puede volar porque exede el limite de velocidad";
	}
	
}
