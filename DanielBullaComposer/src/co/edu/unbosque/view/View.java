package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public View(){}
	
	public String leerCaracteres(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		String dato = aux;
		return dato;
		
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
