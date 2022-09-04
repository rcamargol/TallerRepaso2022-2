package co.edu.unbosque.vista;

import javax.swing.JOptionPane;

import co.edu.unbosque.controlador.Controlador;

public class Vista {
	
	private Controlador c;
	public Vista(Controlador controlador) {
		c=controlador;
		// TODO Auto-generated constructor stub
	}
//	Controlador c = new Controlador();

	public String pedirLetra() {
		String letra = JOptionPane.showInputDialog("Escriba la primera letra de su primer apellido");
		if (letra.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No se ha ingresado una letra");
		}
		return letra;
	}

	public String pedirMes() {
		String mes = JOptionPane.showInputDialog(
				"Escriba el numero correspondiente al mes de su cumpleaños \n 1) Enero \n 2) Febrero \n 3) Marzo \n 4) Abril \n 5) Mayo \n 6) Junio \n 7) Julio \n 8) Agosto \n 9) Septimebre \n 10) Octubre \n 11) Noviembre \n 12) Diciembre");
		if (mes.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No se ha ingresado un numero");
		}
		return mes;
	}

	public String pedirNumero() {
		String numtelefono = JOptionPane.showInputDialog("Escriba el ultimo digito de su numero telefonico");
		if (numtelefono.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No se ha ingresado un numero");
		}
		return numtelefono;
	}

	public void mostrarResultado(String parteuno, String partedos, String partetres) {
		JOptionPane.showMessageDialog(null, "El nombre de tu libro seria: " + c.buscarParteUno(parteuno) + " "
				+ c.buscarParteDos(partedos) + " " + c.buscarParteTres(partetres));
	}
}
