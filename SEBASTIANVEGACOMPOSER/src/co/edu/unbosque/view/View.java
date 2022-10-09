package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View {
	
	public void mostrarMensaje(String mensaje, String titulo){
		
		 JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		
	}
	public String recibirDatos(String mensaje) {
		
	String res = JOptionPane.showInputDialog(mensaje);
	return res;
		
	}
	
	public String guardarArchivo() {
		
		
		JFileChooser j = new JFileChooser();
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt","txt");
		j.setFileFilter(filtro);
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		return f.getPath();
		
	}

}
