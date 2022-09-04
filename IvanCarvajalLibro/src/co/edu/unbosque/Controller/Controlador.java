package co.edu.unbosque.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.View.Ventanaprincipal;

public class Controlador implements ActionListener{

	private Ventanaprincipal VTP;
	
	public Controlador() {
		VTP = new Ventanaprincipal();
		asignarOyentes();
	}
	private void asignarOyentes() {
		VTP.getBtnenter().getENTER().addActionListener(this);;
		VTP.getPanelLet().getPanel1().getA().addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==VTP.getBtnenter().getENTER()) {
			validemensaje();
		}		
	}
	private void validemensaje() {
		String mensa = " ";
		
		if (VTP.getPanelLet().getPanel1().getA().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Verdadera], ";
		}
		if (VTP.getPanelLet().getPanel1().getB().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Exitante], ";
		}
		if (VTP.getPanelLet().getPanel1().getC().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Horripilante], ";
		}
		if (VTP.getPanelLet().getPanel1().getD().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Alegre], ";
		}
		if (VTP.getPanelLet().getPanel1().getE().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Fatal], ";
		}
		if (VTP.getPanelLet().getPanel1().getF().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Apasionante], ";
		}
		if (VTP.getPanelLet().getPanel1().getG().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Tragica], ";
		}
		if (VTP.getPanelLet().getPanel1().getH().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Sangrienta], ";
		}
		if (VTP.getPanelLet().getPanel1().getI().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Famosa], ";
		}
		if (VTP.getPanelLet().getPanel1().getJ().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Gran], ";
		}
		if (VTP.getPanelLet().getPanel1().getK().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Penosa], ";
		}
		if (VTP.getPanelLet().getPanel1().getL().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Triste], ";
		}
		if (VTP.getPanelLet().getPanel1().getM().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Desastrosa], ";
		}
		if (VTP.getPanelLet().getPanel1().getN().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Hermosa], ";
		}
		if (VTP.getPanelLet().getPanel1().getO().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Oscura], ";
		}
		if (VTP.getPanelLet().getPanel1().getP().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Gloriosa], ";
		}
		if (VTP.getPanelLet().getPanel1().getQ().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Infeliz], ";
		}
		if (VTP.getPanelLet().getPanel1().getR().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Emocionante], ";
		}
		if (VTP.getPanelLet().getPanel1().getS().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Fantastica], ";
		}
		if (VTP.getPanelLet().getPanel1().getT().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Terrorifica], ";
		}
		if (VTP.getPanelLet().getPanel1().getU().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Aburrida], ";
		}
		if (VTP.getPanelLet().getPanel1().getV().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Increible], ";
		}
		if (VTP.getPanelLet().getPanel1().getW().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Desgraciada], ";
		}
		if (VTP.getPanelLet().getPanel1().getX1().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Lamentable], ";
		}
		if (VTP.getPanelLet().getPanel1().getY1().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Comica], ";
		}
		if (VTP.getPanelLet().getPanel1().getZ().isSelected()) {
			mensa+="su libro iniciara con la palabra  [La Miserable], ";
		}
//
//		[HASTA AQUI VAN LAS LETRAS]
//		
//		
		if (VTP.getPanelLet().getPanelm().getENERO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [HAZAÑA], ";
		}
		if (VTP.getPanelLet().getPanelm().getFEBRERO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [REENCARNACION], ";
		}
		if (VTP.getPanelLet().getPanelm().getMARZO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [BATALLA], ";
		}
		if (VTP.getPanelLet().getPanelm().getABRIL().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [EXISTENCIA], ";
		}
		if (VTP.getPanelLet().getPanelm().getMAYO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [MUERTE], ";
		}
		if (VTP.getPanelLet().getPanelm().getJUNIO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [MISION], ";
		}
		if (VTP.getPanelLet().getPanelm().getJULIO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [VENGANZA], ";
		}
		if (VTP.getPanelLet().getPanelm().getAGOSTO().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [ANECDOTA], ";
		}
		if (VTP.getPanelLet().getPanelm().getSEPTIEMBRE().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [VIDA], ";
		}
		if (VTP.getPanelLet().getPanelm().getOCTUBRE().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [LEYENDA], ";
		}
		if (VTP.getPanelLet().getPanelm().getNOVIEMBRE().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [HISTORIA], ";
		}
		if (VTP.getPanelLet().getPanelm().getDICIEMBRE().isSelected()) {
			mensa+="De acuerdo a su mes su libro complementa con  [BIOGRAFIA], ";
		}
//
//		[HASTA AQUI VAN LOS MESES]
//		
//	
		if (VTP.getPanelLet().getPaneltel().getT0().isSelected()) {
			mensa+="y su libro terminara con  [DE UN BIPOLAR], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT1().isSelected()) {
			mensa+="y su libro terminara con  [DE DE UN ASESINO/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT2().isSelected()) {
			mensa+="y su libro terminara con  [DE UN LOCO/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT3().isSelected()) {
			mensa+="y su libro terminara con  [DE UN ADICTO/A A LOS MEMES], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT4().isSelected()) {
			mensa+="y su libro terminara con  [DE UN SOÑADOR/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT5().isSelected()) {
			mensa+="y su libro terminara con  [DE UN GENIO/A INCOMPRENDIDO/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT6().isSelected()) {
			mensa+="y su libro terminara con  [DE UN SIMBOLO SEXUAL], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT7().isSelected()) {
			mensa+="y su libro terminara con  [DE UN ALCOHOLICO/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT8().isSelected()) {
			mensa+="y su libro terminara con  [DE UN GUERRERO/A], ";
		}
		if (VTP.getPanelLet().getPaneltel().getT9().isSelected()) {
			mensa+="y su libro terminara con  [DE UN AVENTURERO/A], ";
		}
		
		JOptionPane.showMessageDialog( null, mensa);
	}

}
