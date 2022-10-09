package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CynuxX1;
import co.edu.unbosque.model.ExcepcionPorAlmaDeRenk;
import co.edu.unbosque.model.ExcepcionPorEdadDeRenk;
import co.edu.unbosque.view.View;

public class Controller {

	private CynuxX1 p;
	private View v;

	public Controller() {
		p = new CynuxX1();
		v = new View();
		iniciar();
	}

	public void iniciar() {

		String[] personajes = {"Kira", "Astar", "Renk", "Diana" };
		Object opcion = JOptionPane.showInputDialog(null, "Selecciona el personaje del cual quiere ver los datos.", "",
				JOptionPane.QUESTION_MESSAGE, null, personajes, personajes[0]);

		if (opcion == "Kira") {

			v.mostrarResultado(
					"Ser: Heroe"
					+ "\nNombre: Kira"
					+ "\nTiempo con fuego en manos: " + p.getKira().getTiempoConFuego() + " minutos."
					+ "\nEstatura: " + p.getKira().getEstatura() + " metros."
					+ "\nConocida porque: \n"
					+ p.getKira().luchar() + "\n"
					+ p.getKira().volar());

		} else if (opcion == "Astar") {

			v.mostrarResultado(
					"Ser: Heroe"
					+ "\nNombre: Astar"
					+ "\nVelocidad de vuelo: " + p.getAstar().getVelocidadDeVuelo() + " km/h."
					+ "\nEstatura: " + p.getAstar().getEstatura()+ " metros."
					+ "\nConocido porque: \n"
					+ p.getAstar().defender() + "\n"
					+ p.getAstar().detenerElTiempo());

		} else if (opcion == "Renk") {

			try {
				try {
					v.mostrarResultado(
							"Ser: Desterrado "
							+ "\nNombre: Renk "
							+ "\nNivel de tristeza: " + p.getRenk().getNivelDeTristeza()
							+ "\nEdad: " + p.VerificarEdadDeRenk(p.getRenk().getEdad()) + " años."
							+ "\nAlma: " + p.pasarAlmaBooleanAString(p.getRenk().getAlma())
							+ "\nConocido porque: \n"
							+ p.getRenk().arrastrar() + "\n"
							+ p.getRenk().llorar());
				} catch (ExcepcionPorEdadDeRenk e) {
					JOptionPane.showMessageDialog(null, "Un desterrado no puede tener mas de 1500 años, en este caso Renk ya fallecio.");
					e.printStackTrace();
				}
			} catch (ExcepcionPorAlmaDeRenk e) {
				JOptionPane.showMessageDialog(null, "Renk debe tener alma falsa porque es un desterrado.");
				e.printStackTrace();
			}

		} else if (opcion == "Diana") {

			v.mostrarResultado(
					"Ser: Mortal"
					+ "\nNombre: Diana"
					+ "\n" + "Color de ojos: " + p.getDiana().getColorDeOjos()
					+ "\nEdad: " + p.getDiana().getEdad() + " años."
					+ "\nConocida porque: \n"
					+ p.getDiana().ejercerProfesion() + "\n" + p.getDiana().amar());
		}
	}
}
