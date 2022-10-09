package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarDatos(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
		
	public void mostrarPromedio(double nota) {
			JOptionPane.showMessageDialog(null, nota);
	}
	
	public String pedirDato(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, mensaje);
		return dato;
	}
	
	public int pedirDatoEntero(String msg) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
		return numero;
	}

}
