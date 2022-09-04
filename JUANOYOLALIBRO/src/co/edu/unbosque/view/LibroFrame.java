package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;


public class LibroFrame extends JFrame {
	private static final int FRAME_WIDTH = 1200;
	private static final int FRAME_HEIGHT = 125;
    private static final String SIGUIENTE = "SIGUIENTE";
	public ActionListener listener;
	private Controller controller;
	private JButton siguiente;
	private JTextField letra;
	private JLabel letra1;
	private JTextField NumT;
	private JLabel NumT1;
	private JTextField NumM;
	private JLabel NumM1;

	public LibroFrame(Controller pControl) {
		listener = new BotonListener();
		controller = pControl;
		createControlPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	class BotonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equalsIgnoreCase(SIGUIENTE)) {
              capturarDatos(e);
			} 				
		}
	}
	public void createControlPanel() {	
		JPanel panel1 = crearBotonSig();		
		JPanel panel2 = crearDatosPanel();
	    add(panel2, BorderLayout.CENTER);
	    add(panel1, BorderLayout.SOUTH);
	}	
	public JPanel crearBotonSig() {
    	siguiente = new JButton(SIGUIENTE);
    	siguiente.setActionCommand(SIGUIENTE);
    	siguiente.setText("Siguiente");	
    	siguiente.addActionListener(listener);
    	siguiente.setFocusPainted(false);
		JPanel panel = new JPanel();
		panel.add(siguiente);
		return panel;
    }
	public JPanel crearDatosPanel() {
		JPanel panel = new JPanel();
		letra = new JTextField("A");
		letra1 = new JLabel("Digite la primera letra de su primer apellido:");
		letra.setPreferredSize(new Dimension (100,30));
		panel.add(letra1);
		panel.add(letra);		
	    NumM = new JTextField();
		NumM1 = new JLabel("Digite el número del mes en el que nació (0-12):");
		NumM.setPreferredSize(new Dimension (100,30));
		panel.add(NumM1);
		panel.add(NumM);		
	    NumT = new JTextField();
		NumT1 = new JLabel("Digite el último número de su número telefónico (0-9):");
		NumT.setPreferredSize(new Dimension (100,30));
		panel.add(NumT1);
		panel.add(NumT);	
		return panel;
	}
    public void capturarDatos (ActionEvent e) {
    	try { 
    		String dato1 = letra.getText();
    		int dato2 = Integer.parseInt(NumM.getText());
    		int dato3 = Integer.parseInt(NumT.getText());
        	JOptionPane.showMessageDialog(null, "EL NOMBRE DEL LIBRO DE SU VIDA ES: "+ controller.unirDatos(dato1, dato2, dato3));        	
    	} catch (NumberFormatException a) {
    		JOptionPane.showMessageDialog(null, "¡Digite un número entero en el mes o en el número de su teléfono!","ERROR", JOptionPane.WARNING_MESSAGE);;
    	}  	
    }					
}
