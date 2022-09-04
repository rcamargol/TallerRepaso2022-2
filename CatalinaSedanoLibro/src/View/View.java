package View;

import javax.swing.JOptionPane;

public class View {
	public int leerEntero(String mensaje) {
		try {
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
		}
	return Integer.parseInt(JOptionPane.showInputDialog(mensaje).toUpperCase());
		
	}
	public String leerString(String mensaje) {
	return JOptionPane.showInputDialog(mensaje).toUpperCase();
	}

	public void mostrarInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}