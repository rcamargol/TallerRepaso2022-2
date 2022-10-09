package co.edu.unbosque.view;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.LeerArchivo;

public class View {
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public String escribirArchivo(String dato) {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		String fichero = ""+j.getSelectedFile();
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(dato);
			pw.close();
		} catch (Exception e) {
			return null;
		}
		return fichero;
	}
}

