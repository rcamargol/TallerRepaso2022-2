package co.edu.unbosque.View;
import javax.swing.JOptionPane;

public class Vista {
	String[] mesaElegir = { "Enero","Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	String[] apellido = { "Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz"};
	
	public int pedirTel() {
		int a;
		a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el último dígito de su Nº telefónico:","Q hubo profe",JOptionPane.QUESTION_MESSAGE));
		return a;
	}
	
	public String pedirmesNaci() {
		String opcion = (String) JOptionPane.showInputDialog(null,"Selecciona el mes de tu cumpleaños", "Elige tu mes de cumpleaños",JOptionPane.QUESTION_MESSAGE,null,mesaElegir, mesaElegir[0]);
		return opcion;

	}
	public String pedirApellido(){
		String a =  (String) JOptionPane.showInputDialog(null, "Ingresa la primera letra de su apellido", "Firma Shrek",JOptionPane.QUESTION_MESSAGE, null, apellido, apellido[0] );
		return a ;
	}
	
	public String mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
		return dato;
	}

	public void mensajeTerminal() {
		 JOptionPane.showMessageDialog(null, "Ha habido un error","Error", JOptionPane.ERROR_MESSAGE);
	}

}
