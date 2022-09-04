package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Datos;
import co.edu.unbosque.view.Ventanas;

public class Controller {
	private Datos datos;
	private Ventanas vista;
	private String resultado1, resultado2, resultado3;
	private char comillas;

	public Controller() {
		datos = new Datos();
		vista = new Ventanas();
		comillas = '"';
		funcionar();
	}

	public void funcionar() {
		apellido();
		meses();
		numeroTelefonico();
		resultado();
	}

	public void apellido() {
		String menu = "COMO SE LLAMARÍA EL LIBRO DE TU VIDA\n\n" + "\t(Digite la primera letra de tu primer apellido)";
		String opcion = vista.pedirTexto(menu);

		switch (opcion.toUpperCase()) {
		case "A": {
			resultado1 = datos.getLetras()[0];
			break;
		}
		case "B": {
			resultado1 = datos.getLetras()[1];
			break;
		}
		case "C": {
			resultado1 = datos.getLetras()[2];
			break;
		}
		case "D": {
			resultado1 = datos.getLetras()[3];
			break;
		}
		case "E": {
			resultado1 = datos.getLetras()[4];
			break;
		}
		case "F": {
			resultado1 = datos.getLetras()[5];
			break;
		}
		case "G": {
			resultado1 = datos.getLetras()[6];
			break;
		}
		case "H": {
			resultado1 = datos.getLetras()[7];
			break;
		}
		case "I": {
			resultado1 = datos.getLetras()[8];
			break;
		}
		case "J": {
			resultado1 = datos.getLetras()[9];
			break;
		}
		case "K": {
			resultado1 = datos.getLetras()[10];
			break;
		}
		case "L": {
			resultado1 = datos.getLetras()[11];
			break;
		}
		case "M": {
			resultado1 = datos.getLetras()[12];
			break;
		}
		case "N": {
			resultado1 = datos.getLetras()[13];
			break;
		}
		case "O": {
			resultado1 = datos.getLetras()[14];
			break;
		}
		case "P": {
			resultado1 = datos.getLetras()[15];
			break;
		}
		case "Q": {
			resultado1 = datos.getLetras()[16];
			break;
		}
		case "R": {
			resultado1 = datos.getLetras()[17];
			break;
		}
		case "S": {
			resultado1 = datos.getLetras()[18];
			break;
		}
		case "T": {
			resultado1 = datos.getLetras()[19];
			break;
		}
		case "U": {
			resultado1 = datos.getLetras()[20];
			break;
		}
		case "V": {
			resultado1 = datos.getLetras()[21];
			break;
		}
		case "W": {
			resultado1 = datos.getLetras()[22];
			break;
		}
		case "X": {
			resultado1 = datos.getLetras()[23];
			break;
		}
		case "Y": {
			resultado1 = datos.getLetras()[24];
			break;
		}
		case "Z": {
			resultado1 = datos.getLetras()[25];
			break;
		}
		default:
			vista.mostrarInformacion("Por favor, ingrese una letra valida.");
			apellido();
		}
	}

	public void meses() {
		String menu = "COMO SE LLAMARÍA EL LIBRO DE TU VIDA\n\n" + "\t(Digite el mes de nacimiento.)";
		String opcion = vista.pedirTexto(menu);

		switch (opcion.toUpperCase()) {
		case "ENERO": {
			resultado2 = datos.getMeses()[0];
			break;
		}
		case "FEBRERO": {
			resultado2 = datos.getMeses()[1];
			break;
		}
		case "MARZO": {
			resultado2 = datos.getMeses()[2];
			break;
		}
		case "ABRIL": {
			resultado2 = datos.getMeses()[3];
			break;
		}
		case "MAYO": {
			resultado2 = datos.getMeses()[4];
			break;
		}
		case "JUNIO": {
			resultado2 = datos.getMeses()[5];
			break;
		}
		case "JULIO": {
			resultado2 = datos.getMeses()[6];
			break;
		}
		case "AGOSTO": {
			resultado2 = datos.getMeses()[7];
			break;
		}
		case "SEPTIEMBRE": {
			resultado2 = datos.getMeses()[8];
			break;
		}
		case "OCTUBRE": {
			resultado2 = datos.getMeses()[9];
			break;
		}
		case "NOVIEMBRE": {
			resultado2 = datos.getMeses()[10];
			break;
		}
		case "DICIEMBRE": {
			resultado2 = datos.getMeses()[11];
			break;
		}
		default:
			vista.mostrarInformacion("Por favor, ingrese una mes valido.");
			meses();
		}
	}

	public void numeroTelefonico() {
		String menu = "COMO SE LLMARÍA EL LIBRO DE TU VIDA\n\n" + "\t(Digite el ultimo digito de su numero telefonico)";
		int opcion = vista.pedirEntero(menu);

		switch (opcion) {
		case 0: {
			resultado3 = datos.getNumero()[0];
			break;
		}
		case 1: {
			resultado3 = datos.getNumero()[1];
			break;
		}
		case 2: {
			resultado3 = datos.getNumero()[2];
			break;
		}
		case 3: {
			resultado3 = datos.getNumero()[3];
			break;
		}
		case 4: {
			resultado3 = datos.getNumero()[4];
			break;
		}
		case 5: {
			resultado3 = datos.getNumero()[5];
			break;
		}
		case 6: {
			resultado3 = datos.getNumero()[6];
			break;
		}
		case 7: {
			resultado3 = datos.getNumero()[7];
			break;
		}
		case 8: {
			resultado3 = datos.getNumero()[8];
			break;
		}
		case 9: {
			resultado3 = datos.getNumero()[9];
			break;
		}
		default:
			vista.mostrarInformacion("Por favor, ingrese un numero valido.");
			numeroTelefonico();
		}
	}

	public void resultado() {
		vista.mostrarInformacion("El nombre de el libro de tu vida es:\n" + comillas + resultado1 + " " + resultado2
				+ " " + resultado3 + comillas);
		funcionar();
	}
}
