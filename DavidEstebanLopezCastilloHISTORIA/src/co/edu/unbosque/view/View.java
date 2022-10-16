package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	private String[] personajes = { "Kira (H�roe)", "Astar (H�roe)", "Renk (Desterrado)", "David (Mortal)"};
 
	public String seleccionarPersonaje(String mensaje) {
		String msj =(String) JOptionPane.showInputDialog(null, "****SELECCIONE UN PERSONAJE****", mensaje, JOptionPane.QUESTION_MESSAGE,null,personajes,personajes[0]);
	    return msj;
	}
	
    public void mostrarInformacion(String mensaje) {
	   JOptionPane.showMessageDialog(null, mensaje, "Ventana Informaci�n", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
