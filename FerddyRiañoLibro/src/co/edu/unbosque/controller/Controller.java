package co.edu.unbosque.controller;

import co.edu.unbosque.model.Letra;
import co.edu.unbosque.model.Mes;
import co.edu.unbosque.model.Telefono;
import co.edu.unbosque.view.VistaVentana;

public class Controller {

	private Letra letraapellido;
	private Mes mesnacimiento;
	private Telefono digitotelefono;
	private VistaVentana vista;
	
	public Controller() {
		letraapellido = new Letra();
		mesnacimiento = new Mes();
		digitotelefono = new Telefono();
		vista = new VistaVentana();
		funcionar();
	}
	
	public void funcionar() {
		int aux1 = vista.leerDatoEntero("Ingresa la primera letra de tu primer apellido con el numero que le corresponda:" + "\n" +
										"A = 1" + "\n" +
										"B = 2" + "\n" +
										"C = 3" + "\n" +
										"D = 4" + "\n" +
										"E = 5" + "\n" +
										"F = 6" + "\n" +
										"G = 7" + "\n" +
										"H = 8" + "\n" +
										"I = 9" + "\n" +
										"J = 10" + "\n" +
										"K = 11" + "\n" +
										"L = 12" + "\n" +
										"M = 13" + "\n" +
										"N = 14" + "\n" +
										"O = 15" + "\n" +
										"P = 16" + "\n" +
										"Q = 17" + "\n" +
										"R = 18" + "\n" +
										"S = 19" + "\n" +
										"T = 20" + "\n" +
										"U = 21" + "\n" +
										"V = 22" + "\n" +
										"W = 23" + "\n" +
										"X = 24" + "\n" +
										"Y = 25" + "\n" +
										"Z = 26");
		letraapellido.setLetra(aux1);
		
		int aux2 = vista.leerDatoEntero("Ingresa el numero del mes en el que naciste");
		mesnacimiento.setMes(aux2);
		
		int aux3 = vista.leerDatoEntero("Ingresa el ultimo digito de tu numero telefonico");
		digitotelefono.setTelefono(aux3);
		
		if(letraapellido.letraApellido() == "" || mesnacimiento.mesNacimiento() == "" || digitotelefono.digitoTelefono() == "") {
			vista.mostrarInformacion("Uno de los datos que se ingresaron no es valido, por favor intentelo de nuevo.");
		}else {
			vista.mostrarInformacion("El nombre del libro de tu vida es:" + "\n" +
									letraapellido.letraApellido() + mesnacimiento.mesNacimiento() + digitotelefono.digitoTelefono());
		}
	}
}
