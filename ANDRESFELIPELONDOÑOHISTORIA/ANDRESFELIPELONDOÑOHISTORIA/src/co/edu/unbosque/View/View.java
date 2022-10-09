package co.edu.unbosque.View;

import javax.swing.JOptionPane;

public class View {
	
	public int leerDatoEntero(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	
	public long leerDatoLong(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		long dato = Integer.parseInt(aux);
		return dato;
	}

	public String leerDatoString(String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}

	public double leerDatoDouble(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		double dato = Double.parseDouble(aux);
		return dato;
	}

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}

