package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void MostrarInfo(String m) {
		JOptionPane.showMessageDialog(null,m);
	}
	public File cancion() {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		return f;
	}
}