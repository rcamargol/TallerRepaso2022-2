package co.edu.unbosque.view;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public File cancion(){
		JFileChooser j= new JFileChooser();
		j.showSaveDialog(j);
		File f=j.getSelectedFile();
		return f;
	}
}



