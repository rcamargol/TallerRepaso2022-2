package co.edu.unbosque.controller;

import co.edu.unbosque.model.Desterrado;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Mortal;
import co.edu.unbosque.view.View;

public class Controller {
	private View view;

	private Heroe kira;
	private Heroe astar;
	private Mortal isabella;
	private Desterrado renk;

	public Controller() {
		String warnig = "Vuelve a intentarlo.";
		view = new View();

		try {
			kira = new Heroe("Kira", 3, true, " 40 años");
		} catch (Exception e) {
			// TODO: handle exception
			view.smd(warnig);
		}

		try {
			astar = new Heroe("Astar", 3, true, "33 años");
		} catch (Exception e) {
			// TODO: handle exception
			view.smd(warnig);
		}

		try {
			isabella = new Mortal("Isabella", 1.65, "Ojos violetas", true, "19 años");
		} catch (Exception e) {
			// TODO: handle exception
			view.smd(warnig);
		}

		try {
			renk = new Desterrado("Renk", 1.50, false, "1500 años ");
		} catch (Exception e) {
			// TODO: handle exception
			view.smd(warnig);
		}

		try {
			// Ventana de kira
			view.smd(kira.habitar() + "\n" + kira.sentir() + "\n" + kira.detenerElTiempo() + "\n" + kira.crearFuego()
					+ "\n" + kira.volar() + "\n" + "Mi alma es: " + kira.alma() + "\n" + kira.altura());
			// Ventana de astar
			view.smd(
					astar.habitar() + "\n" + astar.sentir() + "\n" + astar.detenerElTiempo() + "\n" + astar.crearFuego()
							+ "\n" + astar.volar() + "\n" + "Mi alma es: " + astar.alma() + "\n" + astar.altura());
			// Ventana de isabella
			view.smd(isabella.habitar() + "\n" + isabella.sentir() + "\n" + isabella.profesion() + "\n"
					+ isabella.tenerFamilia() + "\n" + isabella.aprender() + "\n" + "Mi alma es: " + isabella.alma()
					+ "\n" + isabella.colorOjos());
			// Ventana de renk
			view.smd(renk.habitar() + "\n" + renk.sentir() + "\n" + "Mi alma es: " + renk.alma() + "\n"
					+ renk.arrastrar());
		} catch (Exception e) {
			// TODO: handle exception
			view.smd(warnig);
		}

	}

}
