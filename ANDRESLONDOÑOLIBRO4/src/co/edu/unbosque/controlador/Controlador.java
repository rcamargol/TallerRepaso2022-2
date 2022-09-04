package co.edu.unbosque.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import co.edu.unbosque.modelo.*;
import co.edu.unbosque.vista.*;
public class Controlador { 

	private Ventana ventana;
	public Libro libro;
	public Controlador() {
	
	libro = new Libro();
	ventana = new Ventana();
	}
	
	public void iniciar() {
		
			
		ventana.getjButton().addActionListener(new ActionListener() {
		
			@Override
       
        public void actionPerformed(ActionEvent e) {
        	
        	if (ventana.getjTextField().getText().equals("A")) 
                ventana.getjLabel().setText("LA VERDADERA");
            if (ventana.getjTextField().getText().equals("B")) 
                ventana.getjLabel().setText("LA EXCITANTE");
            if (ventana.getjTextField().getText().equals("C")) 
                ventana.getjLabel().setText("LA HORRIPILANTE");
            if (ventana.getjTextField().getText().equals("D")) 
                ventana.getjLabel().setText("LA ALEGRE");
            if (ventana.getjTextField().getText().equals("E")) 
                ventana.getjLabel().setText("LA FATAL");
            if (ventana.getjTextField().getText().equals("F")) 
                ventana.getjLabel().setText("LA APASIONANTE");
            if (ventana.getjTextField().getText().equals("G")) 
                ventana.getjLabel().setText("LA TRAGICA");
            if (ventana.getjTextField().getText().equals("H")) 
                ventana.getjLabel().setText("LA SANGRIENTA");
            if (ventana.getjTextField().getText().equals("I")) 
                ventana.getjLabel().setText("LA FAMOSA");
            if (ventana.getjTextField().getText().equals("J")) 
                ventana.getjLabel().setText("LA GRAN");
            if (ventana.getjTextField().getText().equals("K")) 
                ventana.getjLabel().setText("LA PENOSA");
            if (ventana.getjTextField().getText().equals("L")) 
                ventana.getjLabel().setText("LA TRISTE");
            if (ventana.getjTextField().getText().equals("M")) 
                ventana.getjLabel().setText("LA DESASTROSA");
            if (ventana.getjTextField().getText().equals("N")) 
                ventana.getjLabel().setText("LA HERMOSA");
            if (ventana.getjTextField().getText().equals("O")) 
                ventana.getjLabel().setText("LA OSCURA");
            if (ventana.getjTextField().getText().equals("P")) 
                ventana.getjLabel().setText("LA GLORIOSA");
            if (ventana.getjTextField().getText().equals("Q")) 
                ventana.getjLabel().setText("LA INFELIZ");
            if (ventana.getjTextField().getText().equals("R")) 
                ventana.getjLabel().setText("LA EMOCIONANTE");
            if (ventana.getjTextField().getText().equals("S")) 
                ventana.getjLabel().setText("LA FANTASTICA");
            if (ventana.getjTextField().getText().equals("T")) 
                ventana.getjLabel().setText("LA TERRORIFICA");
            if (ventana.getjTextField().getText().equals("U")) 
                ventana.getjLabel().setText("LA ABURRIDA");
            if (ventana.getjTextField().getText().equals("V")) 
                ventana.getjLabel().setText("LA INCREIBLE");
            if (ventana.getjTextField().getText().equals("W")) 
                ventana.getjLabel().setText("LA DESGRACIADA");
            if (ventana.getjTextField().getText().equals("X")) 
                ventana.getjLabel().setText("LA LAMENTABLE");
            if (ventana.getjTextField().getText().equals("Y")) 
                ventana.getjLabel().setText("LA COMICA");
            if (ventana.getjTextField().getText().equals("Z")) 
                ventana.getjLabel().setText("LA MISERABLE");
            if (ventana.getjTextField().getText().equals("ENERO")) 
                ventana.getjLabel2().setText("HAZAÑA");
            if (ventana.getjTextField2().getText().equals("FEBRERO")) 
                ventana.getjLabel2().setText("REENCARNACIÓN");
            if (ventana.getjTextField2().getText().equals("MARZO")) 
                ventana.getjLabel2().setText("BATALLA");
            if (ventana.getjTextField2().getText().equals("ABRIL")) 
                ventana.getjLabel2().setText("EXISTENCIA");
            if (ventana.getjTextField2().getText().equals("MAYO")) 
                ventana.getjLabel2().setText("MUERTE");
            if (ventana.getjTextField2().getText().equals("JUNIO")) 
                ventana.getjLabel2().setText("MISIÓN");
            if (ventana.getjTextField2().getText().equals("JULIO")) 
                ventana.getjLabel2().setText("VENGANZA");
            if (ventana.getjTextField2().getText().equals("AGOSTO")) 
                ventana.getjLabel2().setText("ANÉCDOTA");
            if (ventana.getjTextField2().getText().equals("SEPTIEMBRE")) 
                ventana.getjLabel2().setText("VIDA");
            if (ventana.getjTextField2().getText().equals("OCTUBRE")) 
                ventana.getjLabel2().setText("LEYENDA");
            if (ventana.getjTextField2().getText().equals("NOVIEMBRE")) 
                ventana.getjLabel2().setText("HISTORIA");
            if (ventana.getjTextField2().getText().equals("DICIEMBRE")) 
                ventana.getjLabel2().setText("BIOGRAFIA");
            if (ventana.getjTextField3().getText().equals("0")) 
                ventana.getjLabel3().setText("DE UN BIPOLAR");
            if (ventana.getjTextField3().getText().equals("1")) 
                ventana.getjLabel3().setText("DE UN ASESINO/A");
            if (ventana.getjTextField3().getText().equals("2")) 
                ventana.getjLabel3().setText("DE UN LOCO/A");
            if (ventana.getjTextField3().getText().equals("3")) 
                ventana.getjLabel3().setText("DE UN ADICTO/A A LOS MEMES");
            if (ventana.getjTextField3().getText().equals("4")) 
                ventana.getjLabel3().setText("DE UN SOÑADOR/A");
            if (ventana.getjTextField3().getText().equals("5")) 
                ventana.getjLabel3().setText("DE UN GENIO/A INCOMPRENDIDO");
            if (ventana.getjTextField3().getText().equals("6")) 
                ventana.getjLabel3().setText("DE UN SIMBOLO SEXUAL");
            if (ventana.getjTextField3().getText().equals("7")) 
                ventana.getjLabel3().setText("DE UN ALCOHÓLICO/A");
            if (ventana.getjTextField3().getText().equals("8")) 
                ventana.getjLabel3().setText("DE UN GUERRERO/A");
            if (ventana.getjTextField3().getText().equals("9")) 
                ventana.getjLabel3().setText("DE UN AVENTURERO/A");
        	 
        }
        
        });
	}

	
		
	}

