package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	
	public void msd (String msd) {
		JOptionPane.showMessageDialog(null, msd);
	}
	
	public String directorio() {
		JFileChooser chooser = new JFileChooser();
		chooser.showSaveDialog(null);
		File f = chooser.getSelectedFile();
		return f.getPath();
	}
}
