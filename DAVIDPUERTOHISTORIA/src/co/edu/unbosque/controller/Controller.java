package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	private CynusX1 c;
	private View v;
	private String menu;
	private int opc;
	
	public Controller() {
		this.c =  new CynusX1();
		this.v = new View();
		iniciar();
	}
	
	private void iniciar() {
		menu = "BIENVENID@, POR FAVOR DIGITA LA OPCIÓN QUE DESEAS\n" + 
				"1. Mostrar información de Kira\n" + 
				"2. Mostrar informacion de Astar\n" + 
				"3. Mostrar la información de Renk\n" + 
				"4. Mostrar la información de David Puerto\n" + 
				"5. Salir\n";
		
		do {
			opc = v.pedirdatoEntero(menu);
			
			switch (opc) {
			case 1: 
				mostrarDatosKira();
				break;
			case 2:
				mostrarDatosAstar();
				break;
			case 3:
				try {
					mostrarDatosRenk();
				} catch (ExcepcionEdad e) {
					v.mostrarDato("La edad no puede ser superior a 1500 años");
				} catch (ExcepcionAlma e) {
					v.mostrarDato("El alma no puede ser verdadera");
				}
				break;
			case 4: 
				mostrarDatosDavid();
				break;
			case 5:
				v.mostrarDato("Hasta luego...");
				break;
			default:
				v.mostrarDato("Opción inválida...");
			}
		} while (opc != 5);
	}
	
	private void mostrarDatosKira() {
		v.mostrarDato("Mi color de ojos es: " + c.getKira().getColorOjos() + "\n" +
		"Mi estatura es: " + c.getKira().getEstatura() + " metros" + "\n" + 
		c.getKira().crearFuego() + "\n" + 
		c.getKira().detenerTiempo());
	}
	
	private void mostrarDatosAstar() {
		v.mostrarDato("Mi color de ojos es: " + c.getAstar().getColorOjos() + "\n" +
		"Mi estatura es: " + c.getAstar().getEstatura() + " metros" + "\n" + 
		c.getAstar().crearFuego() + "\n" + 
		c.getAstar().detenerTiempo());
	}
	
	private void mostrarDatosRenk() throws ExcepcionEdad, ExcepcionAlma{
		if (c.getRenk().getEdad() > 1500) {
			throw new ExcepcionEdad("La edad es mayor a 1500");
		}if (c.getRenk().getAlma() == true) {
			throw new ExcepcionAlma("El alma no puede ser verdadera");
		}else {
			v.mostrarDato("Mi edad es: " + c.getRenk().getEdad() + " años" + "\n" +
			"Mi alma es " + pasarAlmaAString(c.getRenk().getAlma()) + "\n" +
			c.getRenk().arrastrarse());
		}
	}
	
	private void mostrarDatosDavid() {
		v.mostrarDato("Mi color de ojos es: " + c.getDavid().getColorOjos() + "\n" +
		"Mi edad es: " + c.getDavid().getEdad() + " años" + "\n" +  
		c.getDavid().ejercerPorfesion() + "\n" + 
		c.getDavid().tenerFamilia());
	}
	
	private String pasarAlmaAString(boolean alma) {
		String almaS;
		if (alma == false) {
			almaS = "falsa";
		}else {
			almaS = "verdadera";
		}
		return almaS;
	}
}
