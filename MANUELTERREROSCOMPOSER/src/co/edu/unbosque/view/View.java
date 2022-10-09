package co.edu.unbosque.view;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	public void mostrarResultados(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje ,"Su próximo éxito será...", 0, null);
	}

	public File lanzarFilechooser() {

			JFileChooser file=new JFileChooser();
			  file.showSaveDialog(null);
			  File f = file.getSelectedFile();
			  return f;
			
		}
		
    }


