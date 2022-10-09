package co.edu.unbosque.model;

import co.edu.unbosque.view.View;

public class Mortal extends Kublakan {

	public View view;

	public Mortal(String nombre, double altura, String colorOjos, boolean alma, String edad) {
		this.nombre = nombre;
		this.altura = altura;
		this.alma = alma;
		this.colorDeOjos = colorOjos;
		this.edad = edad;
	}

	public String aprender() {
		return "";
	}

	public String adquirirConocimientos() {

		return "Adquirimos conocimientos nuevos/Aprendemos";
	}

	public String tenerFamilia() {

		return " y podemos tener familias";

	}

	public String profesion() {

		return " tenemos profesiones utiles para cynus";
	}

	public String habitar() {

		return "Mi nombre es " + this.nombre + " y Habitó en el este del pais ";
	}

	public String sentir() {

		return "Los mortales solo podemos sentir a otros mortales.";

	}

	public boolean alma() {

		return this.alma;
	}

	public String colorOjos() {

		return "Todos los mortales tenemos los ojos violetas.";
	}

}
