package co.edu.unbosque.model;

public class NombrePorMesNacimiento {
	
	private String mes;
	private String dato02;
	
	public NombrePorMesNacimiento() {
		mes = "";
		dato02 = "";
	}
	
	public String evaluarMes () {
		
		switch (mes) {
		case " Enero ":
			dato02 = "HAZA�A ";
			break;
		case " Febrero ":
			dato02 = "REENCARNACI�N ";
			break;
		case " Marzo ":
			dato02 = "BATALLA ";
			break;
		case " Abril ":
			dato02 = "EXISTENCIA ";
			break;
		case " Mayo ":
			dato02 = "MUERTE ";
			break;
		case " Junio ":
			dato02 = "MISI�N ";
			break;
		case " Julio ":
			dato02 = "VENGANZA ";
			break;
		case " Agosto ":
			dato02 = "AN�CDOTA ";
			break;
		case " Septiembre ":
			dato02 = "VIDA ";
			break;
		case " Octubre ":
			dato02 = "LEYENDA ";
			break;
		case " Noviembre ":
			dato02 = "HISTORIA ";
			break;
		case " Diciembre ":
			dato02 = "BIOGRAF�A ";
			break;
		}
		
		return dato02;
		
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
		
}
