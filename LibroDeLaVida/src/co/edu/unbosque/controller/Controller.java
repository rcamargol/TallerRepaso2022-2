package co.edu.unbosque.controller;

import co.edu.unbosque.view.*;
import co.edu.unbosque.model.*;

public class Controller {
	
	private Libro lib;
	private GUINac gui;
	
	public Controller() {
		this.gui = new GUINac();
		this.lib = new Libro(null, null, null);
		funcionar ();
	}
	
	public void funcionar() {
		String showAp = finalApel();
		String showMes = finalMes ();
		String showTel = finalTel();
		
		gui.mostrarResult(showAp, showMes, showTel);
	}
	
	public String finalApel () {
		String inputApel = gui.inputApellido();
		String finApel = null;
		if (inputApel.equalsIgnoreCase("A")) {
			finApel = "La verdadera";
		} else if (inputApel.equalsIgnoreCase("B")) {
			finApel = "La excitante";
		} else if (inputApel.equalsIgnoreCase("C")) {
			finApel = "La horripilante";
		} else if (inputApel.equalsIgnoreCase("D")) {
			finApel = "La alegre";
		} else if (inputApel.equalsIgnoreCase("E")) {
			finApel = "La fatal";
		} else if (inputApel.equalsIgnoreCase("F")) {
			finApel = "La apasionante";
		} else if (inputApel.equalsIgnoreCase("G")) {
			finApel = "La trágica";
		} else if (inputApel.equalsIgnoreCase("H")) {
			finApel = "La sangrienta";
		} else if (inputApel.equalsIgnoreCase("I")) {
			finApel = "La triste";
		} else if (inputApel.equalsIgnoreCase("J")) {
			finApel = "La gran";
		} else if (inputApel.equalsIgnoreCase("K")) {
			finApel = "La penosa";
		} else if (inputApel.equalsIgnoreCase("L")) {
			finApel = "La triste";
		} else if (inputApel.equalsIgnoreCase("M")) {
			finApel = "La desastrosa";
		} else if (inputApel.equalsIgnoreCase("N")) {
			finApel = "La hermosa";
		} else if (inputApel.equalsIgnoreCase("O")) {
			finApel = "La oscura";
		} else if (inputApel.equalsIgnoreCase("P")) {
			finApel = "La gloriosa";
		} else if (inputApel.equalsIgnoreCase("Q")) {
			finApel = "La infeliz";
		} else if (inputApel.equalsIgnoreCase("R")) {
			finApel = "La emocionante";
		} else if (inputApel.equalsIgnoreCase("S")) {
			finApel = "La fantástica";
		} else if (inputApel.equalsIgnoreCase("T")) {
			finApel = "La terrorífica";
		} else if (inputApel.equalsIgnoreCase("U")) {
			finApel = "La aburrida";
		} else if (inputApel.equalsIgnoreCase("V")) {
			finApel = "La increíble";
		} else if (inputApel.equalsIgnoreCase("W")) {
			finApel = "La desgraciada";
		} else if (inputApel.equalsIgnoreCase("X")) {
			finApel = "La lamentable";
		} else if (inputApel.equalsIgnoreCase("Y")) {
			finApel = "La cómica";
		} else if (inputApel.equalsIgnoreCase("Z")) {
			finApel = "La miserable";
		} else {
			gui.errorMensaje();
			finalApel();
		}
		
		lib.setApellido(finApel);
		return finApel;
	}
	
	public String finalMes () {
		String inputMes = gui.inputMes();
		String finMes = null;
		if (inputMes.equalsIgnoreCase("Enero")) {
			finMes = "hazaña";
		} else if (inputMes.equalsIgnoreCase("Febrero")) {
			finMes = "reencarnación";
		} else if (inputMes.equalsIgnoreCase("Marzo")) {
			finMes = "batalla";
		} else if (inputMes.equalsIgnoreCase("Abril")) {
			finMes = "existencia";
		} else if (inputMes.equalsIgnoreCase("Mayo")) {
			finMes = "muerte";
		} else if (inputMes.equalsIgnoreCase("Junio")) {
			finMes = "misión";
		} else if (inputMes.equalsIgnoreCase("Julio")) {
			finMes = "venganza";
		} else if (inputMes.equalsIgnoreCase("Agosto")) {
			finMes = "anécdota";
		} else if (inputMes.equalsIgnoreCase("Septiembre")) {
			finMes = "vida";
		} else if (inputMes.equalsIgnoreCase("Octubre")) {
			finMes = "leyenda";
		} else if (inputMes.equalsIgnoreCase("Noviembre")) {
			finMes = "historia";
		} else if (inputMes.equalsIgnoreCase("Diciembre")) {
			finMes = "biografía";
		} else {
			gui.errorMensaje();
			finalMes();
		}
		
		lib.setMes(finMes);
		return finMes;
	}
	
	public String finalTel() {
		int inputTel = gui.inputTel();
		String finTel = null;
		if (inputTel == 0) {
			finTel = "de un bipolar";
		} else if (inputTel == 1) {
			finTel = "de un asesino";
		} else if (inputTel == 2) {
			finTel = "de un loco";
		} else if (inputTel == 3) {
			finTel = "de un adicto a los memes";
		} else if (inputTel == 4) {
			finTel = "de un soñador";
		} else if (inputTel == 5) {
			finTel = "de un genio";
		} else if (inputTel == 6) {
			finTel = "de un símbolo sexual";
		} else if (inputTel == 7) {
			finTel = "de un alcoholíco";
		} else if (inputTel == 8) {
			finTel = "de un guerrero";
		} else if (inputTel == 9) {
			finTel = "de un aventurero";
		}else {
			gui.errorMensaje();
			finalTel();
		}
		
		lib.setTelefono(finTel);
		return finTel;
	}
	
}
