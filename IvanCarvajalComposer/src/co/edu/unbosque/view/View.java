package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void mostrarResultados(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public String generarCancion() {
		JFileChooser J = new JFileChooser();
		J.showSaveDialog(J);
		File f = J.getSelectedFile();
		return f.getPath();
		}
}
