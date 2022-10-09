package co.edu.unbosque.controller;

import java.util.Iterator;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	private CynusX1 planeta;
	private View vista;
	
	public Controller() {
		this.planeta = new CynusX1();
		this.vista = new View();
		funcionar();
	}
	public void funcionar() {
		try {
			int dato = vista.leerEntero("Digite un numero entero correspondiente a el personaje\n\n" 
					+ "1. KIRA\n"
					+ "2. ASTAR\n"
					+ "3. RENK\n"
					+ "4. SEBASTIAN CASTAÑEDA\n"
					+ "5. FINALIZAR");
			switch (dato) {
			case 1: {
				vista.mostrarInformacion("KIRA\n\n" + planeta.getKira().toString() + "\n" + planeta.getKira().accionar());
				break;
			}
			case 2: {
				vista.mostrarInformacion("ASTAR\n\n" + planeta.getAstar().toString() + "\n" + planeta.getAstar().accionar());
				break;
			}
			case 3: {
				vista.mostrarInformacion("RENK\n\n" + planeta.getRenk().toString() + "\n" + planeta.getRenk().accionar());
				break;
			}
			case 4: {
				vista.mostrarInformacion("SEBASTIAN CASTAÑEDA\n\n" + planeta.getSebas().toString() + "\n" + planeta.getSebas().accionar());
				break;
			}
			case 5: {
				finalizar();
				break;
			}
			default:
				vista.mostrarInformacion("Digite un numero correspondiente");
			}
			funcionar();
		} catch (Exception nullException) {
			vista.mostrarInformacion("Digite un numero correspondiente");
			funcionar();
		}
	}
	private void finalizar() {
		try {
			int dato = vista.leerEntero("¿Seguro que quieres salir del programa?\n\n" 
					+ "1. Salir\n"
					+ "2. Volver\n");
			if(dato == 1) {
				vista.mostrarInformacion("Gracias, vuelva pronto");
				System.exit(0);
			}else if(dato==2){
				funcionar();
			}
		} catch (Exception nullException) {
			vista.mostrarInformacion("Digite un numero valido");
			finalizar();
		}
		
	}
}
