package co.edu.unbosque.model;

public class Mortal extends KublaKan {

	public Mortal(int edad, double estatura, String colorOjos, boolean alma) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean adquirirConocimientos() {
		return true;
	}
	
	protected boolean tenerFamilia() {
		return true;
	}
	
	protected boolean ejercerProfesion() {
		return true;
	}
	
}
