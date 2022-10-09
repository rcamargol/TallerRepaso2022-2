package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.EdadMaximaException;
import co.edu.unbosque.model.TipoAlmaException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX x;
	private View gui;
	
	public Controller(){
		
		x = new ClaseX();
		gui = new View();
		
		funcionar();
	}
	
	public void funcionar(){
		
		gui.mostrarDatos("Kira es un Heroe, "+x.getK().habitar()+x.getK().sentir()+x.getK().volar()+"\n"+x.getK().crearFuego()+"y"+x.getK().detenerTiem()+
				         x.getK().hab_magicas()+x.getK().salvar()+"\n"+"\n"+
		
		                 "Astar es un Heroe, "+x.getA().habitar()+x.getA().sentir()+x.getA().volar()+"\n"+x.getA().crearFuego()+"y"+x.getA().detenerTiem()+
		                 x.getA().luchar()+x.getA().explorar()+"\n"+"\n"+
		                 
				         "Juan es un Mortal, "+x.getJ().habitar()+x.getJ().sentir()+x.getJ().adConocimiento()+"\n"+x.getJ().tenerFamilia()+"y"+x.getJ().ejercerProf()+
				         x.getJ().lib_leidos()+x.getJ().fabric_arm()+"\n"+"\n"+
				         
				         "Renk es un Desterrado, "+x.getR().habitar()+x.getR().sentir()+x.getR().arrastrar()+x.getR().tipo_trabajo()+"y"+x.getR().medir_tam());
		
		try {
			gui.mostrarDatos(x.generarExcepcion());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
