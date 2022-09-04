package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Modelo.LibroDeVida;
import Vista.VentanaJFrame;

public class Controlador implements ActionListener{

	public VentanaJFrame ventanajframe;
	public LibroDeVida librodevida = new LibroDeVida();
		public Controlador(VentanaJFrame ventanajframe) {
		this.ventanajframe = ventanajframe;
		this.ventanajframe.ventanajpanel.Apellido.addActionListener(this);
		this.ventanajframe.ventanajpanel.Mes.addActionListener(this);
		this.ventanajframe.ventanajpanel.Generar.addActionListener(this);
		
		this.ventanajframe.ventanajpanel.Telefono.addActionListener(this);
		ventanajframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanajframe.ventanajpanel.Generar) {
			char apellido = ventanajframe.ventanajpanel.Apellido.getSelectedItem().toString().charAt(0);
			String mes = ventanajframe.ventanajpanel.Mes.getSelectedItem().toString();
			int telefono = Integer.parseInt(ventanajframe.ventanajpanel.Telefono.getSelectedItem().toString()) ;
			String respuesta = librodevida.ArmarRespuesta(apellido, mes, telefono);
			ventanajframe.ventanajpanel.respuesta(respuesta);
			
		}
		
	}

}
