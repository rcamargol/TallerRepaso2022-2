package co.edu.unbosque.model;

public class Mes {

	private int mes;
	
	public Mes() {
		mes = 0;
	}
	
	public String mesNacimiento() {
		String rta2 = "";
		if(mes == 1) {
			rta2 = "hazaña ";
		}else if(mes == 2) {
			rta2 = "reencarnacion ";
		}else if(mes == 3) {
			rta2 = "batalla ";
		}else if(mes == 4) {
			rta2 = "existencia ";
		}else if(mes == 5) {
			rta2 = "muerte ";
		}else if(mes == 6) {
			rta2 = "mision ";
		}else if(mes == 7) {
			rta2 = "venganza ";
		}else if(mes == 8) {
			rta2 = "anecdota ";
		}else if(mes == 9) {
			rta2 = "vida ";
		}else if(mes == 10) {
			rta2 = "leyenda ";
		}else if(mes == 11) {
			rta2 = "historia ";
		}else if(mes == 12) {
			rta2 = "biografia ";
		}else {
			rta2 = "";
		}
		return rta2;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
}
