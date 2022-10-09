package co.edu.unbosque.controller;

import co.edu.unbosque.model.ContexturaException;
import co.edu.unbosque.model.CynuxX1;
import co.edu.unbosque.model.EstaturaException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private CynuxX1 cx;
	private View gui;
	
	public Controller() {
		
		cx = new CynuxX1();
		gui = new View();
		funcionar();
	}
	
	public void funcionar() {
		
		String opc = gui.pedirDatoMenu("Seleccione el descendiente");
		
		if (opc == "Heroes") {
			
			mostrarInformacionHeroes();
			
		}
		
		else if (opc == "Mortales") {
			
			mostrarInformacionMortales();
		}
		
		else 		
			mostrarInformacionDesterrados();
		}
	
	public void mostrarInformacionHeroes() {
		
		String opc = gui.pedirDatoMenuHeroes("Seleccione la opcion que desee");
		
		if (opc == "Mostrar todos") {
			gui.mostrarMensaje(cx.getK().toString()+"\n"+
					cx.getK().habitar()+"\n"+
					cx.getK().sentir()+"\n"+
					cx.getK().volar()+"\n"+
					cx.getK().detenerTiempo()+"\n"+
					cx.getK().crearFuego()+"\n"+
					cx.getK().cantar()+"\n"+
					cx.getK().bailar());
			try {
				cx.getK().intervalarEstatura();
			} catch (EstaturaException e) {
				gui.mostrarMensaje(e.getMessage());
			}
			gui.mostrarMensaje(cx.getA().toString()+"\n"+
					cx.getA().habitar()+"\n"+
					cx.getA().sentir()+"\n"+
					cx.getA().volar()+"\n"+
					cx.getA().detenerTiempo()+"\n"+
					cx.getA().crearFuego()+"\n"+
					cx.getA().hablar()+"\n"+
					cx.getA().luchar());
			try {
				cx.getA().intervalarEstatura();
			} catch (EstaturaException e) {
				gui.mostrarMensaje(e.getMessage());
			}
		}
		else if (opc == "Kira") {
			gui.mostrarMensaje(cx.getK().toString()+"\n"+
					cx.getK().habitar()+"\n"+
					cx.getK().sentir()+"\n"+
					cx.getK().volar()+"\n"+
					cx.getK().detenerTiempo()+"\n"+
					cx.getK().crearFuego()+"\n"+
					cx.getK().cantar()+"\n"+
					cx.getK().bailar());
			try {
				cx.getK().intervalarEstatura();
			} catch (EstaturaException e) {
				gui.mostrarMensaje(e.getMessage());
			}
		}
		else {
			gui.mostrarMensaje(cx.getA().toString()+"\n"+
					cx.getA().habitar()+"\n"+
					cx.getA().sentir()+"\n"+
					cx.getA().volar()+"\n"+
					cx.getA().detenerTiempo()+"\n"+
					cx.getA().crearFuego()+"\n"+
					cx.getA().hablar()+"\n"+
					cx.getA().luchar());
			try {
				cx.getA().intervalarEstatura();
			} catch (EstaturaException e) {
				gui.mostrarMensaje(e.getMessage());
			}
		}
	}
	
	public void mostrarInformacionMortales() {
		gui.mostrarMensaje(cx.getD().toString()+"\n"+
				cx.getD().habitar()+"\n"+
				cx.getD().sentir()+"\n"+
				cx.getD().adquirirConocimientos()+"\n"+
				cx.getD().tenerFamilia()+"\n"+
				cx.getD().ejercerProfesion()+"\n"+
				cx.getD().escucharMusica()+"\n"+
				cx.getD().manejar()+"\n");
		try {
			cx.getD().intervalarEstatura();
		} catch (EstaturaException e) {
			gui.mostrarMensaje(e.getMessage());
		}
	}
	
	public void mostrarInformacionDesterrados() {
		gui.mostrarMensaje(cx.getR().toString()+"\n"+
				cx.getR().habitar()+"\n"+
				cx.getR().sentir()+"\n"+
				cx.getR().arrastrar()+"\n"+
				cx.getR().ejecutarVenganza()+"\n"+
				cx.getR().dormir()+"\n"+
				cx.getR().llorar());
		try {
			cx.getR().intervalarEstatura();
		} catch (EstaturaException e) {
			gui.mostrarMensaje(e.getMessage());
		}
		try {
			cx.getR().recomendarSegunContextura();
		} catch (ContexturaException e) {
			gui.mostrarMensaje(e.getMessage());
		}
	}
}
