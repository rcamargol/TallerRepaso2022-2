package co.edu.unbosque.view;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View {
	
	public void mostrarMensaje(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	public File capturarArchivo(){
		JFileChooser j = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
		j.setFileFilter(filter);
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		if(!f.getName().contains(".")) f = new File(f.toString() + ".txt");
		return f;	
	}
	

}
