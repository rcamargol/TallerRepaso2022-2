package co.edu.unbosque.View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPrincipalLetras extends JPanel{
	
	private Panelapellido panel1;
	private Panelmes panelm;
	private Paneltelefono paneltel;
	
     public  PanelPrincipalLetras() {

		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		panel1 = new Panelapellido();
		panelm = new Panelmes();
		paneltel = new Paneltelefono();
		
//		add(pimg, BorderLayout.EAST);
		add(panel1, BorderLayout.EAST);
		add(panelm, BorderLayout.CENTER);
		add(paneltel, BorderLayout.CENTER);
		
		
	}

	public Panelapellido getPanel1() {
		return panel1;
	}

	public void setPanel1(Panelapellido panel1) {
		this.panel1 = panel1;
	}

	public Panelmes getPanelm() {
		return panelm;
	}

	public void setPanelm(Panelmes panelm) {
		this.panelm = panelm;
	}

	public Paneltelefono getPaneltel() {
		return paneltel;
	}

	public void setPaneltel(Paneltelefono paneltel) {
		this.paneltel = paneltel;
	}
	
}


