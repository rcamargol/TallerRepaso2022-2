package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bt1;
	
	public View() {
		setBounds(0, 0, 255, 150);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt1 = new JButton("Guardar cancion y mostrar");
		bt1.setBounds(20, 40, 200, 30);
		bt1.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		bt1.setForeground(Color.black);
		
		add(bt1);
	}
	public void mostrarDatos(String datos) {
		JOptionPane.showMessageDialog(null, datos);
	}
	public JButton getBt1() {
		return bt1;
	}
	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}
	
	
	
}
