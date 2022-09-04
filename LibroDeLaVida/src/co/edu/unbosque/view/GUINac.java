package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class GUINac {	
	
	public GUINac() {

	}

	public String inputApellido () {
		String apel;
		apel = JOptionPane.showInputDialog("Ingrese la primera letra de su apellido");
		return apel;
	}
	
	public String inputMes () {
		String mn;
		mn = JOptionPane.showInputDialog("Ingrese su mes de nacimiento");
		return mn;
	}
	
	public int inputTel() {
		int cel;
		cel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último digito de su teléfono"));
		return cel;
	}
	
	public void errorMensaje () {
		JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
	}
	
	public void mostrarResult (String corApel, String corMes, String corTel) {
		
		String finApel = corApel;
		String finMes = corMes;
		String finTel = corTel;
		
		JOptionPane.showMessageDialog(null, finApel + " " + finMes + " " + finTel, "El libro de tu vida es...", JOptionPane.WARNING_MESSAGE);;
	}
}
