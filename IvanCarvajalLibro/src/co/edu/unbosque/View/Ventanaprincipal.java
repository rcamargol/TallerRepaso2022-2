package co.edu.unbosque.View;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventanaprincipal extends JFrame {

	private PanelBoton btnenter;
	private JLabel titulo;
	private PanelPrincipalLetras panelLet;
	
	public Ventanaprincipal() {
		
		setTitle("IvanCarvajalLibro");
		setSize(500,650);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();
		
		setResizable(false);
		setVisible(true);
	}

	private void inicializarComponentes() {
		btnenter = new PanelBoton(); 
		panelLet = new PanelPrincipalLetras();
	
		
		titulo = new JLabel("¿Como se llamaria el libro de tu vida?", JLabel.CENTER);
		titulo.setFont(new Font("",Font.ITALIC,18));
		
		getContentPane().add(titulo, BorderLayout.NORTH);
		getContentPane().add(panelLet);
		getContentPane().add(btnenter, BorderLayout.SOUTH );

	}
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public PanelBoton getBtnenter() {
		return btnenter;
	}

	public void setBtnenter(PanelBoton btnenter) {
		this.btnenter = btnenter;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public PanelPrincipalLetras getPanelLet() {
		return panelLet;
	}

	public void setPanelLet(PanelPrincipalLetras panelLet) {
		this.panelLet = panelLet;
	}
	
	

}
