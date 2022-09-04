package co.edu.unbosque.view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import co.edu.unbosque.controller.Controller;



public class MenuFrame extends JFrame{
	private static final int PRINCIPAL_HEIGHT = 300;
	private static final int PRINCIPAL_WIDTH = 400;
	public static final String INICIAR = "INICIAR";
	public static final String SALIR = "SALIR";
	private JButton salir;
	private JButton iniciar;
	private JLabel titulo;
	public ActionListener listener;
	private Controller controller;
	
	public MenuFrame(Controller pControl) {		
			listener = new ChoiceListener();
		    createControlPanel();
		    setSize(PRINCIPAL_WIDTH, PRINCIPAL_HEIGHT);
		    controller = pControl;
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
	}
	class ChoiceListener implements ActionListener {
	     
	      public void actionPerformed(ActionEvent event)
	      {  
	    	  if (event.getActionCommand().equalsIgnoreCase(INICIAR)){	    	
	    		  abrirLibro(event);	  		 
	  		  }else if (event.getActionCommand().equalsIgnoreCase(SALIR)) {
	  			  cerrarFrame(event);
	  		  }
	      }
	}
	public void createControlPanel() {
		setLayout(new GridLayout(3,1));
		JPanel panel1 = crearTextoLabel(); 
		JPanel panel2 = crearBotonInicio();
		JPanel panel3 = crearBotonSalir();
		add(panel1);
		add(panel2);
		add(panel3);
	}
	public JPanel crearBotonInicio() {
		iniciar = new JButton(INICIAR);
		iniciar.setActionCommand(INICIAR);
		iniciar.setText("Si");	
		iniciar.addActionListener(listener);
		iniciar.setFocusPainted(false);
		JPanel panel = new JPanel();
		panel.add(iniciar);
		return panel;
	}
	public JPanel crearBotonSalir() {
		salir = new JButton(SALIR);
		salir.setActionCommand(SALIR);
		salir.setText("No");	
		salir.addActionListener(listener);
		salir.setFocusPainted(false);
		JPanel panel = new JPanel();
		panel.add(salir);
		return panel;
	}
    public JPanel crearTextoLabel () {
    	titulo = new JLabel("¿Quieres saber cómo se llamaría el libro de tu vida?");
    	JPanel panel = new JPanel();
    	panel.add(titulo);
    	return panel;
    }
	
	
	public void abrirLibro (ActionEvent e) {
		  LibroFrame  LibFrame = new LibroFrame(controller);
	      LibFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      LibFrame.setTitle("Digite sus datos");
	      LibFrame.setLocationRelativeTo(null);
	      LibFrame.setVisible(true);
	      this.setVisible(false);
	}	
	public void cerrarFrame(ActionEvent e) {
		this.setVisible(false);
	}
    
	
	
}
