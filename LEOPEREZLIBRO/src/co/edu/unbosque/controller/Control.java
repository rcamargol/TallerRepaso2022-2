package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Datos;
import co.edu.unbosque.view.VistaConsola;

public class Control {
	
	private VistaConsola vista;
	public Control() {
	  vista = new VistaConsola();
	  vista.showVista();
	  
	  }
	Datos dat = new Datos();
	public void nomDatos(String apellido, int mes, int numero) {
		dat.valoresDatos(apellido, apellido, mes, apellido, numero, apellido);
		String pri = apellido;
		String seg = Integer.toString(mes);
		String ter = Integer.toString(numero);
		
		vista.mostrarDatos(pri, seg, ter);
		
	}

	
	 
	 
	 
	 
		 
}
