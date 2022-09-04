package co.edu.unbosque.model;

public class Letra {

	private int letra;
	
	public Letra() {
		letra = 0;
	}
	
	public String letraApellido() {
		String rta1 = "";
	if(letra == 1) {
		rta1 = "La verdadera ";
	}else if(letra == 2) {
		rta1 = "La excitante ";
	}else if(letra == 3) {
		rta1 = "La horripilante ";
	}else if(letra == 4) {
		rta1 = "La alegre ";
	}else if(letra == 5) {
		rta1 = "La fatal ";
	}else if(letra == 6) {
		rta1 = "La apasionante ";
	}else if(letra == 7) {
		rta1 = "La tragica ";
	}else if(letra == 8) {
		rta1 = "La sangrienta ";
	}else if(letra == 9) {
		rta1 = "La famosa ";
	}else if(letra == 10) {
		rta1 = "La gran ";
	}else if(letra == 11) {
		rta1 = "La penosa ";
	}else if(letra == 12) {
		rta1 = "La triste ";
	}else if(letra == 13) {
		rta1 = "La desastrosa ";
	}else if(letra == 14) {
		rta1 = "La hermosa ";
	}else if(letra == 15) {
		rta1 = "La oscura ";
	}else if(letra == 16) {
		rta1 = "La gloriosa "; 
	}else if(letra == 17) {
		rta1 = "La infeliz ";
	}else if(letra == 18) {
		rta1 = "La emocionante ";
	}else if(letra == 19) {
		rta1 = "La fantastica ";
	}else if(letra == 20) {
		rta1 = "La terrorifica ";
	}else if(letra == 21) {
		rta1 = "La aburrida ";
	}else if(letra == 22) {
		rta1 = "La increible ";
	}else if(letra == 23) {
		rta1 = "La desgraciada ";
	}else if(letra == 24) {
		rta1 = "La lamentable ";
	}else if(letra == 25) {
		rta1 = "La comica ";
	}else if(letra == 26) {
		rta1 = "La miserable ";
	}else {
		rta1 = "";
	}
	return rta1;
	}

	public int getLetra() {
		return letra;
	}

	public void setLetra(int letra) {
		this.letra = letra;
	}
}

