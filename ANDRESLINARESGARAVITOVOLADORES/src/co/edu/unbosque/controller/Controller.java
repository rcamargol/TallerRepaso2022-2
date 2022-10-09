package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import co.edu.unbosque.model.Voladores;
import co.edu.unbosque.view.View;

public class Controller extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private View v;
	private Voladores vls;
	
	public Controller() {
		v = new View();
		vls = new Voladores();
	}
	
	public void iniciar() {
		v.getBt1().addActionListener(this);
		v.getBt1().setActionCommand("bt1");
		v.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("bt1")) {
	
			if(v.getLista().getItemAt(v.getLista().getSelectedIndex())=="Bird") {
				v.mostrarDatos(vls.getB().buildNest()+
						"\n"+vls.getB().layEggs()+
						"\n"+vls.getB().takeOff()+
						"\n"+vls.getB().land()+
						"\n"+vls.getB().fly()+
						"\n"+vls.getB().eat());
			}else if(v.getLista().getItemAt(v.getLista().getSelectedIndex())=="Helicopter") {
				v.mostrarDatos(vls.getH().unirMetodos()+
						"\n"+vls.getH().helipadLanding());
			}else if(v.getLista().getItemAt(v.getLista().getSelectedIndex())=="SeaPlane") {
				v.mostrarDatos(vls.getSp().unirMetodos()+
						"\n"+vls.getSp().waterLanding());
			}else if(v.getLista().getItemAt(v.getLista().getSelectedIndex())=="Superman") {
				v.mostrarDatos(vls.getS().unirMetodos()+
						"\n"+vls.getS().lwapBuilding()+
						"\n"+vls.getS().stopBullet()+
						"\n"+vls.getS().takeOff()+
						"\n"+vls.getS().land()+
						"\n"+vls.getS().fly());
			}
		}
		
	}

}
