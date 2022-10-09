package co.edu.unbosque.view;


import javax.swing.JOptionPane;

public class View {
	public View() {

	}

	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		return Integer.parseInt(aux);
	}
	public String menu(){
		return"Hola, elige unna opcion";
	}

	public void MostrarInfo(String m) {
		JOptionPane.showMessageDialog(null,m);
	}
}
