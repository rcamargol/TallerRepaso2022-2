package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	String [] objetos = {"Superman", "Hidroavion", "Helicoptero", "Aves"};
	public void mostrarDatos(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public String generarLista() {
		   String opcion = (String) JOptionPane.showInputDialog(null,"Elegi algo", "Che boludo",JOptionPane.QUESTION_MESSAGE,null,objetos, objetos[0]);
		   return opcion;
	   }
}
