package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vista {
	
	public int otraOpcion () {
		int repetir = JOptionPane.showConfirmDialog(null, "¿Desea seleccionar otra opcion?");

		return repetir;	
		
	}
	
	public String pedirPrimeraLetraApellido (String mensaje) {
		Object [] abc = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		Object apellido = JOptionPane.showInputDialog(null, mensaje, "¿Cómo se llamaría el libro de tu vida?", JOptionPane.QUESTION_MESSAGE, null, abc, abc[0]);
		
		String resp = (String) apellido;
		
		if ( resp == null) {
			resp="c";
		}
		return resp;
		
	}
	
	public String pedirMesNacimiento (String mensaje) {
		
		Object [] meses = {" Enero ", " Febrero "," Marzo "," Abril "," Mayo "," Junio "," Julio "," Agosto "," Septiembre "," Octubre "," Noviembre "," Diciembre "};
		Object mesElegido = JOptionPane.showInputDialog(null, mensaje, "¿Cómo se llamaría el libro de tu vida?", JOptionPane.QUESTION_MESSAGE, null, meses, meses[0]);
		
		String resp = (String) mesElegido;
		
		if ( resp == null) {
			resp="c";
		}
		return resp;
		
	}
	
	public String pedirUltimoDigitoNumeroTelefono (String mensaje) {
		Object [] meses = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		Object mesElegido = JOptionPane.showInputDialog(null, mensaje, "¿Cómo se llamaría el libro de tu vida?", JOptionPane.QUESTION_MESSAGE, null, meses, meses[0]);
		
		String resp = (String) mesElegido;
		
		if ( resp == null) {
			resp="c";
		}
		return resp;
		
	}
	
	public void mostrarNombreDelLibro (String mensaje) {
		ImageIcon icono = new ImageIcon("imagenes/libro.png");
		JOptionPane.showMessageDialog(null, mensaje,"",JOptionPane.INFORMATION_MESSAGE, icono);
		
	}

}
