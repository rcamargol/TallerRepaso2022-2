package co.edu.unbosque.View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel {
	
	private JButton ENTER;
	
	public PanelBoton() {
//		setLayout(new GridLayout(1,1));
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		ENTER = new JButton();
		ENTER.setText("BUSCAR");
		ENTER.setBounds(230, 90, 120, 40);
		ENTER.setActionCommand("ENTER");
		add(ENTER);
	}

	public JButton getENTER() {
		return ENTER;
	}

	public void setENTER(JButton eNTER) {
		ENTER = eNTER;
	}
	
}
