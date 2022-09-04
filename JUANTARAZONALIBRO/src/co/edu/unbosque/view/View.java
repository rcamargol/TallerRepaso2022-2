package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	private String[] choices;
	private String[] choices2;
	private String[] choices3;
	
	private String dat;
	private String dat2;
	private String dat3;
	
	public View(){
		
		choices = new String[26];
		choices2 = new String[12];
		choices3 = new String[10];
	}
	
	public String procesarDatos() {
		
		dat = (String) JOptionPane.showInputDialog(null, "Escoga la primera letra de su apellido:", 
				"El Libro de tu vida", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		
		dat2 = (String) JOptionPane.showInputDialog(null, "Escoga segun su mes de nacimiento:", 
				"El Libro de tu vida", JOptionPane.QUESTION_MESSAGE, null, choices2, choices2[0]);
		
		dat3 = (String) JOptionPane.showInputDialog(null, "Escoga segun el ultimo digito de su numero telefónico", 
				"El Libro de tu vida", JOptionPane.QUESTION_MESSAGE, null, choices3, choices3[0]);
		
		//Pido disculpas profesor Ricardo por toda esta plana, no encontre una solucion mas optima
		dat = dat.replace("A.","");
		dat = dat.replace("B.","");
		dat = dat.replace("C.","");
		dat = dat.replace("D.","");
		dat = dat.replace("E.","");
		dat = dat.replace("F.","");
		dat = dat.replace("G.","");
		dat = dat.replace("H.","");
		dat = dat.replace("I.","");
		dat = dat.replace("J.","");
		dat = dat.replace("K.","");
		dat = dat.replace("L.","");
		dat = dat.replace("M.","");
		dat = dat.replace("N.","");
		dat = dat.replace("O.","");
		dat = dat.replace("P.","");
		dat = dat.replace("Q.","");
		dat = dat.replace("R.","");
		dat = dat.replace("S.","");
		dat = dat.replace("T.","");
		dat = dat.replace("U.","");
		dat = dat.replace("V.","");
		dat = dat.replace("W.","");
		dat = dat.replace("X.","");
		dat = dat.replace("Y.","");
		dat = dat.replace("Z.","");
		
		dat2 = dat2.replace("Enero.", "");
		dat2 = dat2.replace("Febrero.", "");
		dat2 = dat2.replace("Marzo.", "");
		dat2 = dat2.replace("Abril.", "");
		dat2 = dat2.replace("Mayo.", "");
		dat2 = dat2.replace("Junio.", "");
		dat2 = dat2.replace("Julio.", "");
		dat2 = dat2.replace("Agosto.", "");
		dat2 = dat2.replace("Septiembre.", "");
		dat2 = dat2.replace("Octubre.", "");
		dat2 = dat2.replace("Noviembre.", "");
		dat2 = dat2.replace("Diciembre.", "");
		
		dat3 = dat3.replace("0.","");
		dat3 = dat3.replace("1.","");
		dat3 = dat3.replace("2.","");
		dat3 = dat3.replace("3.","");
		dat3 = dat3.replace("4.","");
		dat3 = dat3.replace("5.","");
		dat3 = dat3.replace("6.","");
		dat3 = dat3.replace("7.","");
		dat3 = dat3.replace("8.","");
		dat3 = dat3.replace("9.","");
		
		return dat+" "+dat2+" "+dat3;
	}
	
	public void mostrarDatos(String d){
		
		JOptionPane.showMessageDialog(null, "El libro de tu vida se llama "+d);
	}
	
	public String[] getChoices() {
		return choices;
	}

	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	public String[] getChoices2() {
		return choices2;
	}

	public void setChoices2(String[] choices2) {
		this.choices2 = choices2;
	}

	public String[] getChoices3() {
		return choices3;
	}

	public void setChoices3(String[] choices3) {
		this.choices3 = choices3;
	}

	public String getDat() {
		return dat;
	}

	public void setDat(String dat) {
		this.dat = dat;
	}

	public String getDat2() {
		return dat2;
	}

	public void setDat2(String dat2) {
		this.dat2 = dat2;
	}

	public String getDat3() {
		return dat3;
	}

	public void setDat3(String dat3) {
		this.dat3 = dat3;
	}
	
}
