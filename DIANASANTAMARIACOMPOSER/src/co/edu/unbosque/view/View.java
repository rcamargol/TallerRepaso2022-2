package co.edu.unbosque.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void mostrarCancion(String cancion) {
		JOptionPane.showMessageDialog(null, cancion);
	}

	public String guardarArchivo(String cancion) {
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(fc);
		File f = fc.getSelectedFile();
		return f.getPath();
	}
}
