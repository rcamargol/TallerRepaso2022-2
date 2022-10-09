package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {



	public int leerdatoEntero(String mensaje) {
		String a = JOptionPane.showInputDialog(mensaje);
		int da = Integer.parseInt(a);
		return da;
		// TODO Auto-generated method stub

	}
	public void mostrarInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
