package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private View v;
	private CynusX1 cy;
	
	public Controller() {
		v = new View();
		cy = new CynusX1();
	}
	
	public void iniciar() {
		v.getBt1().addActionListener(this);
		v.getBt1().setActionCommand("bt1");
		v.setVisible(true);
		cy.iniciarDatos();
	}
	
	public void mostrarHeroe () {
		v.mostrarDatos("Heroes: "
		+"\n"+"\n"+cy.getKi().toString()+"\n"
		+"\n"+cy.getA().toString()+"\n"
		+"\n"+"Habilidades: "
		+"\n"+"-"+cy.getKi().volar()
		+"\n"+"-"+cy.getKi().crearFuego()
		+"\n"+"-"+cy.getKi().detenerTiempo()+"\n"
		+"\n"+"Habitan: "+cy.getKi().habitad()
		+"\n"+"Sienten: "+cy.getKi().sentir()
		);
	}
	
	public void mostrarDesterrado () {
		v.mostrarDatos("Desterrado: "
		+"\n"+"\n"+cy.getR().toString()+"\n"
		+"\n"+"Habilidades: "
		+"\n"+"-"+cy.getR().arrastrar()+"\n"
		+"\n"+"Habita: "+cy.getR().habitad()
		+"\n"+"Siente: "+cy.getR().sentir()
		);
	}
	
	public void mostrarMortal() {
		v.mostrarDatos("Desterrado: "
		+"\n"+"\n"+cy.getAn().toString()+"\n"
		+"\n"+"Habilidades: "
		+"\n"+"-"+cy.getAn().abquirirConocimiento()
		+"\n"+"-"+cy.getAn().tenerFamilia()
		+"\n"+"-"+cy.getAn().ejercerProfecion()+"\n"
		+"\n"+"Habita: "+cy.getAn().habitad()
		+"\n"+"Siente: "+cy.getAn().sentir()
		);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("bt1")) {
			
			if (v.getListcreado().getItemAt(v.getListcreado().getSelectedIndex())=="Heroe") {
				mostrarHeroe();
			}
			
			if (v.getListcreado().getItemAt(v.getListcreado().getSelectedIndex())=="Desterrado") {
				mostrarDesterrado();
			}
			
			if (v.getListcreado().getItemAt(v.getListcreado().getSelectedIndex())=="Mortal") {
				mostrarMortal();
			}
			
		}
	}

}
