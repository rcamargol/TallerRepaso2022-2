package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrar(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public int pedirDatoEntero(String msg) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
		return numero;
	}
}
