package co.edu.unbosque.model;

import co.edu.unbosque.view.View;

public class Heroe extends Kublakan {
	public View view;

	public Heroe(String nombre, double altura, boolean alma, String edad) {
		this.nombre = nombre;
		this.altura = altura;
		this.alma = alma;
		this.edad = edad;

	}

	public String volar() {

		return "y volamos por los aires";
	}

	public String crearFuego() {

		return "Creamos fuego con nuetras manos.";
	}

	public String detenerElTiempo() {

		return "Tambien podemos detener el tiempo.";
	}

	public String habitar() {

		return "Mi nombre es " + this.nombre + " y habito al norte del planeta Cynus.";
	}

	public String sentir() {

		return "Los heroes podemos sentirnos a si mismos y a seres de otros mundos.";
	}

	public boolean alma() {

		return this.alma;
	}

	public String altura() {

		return "Todos los heroes medimos 3 metros.";
	}

}
