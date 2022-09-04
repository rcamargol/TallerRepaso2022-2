package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] letra = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	private String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	private JLabel titulo, opletra, opmes, opnum;
	private JComboBox<String> listletra;
	private JComboBox<String> listmes;
	private JComboBox<String> listnum;
	private JButton bt1;
	
	public VentanaPrincipal() {
		setBounds(0, 0, 725, 290);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		titulo = new JLabel("¿Cómo se llamaria el libro de tu vida? ");
		titulo.setBounds(213, 30, 300, 30);
		titulo.setFont(new Font("Bauhaus 93",Font.BOLD+Font.ITALIC,15));
		titulo.setForeground(Color.black);
		
		opletra = new JLabel("Primera letra de tu primer apellido");
		opletra.setBounds(35, 80, 210, 30);
		opletra.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		opletra.setForeground(Color.black);
		
		opmes = new JLabel("Mes de nacimiento");
		opmes.setBounds(300, 80, 210, 30);
		opmes.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		opmes.setForeground(Color.black);
		
		opnum = new JLabel("Último dígito de tu número telefónico");
		opnum.setBounds(485, 80, 210, 30);
		opnum.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		opnum.setForeground(Color.black);
		
		listletra = new JComboBox<>(letra);
		listletra.setBounds(20, 130, 210, 30);
		listletra.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		listletra.setForeground(Color.black);
		
		listmes = new JComboBox<>(mes);
		listmes.setBounds(250, 130, 210, 30);
		listmes.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		listmes.setForeground(Color.black);
		
		listnum = new JComboBox<>(num);
		listnum.setBounds(480, 130, 210, 30);
		listnum.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		listnum.setForeground(Color.black);
		
		bt1 = new JButton("Mostrar nombre");
		bt1.setBounds(255, 180, 200, 30);
		bt1.setFont(new Font("Bell MT",Font.BOLD+Font.ITALIC,12));
		bt1.setForeground(Color.black);
		
		add(titulo);
		add(opletra);
		add(opmes);
		add(opnum);
		add(listletra);
		add(listmes);
		add(listnum);
		add(bt1);
		
	}
	

	public JComboBox<String> getListletra() {
		return listletra;
	}


	public void setListletra(JComboBox<String> listletra) {
		this.listletra = listletra;
	}


	public JComboBox<String> getListmes() {
		return listmes;
	}


	public void setListmes(JComboBox<String> listmes) {
		this.listmes = listmes;
	}


	public JComboBox<String> getListnum() {
		return listnum;
	}


	public void setListnum(JComboBox<String> listnum) {
		this.listnum = listnum;
	}


	public String[] getLetra() {
		return letra;
	}

	public void setLetra(String[] letra) {
		this.letra = letra;
	}

	public String[] getMes() {
		return mes;
	}

	public void setMes(String[] mes) {
		this.mes = mes;
	}

	public String[] getNum() {
		return num;
	}

	public void setNum(String[] num) {
		this.num = num;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getOpletra() {
		return opletra;
	}

	public void setOpletra(JLabel opletra) {
		this.opletra = opletra;
	}

	public JLabel getOpmes() {
		return opmes;
	}

	public void setOpmes(JLabel opmes) {
		this.opmes = opmes;
	}

	public JLabel getOpnum() {
		return opnum;
	}

	public void setOpnum(JLabel opnum) {
		this.opnum = opnum;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}
	
	
}
