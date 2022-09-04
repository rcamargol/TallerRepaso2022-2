package co.edu.unbosque.model;

public class App {
     
	
	public String seleccionarSegunLetra(String pLetra) {
    	 String msg = "";
    	 if (pLetra.equalsIgnoreCase("A")) {
    		 msg = "LA VERDADERA";
    	 }else if (pLetra.equalsIgnoreCase("B")) {
    		 msg = "LA EXCITANTE";
    	 }else if (pLetra.equalsIgnoreCase("C")) {
    		 msg = "LA HORRIPILANTE";
    	 }else if (pLetra.equalsIgnoreCase("D")) {
    		 msg = "LA ALEGRE";
    	 }else if (pLetra.equalsIgnoreCase("E")) {
    		 msg = "LA FATAL";
    	 }else if (pLetra.equalsIgnoreCase("F")) {
    		 msg = "LA APASIONANTE";
    	 }else if (pLetra.equalsIgnoreCase("G")) {
    		 msg = "LA HORRIPILANTE";
    	 }else if (pLetra.equalsIgnoreCase("H")) {
    		 msg = "LA SANGRIENTA";
    	 }else if (pLetra.equalsIgnoreCase("I")) {
    		 msg = "LA FAMOSA";
    	 }else if (pLetra.equalsIgnoreCase("J")) {
    		 msg = "LA GRAN";
    	 }else if (pLetra.equalsIgnoreCase("K")) {
    		 msg = "LA PENOSA";
    	 }else if (pLetra.equalsIgnoreCase("L")) {
    		 msg = "LA TRISTE";
    	 }else if (pLetra.equalsIgnoreCase("M")) {
    		 msg = "LA DESASTROSA";
    	 }else if (pLetra.equalsIgnoreCase("N")) {
    		 msg = "LA HERMOSA";
    	 }else if (pLetra.equalsIgnoreCase("O")) {
    		 msg = "LA OSCURA";
    	 }else if (pLetra.equalsIgnoreCase("P")) {
    		 msg = "LA GLORIOSA";
    	 }else if (pLetra.equalsIgnoreCase("Q")) {
    		 msg = "LA INFELIZ";
    	 }else if (pLetra.equalsIgnoreCase("R")) {
    		 msg = "LA EMOCIONANTE";
    	 }else if (pLetra.equalsIgnoreCase("S")) {
    		 msg = "LA FANTÁSTICA";
    	 }else if (pLetra.equalsIgnoreCase("T")) {
    		 msg = "LA TERRORÍFICA";
    	 }else if (pLetra.equalsIgnoreCase("U")) {
    		 msg = "LA ABURRIDA";
    	 }else if (pLetra.equalsIgnoreCase("V")) {
    		 msg = "LA INCREÍBLE";
    	 }else if (pLetra.equalsIgnoreCase("W")) {
    		 msg = "LA DESGRACIADA";
    	 }else if (pLetra.equalsIgnoreCase("X")) {
    		 msg = "LA LAMENTABLE";
    	 }else if (pLetra.equalsIgnoreCase("Y")) {
    		 msg = "LA CÓMICA";
    	 }else if (pLetra.equalsIgnoreCase("C")) {
    		 msg = "LA MISERABLE";
    	 }else {
    		 msg = "LA VERDADERA";
    	 }
    	return msg;	
     }
	
	public String seleccionarPalabraPorNumero (int pNum) {
		String msg = "";
		if (pNum == 1) {
			msg = " HAZAÑA";
		} else if (pNum == 2) {
			msg = " REENCARNACIÓN";
		} else if (pNum ==3) {
			msg = " BATALLA";
		} else if (pNum == 4) {
			msg = " EXISTENCIA";
		} else if (pNum == 5) {
			msg = " MUERTE";
		} else if (pNum == 6) {
			msg = " MISIÓN";
		} else if (pNum == 7) {
			msg = " VENGANZA";
		} else if (pNum == 8) {
			msg = " ANÉCDOTA";
		} else if (pNum == 9) {
			msg = " VIDA";
		} else if (pNum == 10){
			msg = " LEYENDA";
		} else if (pNum == 11) {
			msg = " HISTORIA";
		} else if (pNum == 12) {
			msg = " BIOGRAFÍA";
		}
		return msg;
	}
	public String seleccionarFrasePorNumero (int pNum) {
		String msg = "";
		if (pNum == 0) {
			msg = " DE UN/A BIPOLAR";
		} else if (pNum == 1) {
			msg = " DE UN/A ASESINO/A";
		} else if (pNum ==2) {
			msg = " DE UN/A LOCO/A";
		} else if (pNum == 3) {
			msg = " DE UN/A ADICTO/A A LOS MEMES";
		} else if (pNum == 4) {
			msg = " DE UN/A SOÑADOR/A";
		} else if (pNum == 5) {
			msg = " DE UN/A GENIO/A";
		} else if (pNum == 6) {
			msg = " DE UN SÍMBOLO SEXUAL";
		} else if (pNum == 7) {
			msg = " DE UN/A ALCOHÓLICO/A";
		} else if (pNum == 8) {
			msg = " DE UN/A GUERRERO/A";
		} else if (pNum == 9) {
			msg = " DE UN/A AVENTURERO/A";
		}
		return msg;
	}
	public String unirOpciones(String msg1, String msg2, String msg3) {
		String msg = msg1  +  msg2 +  msg3;
		return msg;
	}
}
