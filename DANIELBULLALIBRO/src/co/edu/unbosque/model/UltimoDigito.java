package co.edu.unbosque.model;

public class UltimoDigito {
private int digito;
	
	public UltimoDigito() {
		digito = 0;
		
	}
	public String digito() {
		String rta = "";
		if(digito==0) {
			rta= "de un bipolar ";
		}else if(digito==1) {
			rta= "de un asesino/a ";
		}else if(digito==2) {
			rta= "de un loco/a ";
		}else if(digito==3) {
			rta= "de un adicto/a a los memes ";
		}else if(digito==4) {
			rta= "de un soñador/a ";
		}else if(digito==5) {
			rta= "de un genio/a incomprendido/a ";
		}else if(digito==6) {
			rta= "de un simbolo sexual ";
		}else if(digito==7) {
			rta= "de un alcoholico/a ";
		}else if(digito==8) {
			rta= "de un guerrero/a ";
		}else if(digito==9) {
			rta= "de un aventurero/a ";
			
		}else {
			rta=" ERROR ";
		}
		return rta;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
}
	
