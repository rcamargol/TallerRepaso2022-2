package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	String[] personajes = {"Superman", "Helicoptero", "Pajaro", "Hidroavion"};
	
	public String SeleccionarMenu(String mensaje) {
		String dato ="";
		dato = (String) JOptionPane.showInputDialog(null, "Seleccione el objeto", 
				              mensaje, JOptionPane.QUESTION_MESSAGE,null,personajes,personajes[0]);
		return dato;
	}
	
	public void mostrarResultados(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
