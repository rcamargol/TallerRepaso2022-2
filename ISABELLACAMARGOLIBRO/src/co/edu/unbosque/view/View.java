package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {

	private Scanner leer;

	public View() {
		leer = new Scanner(System.in);
	}

	public void Mostrarinfo(String m) {

		System.out.println(m);
	}

	public void smd(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void smd(String mensaje, String title) {
		JOptionPane.showMessageDialog(null, mensaje, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public void smd(String mensaje, String title, int type) {
		JOptionPane.showMessageDialog(null, mensaje, title, type);
	}

	public String sid(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}

	public String sid(String mensaje, String title, String[] data) {
		return (String) JOptionPane.showInputDialog(null, mensaje, title, JOptionPane.QUESTION_MESSAGE, null, data,
				null);
	}

	public String sid(String mensaje, String title, String[] data, int type) {
		return (String) JOptionPane.showInputDialog(null, mensaje, title, type, null, data, null);
	}

	public int leerdato() {
		return leer.nextInt();
	}
}
