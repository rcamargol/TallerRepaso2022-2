package co.edu.unbosque.view;
import javax.swing.JOptionPane;
public class View {		
		public View(){
		
		}
		public void mostrarHistoria(String mensaje) {
			JOptionPane.showMessageDialog(null, mensaje);
		}	
		
		public double leerdatodouble(String mensaje) {
			String e = JOptionPane.showInputDialog(mensaje);
			
			Double da = Double.parseDouble(e);
			return da;
	}
		public int leerdatoEntero(String mensaje) {
			String a = JOptionPane.showInputDialog(mensaje);
			int da = Integer.parseInt(a);
			return da;
			// TODO Auto-generated method stub
	
		}
		public void devolverInformacion(String mensaje) {
			JOptionPane.showMessageDialog(null, mensaje);
			// TODO Auto-generated method stub
		}
		public void mostrarInformacion(String message) {
			// TODO Auto-generated method stub
			
		}
		
}