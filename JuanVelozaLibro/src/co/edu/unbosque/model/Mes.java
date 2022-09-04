package co.edu.unbosque.model;

public class Mes {

private int mes;
	
	public Mes(){
		mes = 0;
	}
	
	public String mesElegido() {
		String rta = "";
		if (mes <= 12 && mes > 0) {
			if (mes == 1 ) {
				rta = " HAZAÑA "; 
			}else if (mes == 2) {
				rta  = " REENCARNACION ";
			}else if (mes == 3){
				rta = " BATALLA ";
			}else if (mes == 4) {
				rta = " EXISTENCIA ";
			}else if (mes == 5) {
				rta = " MUERTE ";
			}else if (mes == 6) {
				rta = " MISION ";
			}else if (mes == 7) {
				rta = " VENGANZA ";
			}else if (mes == 8) {
				rta = " ANECTDOTA ";
			}else if (mes == 9) {
				rta = " VIDA ";
			}else if (mes == 10) {
				rta = " LEYENDA ";
			}else if (mes == 11) {
				rta =  " HISTORIA ";
			}else if (mes == 12) {
				rta = " BIOGRAFIA ";
			}
		}
		return rta;
		}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
}
