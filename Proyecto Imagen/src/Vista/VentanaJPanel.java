package Vista;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaJPanel extends JPanel {

	Character[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	Integer[] telefono = {0,1,2,3,4,5,6,7,8,9};
	public JComboBox<Character> Apellido = new JComboBox<Character>(abecedario);
	public JComboBox<String> Mes = new JComboBox<String>(mes);
	public JComboBox<Integer> Telefono = new JComboBox<Integer>(telefono);
	public JButton Generar = new JButton("Generar");
	public JLabel label1 = new JLabel(); 
	
	
	public VentanaJPanel() {
		setLayout(null);

		label1 = new JLabel();
	    ImageIcon imagen = new ImageIcon("imagen.jpg");
	    label1.setBounds(0,0,500,400);
	    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT));
	    label1.setIcon(icono);
	    add(label1);
	    JLabel apellido = new JLabel("apellido");
	    apellido.setBounds(10,400,100,25);
	    Apellido.setBounds(10,430,50,25);
	    add(Apellido);
	    add(apellido);
	    
	    JLabel mes = new JLabel("mes");
	    mes.setBounds(100,400,100,25);
	    Mes.setBounds(100,430,100,25);
	    add(Mes);
	    add(mes);
	    
	    JLabel telefono = new JLabel("telefono");
	    telefono.setBounds(200,400,100,25);
	    Telefono.setBounds(200,430,50,25);
	    add(Telefono);
	    add(telefono);
	    
	    Generar.setBounds(350, 400, 100, 50);
	    add(Generar);
	}
	
	public void respuesta(String respuesta) {
		JOptionPane.showMessageDialog(null, respuesta,"PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
	}
}