package co.edu.unbosque.controlador;

import javax.swing.JOptionPane;

import co.edu.unbosque.modelo.Libro;
import co.edu.unbosque.vista.Vista;

public class Controlador {

	private Libro libro;
	private Vista vista;

	public Controlador() {
		// TODO Auto-generated constructor stub
		libro = new Libro(null, null, null);
		vista = new Vista(this);
	}

	public Controlador(Libro libro, Vista vista) {
		super();
		this.libro = libro;
		this.vista = vista;
	}

	public String buscarParteUno(String letra) {
		String parteuno = "";
		letra = vista.pedirLetra();
		if (letra.equalsIgnoreCase("a")) {
			parteuno = "La verdadera";
		} else if (letra.equalsIgnoreCase("b")) {
			parteuno = "La excitante";
		} else if (letra.equalsIgnoreCase("c")) {
			parteuno = "La horripilante";
		} else if (letra.equalsIgnoreCase("d")) {
			parteuno = "La alegre";
		} else if (letra.equalsIgnoreCase("e")) {
			parteuno = "La fatal";
		} else if (letra.equalsIgnoreCase("f")) {
			parteuno = "La apasionante";
		} else if (letra.equalsIgnoreCase("g")) {
			parteuno = "La tragica";
		} else if (letra.equalsIgnoreCase("h")) {
			parteuno = "La sangrienta";
		} else if (letra.equalsIgnoreCase("i")) {
			parteuno = "La famosa";
		} else if (letra.equalsIgnoreCase("j")) {
			parteuno = "La gran";
		} else if (letra.equalsIgnoreCase("k")) {
			parteuno = "La penosa";
		} else if (letra.equalsIgnoreCase("l")) {
			parteuno = "La triste";
		} else if (letra.equalsIgnoreCase("m")) {
			parteuno = "La desastrosa";
		} else if (letra.equalsIgnoreCase("n")) {
			parteuno = "La hermosa";
		} else if (letra.equalsIgnoreCase("o")) {
			parteuno = "La oscura";
		} else if (letra.equalsIgnoreCase("p")) {
			parteuno = "La gloriosa";
		} else if (letra.equalsIgnoreCase("q")) {
			parteuno = "La infeliz";
		} else if (letra.equalsIgnoreCase("r")) {
			parteuno = "La emocionante";
		} else if (letra.equalsIgnoreCase("s")) {
			parteuno = "La fantastica";
		} else if (letra.equalsIgnoreCase("t")) {
			parteuno = "La terrorifica";
		} else if (letra.equalsIgnoreCase("u")) {
			parteuno = "La aburrida";
		} else if (letra.equalsIgnoreCase("v")) {
			parteuno = "La increible";
		} else if (letra.equalsIgnoreCase("w")) {
			parteuno = "La desgraciada";
		} else if (letra.equalsIgnoreCase("x")) {
			parteuno = "La lamentable";
		} else if (letra.equalsIgnoreCase("y")) {
			parteuno = "La comica";
		} else if (letra.equalsIgnoreCase("z")) {
			parteuno = "La miserable";
		} else {
			JOptionPane.showMessageDialog(null, "No ingreso un caracter valido");
		}
		return parteuno;
	}

	public String buscarParteDos(String mes) {
		String partedos = "";
		mes = vista.pedirMes();
		if (mes.equalsIgnoreCase("1")) {
			partedos = "hazaña";
		} else if (mes.equalsIgnoreCase("2")) {
			partedos = "reencarnacion";
		} else if (mes.equalsIgnoreCase("3")) {
			partedos = "batalla";
		} else if (mes.equalsIgnoreCase("4")) {
			partedos = "existencia";
		} else if (mes.equalsIgnoreCase("5")) {
			partedos = "muerte";
		} else if (mes.equalsIgnoreCase("6")) {
			partedos = "mision";
		} else if (mes.equalsIgnoreCase("7")) {
			partedos = "venganza";
		} else if (mes.equalsIgnoreCase("8")) {
			partedos = "anecdota";
		} else if (mes.equalsIgnoreCase("9")) {
			partedos = "vida";
		} else if (mes.equalsIgnoreCase("10")) {
			partedos = "leyenda";
		} else if (mes.equalsIgnoreCase("11")) {
			partedos = "historia";
		} else if (mes.equalsIgnoreCase("12")) {
			partedos = "biografia";
		} else {
			JOptionPane.showMessageDialog(null, "No ingreso un caracter valido");
		}
		return partedos;
	}

	public String buscarParteTres(String numtelefono) {
		String partetres = "";
		numtelefono = vista.pedirNumero();
		if (numtelefono.equalsIgnoreCase("0")) {
			partetres = "de un bipolar";
		} else if (numtelefono.equalsIgnoreCase("1")) {
			partetres = "de un asesin@";
		} else if (numtelefono.equalsIgnoreCase("2")) {
			partetres = "de un loc@";
		} else if (numtelefono.equalsIgnoreCase("3")) {
			partetres = "de un adict@ a los memes";
		} else if (numtelefono.equalsIgnoreCase("4")) {
			partetres = "de un soñador(a)";
		} else if (numtelefono.equalsIgnoreCase("5")) {
			partetres = "de un geni@ incomprendid@";
		} else if (numtelefono.equalsIgnoreCase("6")) {
			partetres = "de un simbolo sexual";
		} else if (numtelefono.equalsIgnoreCase("7")) {
			partetres = "de un alcoholic@";
		} else if (numtelefono.equalsIgnoreCase("8")) {
			partetres = "de un guerrer@";
		} else if (numtelefono.equalsIgnoreCase("9")) {
			partetres = "de un aventurer@";
		} else {
			JOptionPane.showMessageDialog(null, "No ingreso un caracter valido");
		}
		return partetres;
	}

	public void iniciar() {
		JOptionPane.showMessageDialog(null,
				"Vamos a averiguar cual seria el nombre del libro que describe su vida, para ello siga las indicaciones ingresando los datos");
		vista.mostrarResultado(libro.getLetra(), libro.getMes(), libro.getNumtelefono());
	}
}
