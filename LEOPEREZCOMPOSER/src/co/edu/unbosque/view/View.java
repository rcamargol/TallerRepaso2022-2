package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void mostrar(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public File capturarArchivo() {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		return f;
	}
}
