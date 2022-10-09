package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	String[] voladores = {"Vehiculo aereo","Pajaro","Superman"};
	String[] vehiculoAereo = {"Mostrar todos","Hidroavion","Helicoptero"};
		
		public void mostrarMensaje(String dato) {
			JOptionPane.showMessageDialog(null, dato);
		}
		
		public String pedirDatoMenu(String mensaje) {
			String dato ="";
			dato = (String) JOptionPane.showInputDialog(null, "Selector de voladores", mensaje, JOptionPane.QUESTION_MESSAGE,null, voladores,voladores[0]);
			return dato;
		}
		
		public String pedirDatoMenuVehiculoAereo(String mensaje) {
			String dato ="";
			dato = (String) JOptionPane.showInputDialog(null, "Selector de heroes", mensaje, JOptionPane.QUESTION_MESSAGE,null,vehiculoAereo,vehiculoAereo[0]);
			return dato;
		}
}
