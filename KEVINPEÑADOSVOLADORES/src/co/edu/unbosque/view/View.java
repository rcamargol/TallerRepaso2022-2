package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View {
	
	public void mostrar(String msg, String img) {
		ImageIcon icono = new ImageIcon("img/"+img+".jpg");
		JOptionPane.showMessageDialog(null, msg, "", 0, icono);
	}

}
