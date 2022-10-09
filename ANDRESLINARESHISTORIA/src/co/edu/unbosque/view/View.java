package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String>listcreado;
	private String[] creado = {"Heroe","Mortal","Desterrado"};
	private JButton bt1;
	
	public View() {
		setBounds(0, 0, 200, 160);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		listcreado = new JComboBox<>(creado);
		listcreado.setBounds(20, 20, 150, 30);
		listcreado.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		listcreado.setForeground(Color.black);
		
		bt1 = new JButton("Mostrar nombre");
		bt1.setBounds(20, 60, 150, 30);
		bt1.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		bt1.setForeground(Color.black);
		
		add(listcreado);
		add(bt1);
		
	}
	
	public void mostrarDatos(String datos) {
		JOptionPane.showMessageDialog(null, datos);
	}

	public JComboBox<String> getListcreado() {
		return listcreado;
	}

	public void setListcreado(JComboBox<String> listcreado) {
		this.listcreado = listcreado;
	}

	public String[] getCreado() {
		return creado;
	}

	public void setCreado(String[] creado) {
		this.creado = creado;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}
	
}
