package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public int pedirdatoEntero(String pMensaje) {
		int dato;
		dato = Integer.parseInt(JOptionPane.showInputDialog(null, pMensaje, "", JOptionPane.QUESTION_MESSAGE));
		return dato;
	}

	public void mostrarDato(String pDato) {
		JOptionPane.showMessageDialog(null, pDato, "", JOptionPane.INFORMATION_MESSAGE);
	}
}
