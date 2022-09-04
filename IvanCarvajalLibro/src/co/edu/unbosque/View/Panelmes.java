package co.edu.unbosque.View;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Panelmes extends JPanel {
	
	private JRadioButton ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,
	                     JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE;
	private ButtonGroup grupomes;
	
     public Panelmes() {
		
		setLayout(new GridLayout(6,6));
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		setBorder(new TitledBorder ("INGRESA TU MES DE NACIMIENTO"));
		grupomes= new ButtonGroup();
		
		ENERO = new JRadioButton();
		ENERO.setText("ENERO.../");
		grupomes.add(ENERO);
		
		FEBRERO = new JRadioButton();
		FEBRERO.setText("FEBRERO.../");
		grupomes.add(FEBRERO);
		
		MARZO = new JRadioButton();
		MARZO.setText("MARZO.../");
		grupomes.add(MARZO);
		
		ABRIL = new JRadioButton();
		ABRIL.setText("ABRIL.../");
		grupomes.add(ABRIL);
		
		MAYO = new JRadioButton();
		MAYO.setText("MAYO.../");
		grupomes.add(MAYO);
		
		JUNIO = new JRadioButton();
		JUNIO.setText("JUNIO.../");
		grupomes.add(JUNIO);
		
		JULIO = new JRadioButton();
		JULIO.setText("JULIO.../");
		grupomes.add(JULIO);
		
		AGOSTO = new JRadioButton();
		AGOSTO.setText("AGOSTO.../");
		grupomes.add(AGOSTO);
		
		SEPTIEMBRE = new JRadioButton();
		SEPTIEMBRE.setText("SEPTIEMBRE.../");
		grupomes.add(SEPTIEMBRE);
		
		OCTUBRE = new JRadioButton();
		OCTUBRE.setText("OCTUBRE.../");
		grupomes.add(OCTUBRE);
		
		NOVIEMBRE = new JRadioButton();
		NOVIEMBRE.setText("NOVIEMBRE.../");
		grupomes.add(NOVIEMBRE);
		
		DICIEMBRE = new JRadioButton();
		DICIEMBRE.setText("DICIEMBRE.../");
		grupomes.add(DICIEMBRE);
		
		add(ENERO);
		add(new JLabel());
		add(FEBRERO);
		add(new JLabel());
		add(MARZO);
		add(new JLabel());
		add(ABRIL);
		add(new JLabel());
		add(MAYO);
		add(new JLabel());
		add(JUNIO);
		add(new JLabel());
		add(JULIO);
		add(new JLabel());
		add(AGOSTO);
		add(new JLabel());
		add(SEPTIEMBRE);
		add(new JLabel());
		add(OCTUBRE);
		add(new JLabel());
		add(NOVIEMBRE);
		add(new JLabel());
		add(DICIEMBRE);	
	}

	public JRadioButton getENERO() {
		return ENERO;
	}

	public void setENERO(JRadioButton eNERO) {
		ENERO = eNERO;
	}

	public JRadioButton getFEBRERO() {
		return FEBRERO;
	}

	public void setFEBRERO(JRadioButton fEBRERO) {
		FEBRERO = fEBRERO;
	}

	public JRadioButton getMARZO() {
		return MARZO;
	}

	public void setMARZO(JRadioButton mARZO) {
		MARZO = mARZO;
	}

	public JRadioButton getABRIL() {
		return ABRIL;
	}

	public void setABRIL(JRadioButton aBRIL) {
		ABRIL = aBRIL;
	}

	public JRadioButton getMAYO() {
		return MAYO;
	}

	public void setMAYO(JRadioButton mAYO) {
		MAYO = mAYO;
	}

	public JRadioButton getJUNIO() {
		return JUNIO;
	}

	public void setJUNIO(JRadioButton jUNIO) {
		JUNIO = jUNIO;
	}

	public JRadioButton getJULIO() {
		return JULIO;
	}

	public void setJULIO(JRadioButton jULIO) {
		JULIO = jULIO;
	}

	public JRadioButton getAGOSTO() {
		return AGOSTO;
	}

	public void setAGOSTO(JRadioButton aGOSTO) {
		AGOSTO = aGOSTO;
	}

	public JRadioButton getSEPTIEMBRE() {
		return SEPTIEMBRE;
	}

	public void setSEPTIEMBRE(JRadioButton sEPTIEMBRE) {
		SEPTIEMBRE = sEPTIEMBRE;
	}

	public JRadioButton getOCTUBRE() {
		return OCTUBRE;
	}

	public void setOCTUBRE(JRadioButton oCTUBRE) {
		OCTUBRE = oCTUBRE;
	}

	public JRadioButton getNOVIEMBRE() {
		return NOVIEMBRE;
	}

	public void setNOVIEMBRE(JRadioButton nOVIEMBRE) {
		NOVIEMBRE = nOVIEMBRE;
	}

	public JRadioButton getDICIEMBRE() {
		return DICIEMBRE;
	}

	public void setDICIEMBRE(JRadioButton dICIEMBRE) {
		DICIEMBRE = dICIEMBRE;
	}
	
}
