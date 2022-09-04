package Model;

public class EscogerCel {
private int numero;
	
	public EscogerCel() {
		
	}
	public String numero(int numero) {
		String respuesta = "";
		if(numero==0) {
			respuesta= "DE UN BIPOLAR";
		}else if(numero==1) {
			respuesta= "DE UN ASESINO/A ";
		}else if(numero==2) {
			respuesta= "DE UN LOCO/A ";
		}else if(numero==3) {
			respuesta= "DE UN ADICTO/A A LOS MEMES";
		}else if(numero==4) {
			respuesta= "DE UN SOÑADOR/A ";
		}else if(numero==5) {
			respuesta= "DE UN GENIO/A INCOMPRENDIDO/A";
		}else if(numero==6) {
			respuesta= "DE UN SIMBOLO SEXUAL ";
		}else if(numero==7) {
			respuesta= "DE UN ALCHOLICO/A";
		}else if(numero==8) {
			respuesta= "DE UN GUERRERO/A";
		}else if(numero==9) {
			respuesta= "DE UN AVENTURERO/A ";
			
		}else {
			respuesta=" INVALIDO";
		}
		return respuesta;
	}
}
