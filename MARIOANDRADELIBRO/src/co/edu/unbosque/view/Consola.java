package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Consola {

	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDatoABC() {
		return JOptionPane.showInputDialog("Digita la primera letra de tu Nombre").toUpperCase();
	}
	public String pedirDatoMes() {
		return JOptionPane.showInputDialog("Digita tu mes de nacimiento").toUpperCase();
	}
	public int pedirDatoNum() {
		try {
			 Integer.parseInt(JOptionPane.showInputDialog("Digita el ultimo digito de tu numero telefonico"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Recuerda digitar solo un numero");
		}
		return Integer.parseInt(JOptionPane.showInputDialog("Digita el ultimo digito de tu numero telefonico"));
	}
	public void MostrarInfo(String m) {
		JOptionPane.showMessageDialog(null,m);
	}
	
}