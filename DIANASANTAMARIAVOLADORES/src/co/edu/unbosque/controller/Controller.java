package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Diversity;
import co.edu.unbosque.view.View;

public class Controller {

	private View v;
	private Diversity d;

	public Controller() {
		this.v = new View();
		this.d = new Diversity();
		iniciar();
	}

	public void iniciar() {
		String[] menu = { "", "Hidroavion", "Helicoptero", "Ave", "Superman" };
		Object opcion = JOptionPane.showInputDialog(null, "ï¿De cual elemento desea ver la informacion?", null,
				JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
		if (opcion == "") {
			v.mostrarMensaje("No es una opcion valida");
		} else if (opcion == "Hidroavion") {
			v.mostrarMensaje("HIDROAVION \n" + d.getSeaPlane().takeOff() +
					"\n" + d.getSeaPlane().land() + 
					"\n" + d.getSeaPlane().fly() +
					"\n" + d.getSeaPlane().turnOnEngine() + 
					"\n" + d.getSeaPlane().turnOffEngine() +
					"\n" + d.getSeaPlane().transport() + 
					"\n" + d.getSeaPlane().stayInWater() +
					"\n" + "Tiene flotadores: "+d.getSeaPlane().isFloats());
		} else if (opcion == "Helicoptero") {
			v.mostrarMensaje("HELICOPTERO \n" + d.getHelicopter().takeOff() + 
					"\n" + d.getHelicopter().land()+
					"\n" + d.getHelicopter().fly() + 
					"\n" + d.getHelicopter().turnOnEngine()+
					"\n" + d.getHelicopter().turnOffEngine() + 
					"\n" + d.getHelicopter().transport()+
					"\n" + d.getHelicopter().flyVertically() +
					"\n" + "El numero de helices es: ");
		} else if (opcion == "Ave") {
			v.mostrarMensaje("AVE \n" + d.getBird().takeOff() + 
					"\n" + d.getBird().land() +
					"\n" + d.getBird().fly() + 
					"\n" + d.getBird().eat() +
					"\n" + d.getBird().sleep() + 
					"\n" + d.getBird().buildNest() +
					"\n" + d.getBird().layEggs() +
					"\n" + "El color de sus plumas es: " + d.getBird().getFeatherColor());
		} else if (opcion == "Superman") {
			v.mostrarMensaje(
					"SUPERMAN \n" + d.getSuperman().takeOff() +
					"\n" + d.getSuperman().land() +
					"\n" + d.getSuperman().fly() +
					"\n" + d.getSuperman().eat() +
					"\n" + d.getSuperman().sleep() +
					"\n" + d.getSuperman().fightingEvil() +
					"\n" + d.getSuperman().leapBuilding() +
					"\n" + d.getSuperman().StopBullet() +
					"\n" + d.getSuperman().seeWithXRays() +
					"\n" + "Trabaja como: " + d.getSuperman().getOccupation());
		}
	}
}
