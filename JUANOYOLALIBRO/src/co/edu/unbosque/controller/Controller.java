package co.edu.unbosque.controller;

import javax.swing.JFrame;

import co.edu.unbosque.model.App;
import co.edu.unbosque.view.MenuFrame;
public class Controller {
     
	private App app;
    private MenuFrame menu;
	
	public Controller() {
		   app = new App();
		   funcionar();
		}
	public void funcionar() {
		  JFrame Menuframe = new MenuFrame(this);
	      Menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Menuframe.setTitle("El libro de la vida");
	      Menuframe.setLocationRelativeTo(null);
	      Menuframe.setVisible(true); 
	}
	public String unirDatos(String letra, int mes, int numt) {
		String msg1 = app.seleccionarSegunLetra(letra);
		String msg2 = app.seleccionarPalabraPorNumero(mes);
		String msg3 = app.seleccionarFrasePorNumero(numt);
		String msgf = app.unirOpciones(msg1, msg2, msg3);
		return msgf;
	}
	
}
