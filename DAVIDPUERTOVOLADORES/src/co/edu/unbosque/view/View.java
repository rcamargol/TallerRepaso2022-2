package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	public int pedirDatoEntero(String pDato) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, pDato, "", JOptionPane.QUESTION_MESSAGE));
		return numero;
	}
	
	public void mostrarDato(String pDato) {
		JOptionPane.showMessageDialog(null, pDato, "", JOptionPane.INFORMATION_MESSAGE);
	}
}
