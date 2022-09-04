package Model;

public class EscogerMes {

	public String Mes (String mes) {
		String respuesta;
		if(mes.equals("ENERO")) {
			respuesta= "HAZAÑA";
		}else if(mes.equals("FEBRERO")) {
			respuesta= "REENCARNACION ";
		}else if(mes.equals("MARZO")) {
			respuesta= "BATALLA ";
		}else if(mes.equals("ABRIL")) { 
			respuesta= "EXISTENCIA";
		}else if(mes.equals("MAYO")) {
			respuesta= "MUERTE";
		}else if(mes.equals("JUNIO")) {
			respuesta= "MISION ";
		}else if(mes.equals("JULIO")) {
			respuesta= "VENGANZA ";
		}else if(mes.equals("AGOSTO")) {
			respuesta= "ANECDOTA ";
		}else if(mes.equals("SEPTIEMBRE")) {
			respuesta= "VIDA";
		}else if(mes.equals("OCTUBRE")) {
			respuesta= "LEYENDA";
		}else if(mes.equals("NOVIEMBRE")) {
			respuesta= "HISTORIA ";
		}else if(mes.equals("DICIEMBRE")) {
			respuesta= "BIOGRAFIA";
		}else {
			respuesta= " INVALIDO ";
		}
		return respuesta;
	}	
	
}
	

