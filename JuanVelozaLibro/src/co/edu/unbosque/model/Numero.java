package co.edu.unbosque.model;

public class Numero {

	private int a;
	
	public Numero() {
		a = 0;
				
	}
	
	public String UltimoDigito() {
		String rta = "";
		
		if(a==0) {
			rta= "DE UN BIPOLAR ";
		}else if(a==1) {
			rta= "DE UN ASESINO ";
		}else if(a==2) {
			rta= "DE UN LOCO";
		}else if(a==3) {
			rta= "DE UN ADICTO A LOS MEMES ";
		}else if(a==4) {
			rta= "DE UN SOÑADOR";
		}else if(a==5) {
			rta= "DE UN GENIO INCOMPRENDIDO ";
		}else if(a==6) {
			rta= "DE UN SIMBOLO SEXUAL ";
		}else if(a==7) {
			rta= "DE UN ALCOHOLICO ";
		}else if(a==8) {
			rta= "DE UN GUERRERO ";
		}else if(a==9) {
			rta= "DE UN AVENTURERO ";
		}
		return rta;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
