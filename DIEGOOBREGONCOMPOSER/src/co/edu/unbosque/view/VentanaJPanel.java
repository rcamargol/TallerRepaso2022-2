package co.edu.unbosque.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaJPanel extends JPanel {

	private JButton Generar = new JButton("Generar");
	private JButton Guardar = new JButton("Guardar");
	private JLabel Letra = new JLabel("");
	
	public VentanaJPanel() {
		setLayout(null);
	    JLabel cancion = new JLabel("Generador de letras para canciones de Reggaeton");
	    cancion.setBounds(10,20,400,20);
	    add(cancion);
	    Letra.setBounds(10, 10, 500, 400);
	    add(Letra);
	    Generar.setBounds(120, 350, 100, 50);
	    add(Generar);
	    Guardar.setBounds(260, 350, 100, 50);
	    add(Guardar);
	}
	
	public void imprimir(ArrayList letra) {
		Letra.setText("");
		String respuesta = "<html>";
		int aux=0;
		for (int i = 0; i < letra.size(); i++) {
			if (aux==4) {
				respuesta+="<br>";
				aux=0;
			}
			respuesta+=letra.get(i)+"<br>";
			aux++;
		}
		respuesta+="</html>";
		Letra.setText(respuesta);
	}
	public File guardarArchivo() {
		 JFileChooser file=new JFileChooser();
		 file.showSaveDialog(this);
		 File guarda =file.getSelectedFile();
		 return guarda;
	}

	public JButton getGenerar() {
		return Generar;
	}

	public void setGenerar(JButton generar) {
		Generar = generar;
	}

	public JButton getGuardar() {
		return Guardar;
	}

	public void setGuardar(JButton guardar) {
		Guardar = guardar;
	}

	public JLabel getLetra() {
		return Letra;
	}

	public void setLetra(JLabel letra) {
		Letra = letra;
	}
	
}