package co.edu.unbosque.controller;

import co.edu.unbosque.model.ControlTower;
import co.edu.unbosque.view.View;

public class Controller {
	private ControlTower ct;
	private View v;

	public Controller() {
		this.ct = new ControlTower();
		this.v = new View();
		funcionar();
	}
	
	public void funcionar() {
		int opc = 0;
		String menu = "BIENVENID@, POR FAVOR DIGITA LA OPCIÓN QUE DESEAS\n" + 
				"1. Mostrar información de Superman\n" + 
				"2. Mostrar informacion de Bird\n" + 
				"3. Mostrar la información de Sea Plane\n" + 
				"4. Mostrar la información de Helicopter\n" + 
				"5. Salir\n";
		
		do {
			opc = v.pedirDatoEntero(menu);
			
			switch (opc) {
			case 1:
				mostrarDatosSuperman();
				break;
			case 2: 
				mostrarDatosBird();
				break;
			case 3:
				mostrarDatosSeaPlane();
				break;
			case 4:
				mostrarDatosHelicopter();
				break;
			case 5:
				v.mostrarDato("Hasta luego..");
				break;
			default: 
				v.mostrarDato("opcion incorrecta...");
				break;
			}
		} while (opc != 5);
	}
	
	public void mostrarDatosSuperman() {
		v.mostrarDato("mi superfuerza es: " + pasarBooleanAString(ct.getS().isSuperForce()) + "\n" 
				+ ct.getS().absorberEnergiaSolar() + "\n"
				+ ct.getS().eat() + "\n"
				+ ct.getS().fly() + "\n" 
				+ ct.getS().land() + "\n"
				+ ct.getS().LeapBuilding() + "\n"
				+ ct.getS().stopBullet() + "\n"
				+ ct.getS().takeOff() + "\n");
	}
	
	public void mostrarDatosBird() {
		v.mostrarDato("Mi pico es: " + pasarBooleanAString(ct.getB().isPico()) + "\n"
				+ ct.getB().eat() + "\n"
				+ ct.getB().fly() + "\n"
				+ ct.getB().land() + "\n"
				+ ct.getB().takeOff() + "\n"
				+ ct.getB().buildNest() + "\n"
				+ ct.getB().layEggs() + "\n"
				+ ct.getB().trinar() + "\n");
	}
	
	public void mostrarDatosHelicopter() {
		v.mostrarDato("Tengo " + ct.getH().getNumHelices() + " helices" + "\n"
				+ ct.getH().desplazarse() + "\n"
				+ ct.getH().encenderPropulsores() + "\n"
				+ ct.getH().fly() + "\n"
				+ ct.getH().land() + "\n"
				+ ct.getH().realizarVueloEstacionario() + "\n"
				+ ct.getH().takeOff() + "\n");
	}
	
	public void mostrarDatosSeaPlane() {
		v.mostrarDato("Tengo " + ct.getSp().getNumFlotadores() + " flotadores"
				+ ct.getSp().apagarIncendio() + "\n"
				+ ct.getSp().desplazarse() + "\n"
				+ ct.getSp().encenderPropulsores() + "\n"
				+ ct.getSp().land() + "\n"
				+ ct.getSp().takeOff() + "\n");
	}
	
	private String pasarBooleanAString(boolean pDato) {
		String booleanString;
		if (pDato == false) {
			booleanString = "fals@";
		}else {
			booleanString = "verdader@";
		}
		return booleanString;
	}

}
