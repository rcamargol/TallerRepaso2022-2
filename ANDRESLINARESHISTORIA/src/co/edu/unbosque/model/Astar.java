package co.edu.unbosque.model;

public class Astar extends Heroe{

	public Astar(int edad, double estatura, String color_ojos, boolean alma, String nombre) {
		super(edad, estatura, color_ojos, alma, nombre);
	}
	
	public String toString() {
		return "Nombre: "+ this.nombre
				+"\n"+"Estatura: "+this.estatura+"m";
	}
	
}
