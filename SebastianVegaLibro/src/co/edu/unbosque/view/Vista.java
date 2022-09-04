package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista {
	
	String respuesta;
	int resultado;
	
public String Recibirdatos(String mensaje){
		
		respuesta = JOptionPane.showInputDialog(null, mensaje);
		return respuesta;
		
}

public int Mostrarmensaje(String mensaje, String titulo){
	
	resultado = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	return resultado;
	
}
	
}
