package co.edu.unbosquemodel;

public class Mes {
	private int mes;
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public Mes() {
		mes = 0;
		
	}
	public String DiaMes() {
		String rta = "";
		if(mes==1) {
			rta= "hazaña ";
		}else if(mes==2) {
			rta= "reencarnacion ";
		}else if(mes==3) {
			rta= "batalla ";
		}else if(mes==4) {
			rta= "existencia ";
		}else if(mes==5) {
			rta= "muerte ";
		}else if(mes==6) {
			rta= "mision ";
		}else if(mes==7) {
			rta= "venganza ";
		}else if(mes==8) {
			rta= "anecdota ";
		}else if(mes==9) {
			rta= "vida ";
		}else if(mes==10) {
			rta= "leyenda ";
		}else if(mes==11) {
			rta= "historia ";
		}else if(mes==12) {
			rta= "biografia ";
		}else {
			rta= " ERROR ";
		}
		return rta;
	}
		
}
