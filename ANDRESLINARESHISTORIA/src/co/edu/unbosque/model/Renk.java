package co.edu.unbosque.model;

public class Renk extends Desterrado{

	public Renk(int edad, double estatura, String color_ojos, boolean alma, String nombre) {
		super(edad, estatura, color_ojos, alma, nombre);
	}
	
	public String toString() {
		return "Nombre: "+ this.nombre
				+"\n"+"Edad max: "+this.edad
				+"\n"+"Alma: "+this.alma;
	}

}
