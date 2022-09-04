package Controlador;

import Vista.VentanaJFrame;
import Vista.VentanaJPanel;

public class Main {

	public static void main(String[] args) {
		VentanaJPanel jpanelMesa = new VentanaJPanel();
		VentanaJFrame principaljframe = new VentanaJFrame(jpanelMesa);
		Controlador principal = new Controlador(principaljframe);
	}

}
