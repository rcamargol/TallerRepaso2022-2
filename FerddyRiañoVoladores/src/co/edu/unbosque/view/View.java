package co.edu.unbosque.view;


import javax.swing.JOptionPane;

public class View {
	
	public View(){
	
	}
	
	public String leerCaracteres(String mensaje) {
		String aux2 = JOptionPane.showInputDialog(mensaje);
		String dato2 = aux2;
		return dato2;
		
	}
	
	public int leerDatoEntero(String mensaje) {
		String aux3 = JOptionPane.showInputDialog(mensaje);
		int dato3 = Integer.parseInt(aux3);
		return dato3;
		
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}