package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	public View(){
		
	}
	
	public static int leerDatoEntero(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato= Integer.parseInt(aux);
		return dato;
		
	}
	
	public static void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}


