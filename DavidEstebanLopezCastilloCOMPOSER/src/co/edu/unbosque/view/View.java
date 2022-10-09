package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public String mostrarDireccion() {
		JFileChooser f = new JFileChooser();
		f.showSaveDialog(f);
		File j = f.getSelectedFile();
		return j.getPath();		
	}
}
