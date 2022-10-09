package co.edu.unbosque.model;

public class Renk extends Desterrado {

	public String nombre;
	public Renk(int edad, double estatura, String colorOjos, boolean alma, String nombre) {
		super(edad, estatura, colorOjos, alma);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	public String descripcion() {
		if(super.edad <= 1500) {
			if(super.arrastrarce() == true) {
				return "Mi nombre es: "+this.nombre+" soy un desterrado";
			}
		}
		return "No soy un desterrado";
	}
	
	public String caracteristicas() {
		if(super.alma == false) {
			String a = "falsa";
			return "Al ser un desterrado mi alma es "+a+
					"\n ademas de que solo puedo arrastrarme y vivir 1500 años";
		}else {
			return "no soy un desterrado";
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
