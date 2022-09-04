package Vista;

import java.awt.Container;

import javax.swing.JFrame;

public class VentanaJFrame extends JFrame{

	public VentanaJPanel ventanajpanel = new VentanaJPanel();
		public VentanaJFrame(VentanaJPanel ventanajpanel) {
			this.ventanajpanel=ventanajpanel;
			setSize(500, 500);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container contentpane = getContentPane();
			setTitle("Libro de vida");
			contentpane.add(ventanajpanel);
			setLocationRelativeTo( null );
		}

}
