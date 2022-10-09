package co.edu.unbosque.model;

public class Astar extends Heroe {
	
	public String nombre;
	public Astar(int edad, double estatura, String colorOjos, boolean alma, String nombre) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	public String descripcion() {
		if(super.crearFuego() || super.detenerTiempo() || super.volar() == true) {
			return "Mi nombre es "+this.nombre+" y soy un heroe";
		}else {
			return "No soy un heroe";
		}
	}
	public String caracteristicas() {
		return "Al ser un heroe me caracterizó por medir "+ super.estatura+" metros"+
			"\n ademas de poder volar, crear fuego y detener el tiempo";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
