package co.edu.unbosque.model;

public class LetraApellido {

	private int letra;
	
	public LetraApellido() {
		letra = 0;
	}
	
	public String ALetra() {
		String rta = "";
		if(letra == 1) {
			rta= "La verdadera ";
		}else if(letra == 2) {
			rta= "La exitante ";
		}else if(letra == 3) {
			rta= "La horripilante ";
		}else if(letra == 4) {
			rta= "La alegre ";
		}else if(letra == 5) {
			rta= "La fatal ";
		}else if(letra == 6) {
			rta= "La apasionante ";
		}else if(letra == 7) {
			rta= "La tragica ";
		}else if(letra == 8) {
			rta= "La sangrienta ";
		}else if(letra == 9) {
			rta= "La famosa ";
		}else if(letra == 10) {
			rta= "La gran ";
		}else if(letra == 11) {
			rta= "La penosa ";
		}else if(letra == 12) {
			rta= "La triste ";
		}else if(letra == 13) {
			rta= "La desastrosa ";
		}else if(letra == 14) {
			rta= "La hermosa ";
		}else if(letra == 15) {
			rta= "La oscura ";
		}else if(letra == 16) {
			rta= "La gloriosa ";
		}else if(letra == 17) {
			rta= "La infeliz ";
		}else if(letra == 18) {
			rta= "La emocionante ";
		}else if(letra == 19) {
			rta= "La fantastica ";
		}else if(letra == 20) {
			rta= "La terrorifica ";
		}else if(letra == 21) {
			rta= "La aburrida ";
		}else if(letra == 22) {
			rta= "La increible ";
		}else if(letra == 23) {
			rta= "La desgraciada ";
		}else if(letra == 24) {
			rta= "La lamentable ";
		}else if(letra == 25) {
			rta= "La comica ";
		}else if(letra == 26) {
			rta= "La miserable ";
		}else{
			rta=" ERROR ";
		}
		return rta;
	}

	public int getLetra() {
		return letra;
	}

	public void setLetra(int letra) {
		this.letra = letra;
	}

	

	



	
}
