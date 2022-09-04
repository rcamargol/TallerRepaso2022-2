package co.edu.unbosque.view;



import javax.swing.JOptionPane;

public class VerVentanas {

	public VerVentanas () {
		
	}
	
	public int leerdatoEntero (String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	
	public String leerDato (String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje , "Ventana de Resultados", JOptionPane.INFORMATION_MESSAGE);
	}

}
