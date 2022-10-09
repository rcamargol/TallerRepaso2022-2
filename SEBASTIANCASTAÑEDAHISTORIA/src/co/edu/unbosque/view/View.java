package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public View() {
		
	}
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public int leerEntero(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
		return dato;
	}
}
