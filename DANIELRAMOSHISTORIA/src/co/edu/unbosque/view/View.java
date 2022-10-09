package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
String[] descendientes = {"Heroes","Mortales","Desterrados"};
String[] heroes = {"Mostrar todos","Kira","Astar"};
	
	public void mostrarMensaje(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDatoMenu(String mensaje) {
		String dato ="";
		dato = (String) JOptionPane.showInputDialog(null, "Selector de descendientes", mensaje, JOptionPane.QUESTION_MESSAGE,null,descendientes,descendientes[0]);
		return dato;
	}
	
	public String pedirDatoMenuHeroes(String mensaje) {
		String dato ="";
		dato = (String) JOptionPane.showInputDialog(null, "Selector de heroes", mensaje, JOptionPane.QUESTION_MESSAGE,null,heroes,heroes[0]);
		return dato;
	}

}
