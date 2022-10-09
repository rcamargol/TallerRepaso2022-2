package co.edu.unbosque.model;

public class Andres extends Mortal{

	public Andres(int edad, double estatura, String color_ojos, boolean alma, String nombre) {
		super(edad, estatura, color_ojos, alma, nombre);
	}

	public String toString() {
		return "Nombre: "+ this.nombre
				+"\n"+"Estatura: "+this.estatura+"m"
				+"\n"+"Edad: "+this.edad
				+"\n"+"Color de ojos: "+this.color_ojos
				+"\n"+"Alma: "+this.alma;
	}
}
