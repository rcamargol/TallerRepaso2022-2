package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cancion c;
	private View v;
	
	public Controller() {
		c = new Cancion();
		v = new View();
	}
	
	public void iniciar() {
		v.setVisible(true);
		v.getBt1().addActionListener(this);
		v.getBt1().setActionCommand("bt1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("bt1")) {
			v.setVisible(false);
			c.guardarCancion();
			v.mostrarDatos(c.gestionDeArchivos());
		}
		
	}
	
}
