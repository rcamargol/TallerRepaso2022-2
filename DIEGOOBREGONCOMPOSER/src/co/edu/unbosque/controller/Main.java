package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaJFrame;
import co.edu.unbosque.view.VentanaJPanel;

public class Main {
	public static void main(String[] args) {
		VentanaJPanel jpanelMesa = new VentanaJPanel();
		VentanaJFrame principaljframe = new VentanaJFrame(jpanelMesa);
		Controller principal = new Controller(principaljframe);
	}
}
