package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	String [] a = {"Manuel", "Kira", "Renk", "Astar"};
	
	public String generarLista() {
		   String opcion = (String) JOptionPane.showInputDialog(null,"Elegi un personaje", "Cuestionario",JOptionPane.QUESTION_MESSAGE,null,a, a[0]);
		   return opcion;
	   }
	
	public void mostrarResultados(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
