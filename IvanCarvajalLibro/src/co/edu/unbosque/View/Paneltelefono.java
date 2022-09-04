package co.edu.unbosque.View;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Paneltelefono extends JPanel {

	private JRadioButton T0,T1,T2,T3,T4,T5,T6,T7,T8,T9;
    private ButtonGroup grupomes;

       public Paneltelefono() {

       setLayout(new GridLayout(4,5));
       inicializarComponentes();
       setVisible(true);
    }

	private void inicializarComponentes() {
		setBorder(new TitledBorder ("INGRESA TU ULTIMO # TEL"));
		grupomes= new ButtonGroup();
		
		T0 = new JRadioButton();
		T0.setText("...0...");
		grupomes.add(T0);
		
		T1 = new JRadioButton();
		T1.setText("...1...");
		grupomes.add(T1);
		
		T2 = new JRadioButton();
		T2.setText("...2...");
		grupomes.add(T2);
		
		T3 = new JRadioButton();
		T3.setText("...3...");
		grupomes.add(T3);
		
		T4 = new JRadioButton();
		T4.setText("...4...");
		grupomes.add(T4);
		
		T5 = new JRadioButton();
		T5.setText("...5...");
		grupomes.add(T5);
		
		T6 = new JRadioButton();
		T6.setText("...6...");
		grupomes.add(T6);
		
		T7 = new JRadioButton();
		T7.setText("...7...");
		grupomes.add(T7);
		
		T8 = new JRadioButton();
		T8.setText("...8...");
		grupomes.add(T8);
		
		T9 = new JRadioButton();
		T9.setText("...9...");
		grupomes.add(T9);
		
		add(T0);
		add(new JLabel());
		add(T1);
		add(new JLabel());
		add(T2);
//		add(new JLabel());
		add(T3);
		add(new JLabel());
		add(T4);
		add(new JLabel());
		add(T5);
//		add(new JLabel());
		add(T6);
		add(new JLabel());
		add(T7);
		add(new JLabel());
		add(T8);
//		add(new JLabel());
		add(T9);
		add(new JLabel());
		
	}

	public JRadioButton getT0() {
		return T0;
	}

	public void setT0(JRadioButton t0) {
		T0 = t0;
	}

	public JRadioButton getT1() {
		return T1;
	}

	public void setT1(JRadioButton t1) {
		T1 = t1;
	}

	public JRadioButton getT2() {
		return T2;
	}

	public void setT2(JRadioButton t2) {
		T2 = t2;
	}

	public JRadioButton getT3() {
		return T3;
	}

	public void setT3(JRadioButton t3) {
		T3 = t3;
	}

	public JRadioButton getT4() {
		return T4;
	}

	public void setT4(JRadioButton t4) {
		T4 = t4;
	}

	public JRadioButton getT5() {
		return T5;
	}

	public void setT5(JRadioButton t5) {
		T5 = t5;
	}

	public JRadioButton getT6() {
		return T6;
	}

	public void setT6(JRadioButton t6) {
		T6 = t6;
	}

	public JRadioButton getT7() {
		return T7;
	}

	public void setT7(JRadioButton t7) {
		T7 = t7;
	}

	public JRadioButton getT8() {
		return T8;
	}

	public void setT8(JRadioButton t8) {
		T8 = t8;
	}

	public JRadioButton getT9() {
		return T9;
	}

	public void setT9(JRadioButton t9) {
		T9 = t9;
	}
	

}
