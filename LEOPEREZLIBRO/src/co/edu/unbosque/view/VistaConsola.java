package co.edu.unbosque.view;



import javax.swing.JOptionPane;

import co.edu.unbosque.model.Datos;

public class VistaConsola {
	

		public void showVista() {
			String apellido = JOptionPane.showInputDialog("Digite la primera letra de su primer apellido");
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite su mes de nacimiento"));
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el último dígito de su número"));
			
		}
		public void mostrarDatos(String pri, String seg, String ter) {
			
			JOptionPane.showMessageDialog(null, "El libro de tu vida es " + pri + " "+ seg + " "+ ter);
		 }
			
	    
	 }

