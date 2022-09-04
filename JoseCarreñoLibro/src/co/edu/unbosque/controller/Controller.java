package co.edu.unbosque.controller;

import co.edu.unbosque.model.Libro;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Libro libro;
	private View view;
	String letraA;
	int mes;
	int ultimoDig;
	
	public Controller() {
		libro = new Libro();
		view = new View();
		funcionar();
	}
	
	public void funcionar() {
		letraA = view.leerDatoString("Ingrese la primera letra de su apellido");
		mes = view.leerDatoEntero("Ingrese el digito del mes de su nacimiento");
		ultimoDig = view.leerDatoEntero("Ingrese el ultimo digito de su numero celular");
		view.mostrarInformacion(libro.identificarApellido(letraA)+" "+libro.identificarMes(mes)+" "+libro.identificarNumero(ultimoDig));
	}
	
}
