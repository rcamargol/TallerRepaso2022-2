package co.edu.unbosque.model;

import co.edu.unbosque.view.View;

public class Desterrado extends Kublakan {

	public Desterrado(String nombre, double altura, boolean alma, String edad) {
		this.nombre = nombre;
		this.altura = altura;

		this.alma = alma;
		this.edad = edad;
	}

	public View view;

	public String habitar() {

		return this.nombre + ": Los desterrados como yo habitamos en el sur.";
	}

	public String sentir() {

		return "No podemos sentir a nadie más que a nosotros mismos.";

	}

	public String arrastrar() {

		return "Tenemos que arrastrarnos para movernos";

	}

	public boolean alma() {

		return this.alma;
	}

}
