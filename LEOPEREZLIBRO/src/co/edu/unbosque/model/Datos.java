package co.edu.unbosque.model;

public class Datos {
	
	String apellido;
	int mes;
	int numero;
	
	
	public Datos() {
		
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Datos [apellido=" + apellido + ", mes=" + mes + ", numero=" + numero + "]";
	}


	public void valoresDatos(String apellido, String pri, int mes, String seg, int numero, String ter){
		 if(apellido.equalsIgnoreCase("a")) {
			   	pri = "LA VERDADERA";
				}
			   if(apellido.equalsIgnoreCase("b")) {
			   	pri = "LA EXCITANTE";
				}
			   if(apellido.equalsIgnoreCase("c")) {
			   	pri = "LA HORRIPILANTE";
				}
			   if(apellido.equalsIgnoreCase("d")) {
			   	pri = "LA ALEGRE";
				}
			   if(apellido.equalsIgnoreCase("e")) {
			   	pri = "LA FATAL";
				}
			   if(apellido.equalsIgnoreCase("f")) {
			   	pri = "LA APASIONENTE";
				}
			   if(apellido.equalsIgnoreCase("g")) {
			   	pri = "LA TRÁGICA";
				}
			   if(apellido.equalsIgnoreCase("h")) {
			   	pri = "LA SANGRIENTA";
				}
			   if(apellido.equalsIgnoreCase("i")) {
			   	pri = "LA FAMOSA";
				}
			   if(apellido.equalsIgnoreCase("j")) {
			   	pri = "LA GRAN";
				}
			   if(apellido.equalsIgnoreCase("k")) {
			   	pri = "LA PENOSA";
				}
			   if(apellido.equalsIgnoreCase("l")) {
			   	pri = "LA TRISTE";
				}
			   if(apellido.equalsIgnoreCase("m")) {
			   	pri = "LA DESASTROSA";
				}
			   if(apellido.equalsIgnoreCase("n")) {
			   	pri = "LA HERMOSA";
				}
			   if(apellido.equalsIgnoreCase("o")) {
			   	pri = "LA OSCURA";
				}
			   if(apellido.equalsIgnoreCase("p")) {
			   	pri = "LA GLORIOSA";
				}
			   if(apellido.equalsIgnoreCase("q")) {
			   	pri = "LA INFELIZ";
				}
			   if(apellido.equalsIgnoreCase("r")) {
			   	pri = "LA EMOCIONANTE";
				}
			   if(apellido.equalsIgnoreCase("s")) {
			   	pri = "LA FANTÁSTICA";
				}
			   if(apellido.equalsIgnoreCase("t")) {
			   	pri = "LA TERRORIFICA";
				}
			   if(apellido.equalsIgnoreCase("u")) {
			   	pri = "LA ABURRIDA";
				}
			   if(apellido.equalsIgnoreCase("v")) {
			   	pri = "LA INCREÍBLE";
				}
			   if(apellido.equalsIgnoreCase("w")) {
			   	pri = "LA DESGRACIADA";
				}
			   if(apellido.equalsIgnoreCase("x")) {
			   	pri = "LA LAMENTABLE";
				}
			   if(apellido.equalsIgnoreCase("y")) {
			   	pri = "LA CÓMICA";
				}
			   if(apellido.equalsIgnoreCase("z")) {
			   	pri = "LA MISERABLE";
				}
			   
			    
			    if(mes==1) {
			   	 seg = "HAZAÑA" ;
			   	 } if(mes==2) {
			       	 seg = "REENCARNACIÓN" ;
			       	 } if(mes==3) {
			           	 seg = "BATALLA" ;
			       	 } if(mes==4) {
			           	 seg = "EXISTENCIA" ;
			       	 } if(mes==5) {
			           	 seg = "MUERTE" ;
			       	 } if(mes==6) {
			           	 seg = "MISIÓN" ;
			       	 } if(mes==7) {
			           	 seg = "VENGANZA" ;
			       	 } if(mes==8) {
			           	 seg = "ANÉCDOTA" ;
			       	 } if(mes==9) {
			           	 seg = "VIDA" ;
			       	 } if(mes==10) {
			           	 seg = "LEYENDA" ;
			       	 } if(mes==11) {
			           	 seg = "HISTORIA" ;
			       	 } if(mes==12) {
			           	 seg = "BIOGRAFÍA" ;
			       	 }
			    
			       	 
			        if(numero==0) {
			           	ter = "DE UN BIPOLAR" ;
			           	} if(numero==1) {
			               	 ter = "DE UN ASESINO/A" ;
			               } if(numero==2) {
			                   	 ter = "DE UN LOCO/A" ;
			               } if(numero==3) {
			                   	 ter = "DE UN ADICTO/A A LOS MEMES" ;
			               } if(numero==4) {
			                   	 ter = "DE UN SOÑADOR/A" ;
			               } if(numero==5) {
			                   	 ter = "DE UN GENIO/A INCOMPRENDIDO/A" ;
			               } if(numero==6) {
			                   	 ter = "DE UN SIMBOLO SEXUAL" ;
			               } if(numero==7) {
			                   	 ter = "DE UN ALCOHÓLICO/A" ;
			               } if(numero==8) {
			                   	 ter = "DE UN GUERRERO/A" ;
			               } if(numero==9) {
			                   	 ter = "DE UN AVENTURERO/A" ;
			               }
	 
	 
	}
	
}
