package co.edu.unbosque.View;

import javax.swing.JOptionPane;

public class View {

	
	
	public void mostInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public static String LeerNombre(String mensaje) {
		String e= JOptionPane.showInputDialog(mensaje);
		String d= e;
		return d;
		// TODO Auto-generated method stub
		
		
	}
	
	
	

}
