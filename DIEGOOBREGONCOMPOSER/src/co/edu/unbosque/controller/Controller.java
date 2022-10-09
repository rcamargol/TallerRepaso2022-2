package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.VentanaJFrame;


public class Controller implements ActionListener{
	
	private Cancion cancion = new Cancion();
	private VentanaJFrame ventanajframe;
	
	public Controller(VentanaJFrame ventanajframe) {
		this.ventanajframe = ventanajframe;
		this.ventanajframe.getVentanajpanel().getGenerar().addActionListener(this);
		this.ventanajframe.getVentanajpanel().getGuardar().addActionListener(this);
		ventanajframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanajframe.getVentanajpanel().getGenerar()) {
			cancion.Crear_Cancion();
			ArrayList letra = cancion.getCancion();
			ventanajframe.getVentanajpanel().imprimir(letra);
		}
		if (e.getSource() == ventanajframe.getVentanajpanel().getGuardar()) {
			cancion.getArchivo().setBody((ArrayList) cancion.getCancion());
			File guarda = ventanajframe.getVentanajpanel().guardarArchivo();
			try {
				cancion.getArchivo().crear(guarda);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cancion.gestionarPropiedades();
		}		
	}
}
