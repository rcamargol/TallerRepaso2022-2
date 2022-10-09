 package co.edu.unbosque.view;

import java.awt.Container;

import javax.swing.JFrame;

public class VentanaJFrame extends JFrame{

	private VentanaJPanel ventanajpanel = new VentanaJPanel();
	public VentanaJFrame(VentanaJPanel ventanajpanel) {
		this.ventanajpanel=ventanajpanel;
		setSize(520, 450);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentpane = getContentPane();
		setTitle("CÓMO COMPONER REGGAETON");
		contentpane.add(ventanajpanel);
		setLocationRelativeTo( null );
	}
	public VentanaJPanel getVentanajpanel() {
		return ventanajpanel;
	}
	public void setVentanajpanel(VentanaJPanel ventanajpanel) {
		this.ventanajpanel = ventanajpanel;
	}
	
}
