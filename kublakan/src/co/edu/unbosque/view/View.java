package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {


public void Mostrar(String pMen) {
	JOptionPane.showMessageDialog(null, pMen);
}
public String pedir(String pMen) {
	String men;
	men=JOptionPane.showInputDialog(pMen);
	
	return men;
}
}