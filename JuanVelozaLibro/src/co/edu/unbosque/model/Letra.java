package co.edu.unbosque.model;


public class Letra {

	private int x ;
	
	public Letra() {
		x = 0;
	}
	
	public String LetraApellido() {
		String rta = "";
		
		if (x == 1) {
			rta = "LA VERDADERA";
		} else if (x == 2) {
			rta = "LA EXCITANTE";
		}else if (x == 3) {
			rta = "LA HORRIPILANTE";
		}else if (x == 4) {
			rta = "LA ALEGRE";
		}else if (x == 5) {
			rta = "LA FATAL";
		}else if (x == 6) {
			rta = "LA APASIONANTE";
		}else if (x == 7) {
			rta = "LA TRAGICA";
		}else if (x == 8) {
			rta = "LA SANGRIENTA";
		}else if (x == 9) {
			rta = "LA EXCITANTE";
		}else if (x == 10) {
			rta = "LA GRAN";
		}else if (x == 11) {
			rta = "LA PENOSA";
		}else if (x == 12) {
			rta = "LA TRISTE";
		}else if (x == 13) {
			rta = "LA DESASTROSA";
		}else if (x == 14) {
			rta = "LA HERMOSA";
		}else if (x == 15) {
			rta = "LA OSCURA";
		}else if (x == 16) {
			rta = "LA GLORIOSA";
		}else if (x == 17) {
			rta = "LA INFELIZ";
		}else if (x == 18) {
			rta = "LA EMOCIONANTE";
		}else if (x == 19) {
			rta = "LA FANTASTICA";
		}else if (x == 20) {
			rta = "LA TERRORIFICA";
		}else if (x == 21) {
			rta = "LA ABURRIDA";
		}else if (x == 22) {
			rta = "LA INCREIBLE";
		}else if (x == 23) {
			rta = "LA DESGRACIADA";
		}else if (x == 24) {
			rta = "LA LAMENTAALE";
		}else if (x == 25) {
			rta = "LA COMICA";
		}else if (x == 26) {
			rta = "LA MISERABLE";
		}
		return rta;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	
	
}
