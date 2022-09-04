package co.edu.unbosque.vista;


	import javax.swing.JOptionPane;

	public class vista {

		public void mostrarResultados(String dato) {
			JOptionPane.showMessageDialog(null, dato);
		}
		
		public String pedirDatoabecedario() {
			return JOptionPane.showInputDialog("Digite la primera letra de su apellido").toUpperCase();
		}
		public String pedirDatomeses() {
			return JOptionPane.showInputDialog("Digite el mes de nacimiento").toUpperCase();
		}
		public int pedirDatotelefono() {
			try {
				 Integer.parseInt(JOptionPane.showInputDialog("Escriba el último digito de su numero telefonico "));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Solo digite u numero");
			}
			return Integer.parseInt(JOptionPane.showInputDialog("Escriba el último digito de su numero telefonico"));
		}
		public void MostrarInfo(String t) {
			JOptionPane.showMessageDialog(null,t);
		}

}
