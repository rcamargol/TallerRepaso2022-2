package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public void mostrarMensaje(String mensaje, String titulo){
		
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		
	}
	public String recibirDatos(String mensaje) {
		
	String res = JOptionPane.showInputDialog(mensaje);
	return res;
		
	}
	
}
