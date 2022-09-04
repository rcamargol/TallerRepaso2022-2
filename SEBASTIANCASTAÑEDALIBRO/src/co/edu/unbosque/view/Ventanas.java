package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Ventanas {

	public Ventanas() {

	}

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public int pedirEntero(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	public String pedirTexto(String mensaje) {
		String texto = JOptionPane.showInputDialog(mensaje);
		return texto;
	}
}
