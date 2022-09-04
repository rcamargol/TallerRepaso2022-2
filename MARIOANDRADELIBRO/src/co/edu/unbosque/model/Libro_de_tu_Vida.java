package co.edu.unbosque.model;

public class Libro_de_tu_Vida {
	
	String[] abc; 
	String[] mes;
	String[] numeroTel;
	
	public Libro_de_tu_Vida() {
		abc = new String[27];
		
		abc[0] =  " La verdadera ";
		abc[1] =  " La Excitante ";
		abc[2] =  " La Horripilante ";
		abc[3] =  " La Alegre ";
		abc[4] =  " La Fatal ";
		abc[5] =  " La Apasionante ";
		abc[6] =  " La Tragica ";
		abc[7] =  " La Sangrienta ";
		abc[8] =  " La Famosa ";
		abc[9] =  " La Gran ";
		abc[10] =  " La Penosa ";
		abc[11] =  " La Triste ";
		abc[12] =  " La Desastrosa ";
		abc[13] =  " La Hermosa ";
		abc[15] =  " La Oscura ";
		abc[16] =  " La Gloriosa";
		abc[17] =  " La Infeliz ";
		abc[18] =  " La Emocionante ";
		abc[19] =  " La Fantastica ";
		abc[20] =  " La Terrorifica ";
		abc[21] =  " La Aburrida ";
		abc[22] =  " La Increible ";
		abc[23] =  " La Desgraciada ";
		abc[24] =  " La Lamentable ";
		abc[25] =  " La Comica ";
		abc[26] =  " La Miserable ";
			
        mes = new String[13];
		
		mes[1] =  " Hazaña ";
		mes[2] =  " Reencarnacion ";
		mes[3] =  " Batalla ";
		mes[4] =  " Existencia ";
		mes[5] =  " Muerte ";
		mes[6] =  " Mision ";
		mes[7] =  " Venganza ";
		mes[8] =  " Anecdota ";
		mes[9] =  " Vida ";
		mes[10] =  " Leyenda ";
		mes[11] = " Historia ";
		mes[12] =  " Biografia ";
		
		numeroTel = new String[10];
		
		numeroTel[0] =  " De un Bipolar ";
		numeroTel[1] =  " De un Asesino/a ";
		numeroTel[2] =  " De un Loco/a ";
		numeroTel[3] =  " De un Adicto/a los Memes ";
		numeroTel[4] =  " De un Soñador/a ";
		numeroTel[5] =  " De un Genio/a Incomprendido/a ";
		numeroTel[6] =  " De un Simbolo Sexual";
		numeroTel[7] =  " De un Alcoholico/a ";
		numeroTel[8] =  " De un guerrero/a ";
		numeroTel[9] =  " De un Aventurero/a ";

	}
	public String Num(int n,String m) {
		if(n==0) {
			m=numeroTel[0];
		}else if(n==1) {
			m=numeroTel[1];
		}else if(n==2) {
			m=numeroTel[2];
		}else if(n==3) {
			m=numeroTel[3];
		}else if(n==4) {
			m=numeroTel[4];
		}else if(n==5) {
			m=numeroTel[5];
		}else if(n==6) {
			m=numeroTel[6];
		}else if(n==7) {
			m=numeroTel[7];
		}else if(n==8) {
			m=numeroTel[8];
		}else if(n==9) {
			m=numeroTel[9];
		}
		return m;
	}
	public String Mes(String m) {
		if(m.equals("ENERO")) {
			m=mes[1];
		}else if(m.equals("FEBRERO")) {
			m=mes[2];
		}
		else if(m.equals("MARZO")) {
			m=mes[3];
		}
		else if(m.equals("ABRIL")) {
			m=mes[4];
		}
		else if(m.equals("MAYO")) {
			m=mes[5];
		}
		else if(m.equals("JUNIO")) {
			m=mes[6];
		}
		else if(m.equals("JULIO")) {
			m=mes[7];
		}
		else if(m.equals("AGOSTO")) {
			m=mes[8];
		}
		else if(m.equals("SEPTIEMBRE")) {
			m=mes[9];
		}
		else if(m.equals("OCTUBRE")) {
			m=mes[10];
		}
		else if(m.equals("NOVIEMBRE")) {
			m=mes[11];
		}
		else if(m.equals("DICIEMBREL")) {
			m=mes[12];
		}
		
	return m;
}
	
	public String ABC(String m) {
			if(m.equals("A")) {
				m=abc[0];
			}else if(m.equals("B")) {
				m=abc[1];
			}
			else if(m.equals("C")) {
				m=abc[2];
			}
			else if(m.equals("D")) {
				m=abc[3];
			}
			else if(m.equals("E")) {
				m=abc[4];
			}
			else if(m.equals("F")) {
				m=abc[5];
			}
			else if(m.equals("G")) {
				m=abc[6];
			}
			else if(m.equals("H")) {
				m=abc[7];
			}
			else if(m.equals("I")) {
				m=abc[8];
			}
			else if(m.equals("J")) {
				m=abc[9];
			}
			else if(m.equals("K")) {
				m=abc[10];
			}
			else if(m.equals("L")) {
				m=abc[11];
			}
			else if(m.equals("M")) {
				m=abc[12];
			}
			else if(m.equals("N")) {
				m=abc[13];
			}
			else if(m.equals("O")) {
				m=abc[14];
			}
			else if(m.equals("P")) {
				m=abc[15];
			}
			else if(m.equals("Q")) {
				m=abc[16];
			}
			else if(m.equals("R")) {
				m=abc[17];
			}
			else if(m.equals("S")) {
				m=abc[18];
			}
			else if(m.equals("T")) {
				m=abc[19];
			}
			else if(m.equals("V")) {
				m=abc[20];
			}
			else if(m.equals("W")) {
				m=abc[21];
			}
			else if(m.equals("X")) {
				m=abc[22];
			}
			else if(m.equals("Y")) {
				m=abc[23];
			}
			else if(m.equals("Z")) {
				m=abc[1];
			}
		return m;
	}

	
	public String[] getAbc() {
		return abc;
	}

	public void setAbc(String[] abc) {
		this.abc = abc;
	}

	public String[] getMes() {
		return mes;
	}

	public void setMes(String[] mes) {
		this.mes = mes;
	}

	public String[] getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String[] numeroTel) {
		this.numeroTel = numeroTel;
	}
	
	
}
