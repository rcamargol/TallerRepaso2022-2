package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Datos" , JOptionPane.INFORMATION_MESSAGE);
	}
}
