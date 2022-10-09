package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarMensaje (String dato ) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public int pedirDatoEntero() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Numero:"));
		return numero;
	}
}
