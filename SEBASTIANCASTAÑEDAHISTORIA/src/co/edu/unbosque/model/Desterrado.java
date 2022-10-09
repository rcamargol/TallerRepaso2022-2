package co.edu.unbosque.model;

public abstract class Desterrado extends Kublakan{
	protected int vivir;
	public Desterrado(int edad, double estatura, String color_ojos, boolean alma,int vivir) {
		super(edad, estatura, color_ojos, alma);
		this.vivir = vivir;
	}
	public abstract String arrastar();
}
