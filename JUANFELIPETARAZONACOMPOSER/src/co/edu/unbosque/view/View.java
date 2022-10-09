package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	
	public void mostrarDatos(String dat){
		JOptionPane.showMessageDialog(null, dat);
	}
	
	public File guardarArchivo(){
		
		JFileChooser jf = new JFileChooser("c:\\data\\");
		jf.showSaveDialog(jf);
		File f = jf.getSelectedFile();
		
		return f;
	}
	
	
}
