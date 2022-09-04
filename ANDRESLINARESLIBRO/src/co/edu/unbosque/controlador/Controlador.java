package co.edu.unbosque.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.vista.VentanaPrincipal;

public class Controlador extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VentanaPrincipal vp;
	private String letra;
	private String mes;
	private String num;

	public Controlador() {
		vp = new VentanaPrincipal();
	}
	
	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void iniciar() {
		vp.getBt1().addActionListener(this);
		vp.getBt1().setActionCommand("bt1");
		vp.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("bt1")) {
			
			
			if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "A") {
				letra= "La verdadera ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "B"){
				letra= "La excitante ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "C"){
				letra= "La horripilante ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "D"){
				letra= "La alegre ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "E"){
				letra= "La fatal ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "F"){
				letra= "La apasionante ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "G"){
				letra= "La trágica ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "H"){
				letra= "La sangrienta ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "I"){
				letra= "La famosa ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "J"){
				letra= "La gran ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "K"){
				letra= "La penosa ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "L"){
				letra= "La triste ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "M"){
				letra= "La desastrosa ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "N"){
				letra= "La hermosa ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "O"){
				letra= "La oscura ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "P"){
				letra= "La gloriosa ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "Q"){
				letra= "La infeliz ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "R"){
				letra= "La emocionante ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "S"){
				letra= "La fantástica ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "T"){
				letra= "La terrorífica ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "U"){
				letra= "La aburrida ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "V"){
				letra= "La increíble ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "W"){
				letra= "La desgraciada ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "X"){
				letra= "La lamentable ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "Y"){
				letra= "La cómica ";
			}else if (vp.getListletra().getItemAt(vp.getListletra().getSelectedIndex())== "Z"){
				letra= "La miserable ";
			}
			
			if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Enero") {
				mes = "hazaña ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Febrero") {
				mes = "reencarnación ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Marzo") {
				mes = "batalla ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Abril") {
				mes = "existencia ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Mayo") {
				mes = "muerte ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Junio") {
				mes = "Misión ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Julio") {
				mes = "venganza ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Agosto") {
				mes = "anécdota ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Septiembre") {
				mes = "vida ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Octubre") {
				mes = "leyenda ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Noviembre") {
				mes = "historia ";
			}else if (vp.getListmes().getItemAt(vp.getListmes().getSelectedIndex())== "Diciembre") {
				mes = "biografía ";
			}
			
			if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "0") {
				num = "de un bipolar.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "1") {
				num = "de un asesino/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "2") {
				num = "de un loco/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "3") {
				num = "de un adicto/a a los meses.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "4") {
				num = "de un soñador/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "5") {
				num = "de un genio/a incomprendido/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "6") {
				num = "de un símbolo sexual.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "7") {
				num = "de un alcohólico/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "8") {
				num = "de un guerrero/a.";
			}else if (vp.getListnum().getItemAt(vp.getListnum().getSelectedIndex())== "9") {
				num = "de un aventurero/a.";
			}
			
			
			JOptionPane.showMessageDialog(null, letra + mes + num);
			
		}
		
		
	}
	
}
