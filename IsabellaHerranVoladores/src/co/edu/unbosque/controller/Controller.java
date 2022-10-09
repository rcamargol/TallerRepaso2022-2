package co.edu.unbosque.controller;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;


public class Controller {
	
	private Voladores vl;
	private View v;
	
	public Controller() {
		vl = new Voladores();
		v = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		String menu = ".: Seleccion de Volador :." + "\n"
					+ "\t1. Pajaro" + "\n" + "\t2. Helicoptero" + "\n" + "\t3. Hidroavion" + "\n" + "\t4. Superman" + "\n" + "\t5. Salir" + "\n"
					+ "Digita la opcion correspondiante al volador del que quieres ver la descripcion.";
		
		int opcion = (int) v.leerDatoEntero(menu);
		
		switch (opcion) {
		case 1:
			v.mostrarInformacion("Los pajaros como todos los animales pueden comer y tambien como todos los voladores" + "\n"
							   + "pueden despegar, volar y aterrizar, pero ademas de esto pueden construir sus propios nidos" + "\n"
							   + "y poner huevos para reproducirse. Se caracterizan por tener en promedio 5 años de vida y plumas amarillas.");
			break;
		case 2:
			v.mostrarInformacion("Los helicopteros como todos los vehiculos pueden transportar objetos y tambien como todos los voladores" + "\n"
							   + "pueden despegar, volar y aterrizar, pero ademas de esto, como todos los aviones su combustible es el petroleo" + "\n"
							   + "y en su caso particular, sus alas suelen medir 3 metros, y su longitud promedio es de unos 15 metros.");
			break;
		case 3:
			v.mostrarInformacion("Los hidroaviones como todos los vehiculos pueden transportar objetos y tambien como todos los voladores" + "\n"
							   + "pueden despegar, volar y aterrizar, pero ademas de esto, como todos los aviones su combustible es el petroleo" + "\n"
							   + "y en su caso particular, sus alas suelen medir 5 metros, y la superficie suele estar conformada de flotadores.");
			break;
		case 4:
			v.mostrarInformacion("Superman como todo animal puede comer y tiene aproximadamente 50 años y tambien como todo kryptoniano" + "\n"
							   + "utiliza ropa resistente, que en su caso es un traje con capa de color rojo y azul principalmente," + "\n"
							   + "ademas de esto, su caracteristica especial es que puede lanzar un rayo laser de color rojo por medio de sus ojos.");
			break;
		case 5:
			v.mostrarInformacion("Que tengas un buen dia.");
			break;
		}
		if(opcion != 5) {
			funcionar();
		}
	}
		
		
}

