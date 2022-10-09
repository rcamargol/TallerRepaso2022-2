package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public void mostrar(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	public String pedir(String dato) {
		String p = JOptionPane.showInputDialog(dato);
		
		return p;
	}
}
