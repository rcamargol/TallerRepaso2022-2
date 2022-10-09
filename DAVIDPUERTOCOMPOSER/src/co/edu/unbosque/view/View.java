package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void mostrarDato(String pDato) {
		JOptionPane.showMessageDialog(null, pDato);
	}

	public String guadarComo() {
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(fc);
		File f = fc.getSelectedFile();
		return f.getPath();
	}
}
