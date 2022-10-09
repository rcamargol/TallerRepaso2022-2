package co.edu.unbosque.model;

public class Andres extends Mortal {
	
	public String nombre;
	public Andres(int edad, double estatura, String colorOjos, boolean alma, String nombre) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	public String descripcion() {
		if(super.adquirirConocimientos() || super.ejercerProfesion() || super.tenerFamilia() == true) {
			return "Mi nombre es: "+this.nombre+" soy un mortal";
		}else {
			return "No soy un mortal";
		}
	}
	public String caracteristicas() {
		return "Al ser un mortal me caracterizó por mis ojos color "+ super.colorOjos+
			"\n ademas de poder poder aprender, poder ejercer profesiones y tener familia";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
