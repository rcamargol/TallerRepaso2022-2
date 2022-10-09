package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class View extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] voladores = {"Bird","Helicopter","SeaPlane","Superman",};
	private JComboBox<String>lista;
	private JButton bt1;
	private JLabel titulo;
	
	public View() {
		setBounds(0, 0, 260, 220);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		titulo = new JLabel("Escoja lo que quiere ver");
		titulo.setBounds(35, 30, 300, 30);
		titulo.setFont(new Font("Bauhaus 93",Font.BOLD+Font.ITALIC,15));
		titulo.setForeground(Color.black);
		
		lista = new JComboBox<>(voladores);
		lista.setBounds(20, 70, 210, 30);
		lista.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		lista.setForeground(Color.black);
		
		bt1 = new JButton("Ver");
		bt1.setBounds(25, 120, 200, 30);
		bt1.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		bt1.setForeground(Color.black);
		
		add(titulo);
		add(lista);
		add(bt1);
	}
	
	public void mostrarDatos(String datos) {
		JOptionPane.showMessageDialog(null, datos);
	}

	public String[] getVoladores() {
		return voladores;
	}

	public void setVoladores(String[] voladores) {
		this.voladores = voladores;
	}

	public JComboBox<String> getLista() {
		return lista;
	}

	public void setLista(JComboBox<String> lista) {
		this.lista = lista;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	
}
