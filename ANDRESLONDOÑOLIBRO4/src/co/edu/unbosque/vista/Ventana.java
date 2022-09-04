package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame  {
	public JLabel jLabel,jLabel2,jLabel3,T1,T2,T3,M1,M2,N1,N2,N3,Nombre;
	public JTextField jTextField,jTextField2,jTextField3;
	public JButton jButton;
			
		
		public void Ventana1() {
		setBounds(10, 10, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
        setVisible(true);
        
        
        jLabel = new JLabel();
        jLabel.setBounds(210, 300, 200, 40);
        
        jLabel2 = new JLabel();
        jLabel2.setBounds(380, 300, 200, 40);
        
        jLabel3 = new JLabel();
        jLabel3.setBounds(530, 300, 200, 40);

        T1 = new JLabel();
       T1.setBounds(210, 100, 150, 40);
        T1.setText("Ingrese la letra de la");
        T2 = new JLabel();
        T2.setBounds(210, 125, 150, 40);
         T2.setText("inicial de tu nombre");
         T3 = new JLabel();
         T3.setBounds(210, 150, 150, 40);
          T3.setText("en MAYUSCULA");
          
          M1 = new JLabel();
          M1.setBounds(350, 100, 150, 40);
           M1.setText("Ingrese el mes en que");
           M2 = new JLabel();
           M2.setBounds(350, 125, 150, 40);
            M2.setText("naciste en MAYUSCULA");
          
            N1 = new JLabel();
            N1.setBounds(530, 100, 150, 40);
             N1.setText("Ingrese el ultimo");
             N2 = new JLabel();
             N2.setBounds(530, 125, 150, 40);
              N2.setText("digito de tu");
              N3 = new JLabel();
              N3.setBounds(530, 150, 150, 40);
               N3.setText("numero telefonico");
          
          Nombre = new JLabel();
          Nombre.setBounds(10, 300, 150, 40);
          Nombre.setText("El nombre de tu libro es: ");
          
         jTextField = new JTextField();
        jTextField.setBounds(210, 200, 100, 20);
        
        jTextField2 = new JTextField();
        jTextField2.setBounds(370, 200, 100, 20);

        jTextField3 = new JTextField();
        jTextField3.setBounds(530, 200, 100, 20);
        
        jButton = new JButton("ok");
        jButton.setBounds(230, 250, 50, 20);
        jButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        }
        
        });
       
      
        add(jLabel);
        add(jButton);
        add(jTextField);
        add(jTextField2);
        add(T1);
        add(T2);
        add(jLabel2);
        add(T3);
		add(jTextField3);
		add(Nombre);
		add(N1);
		add(N2);
		add(N3);
		add(M1);
		add(M2);
		add(jLabel3);
}


		public JLabel getjLabel() {
			return jLabel;
		}


		public void setjLabel(JLabel jLabel) {
			this.jLabel = jLabel;
		}


		public JLabel getjLabel2() {
			return jLabel2;
		}


		public void setjLabel2(JLabel jLabel2) {
			this.jLabel2 = jLabel2;
		}


		public JLabel getjLabel3() {
			return jLabel3;
		}


		public void setjLabel3(JLabel jLabel3) {
			this.jLabel3 = jLabel3;
		}


		public JLabel getT1() {
			return T1;
		}


		public void setT1(JLabel t1) {
			T1 = t1;
		}


		public JLabel getT2() {
			return T2;
		}


		public void setT2(JLabel t2) {
			T2 = t2;
		}


		public JLabel getT3() {
			return T3;
		}


		public void setT3(JLabel t3) {
			T3 = t3;
		}


		public JLabel getM1() {
			return M1;
		}


		public void setM1(JLabel m1) {
			M1 = m1;
		}


		public JLabel getM2() {
			return M2;
		}


		public void setM2(JLabel m2) {
			M2 = m2;
		}


		public JLabel getN1() {
			return N1;
		}


		public void setN1(JLabel n1) {
			N1 = n1;
		}


		public JLabel getN2() {
			return N2;
		}


		public void setN2(JLabel n2) {
			N2 = n2;
		}


		public JLabel getN3() {
			return N3;
		}


		public void setN3(JLabel n3) {
			N3 = n3;
		}


		public JLabel getNombre() {
			return Nombre;
		}


		public void setNombre(JLabel nombre) {
			Nombre = nombre;
		}


		public JTextField getjTextField() {
			return jTextField;
		}


		public void setjTextField(JTextField jTextField) {
			this.jTextField = jTextField;
		}


		public JTextField getjTextField2() {
			return jTextField2;
		}


		public void setjTextField2(JTextField jTextField2) {
			this.jTextField2 = jTextField2;
		}


		public JTextField getjTextField3() {
			return jTextField3;
		}


		public void setjTextField3(JTextField jTextField3) {
			this.jTextField3 = jTextField3;
		}


		public JButton getjButton() {
			return jButton;
		}


		public void setjButton(JButton jButton) {
			this.jButton = jButton;
		}
		
		
	}



