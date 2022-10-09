package co.edu.unbosque.model;

public abstract class Mortal extends Kublakan{
	public Mortal(int edad, double estatura, String color_ojos, boolean alma) {
		super(edad, estatura, color_ojos, alma);
	}
	public abstract String adquirirConocimientos();
	public abstract String tenerFamilia();
	public abstract String ejercerProfesion();
}
